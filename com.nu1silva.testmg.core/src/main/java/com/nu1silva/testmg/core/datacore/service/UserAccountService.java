/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nu1silva.testmg.core.datacore.service;

import com.nu1silva.testmg.core.datacore.domain.UserAccounts;
import com.nu1silva.testmg.core.datacore.exception.UserAccountServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Collection;

/**
 * UserAccountService Class that contains the User Management functionality with the database
 *
 * @author Nuwan Silva (nu1silva@gmail.com)
 * @version 1.0.0
 * @since 2016-09-20
 */
public class UserAccountService {

    private final Logger logger = LoggerFactory.getLogger(UserAccountService.class);

    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("testmg");
    private EntityManager entityManager = entityManagerFactory.createEntityManager();

    private UserAccounts userAccount;

    /**
     * Insert or update a user in the platform
     *
     * @param user
     */
    public void InsertOrUpdateUser(UserAccounts user) {
        if (logger.isDebugEnabled()) {
            logger.debug("creating/updating account for user {}", user.getEmail());
            logger.debug("user account {");
            logger.debug("  ID : {}", user.getUserId());
            logger.debug("  email : {}", user.getEmail());
            logger.debug("  first name : {}", user.getFirstName());
            logger.debug("  last name  : {}", user.getLastName());
            logger.debug("  status : {}", user.getStatus());
            logger.debug("}");
        }
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(user);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            logger.error("error while creating/updating account for []", user.getEmail(),
                    new UserAccountServiceException("error while creating/updating account", ex));
        }
    }

    /**
     * Remove user account from the platform
     *
     * @param email
     */
    public void removeUser(String email) {
        String deleteStatus = "DELETED";

        logger.info("removing user account {}", email);
        if (logger.isDebugEnabled()) {
            logger.debug("NOTE: As a special requirement when removing an account, the said account will be moved into" +
                    "a DELETED state.");
        }

        try {
            if (isUserAvailable(email)) {
                userAccount = getUserByEmail(email);
                updateUserStatus(email, deleteStatus);

                logger.info("successfully removed the user account");

                // entityManager.remove() not used.
                //entityManager.getTransaction().begin();
                //entityManager.remove(userAccount);
                //entityManager.getTransaction().commit();
            } else {
                logger.error("set email {} not associated with any account", email,
                        new UserAccountServiceException("User not found within the system"));
            }
        } catch (Exception ex) {
            logger.error("error occurred while removing user", new UserAccountServiceException(ex));
        }
    }

    /**
     * Update state of any account
     *
     * @param email
     * @param status
     */
    public void updateUserStatus(String email, String status) {
        String currentState = null;
        try {
            userAccount = getUserByEmail(email);
            userAccount.setStatus(status);
            entityManager.getTransaction().begin();
            entityManager.persist(userAccount);
            entityManager.getTransaction().commit();

            if (logger.isDebugEnabled()) {
                logger.debug("status changed for user [{}] {} -> {}", email, currentState, status);
            }
        } catch (Exception ex) {
            logger.error("error occurred while changing status of a user", new UserAccountServiceException(ex));
        }
    }

    /**
     * Get User Account by ID
     *
     * @param userId
     * @return UserAccounts
     */
    public UserAccounts getUserByID(int userId) {
        UserAccounts userAccount = null;
        try {
            userAccount = entityManager.find(UserAccounts.class, userId);
        } catch (Exception e) {
            logger.error("error occurred while getting user by ID", new UserAccountServiceException(e));
        }
        return userAccount;
    }

    /**
     * Get User Account by Email
     *
     * @param email
     * @return UserAccounts
     */
    public UserAccounts getUserByEmail(String email) {
        UserAccounts userAccount = null;
        try {
            Query getUserByEmailQuery = entityManager.createQuery("SELECT u FROM UserAccounts u WHERE u.email = '" + email + "'");
            userAccount = (UserAccounts) getUserByEmailQuery.getSingleResult();

        } catch (Exception e) {
            logger.error("error occurred while getting user by email", new UserAccountServiceException(e));
        }
        return userAccount;
    }

    /**
     * Get all user accounts available in the database
     *
     * @return List of UserAccounts
     */
    public Collection<UserAccounts> getAllUserAccounts() {
        logger.info("retrieve all accounts");
        Query getAllQuery = entityManager.createQuery("SELECT u FROM UserAccounts u");
        return getAllQuery.getResultList();
    }

    /**
     * Check if the email is already available in the system
     *
     * @param email
     * @return
     */
    private Boolean isUserAvailable(String email) {
        Boolean result = false;
        try {
            Query isUserAvailableQuery = entityManager.createQuery("SELECT count(*) FROM UserAccounts u WHERE u.email = '" + email + "'");
            if (Integer.parseInt(isUserAvailableQuery.getSingleResult().toString()) >= 1)
                result = true;
            else
                result = false;
        } catch (Exception e) {
            logger.error("error occurred while checking user availability", new UserAccountServiceException(e));
        }
        return result;
    }
}
