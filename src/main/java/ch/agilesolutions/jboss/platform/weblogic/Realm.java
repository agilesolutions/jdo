
package ch.agilesolutions.jboss.platform.weblogic;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Realm {

    @SerializedName("sec:authentication-provider")
    @Expose
    private List<SecAuthenticationProvider> secAuthenticationProvider = new ArrayList<SecAuthenticationProvider>();
    @SerializedName("sec:deploy-role-ignored")
    @Expose
    private Boolean secDeployRoleIgnored;
    @SerializedName("sec:name")
    @Expose
    private String secName;
    @SerializedName("sec:password-validator")
    @Expose
    private SecPasswordValidator secPasswordValidator;
    @SerializedName("sec:role-mapper")
    @Expose
    private SecRoleMapper secRoleMapper;
    @SerializedName("sec:security-dd-model")
    @Expose
    private String secSecurityDdModel;
    @SerializedName("sec:adjudicator")
    @Expose
    private SecAdjudicator secAdjudicator;
    @SerializedName("sec:authorizer")
    @Expose
    private SecAuthorizer secAuthorizer;
    @SerializedName("sec:cert-path-provider")
    @Expose
    private SecCertPathProvider secCertPathProvider;
    @SerializedName("sec:user-lockout-manager")
    @Expose
    private SecUserLockoutManager secUserLockoutManager;
    @SerializedName("sec:deploy-policy-ignored")
    @Expose
    private Boolean secDeployPolicyIgnored;
    @SerializedName("sec:combined-role-mapping-enabled")
    @Expose
    private Boolean secCombinedRoleMappingEnabled;
    @SerializedName("sec:cert-path-builder")
    @Expose
    private String secCertPathBuilder;
    @SerializedName("sec:credential-mapper")
    @Expose
    private SecCredentialMapper secCredentialMapper;

    /**
     * 
     * @return
     *     The secAuthenticationProvider
     */
    public List<SecAuthenticationProvider> getSecAuthenticationProvider() {
        return secAuthenticationProvider;
    }

    /**
     * 
     * @param secAuthenticationProvider
     *     The sec:authentication-provider
     */
    public void setSecAuthenticationProvider(List<SecAuthenticationProvider> secAuthenticationProvider) {
        this.secAuthenticationProvider = secAuthenticationProvider;
    }

    public Realm withSecAuthenticationProvider(List<SecAuthenticationProvider> secAuthenticationProvider) {
        this.secAuthenticationProvider = secAuthenticationProvider;
        return this;
    }

    /**
     * 
     * @return
     *     The secDeployRoleIgnored
     */
    public Boolean getSecDeployRoleIgnored() {
        return secDeployRoleIgnored;
    }

    /**
     * 
     * @param secDeployRoleIgnored
     *     The sec:deploy-role-ignored
     */
    public void setSecDeployRoleIgnored(Boolean secDeployRoleIgnored) {
        this.secDeployRoleIgnored = secDeployRoleIgnored;
    }

    public Realm withSecDeployRoleIgnored(Boolean secDeployRoleIgnored) {
        this.secDeployRoleIgnored = secDeployRoleIgnored;
        return this;
    }

    /**
     * 
     * @return
     *     The secName
     */
    public String getSecName() {
        return secName;
    }

    /**
     * 
     * @param secName
     *     The sec:name
     */
    public void setSecName(String secName) {
        this.secName = secName;
    }

    public Realm withSecName(String secName) {
        this.secName = secName;
        return this;
    }

    /**
     * 
     * @return
     *     The secPasswordValidator
     */
    public SecPasswordValidator getSecPasswordValidator() {
        return secPasswordValidator;
    }

    /**
     * 
     * @param secPasswordValidator
     *     The sec:password-validator
     */
    public void setSecPasswordValidator(SecPasswordValidator secPasswordValidator) {
        this.secPasswordValidator = secPasswordValidator;
    }

    public Realm withSecPasswordValidator(SecPasswordValidator secPasswordValidator) {
        this.secPasswordValidator = secPasswordValidator;
        return this;
    }

    /**
     * 
     * @return
     *     The secRoleMapper
     */
    public SecRoleMapper getSecRoleMapper() {
        return secRoleMapper;
    }

    /**
     * 
     * @param secRoleMapper
     *     The sec:role-mapper
     */
    public void setSecRoleMapper(SecRoleMapper secRoleMapper) {
        this.secRoleMapper = secRoleMapper;
    }

    public Realm withSecRoleMapper(SecRoleMapper secRoleMapper) {
        this.secRoleMapper = secRoleMapper;
        return this;
    }

    /**
     * 
     * @return
     *     The secSecurityDdModel
     */
    public String getSecSecurityDdModel() {
        return secSecurityDdModel;
    }

    /**
     * 
     * @param secSecurityDdModel
     *     The sec:security-dd-model
     */
    public void setSecSecurityDdModel(String secSecurityDdModel) {
        this.secSecurityDdModel = secSecurityDdModel;
    }

    public Realm withSecSecurityDdModel(String secSecurityDdModel) {
        this.secSecurityDdModel = secSecurityDdModel;
        return this;
    }

    /**
     * 
     * @return
     *     The secAdjudicator
     */
    public SecAdjudicator getSecAdjudicator() {
        return secAdjudicator;
    }

    /**
     * 
     * @param secAdjudicator
     *     The sec:adjudicator
     */
    public void setSecAdjudicator(SecAdjudicator secAdjudicator) {
        this.secAdjudicator = secAdjudicator;
    }

    public Realm withSecAdjudicator(SecAdjudicator secAdjudicator) {
        this.secAdjudicator = secAdjudicator;
        return this;
    }

    /**
     * 
     * @return
     *     The secAuthorizer
     */
    public SecAuthorizer getSecAuthorizer() {
        return secAuthorizer;
    }

    /**
     * 
     * @param secAuthorizer
     *     The sec:authorizer
     */
    public void setSecAuthorizer(SecAuthorizer secAuthorizer) {
        this.secAuthorizer = secAuthorizer;
    }

    public Realm withSecAuthorizer(SecAuthorizer secAuthorizer) {
        this.secAuthorizer = secAuthorizer;
        return this;
    }

    /**
     * 
     * @return
     *     The secCertPathProvider
     */
    public SecCertPathProvider getSecCertPathProvider() {
        return secCertPathProvider;
    }

    /**
     * 
     * @param secCertPathProvider
     *     The sec:cert-path-provider
     */
    public void setSecCertPathProvider(SecCertPathProvider secCertPathProvider) {
        this.secCertPathProvider = secCertPathProvider;
    }

    public Realm withSecCertPathProvider(SecCertPathProvider secCertPathProvider) {
        this.secCertPathProvider = secCertPathProvider;
        return this;
    }

    /**
     * 
     * @return
     *     The secUserLockoutManager
     */
    public SecUserLockoutManager getSecUserLockoutManager() {
        return secUserLockoutManager;
    }

    /**
     * 
     * @param secUserLockoutManager
     *     The sec:user-lockout-manager
     */
    public void setSecUserLockoutManager(SecUserLockoutManager secUserLockoutManager) {
        this.secUserLockoutManager = secUserLockoutManager;
    }

    public Realm withSecUserLockoutManager(SecUserLockoutManager secUserLockoutManager) {
        this.secUserLockoutManager = secUserLockoutManager;
        return this;
    }

    /**
     * 
     * @return
     *     The secDeployPolicyIgnored
     */
    public Boolean getSecDeployPolicyIgnored() {
        return secDeployPolicyIgnored;
    }

    /**
     * 
     * @param secDeployPolicyIgnored
     *     The sec:deploy-policy-ignored
     */
    public void setSecDeployPolicyIgnored(Boolean secDeployPolicyIgnored) {
        this.secDeployPolicyIgnored = secDeployPolicyIgnored;
    }

    public Realm withSecDeployPolicyIgnored(Boolean secDeployPolicyIgnored) {
        this.secDeployPolicyIgnored = secDeployPolicyIgnored;
        return this;
    }

    /**
     * 
     * @return
     *     The secCombinedRoleMappingEnabled
     */
    public Boolean getSecCombinedRoleMappingEnabled() {
        return secCombinedRoleMappingEnabled;
    }

    /**
     * 
     * @param secCombinedRoleMappingEnabled
     *     The sec:combined-role-mapping-enabled
     */
    public void setSecCombinedRoleMappingEnabled(Boolean secCombinedRoleMappingEnabled) {
        this.secCombinedRoleMappingEnabled = secCombinedRoleMappingEnabled;
    }

    public Realm withSecCombinedRoleMappingEnabled(Boolean secCombinedRoleMappingEnabled) {
        this.secCombinedRoleMappingEnabled = secCombinedRoleMappingEnabled;
        return this;
    }

    /**
     * 
     * @return
     *     The secCertPathBuilder
     */
    public String getSecCertPathBuilder() {
        return secCertPathBuilder;
    }

    /**
     * 
     * @param secCertPathBuilder
     *     The sec:cert-path-builder
     */
    public void setSecCertPathBuilder(String secCertPathBuilder) {
        this.secCertPathBuilder = secCertPathBuilder;
    }

    public Realm withSecCertPathBuilder(String secCertPathBuilder) {
        this.secCertPathBuilder = secCertPathBuilder;
        return this;
    }

    /**
     * 
     * @return
     *     The secCredentialMapper
     */
    public SecCredentialMapper getSecCredentialMapper() {
        return secCredentialMapper;
    }

    /**
     * 
     * @param secCredentialMapper
     *     The sec:credential-mapper
     */
    public void setSecCredentialMapper(SecCredentialMapper secCredentialMapper) {
        this.secCredentialMapper = secCredentialMapper;
    }

    public Realm withSecCredentialMapper(SecCredentialMapper secCredentialMapper) {
        this.secCredentialMapper = secCredentialMapper;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(secAuthenticationProvider).append(secDeployRoleIgnored).append(secName).append(secPasswordValidator).append(secRoleMapper).append(secSecurityDdModel).append(secAdjudicator).append(secAuthorizer).append(secCertPathProvider).append(secUserLockoutManager).append(secDeployPolicyIgnored).append(secCombinedRoleMappingEnabled).append(secCertPathBuilder).append(secCredentialMapper).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Realm) == false) {
            return false;
        }
        Realm rhs = ((Realm) other);
        return new EqualsBuilder().append(secAuthenticationProvider, rhs.secAuthenticationProvider).append(secDeployRoleIgnored, rhs.secDeployRoleIgnored).append(secName, rhs.secName).append(secPasswordValidator, rhs.secPasswordValidator).append(secRoleMapper, rhs.secRoleMapper).append(secSecurityDdModel, rhs.secSecurityDdModel).append(secAdjudicator, rhs.secAdjudicator).append(secAuthorizer, rhs.secAuthorizer).append(secCertPathProvider, rhs.secCertPathProvider).append(secUserLockoutManager, rhs.secUserLockoutManager).append(secDeployPolicyIgnored, rhs.secDeployPolicyIgnored).append(secCombinedRoleMappingEnabled, rhs.secCombinedRoleMappingEnabled).append(secCertPathBuilder, rhs.secCertPathBuilder).append(secCredentialMapper, rhs.secCredentialMapper).isEquals();
    }

}
