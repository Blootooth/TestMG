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

import com.nu1silva.testmg.datacore.domain.Users;
import com.nu1silva.testmg.util.PasswordUtils;
import org.apache.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class UserService {

    private final Logger logger = Logger.getLogger(UserService.class);

    Users user = new Users();
    PasswordUtils passwordUtils = new PasswordUtils();

    EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("testmg");
    EntityManager entityManager = managerFactory.createEntityManager();

    // TODO - Implement methods.

    /**
     * Method: createUser
     * Usage: Create user in the database.
     *
     * @param username  username of the user
     * @param password  password of the user
     * @param firstName First Name of the user
     * @param lastName  Last Name of the user
     * @param email     Email of the user
     * @param roleName  Role of the user
     * @param status    Status of the user
     */
    public void createUser(String username, String password, String firstName, String lastName, String email, String roleName, String status) {
        logger.debug("creating user in testmg");
        try {
            user.setUsername(username);
            user.setPassword(passwordUtils.encryptPassword(password));
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setEmail(email);
            user.setRoleName(roleName);
            user.setStatus(status);

            entityManager.getTransaction().begin();
            entityManager.persist(user);
            entityManager.getTransaction().commit();

            logger.info("user created with the username : " + username);
        } catch (Exception ex) {
            logger.error("user creation failed", ex.getCause());
            ex.printStackTrace();
        }
    }

    /**
     * Method: isUsernameAvailable
     * Usage: Check if username already used in the database.
     *
     * @param username username is provided to check for its availability
     * @return TRUE/FALSE
     */
    public Boolean isUsernameAvailable(String username) {
        try {
            if (entityManager.find(Users.class, username) != null) {
                logger.debug("found username in the database");
                return true;
            } else {
                logger.debug("no username found in the database");
                return false;
            }
        } catch (Exception ex) {
            logger.error("username chack failuer", ex.getCause());
            ex.printStackTrace();
            return false;
        }
    }
}
