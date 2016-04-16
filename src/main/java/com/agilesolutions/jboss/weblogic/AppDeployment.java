
package com.agilesolutions.jboss.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class AppDeployment {

    @SerializedName("security-dd-model")
    @Expose
    private String securityDdModel;
    @SerializedName("staging-mode")
    @Expose
    private String stagingMode;
    @SerializedName("module-type")
    @Expose
    private String moduleType;
    @SerializedName("cache-in-app-directory")
    @Expose
    private Boolean cacheInAppDirectory;
    @SerializedName("source-path")
    @Expose
    private String sourcePath;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("target")
    @Expose
    private String target;
    @SerializedName("plan-staging-mode")
    @Expose
    private PlanStagingMode planStagingMode;

    /**
     * 
     * @return
     *     The securityDdModel
     */
    public String getSecurityDdModel() {
        return securityDdModel;
    }

    /**
     * 
     * @param securityDdModel
     *     The security-dd-model
     */
    public void setSecurityDdModel(String securityDdModel) {
        this.securityDdModel = securityDdModel;
    }

    public AppDeployment withSecurityDdModel(String securityDdModel) {
        this.securityDdModel = securityDdModel;
        return this;
    }

    /**
     * 
     * @return
     *     The stagingMode
     */
    public String getStagingMode() {
        return stagingMode;
    }

    /**
     * 
     * @param stagingMode
     *     The staging-mode
     */
    public void setStagingMode(String stagingMode) {
        this.stagingMode = stagingMode;
    }

    public AppDeployment withStagingMode(String stagingMode) {
        this.stagingMode = stagingMode;
        return this;
    }

    /**
     * 
     * @return
     *     The moduleType
     */
    public String getModuleType() {
        return moduleType;
    }

    /**
     * 
     * @param moduleType
     *     The module-type
     */
    public void setModuleType(String moduleType) {
        this.moduleType = moduleType;
    }

    public AppDeployment withModuleType(String moduleType) {
        this.moduleType = moduleType;
        return this;
    }

    /**
     * 
     * @return
     *     The cacheInAppDirectory
     */
    public Boolean getCacheInAppDirectory() {
        return cacheInAppDirectory;
    }

    /**
     * 
     * @param cacheInAppDirectory
     *     The cache-in-app-directory
     */
    public void setCacheInAppDirectory(Boolean cacheInAppDirectory) {
        this.cacheInAppDirectory = cacheInAppDirectory;
    }

    public AppDeployment withCacheInAppDirectory(Boolean cacheInAppDirectory) {
        this.cacheInAppDirectory = cacheInAppDirectory;
        return this;
    }

    /**
     * 
     * @return
     *     The sourcePath
     */
    public String getSourcePath() {
        return sourcePath;
    }

    /**
     * 
     * @param sourcePath
     *     The source-path
     */
    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    public AppDeployment withSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
        return this;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public AppDeployment withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The target
     */
    public String getTarget() {
        return target;
    }

    /**
     * 
     * @param target
     *     The target
     */
    public void setTarget(String target) {
        this.target = target;
    }

    public AppDeployment withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * 
     * @return
     *     The planStagingMode
     */
    public PlanStagingMode getPlanStagingMode() {
        return planStagingMode;
    }

    /**
     * 
     * @param planStagingMode
     *     The plan-staging-mode
     */
    public void setPlanStagingMode(PlanStagingMode planStagingMode) {
        this.planStagingMode = planStagingMode;
    }

    public AppDeployment withPlanStagingMode(PlanStagingMode planStagingMode) {
        this.planStagingMode = planStagingMode;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(securityDdModel).append(stagingMode).append(moduleType).append(cacheInAppDirectory).append(sourcePath).append(name).append(target).append(planStagingMode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AppDeployment) == false) {
            return false;
        }
        AppDeployment rhs = ((AppDeployment) other);
        return new EqualsBuilder().append(securityDdModel, rhs.securityDdModel).append(stagingMode, rhs.stagingMode).append(moduleType, rhs.moduleType).append(cacheInAppDirectory, rhs.cacheInAppDirectory).append(sourcePath, rhs.sourcePath).append(name, rhs.name).append(target, rhs.target).append(planStagingMode, rhs.planStagingMode).isEquals();
    }

}
