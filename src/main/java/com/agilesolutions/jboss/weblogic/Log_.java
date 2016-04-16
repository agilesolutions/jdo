
package com.agilesolutions.jboss.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Log_ {

    @SerializedName("rotation-type")
    @Expose
    private String rotationType;
    @SerializedName("rotate-log-on-startup")
    @Expose
    private Boolean rotateLogOnStartup;
    @SerializedName("file-count")
    @Expose
    private Integer fileCount;
    @SerializedName("file-time-span")
    @Expose
    private Integer fileTimeSpan;
    @SerializedName("log-file-rotation-dir")
    @Expose
    private String logFileRotationDir;
    @SerializedName("rotation-time")
    @Expose
    private String rotationTime;
    @SerializedName("file-name")
    @Expose
    private String fileName;
    @SerializedName("number-of-files-limited")
    @Expose
    private Boolean numberOfFilesLimited;

    /**
     * 
     * @return
     *     The rotationType
     */
    public String getRotationType() {
        return rotationType;
    }

    /**
     * 
     * @param rotationType
     *     The rotation-type
     */
    public void setRotationType(String rotationType) {
        this.rotationType = rotationType;
    }

    public Log_ withRotationType(String rotationType) {
        this.rotationType = rotationType;
        return this;
    }

    /**
     * 
     * @return
     *     The rotateLogOnStartup
     */
    public Boolean getRotateLogOnStartup() {
        return rotateLogOnStartup;
    }

    /**
     * 
     * @param rotateLogOnStartup
     *     The rotate-log-on-startup
     */
    public void setRotateLogOnStartup(Boolean rotateLogOnStartup) {
        this.rotateLogOnStartup = rotateLogOnStartup;
    }

    public Log_ withRotateLogOnStartup(Boolean rotateLogOnStartup) {
        this.rotateLogOnStartup = rotateLogOnStartup;
        return this;
    }

    /**
     * 
     * @return
     *     The fileCount
     */
    public Integer getFileCount() {
        return fileCount;
    }

    /**
     * 
     * @param fileCount
     *     The file-count
     */
    public void setFileCount(Integer fileCount) {
        this.fileCount = fileCount;
    }

    public Log_ withFileCount(Integer fileCount) {
        this.fileCount = fileCount;
        return this;
    }

    /**
     * 
     * @return
     *     The fileTimeSpan
     */
    public Integer getFileTimeSpan() {
        return fileTimeSpan;
    }

    /**
     * 
     * @param fileTimeSpan
     *     The file-time-span
     */
    public void setFileTimeSpan(Integer fileTimeSpan) {
        this.fileTimeSpan = fileTimeSpan;
    }

    public Log_ withFileTimeSpan(Integer fileTimeSpan) {
        this.fileTimeSpan = fileTimeSpan;
        return this;
    }

    /**
     * 
     * @return
     *     The logFileRotationDir
     */
    public String getLogFileRotationDir() {
        return logFileRotationDir;
    }

    /**
     * 
     * @param logFileRotationDir
     *     The log-file-rotation-dir
     */
    public void setLogFileRotationDir(String logFileRotationDir) {
        this.logFileRotationDir = logFileRotationDir;
    }

    public Log_ withLogFileRotationDir(String logFileRotationDir) {
        this.logFileRotationDir = logFileRotationDir;
        return this;
    }

    /**
     * 
     * @return
     *     The rotationTime
     */
    public String getRotationTime() {
        return rotationTime;
    }

    /**
     * 
     * @param rotationTime
     *     The rotation-time
     */
    public void setRotationTime(String rotationTime) {
        this.rotationTime = rotationTime;
    }

    public Log_ withRotationTime(String rotationTime) {
        this.rotationTime = rotationTime;
        return this;
    }

    /**
     * 
     * @return
     *     The fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 
     * @param fileName
     *     The file-name
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Log_ withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 
     * @return
     *     The numberOfFilesLimited
     */
    public Boolean getNumberOfFilesLimited() {
        return numberOfFilesLimited;
    }

    /**
     * 
     * @param numberOfFilesLimited
     *     The number-of-files-limited
     */
    public void setNumberOfFilesLimited(Boolean numberOfFilesLimited) {
        this.numberOfFilesLimited = numberOfFilesLimited;
    }

    public Log_ withNumberOfFilesLimited(Boolean numberOfFilesLimited) {
        this.numberOfFilesLimited = numberOfFilesLimited;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rotationType).append(rotateLogOnStartup).append(fileCount).append(fileTimeSpan).append(logFileRotationDir).append(rotationTime).append(fileName).append(numberOfFilesLimited).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Log_) == false) {
            return false;
        }
        Log_ rhs = ((Log_) other);
        return new EqualsBuilder().append(rotationType, rhs.rotationType).append(rotateLogOnStartup, rhs.rotateLogOnStartup).append(fileCount, rhs.fileCount).append(fileTimeSpan, rhs.fileTimeSpan).append(logFileRotationDir, rhs.logFileRotationDir).append(rotationTime, rhs.rotationTime).append(fileName, rhs.fileName).append(numberOfFilesLimited, rhs.numberOfFilesLimited).isEquals();
    }

}
