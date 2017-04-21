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
package com.nu1silva.testmg.datacore.domain;

import javax.persistence.*;

/**
 * The Users domain class for database mapping
 *
 * @author Nuwan Silva (nu1silva@gmail.com)
 * @version 1.0.0
 * @since 2016-09-20
 */

@Entity
@Table(name = "USER_ACCOUNTS")
public class UserAccounts {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int userId;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "FIRSTNAME")
    private String firstName;
    @Column(name = "LASTNAME")
    private String lastName;
    @Column(name = "STATUS")
    private String status;

    public UserAccounts() {
    }

    public UserAccounts(int userId, String email, String password, String firstName, String lastName, String status) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
    }

    public UserAccounts(String email, String status) {
        this.email = email;
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return "{" + this.userId + "," +
                this.email + "," +
                this.firstName + "," +
                this.lastName + "," +
                this.status + "}";
    }
}
