
package ch.agilesolutions.jboss.platform.jboss;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class PeriodicRotatingFileHandler {

    @SerializedName("formatter")
    @Expose
    private Formatter formatter;
    @SerializedName("autoflush")
    @Expose
    private Boolean autoflush;
    @SerializedName("file")
    @Expose
    private File file;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("suffix")
    @Expose
    private Suffix suffix;
    @SerializedName("append")
    @Expose
    private Append append;
    @SerializedName("level")
    @Expose
    private Level level;

    /**
     * 
     * @return
     *     The formatter
     */
    public Formatter getFormatter() {
        return formatter;
    }

    /**
     * 
     * @param formatter
     *     The formatter
     */
    public void setFormatter(Formatter formatter) {
        this.formatter = formatter;
    }

    public PeriodicRotatingFileHandler withFormatter(Formatter formatter) {
        this.formatter = formatter;
        return this;
    }

    /**
     * 
     * @return
     *     The autoflush
     */
    public Boolean getAutoflush() {
        return autoflush;
    }

    /**
     * 
     * @param autoflush
     *     The autoflush
     */
    public void setAutoflush(Boolean autoflush) {
        this.autoflush = autoflush;
    }

    public PeriodicRotatingFileHandler withAutoflush(Boolean autoflush) {
        this.autoflush = autoflush;
        return this;
    }

    /**
     * 
     * @return
     *     The file
     */
    public File getFile() {
        return file;
    }

    /**
     * 
     * @param file
     *     The file
     */
    public void setFile(File file) {
        this.file = file;
    }

    public PeriodicRotatingFileHandler withFile(File file) {
        this.file = file;
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

    public PeriodicRotatingFileHandler withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The suffix
     */
    public Suffix getSuffix() {
        return suffix;
    }

    /**
     * 
     * @param suffix
     *     The suffix
     */
    public void setSuffix(Suffix suffix) {
        this.suffix = suffix;
    }

    public PeriodicRotatingFileHandler withSuffix(Suffix suffix) {
        this.suffix = suffix;
        return this;
    }

    /**
     * 
     * @return
     *     The append
     */
    public Append getAppend() {
        return append;
    }

    /**
     * 
     * @param append
     *     The append
     */
    public void setAppend(Append append) {
        this.append = append;
    }

    public PeriodicRotatingFileHandler withAppend(Append append) {
        this.append = append;
        return this;
    }

    /**
     * 
     * @return
     *     The level
     */
    public Level getLevel() {
        return level;
    }

    /**
     * 
     * @param level
     *     The level
     */
    public void setLevel(Level level) {
        this.level = level;
    }

    public PeriodicRotatingFileHandler withLevel(Level level) {
        this.level = level;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(formatter).append(autoflush).append(file).append(name).append(suffix).append(append).append(level).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PeriodicRotatingFileHandler) == false) {
            return false;
        }
        PeriodicRotatingFileHandler rhs = ((PeriodicRotatingFileHandler) other);
        return new EqualsBuilder().append(formatter, rhs.formatter).append(autoflush, rhs.autoflush).append(file, rhs.file).append(name, rhs.name).append(suffix, rhs.suffix).append(append, rhs.append).append(level, rhs.level).isEquals();
    }

}
