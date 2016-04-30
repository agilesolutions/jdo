
package ch.agilesolutions.jboss.platform.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Log {

    @SerializedName("domain-log-broadcast-severity")
    @Expose
    private String domainLogBroadcastSeverity;
    @SerializedName("rotation-type")
    @Expose
    private String rotationType;
    @SerializedName("rotate-log-on-startup")
    @Expose
    private Boolean rotateLogOnStartup;
    @SerializedName("file-count")
    @Expose
    private Integer fileCount;
    @SerializedName("logger-severity")
    @Expose
    private String loggerSeverity;
    @SerializedName("file-time-span")
    @Expose
    private Integer fileTimeSpan;
    @SerializedName("log-file-rotation-dir")
    @Expose
    private String logFileRotationDir;
    @SerializedName("stdout-severity")
    @Expose
    private String stdoutSeverity;
    @SerializedName("rotation-time")
    @Expose
    private String rotationTime;
    @SerializedName("file-name")
    @Expose
    private String fileName;
    @SerializedName("number-of-files-limited")
    @Expose
    private Boolean numberOfFilesLimited;
    @SerializedName("memory-buffer-severity")
    @Expose
    private String memoryBufferSeverity;
    @SerializedName("log-file-severity")
    @Expose
    private String logFileSeverity;

    /**
     * 
     * @return
     *     The domainLogBroadcastSeverity
     */
    public String getDomainLogBroadcastSeverity() {
        return domainLogBroadcastSeverity;
    }

    /**
     * 
     * @param domainLogBroadcastSeverity
     *     The domain-log-broadcast-severity
     */
    public void setDomainLogBroadcastSeverity(String domainLogBroadcastSeverity) {
        this.domainLogBroadcastSeverity = domainLogBroadcastSeverity;
    }

    public Log withDomainLogBroadcastSeverity(String domainLogBroadcastSeverity) {
        this.domainLogBroadcastSeverity = domainLogBroadcastSeverity;
        return this;
    }

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

    public Log withRotationType(String rotationType) {
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

    public Log withRotateLogOnStartup(Boolean rotateLogOnStartup) {
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

    public Log withFileCount(Integer fileCount) {
        this.fileCount = fileCount;
        return this;
    }

    /**
     * 
     * @return
     *     The loggerSeverity
     */
    public String getLoggerSeverity() {
        return loggerSeverity;
    }

    /**
     * 
     * @param loggerSeverity
     *     The logger-severity
     */
    public void setLoggerSeverity(String loggerSeverity) {
        this.loggerSeverity = loggerSeverity;
    }

    public Log withLoggerSeverity(String loggerSeverity) {
        this.loggerSeverity = loggerSeverity;
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

    public Log withFileTimeSpan(Integer fileTimeSpan) {
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

    public Log withLogFileRotationDir(String logFileRotationDir) {
        this.logFileRotationDir = logFileRotationDir;
        return this;
    }

    /**
     * 
     * @return
     *     The stdoutSeverity
     */
    public String getStdoutSeverity() {
        return stdoutSeverity;
    }

    /**
     * 
     * @param stdoutSeverity
     *     The stdout-severity
     */
    public void setStdoutSeverity(String stdoutSeverity) {
        this.stdoutSeverity = stdoutSeverity;
    }

    public Log withStdoutSeverity(String stdoutSeverity) {
        this.stdoutSeverity = stdoutSeverity;
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

    public Log withRotationTime(String rotationTime) {
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

    public Log withFileName(String fileName) {
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

    public Log withNumberOfFilesLimited(Boolean numberOfFilesLimited) {
        this.numberOfFilesLimited = numberOfFilesLimited;
        return this;
    }

    /**
     * 
     * @return
     *     The memoryBufferSeverity
     */
    public String getMemoryBufferSeverity() {
        return memoryBufferSeverity;
    }

    /**
     * 
     * @param memoryBufferSeverity
     *     The memory-buffer-severity
     */
    public void setMemoryBufferSeverity(String memoryBufferSeverity) {
        this.memoryBufferSeverity = memoryBufferSeverity;
    }

    public Log withMemoryBufferSeverity(String memoryBufferSeverity) {
        this.memoryBufferSeverity = memoryBufferSeverity;
        return this;
    }

    /**
     * 
     * @return
     *     The logFileSeverity
     */
    public String getLogFileSeverity() {
        return logFileSeverity;
    }

    /**
     * 
     * @param logFileSeverity
     *     The log-file-severity
     */
    public void setLogFileSeverity(String logFileSeverity) {
        this.logFileSeverity = logFileSeverity;
    }

    public Log withLogFileSeverity(String logFileSeverity) {
        this.logFileSeverity = logFileSeverity;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(domainLogBroadcastSeverity).append(rotationType).append(rotateLogOnStartup).append(fileCount).append(loggerSeverity).append(fileTimeSpan).append(logFileRotationDir).append(stdoutSeverity).append(rotationTime).append(fileName).append(numberOfFilesLimited).append(memoryBufferSeverity).append(logFileSeverity).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Log) == false) {
            return false;
        }
        Log rhs = ((Log) other);
        return new EqualsBuilder().append(domainLogBroadcastSeverity, rhs.domainLogBroadcastSeverity).append(rotationType, rhs.rotationType).append(rotateLogOnStartup, rhs.rotateLogOnStartup).append(fileCount, rhs.fileCount).append(loggerSeverity, rhs.loggerSeverity).append(fileTimeSpan, rhs.fileTimeSpan).append(logFileRotationDir, rhs.logFileRotationDir).append(stdoutSeverity, rhs.stdoutSeverity).append(rotationTime, rhs.rotationTime).append(fileName, rhs.fileName).append(numberOfFilesLimited, rhs.numberOfFilesLimited).append(memoryBufferSeverity, rhs.memoryBufferSeverity).append(logFileSeverity, rhs.logFileSeverity).isEquals();
    }

}
