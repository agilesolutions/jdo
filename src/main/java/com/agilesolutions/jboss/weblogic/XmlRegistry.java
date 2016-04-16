
package com.agilesolutions.jboss.weblogic;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class XmlRegistry {

    @SerializedName("transformer-factory")
    @Expose
    private String transformerFactory;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("document-builder-factory")
    @Expose
    private String documentBuilderFactory;
    @SerializedName("sax-parser-factory")
    @Expose
    private String saxParserFactory;

    /**
     * 
     * @return
     *     The transformerFactory
     */
    public String getTransformerFactory() {
        return transformerFactory;
    }

    /**
     * 
     * @param transformerFactory
     *     The transformer-factory
     */
    public void setTransformerFactory(String transformerFactory) {
        this.transformerFactory = transformerFactory;
    }

    public XmlRegistry withTransformerFactory(String transformerFactory) {
        this.transformerFactory = transformerFactory;
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

    public XmlRegistry withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The documentBuilderFactory
     */
    public String getDocumentBuilderFactory() {
        return documentBuilderFactory;
    }

    /**
     * 
     * @param documentBuilderFactory
     *     The document-builder-factory
     */
    public void setDocumentBuilderFactory(String documentBuilderFactory) {
        this.documentBuilderFactory = documentBuilderFactory;
    }

    public XmlRegistry withDocumentBuilderFactory(String documentBuilderFactory) {
        this.documentBuilderFactory = documentBuilderFactory;
        return this;
    }

    /**
     * 
     * @return
     *     The saxParserFactory
     */
    public String getSaxParserFactory() {
        return saxParserFactory;
    }

    /**
     * 
     * @param saxParserFactory
     *     The sax-parser-factory
     */
    public void setSaxParserFactory(String saxParserFactory) {
        this.saxParserFactory = saxParserFactory;
    }

    public XmlRegistry withSaxParserFactory(String saxParserFactory) {
        this.saxParserFactory = saxParserFactory;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(transformerFactory).append(name).append(documentBuilderFactory).append(saxParserFactory).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof XmlRegistry) == false) {
            return false;
        }
        XmlRegistry rhs = ((XmlRegistry) other);
        return new EqualsBuilder().append(transformerFactory, rhs.transformerFactory).append(name, rhs.name).append(documentBuilderFactory, rhs.documentBuilderFactory).append(saxParserFactory, rhs.saxParserFactory).isEquals();
    }

}
