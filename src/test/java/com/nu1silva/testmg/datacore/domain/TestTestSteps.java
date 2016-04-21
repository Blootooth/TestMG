package com.nu1silva.testmg.datacore.domain;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTestSteps {

    TestSteps testSteps = new TestSteps(1023, 190, "Sample Action", "Sample Result", "Manual");

    /**
     * Adding these for the sake of coverage
     */
    @Test
    public void testTestStepId() {
        Assert.assertEquals(1023, testSteps.getTestStepId(), "testStepId mismatch");
    }

    @Test
    public void testTestCaseId() {
        Assert.assertEquals(190, testSteps.getTestCaseId(), "testCaseId mismatch");
    }

    @Test
    public void testTestStepActionId() {
        Assert.assertEquals("Sample Action", testSteps.getTestStepAction(), "testStepAction mismatch");
    }

    @Test
    public void testTestStepExpectedResult() {
        Assert.assertEquals("Sample Result", testSteps.getTestStepExpectedResult(), "testStepExpectedResult mismatch");
    }

    @Test
    public void testTestStepExecutionType() {
        Assert.assertEquals("Manual", testSteps.getTestStepExecutionType(), "TestStepExecutionType mismatch");
    }
}
