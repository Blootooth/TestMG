package com.nu1silva.testmg.datacore.services;

import com.nu1silva.testmg.datacore.domain.Users;
import org.apache.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class UserService {

    private final Logger logger = Logger.getLogger(UserService.class);

    Users user = new Users();

    EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("testmg");
    EntityManager entityManager = managerFactory.createEntityManager();

    // TODO - Implement methods.

    /**
     * Method: createUser
     * Usage: Create user in the database.
     *
     * @param username
     * @param password
     * @param firstName
     * @param lastName
     * @param email
     * @param roleName
     * @param status
     */
    public void createUser(String username, String password, String firstName, String lastName, String email, String roleName, String status) {
        logger.debug("creating user in testmg");
        try {
            user.setUsername(username);
            user.setPassword(password);
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
     * @param username
     * @return
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
