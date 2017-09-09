package com.nu1silva.testmg.core.dao.impl;

import com.nu1silva.testmg.core.dao.UserAccountDAO;
import com.nu1silva.testmg.core.domain.UserAccount;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

public class UserAccountDAOImpl implements UserAccountDAO {

    private final Logger logger = LoggerFactory.getLogger(UserAccountDAOImpl.class);

    @Override
    public Boolean isUserAccountActive(String id) {
        if (logger.isDebugEnabled())
            logger.debug("checking if user account [" + id + "] is ACTIVE");
        return null;
    }

    @Override
    public Boolean isUserAccountAvailable(String id) {
        if (logger.isDebugEnabled())
            logger.debug("checking if user account is available for id [" + id + "]");
        return null;
    }

    @Override
    public UserAccount getUserAccountFromId(String id) {
        return null;
    }

    @Override
    public UserAccount getUserAccountFromEmail(String email) {
        return null;
    }

    @Override
    public void createUserAccount(UserAccount userAccount) {

    }

    @Override
    public void updateUserAccount(UserAccount userAccount) {

    }

    @Override
    public void removeUserAccount(String id) {

    }

    @Override
    public Collection<UserAccount> getAllUserAccounts() {
        return null;
    }
}
