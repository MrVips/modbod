package io.github.pmckeown.dependencytrack.upload;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Encapsulates the request payload for uploading a BOM
 *
 * @author Paul McKeown
 */
public class UploadBomRequest {

    private String projectName;
    private String projectVersion;
    private boolean autoCreate;
    private String base64EncodedBom;
    private String project;

    UploadBomRequest(String projectName, String projectVersion, boolean autoCreate, String base64EncodedBom) {
        this.projectName = projectName;
        this.projectVersion = projectVersion;
        this.autoCreate = autoCreate;
        this.base64EncodedBom = base64EncodedBom;
    }

    UploadBomRequest(String project, String base64EncodedBom) {
        this.project = project;
        this.base64EncodedBom = base64EncodedBom;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectVersion() {
        return projectVersion;
    }

    public boolean isAutoCreate() {
        return autoCreate;
    }

    public String getBom() {
        return base64EncodedBom;
    }

    public String getProject() {
        return project;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
