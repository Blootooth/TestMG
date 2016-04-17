package com.nu1silva.testmg.datacore.domain;

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
