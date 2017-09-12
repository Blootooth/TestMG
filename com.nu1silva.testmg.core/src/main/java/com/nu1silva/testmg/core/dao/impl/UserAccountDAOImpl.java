/*
 * Copyright (c) 2017, nu1silva (https://nu1silva.com) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

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
