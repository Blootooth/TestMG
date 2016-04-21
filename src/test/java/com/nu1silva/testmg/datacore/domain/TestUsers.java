package com.nu1silva.testmg.datacore.domain;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUsers {

    Users users = new Users(100, "user1", "password", "fname", "lname", "mail@example.com", "role1", "ACTIVE");

    @Test
    public void testUserId() {
        Assert.assertEquals(100, users.getUserId(), "userId mismatch");
    }

    @Test
    public void testUsername() {
        Assert.assertEquals("user1", users.getUsername(), "username mismatch");
    }

    @Test
    public void testPassword() {
        Assert.assertEquals("password", users.getPassword(), "password mismatch");
    }

    @Test
    public void testFirstName() {
        Assert.assertEquals("fname", users.getFirstName(), "first name mismatch");
    }

    @Test
    public void testLastName() {
        Assert.assertEquals("lname", users.getLastName(), "last name mismatch");
    }

    @Test
    public void testEmail() {
        Assert.assertEquals("mail@example.com", users.getEmail(), "email mismatch");
    }

    @Test
    public void testRoles() {
        Assert.assertEquals("role1", users.getRoleName(), "role mismatch");
    }

    @Test
    public void testStatus() {
        Assert.assertEquals("ACTIVE", users.getStatus(), "status mismatch");
    }
}
