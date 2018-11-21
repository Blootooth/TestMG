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
 * The Test Project class for database mapping
 *
 * @author Nuwan Silva (nu1silva@gmail.com)
 * @version 1.0.0
 * @since 2018-11-21
 */
public class TestProject {

    private int projectId;
    private String projectName;
    private String projectPrefix;
    private String projectDescription;
    private String projectStatus;
    private String projectAccessLevel;

    /**
     * Test Project constructor
     *
     * @param projectId          project ID
     * @param projectName        project name
     * @param projectPrefix      project prefix
     * @param projectDescription project description
     * @param projectStatus      project status
     * @param projectAccessLevel access level (private or public)
     */
    public TestProject(int projectId, String projectName, String projectPrefix, String projectDescription,
                       String projectStatus, String projectAccessLevel) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectPrefix = projectPrefix;
        this.projectDescription = projectDescription;
        this.projectStatus = projectStatus;
        this.projectAccessLevel = projectAccessLevel;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectPrefix() {
        return projectPrefix;
    }

    public void setProjectPrefix(String projectPrefix) {
        this.projectPrefix = projectPrefix;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public String getProjectAccessLevel() {
        return projectAccessLevel;
    }

    public void setProjectAccessLevel(String projectAccessLevel) {
        this.projectAccessLevel = projectAccessLevel;
    }
}
