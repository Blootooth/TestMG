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

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserAccountService {

//    void InsertOrUpdateUser(UserAccounts user);
//
//    void deleteUser(int userId);

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("testmg");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    public UserAccounts getUser(int userId) {
        UserAccounts userAccount = null;
        try {
            userAccount = entityManager.find(UserAccounts.class, userId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userAccount;
    }
//
//    UserAccounts getUser(String username);
//
//    List<UserAccounts> list();
}
