package com.nu1silva.testmg.datacore.domain;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTestCase {

    TestCase testCase = new TestCase(1001, "Sample Summary", "Sample Description", "Sample PreConditions", "ACTIVE", 1);

    /**
     * Adding these for the sake of coverage
     */
    @Test
    public void testTestCaseId() {
        Assert.assertEquals(1001, testCase.getTestCaseId(), "testCaseId setting failed");
    }

    @Test
    public void testTestSummary() {
        Assert.assertEquals("Sample Summary", testCase.getTestCaseSummary(), "testCaseSummary setting failed");
    }

    @Test
    public void testTestDescription() {
        Assert.assertEquals("Sample Description", testCase.getTestCaseDescription(), "testCaseDescription setting failed");
    }

    @Test
    public void testTestCasePreConditions() {
        Assert.assertEquals("Sample PreConditions", testCase.getTestCasePreConditions(), "testCasePreCondition setting failed");
    }

    @Test
    public void testTestCaseStatus() {
        Assert.assertEquals("ACTIVE", testCase.getTestCaseStatus(), "testCaseStatus setting failed");
    }

    @Test
    public void testTestCaseAuthor() {
        Assert.assertEquals(1, testCase.getTestCaseAuthor(), "testCaseAuthor setting failed");
    }
}
