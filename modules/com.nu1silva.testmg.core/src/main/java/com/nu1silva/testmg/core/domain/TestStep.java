/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nu1silva.testmg.core.domain;

/**
 * Test Step class
 *
 * @author Nuwan Silva (nu1silva@gmail.com)
 * @version 1.0.0
 * @since 2018-11-21
 */
public class TestStep {

    private int testStepId;
    private String testStepAction;
    private String testStepExpected;
    private String testStepType;

    /**
     * Test step constructor
     *
     * @param testStepId       step id
     * @param testStepAction   step action
     * @param testStepExpected step expected result
     * @param testStepType     step type manual or automated
     */
    public TestStep(int testStepId, String testStepAction, String testStepExpected, String testStepType) {
        this.testStepId = testStepId;
        this.testStepAction = testStepAction;
        this.testStepExpected = testStepExpected;
        this.testStepType = testStepType;
    }

    public int getTestStepId() {
        return testStepId;
    }

    public void setTestStepId(int testStepId) {
        this.testStepId = testStepId;
    }

    public String getTestStepAction() {
        return testStepAction;
    }

    public void setTestStepAction(String testStepAction) {
        this.testStepAction = testStepAction;
    }

    public String getTestStepExpected() {
        return testStepExpected;
    }

    public void setTestStepExpected(String testStepExpected) {
        this.testStepExpected = testStepExpected;
    }

    public String getTestStepType() {
        return testStepType;
    }

    public void setTestStepType(String testStepType) {
        this.testStepType = testStepType;
    }
}
