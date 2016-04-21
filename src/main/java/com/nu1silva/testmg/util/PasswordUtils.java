package com.nu1silva.testmg.util;

import org.jasypt.util.password.ConfigurablePasswordEncryptor;

public class PasswordUtils {

    ConfigurablePasswordEncryptor passwordEncryptor = new ConfigurablePasswordEncryptor();

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

    public Boolean passwordVerification(String userId, String password) {
        try {
            passwordEncryptor.setAlgorithm("SHA-1");
            passwordEncryptor.setPlainDigest(true);

            // TODO - call method to get user current password (UserService)

            if (passwordEncryptor.checkPassword(password, "")) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
