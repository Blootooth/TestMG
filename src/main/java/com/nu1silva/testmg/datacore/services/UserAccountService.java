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

package com.nu1silva.testmg.datacore.services;

import com.nu1silva.testmg.datacore.domain.UserAccounts;
import com.nu1silva.testmg.datacore.exceptions.UserAccountServiceException;
import org.jasypt.util.password.StrongPasswordEncryptor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * UserAccountService Class that contains the User Management functionality with the database
 *
 * @author Nuwan Silva (nu1silva@gmail.com)
 * @version 1.0.0
 * @since 2016-09-20
 */
public class UserAccountService {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("testmg");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    StrongPasswordEncryptor strongPasswordEncryptor = new StrongPasswordEncryptor();

    UserAccounts userAccount;

    /**
     * Insert or update a user in the platform
     *
     * @param user
     */
    public void InsertOrUpdateUser(UserAccounts user) {
        try {
            if (!isUserAvailable(user.getEmail())) {

                UserAccounts newUserAccount = new UserAccounts();
                newUserAccount.setEmail(user.getEmail());
                newUserAccount.setFirstName(user.getFirstName());
                newUserAccount.setLastName(user.getLastName());
                newUserAccount.setPassword(strongPasswordEncryptor.encryptPassword(user.getPassword()));
                newUserAccount.setStatus(user.getStatus());

                entityManager.getTransaction().begin();
                entityManager.persist(newUserAccount);
                entityManager.getTransaction().commit();
            } else {
                new UserAccountServiceException("user email already available in the platform");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Remove user account from the platform
     *
     * @param email
     */
    public void removeUser(String email) {
        try {
            if (isUserAvailable(email)) {
                userAccount = entityManager.find(UserAccounts.class, email);
                entityManager.getTransaction().begin();
                entityManager.remove(userAccount);
                entityManager.getTransaction().commit();
            } else {
                new UserAccountServiceException("User not found within the system");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
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
            e.printStackTrace();
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
            e.printStackTrace();
        }
        return userAccount;
    }

//    List<UserAccounts> list();

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
                result = false;
            else
                result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
