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
}
