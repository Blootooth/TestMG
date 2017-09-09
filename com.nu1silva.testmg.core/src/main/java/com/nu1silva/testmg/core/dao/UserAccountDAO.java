package com.nu1silva.testmg.core.dao;

import com.nu1silva.testmg.core.domain.UserAccount;

import java.util.Collection;

public interface UserAccountDAO {

    Boolean isUserAccountActive(String id);

    Boolean isUserAccountAvailable(String id);

    UserAccount getUserAccountFromId(String id);

    UserAccount getUserAccountFromEmail(String email);

    void createUserAccount(UserAccount userAccount);

    void updateUserAccount(UserAccount userAccount);

    void removeUserAccount(String id);

    Collection<UserAccount> getAllUserAccounts();
}
