/*
 * Copyright (c) 2018, nu1silva. (https://nu1silva.com) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.nu1silva.testmg.core.domain;

/**
 * Test Case class
 *
 * @author Nuwan Silva (nu1silva@gmail.com)
 * @version 1.0.0
 * @since 2018-11-21
 */
public class TestCase {

    private int testCaseId;
    private String testCaseSummary;
    private String testCaseDescription;
    private String testCasePreConditions;
    private String testCasePriority;        // TODO - change to enum
    private String testCaseType;            // TODO - change to enum
    private String testCaseExecutionTime;
    private String testCaseStatus;          // TODO - change to enum

    /**
     * Test case constructor
     *
     * @param testCaseId            test case id
     * @param testCaseSummary       test case summary
     * @param testCaseDescription   test case description
     * @param testCasePreConditions test case pre-conditions
     * @param testCasePriority      test case priority
     * @param testCaseType          test case type
     * @param testCaseExecutionTime test case execution time
     * @param testCaseStatus        test case status
     */
    public TestCase(int testCaseId, String testCaseSummary, String testCaseDescription, String testCasePreConditions,
                    String testCasePriority, String testCaseType, String testCaseExecutionTime, String testCaseStatus) {
        this.testCaseId = testCaseId;
        this.testCaseSummary = testCaseSummary;
        this.testCaseDescription = testCaseDescription;
        this.testCasePreConditions = testCasePreConditions;
        this.testCasePriority = testCasePriority;
        this.testCaseType = testCaseType;
        this.testCaseExecutionTime = testCaseExecutionTime;
        this.testCaseStatus = testCaseStatus;
    }

    public int getTestCaseId() {
        return testCaseId;
    }

    public void setTestCaseId(int testCaseId) {
        this.testCaseId = testCaseId;
    }

    public String getTestCaseSummary() {
        return testCaseSummary;
    }

    public void setTestCaseSummary(String testCaseSummary) {
        this.testCaseSummary = testCaseSummary;
    }

    public String getTestCaseDescription() {
        return testCaseDescription;
    }

    public void setTestCaseDescription(String testCaseDescription) {
        this.testCaseDescription = testCaseDescription;
    }

    public String getTestCasePreConditions() {
        return testCasePreConditions;
    }

    public void setTestCasePreConditions(String testCasePreConditions) {
        this.testCasePreConditions = testCasePreConditions;
    }

    public String getTestCasePriority() {
        return testCasePriority;
    }

    public void setTestCasePriority(String testCasePriority) {
        this.testCasePriority = testCasePriority;
    }

    public String getTestCaseType() {
        return testCaseType;
    }

    public void setTestCaseType(String testCaseType) {
        this.testCaseType = testCaseType;
    }

    public String getTestCaseExecutionTime() {
        return testCaseExecutionTime;
    }

    public void setTestCaseExecutionTime(String testCaseExecutionTime) {
        this.testCaseExecutionTime = testCaseExecutionTime;
    }

    public String getTestCaseStatus() {
        return testCaseStatus;
    }

    public void setTestCaseStatus(String testCaseStatus) {
        this.testCaseStatus = testCaseStatus;
    }
}
