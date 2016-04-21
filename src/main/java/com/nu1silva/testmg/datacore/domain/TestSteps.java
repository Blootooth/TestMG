package com.nu1silva.testmg.datacore.domain;

public class TestSteps {

    private int testStepId;
    private int testCaseId;
    private String testStepAction;
    private String testStepExpectedResult;
    private String testStepExecutionType;

    public TestSteps() {
    }

    public TestSteps(int testStepId, int testCaseId, String testStepAction, String testStepExpectedResult, String testStepExecutionType) {
        this.testStepId = testStepId;
        this.testCaseId = testCaseId;
        this.testStepAction = testStepAction;
        this.testStepExpectedResult = testStepExpectedResult;
        this.testStepExecutionType = testStepExecutionType;
    }

    public int getTestStepId() {
        return testStepId;
    }

    public void setTestStepId(int testStepId) {
        this.testStepId = testStepId;
    }

    public int getTestCaseId() {
        return testCaseId;
    }

    public void setTestCaseId(int testCaseId) {
        this.testCaseId = testCaseId;
    }

    public String getTestStepAction() {
        return testStepAction;
    }

    public void setTestStepAction(String testStepAction) {
        this.testStepAction = testStepAction;
    }

    public String getTestStepExpectedResult() {
        return testStepExpectedResult;
    }

    public void setTestStepExpectedResult(String testStepExpectedResult) {
        this.testStepExpectedResult = testStepExpectedResult;
    }

    public String getTestStepExecutionType() {
        return testStepExecutionType;
    }

    public void setTestStepExecutionType(String testStepExecutionType) {
        this.testStepExecutionType = testStepExecutionType;
    }
}
