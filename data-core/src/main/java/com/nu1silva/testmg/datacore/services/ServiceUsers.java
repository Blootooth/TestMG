package com.nu1silva.testmg.datacore.services;

import com.nu1silva.testmg.datacore.domain.Users;
import org.apache.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ServiceUsers {

    private final Logger logger = Logger.getLogger(ServiceUsers.class);

    Users user = new Users();

    EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("testmg");
    EntityManager entityManager = managerFactory.createEntityManager();

    // TODO - Implement methods.

    public void InsertUser(String username, String password, String firstName, String lastName, String email, String roleName, String status) {
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
        } catch (Exception ex) {
            logger.error("user creation failed", ex.getCause());
            ex.printStackTrace();
        }
    }

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
