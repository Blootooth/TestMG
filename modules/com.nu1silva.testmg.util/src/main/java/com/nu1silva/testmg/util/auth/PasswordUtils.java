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
package com.nu1silva.testmg.util.auth;

import org.jasypt.util.password.ConfigurablePasswordEncryptor;

public class PasswordUtils {

    private ConfigurablePasswordEncryptor passwordEncryptor = new ConfigurablePasswordEncryptor();

    /**
     * Main password encryption method.
     *
     * @param password password that will be encrypted
     * @return encrypted password
     */
    public String encryptPassword(String password) {
        try {
            passwordEncryptor.setAlgorithm("SHA-1");
            passwordEncryptor.setPlainDigest(true);
            return passwordEncryptor.encryptPassword(password);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
//
//    public Boolean passwordVerification(String username, String password) {
//        try {
//            passwordEncryptor.setAlgorithm("SHA-1");
//            passwordEncryptor.setPlainDigest(true);
//
//            Users currentUser = userService.getUser(username);
//
//            if (passwordEncryptor.checkPassword(password, currentUser.getPassword())) {
//                return true;
//            } else {
//                return false;
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            return false;
//        }
//    }
}
