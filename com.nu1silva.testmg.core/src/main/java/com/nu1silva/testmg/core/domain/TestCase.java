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
package com.nu1silva.testmg.core.domain;

public class TestCase {

    private int testCaseId;
    private String testCaseSummary;
    private String testCaseDescription;
    private String testCasePreConditions;
    private String testCaseStatus;
    private int testCaseAuthor;

    public TestCase() {
    }

    public TestCase(int testCaseId, String testCaseSummary, String testCaseDescription, String testCasePreConditions, String testCaseStatus, int testCaseAuthor) {
        this.testCaseId = testCaseId;
        this.testCaseSummary = testCaseSummary;
        this.testCaseDescription = testCaseDescription;
        this.testCasePreConditions = testCasePreConditions;
        this.testCaseStatus = testCaseStatus;
        this.testCaseAuthor = testCaseAuthor;
    }

    public String getTestCaseStatus() {
        return testCaseStatus;
    }

    public void setTestCaseStatus(String testCaseStatus) {
        this.testCaseStatus = testCaseStatus;
    }

    public String getTestCaseDescription() {
        return testCaseDescription;
    }

    public void setTestCaseDescription(String testCaseDescription) {
        this.testCaseDescription = testCaseDescription;
    }

    public String getTestCaseSummary() {
        return testCaseSummary;
    }

    public void setTestCaseSummary(String testCaseSummary) {
        this.testCaseSummary = testCaseSummary;
    }

    public int getTestCaseId() {
        return testCaseId;
    }

    public void setTestCaseId(int testCaseId) {
        this.testCaseId = testCaseId;
    }

    public String getTestCasePreConditions() {
        return testCasePreConditions;
    }

    public void setTestCasePreConditions(String testCasePreConditions) {
        this.testCasePreConditions = testCasePreConditions;
    }

    public int getTestCaseAuthor() {
        return testCaseAuthor;
    }

    public void setTestCaseAuthor(int testCaseAuthor) {
        this.testCaseAuthor = testCaseAuthor;
    }
}
