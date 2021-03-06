/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PutParameter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutParameterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The fully qualified name of the parameter that you want to add to the system. The fully qualified name includes
     * the complete hierarchy of the parameter path and name. For example: <code>/Dev/DBServer/MySQL/db-string13</code>
     * </p>
     * <p>
     * For information about parameter name requirements and restrictions, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-su-create.html#sysman-paramstore-su-create-about"
     * >About Creating Systems Manager Parameters</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The maximum length constraint listed below includes capacity for additional system attributes that are not part
     * of the name. The maximum length for the fully qualified parameter name is 1011 characters.
     * </p>
     * </note>
     */
    private String name;
    /**
     * <p>
     * Information about the parameter that you want to add to the system.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     */
    private String description;
    /**
     * <p>
     * The parameter value that you want to add to the system.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The type of parameter that you want to add to the system.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The KMS Key ID that you want to use to encrypt a parameter when you choose the SecureString data type. If you
     * don't specify a key ID, the system uses the default key associated with your AWS account.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * Overwrite an existing parameter. If not specified, will default to "false".
     * </p>
     */
    private Boolean overwrite;
    /**
     * <p>
     * A regular expression used to validate the parameter value. For example, for String types with values restricted
     * to numbers, you can specify the following: AllowedPattern=^\d+$
     * </p>
     */
    private String allowedPattern;

    /**
     * <p>
     * The fully qualified name of the parameter that you want to add to the system. The fully qualified name includes
     * the complete hierarchy of the parameter path and name. For example: <code>/Dev/DBServer/MySQL/db-string13</code>
     * </p>
     * <p>
     * For information about parameter name requirements and restrictions, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-su-create.html#sysman-paramstore-su-create-about"
     * >About Creating Systems Manager Parameters</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The maximum length constraint listed below includes capacity for additional system attributes that are not part
     * of the name. The maximum length for the fully qualified parameter name is 1011 characters.
     * </p>
     * </note>
     * 
     * @param name
     *        The fully qualified name of the parameter that you want to add to the system. The fully qualified name
     *        includes the complete hierarchy of the parameter path and name. For example:
     *        <code>/Dev/DBServer/MySQL/db-string13</code> </p>
     *        <p>
     *        For information about parameter name requirements and restrictions, see <a href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-su-create.html#sysman-paramstore-su-create-about"
     *        >About Creating Systems Manager Parameters</a> in the <i>AWS Systems Manager User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        The maximum length constraint listed below includes capacity for additional system attributes that are not
     *        part of the name. The maximum length for the fully qualified parameter name is 1011 characters.
     *        </p>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The fully qualified name of the parameter that you want to add to the system. The fully qualified name includes
     * the complete hierarchy of the parameter path and name. For example: <code>/Dev/DBServer/MySQL/db-string13</code>
     * </p>
     * <p>
     * For information about parameter name requirements and restrictions, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-su-create.html#sysman-paramstore-su-create-about"
     * >About Creating Systems Manager Parameters</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The maximum length constraint listed below includes capacity for additional system attributes that are not part
     * of the name. The maximum length for the fully qualified parameter name is 1011 characters.
     * </p>
     * </note>
     * 
     * @return The fully qualified name of the parameter that you want to add to the system. The fully qualified name
     *         includes the complete hierarchy of the parameter path and name. For example:
     *         <code>/Dev/DBServer/MySQL/db-string13</code> </p>
     *         <p>
     *         For information about parameter name requirements and restrictions, see <a href=
     *         "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-su-create.html#sysman-paramstore-su-create-about"
     *         >About Creating Systems Manager Parameters</a> in the <i>AWS Systems Manager User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         The maximum length constraint listed below includes capacity for additional system attributes that are
     *         not part of the name. The maximum length for the fully qualified parameter name is 1011 characters.
     *         </p>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The fully qualified name of the parameter that you want to add to the system. The fully qualified name includes
     * the complete hierarchy of the parameter path and name. For example: <code>/Dev/DBServer/MySQL/db-string13</code>
     * </p>
     * <p>
     * For information about parameter name requirements and restrictions, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-su-create.html#sysman-paramstore-su-create-about"
     * >About Creating Systems Manager Parameters</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The maximum length constraint listed below includes capacity for additional system attributes that are not part
     * of the name. The maximum length for the fully qualified parameter name is 1011 characters.
     * </p>
     * </note>
     * 
     * @param name
     *        The fully qualified name of the parameter that you want to add to the system. The fully qualified name
     *        includes the complete hierarchy of the parameter path and name. For example:
     *        <code>/Dev/DBServer/MySQL/db-string13</code> </p>
     *        <p>
     *        For information about parameter name requirements and restrictions, see <a href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-su-create.html#sysman-paramstore-su-create-about"
     *        >About Creating Systems Manager Parameters</a> in the <i>AWS Systems Manager User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        The maximum length constraint listed below includes capacity for additional system attributes that are not
     *        part of the name. The maximum length for the fully qualified parameter name is 1011 characters.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutParameterRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Information about the parameter that you want to add to the system.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     * 
     * @param description
     *        Information about the parameter that you want to add to the system.</p> <important>
     *        <p>
     *        Do not enter personally identifiable information in this field.
     *        </p>
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Information about the parameter that you want to add to the system.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     * 
     * @return Information about the parameter that you want to add to the system.</p> <important>
     *         <p>
     *         Do not enter personally identifiable information in this field.
     *         </p>
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Information about the parameter that you want to add to the system.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     * 
     * @param description
     *        Information about the parameter that you want to add to the system.</p> <important>
     *        <p>
     *        Do not enter personally identifiable information in this field.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutParameterRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The parameter value that you want to add to the system.
     * </p>
     * 
     * @param value
     *        The parameter value that you want to add to the system.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The parameter value that you want to add to the system.
     * </p>
     * 
     * @return The parameter value that you want to add to the system.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The parameter value that you want to add to the system.
     * </p>
     * 
     * @param value
     *        The parameter value that you want to add to the system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutParameterRequest withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The type of parameter that you want to add to the system.
     * </p>
     * 
     * @param type
     *        The type of parameter that you want to add to the system.
     * @see ParameterType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of parameter that you want to add to the system.
     * </p>
     * 
     * @return The type of parameter that you want to add to the system.
     * @see ParameterType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of parameter that you want to add to the system.
     * </p>
     * 
     * @param type
     *        The type of parameter that you want to add to the system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterType
     */

    public PutParameterRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of parameter that you want to add to the system.
     * </p>
     * 
     * @param type
     *        The type of parameter that you want to add to the system.
     * @see ParameterType
     */

    public void setType(ParameterType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of parameter that you want to add to the system.
     * </p>
     * 
     * @param type
     *        The type of parameter that you want to add to the system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterType
     */

    public PutParameterRequest withType(ParameterType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The KMS Key ID that you want to use to encrypt a parameter when you choose the SecureString data type. If you
     * don't specify a key ID, the system uses the default key associated with your AWS account.
     * </p>
     * 
     * @param keyId
     *        The KMS Key ID that you want to use to encrypt a parameter when you choose the SecureString data type. If
     *        you don't specify a key ID, the system uses the default key associated with your AWS account.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The KMS Key ID that you want to use to encrypt a parameter when you choose the SecureString data type. If you
     * don't specify a key ID, the system uses the default key associated with your AWS account.
     * </p>
     * 
     * @return The KMS Key ID that you want to use to encrypt a parameter when you choose the SecureString data type. If
     *         you don't specify a key ID, the system uses the default key associated with your AWS account.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The KMS Key ID that you want to use to encrypt a parameter when you choose the SecureString data type. If you
     * don't specify a key ID, the system uses the default key associated with your AWS account.
     * </p>
     * 
     * @param keyId
     *        The KMS Key ID that you want to use to encrypt a parameter when you choose the SecureString data type. If
     *        you don't specify a key ID, the system uses the default key associated with your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutParameterRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * Overwrite an existing parameter. If not specified, will default to "false".
     * </p>
     * 
     * @param overwrite
     *        Overwrite an existing parameter. If not specified, will default to "false".
     */

    public void setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
    }

    /**
     * <p>
     * Overwrite an existing parameter. If not specified, will default to "false".
     * </p>
     * 
     * @return Overwrite an existing parameter. If not specified, will default to "false".
     */

    public Boolean getOverwrite() {
        return this.overwrite;
    }

    /**
     * <p>
     * Overwrite an existing parameter. If not specified, will default to "false".
     * </p>
     * 
     * @param overwrite
     *        Overwrite an existing parameter. If not specified, will default to "false".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutParameterRequest withOverwrite(Boolean overwrite) {
        setOverwrite(overwrite);
        return this;
    }

    /**
     * <p>
     * Overwrite an existing parameter. If not specified, will default to "false".
     * </p>
     * 
     * @return Overwrite an existing parameter. If not specified, will default to "false".
     */

    public Boolean isOverwrite() {
        return this.overwrite;
    }

    /**
     * <p>
     * A regular expression used to validate the parameter value. For example, for String types with values restricted
     * to numbers, you can specify the following: AllowedPattern=^\d+$
     * </p>
     * 
     * @param allowedPattern
     *        A regular expression used to validate the parameter value. For example, for String types with values
     *        restricted to numbers, you can specify the following: AllowedPattern=^\d+$
     */

    public void setAllowedPattern(String allowedPattern) {
        this.allowedPattern = allowedPattern;
    }

    /**
     * <p>
     * A regular expression used to validate the parameter value. For example, for String types with values restricted
     * to numbers, you can specify the following: AllowedPattern=^\d+$
     * </p>
     * 
     * @return A regular expression used to validate the parameter value. For example, for String types with values
     *         restricted to numbers, you can specify the following: AllowedPattern=^\d+$
     */

    public String getAllowedPattern() {
        return this.allowedPattern;
    }

    /**
     * <p>
     * A regular expression used to validate the parameter value. For example, for String types with values restricted
     * to numbers, you can specify the following: AllowedPattern=^\d+$
     * </p>
     * 
     * @param allowedPattern
     *        A regular expression used to validate the parameter value. For example, for String types with values
     *        restricted to numbers, you can specify the following: AllowedPattern=^\d+$
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutParameterRequest withAllowedPattern(String allowedPattern) {
        setAllowedPattern(allowedPattern);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
        if (getOverwrite() != null)
            sb.append("Overwrite: ").append(getOverwrite()).append(",");
        if (getAllowedPattern() != null)
            sb.append("AllowedPattern: ").append(getAllowedPattern());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutParameterRequest == false)
            return false;
        PutParameterRequest other = (PutParameterRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getOverwrite() == null ^ this.getOverwrite() == null)
            return false;
        if (other.getOverwrite() != null && other.getOverwrite().equals(this.getOverwrite()) == false)
            return false;
        if (other.getAllowedPattern() == null ^ this.getAllowedPattern() == null)
            return false;
        if (other.getAllowedPattern() != null && other.getAllowedPattern().equals(this.getAllowedPattern()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getOverwrite() == null) ? 0 : getOverwrite().hashCode());
        hashCode = prime * hashCode + ((getAllowedPattern() == null) ? 0 : getAllowedPattern().hashCode());
        return hashCode;
    }

    @Override
    public PutParameterRequest clone() {
        return (PutParameterRequest) super.clone();
    }

}
