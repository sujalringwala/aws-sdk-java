/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#updateRdsDbInstance(UpdateRdsDbInstanceRequest) UpdateRdsDbInstance operation}.
 * <p>
 * Updates an Amazon RDS instance.
 * </p>
 * <p>
 * <b>Required Permissions</b> : To use this action, an IAM user must
 * have a Manage permissions level for the stack, or an attached policy
 * that explicitly grants permissions. For more information on user
 * permissions, see
 * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#updateRdsDbInstance(UpdateRdsDbInstanceRequest)
 */
public class UpdateRdsDbInstanceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The Amazon RDS instance's ARN.
     */
    private String rdsDbInstanceArn;

    /**
     * The master user name.
     */
    private String dbUser;

    /**
     * The database password.
     */
    private String dbPassword;

    /**
     * The Amazon RDS instance's ARN.
     *
     * @return The Amazon RDS instance's ARN.
     */
    public String getRdsDbInstanceArn() {
        return rdsDbInstanceArn;
    }
    
    /**
     * The Amazon RDS instance's ARN.
     *
     * @param rdsDbInstanceArn The Amazon RDS instance's ARN.
     */
    public void setRdsDbInstanceArn(String rdsDbInstanceArn) {
        this.rdsDbInstanceArn = rdsDbInstanceArn;
    }
    
    /**
     * The Amazon RDS instance's ARN.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rdsDbInstanceArn The Amazon RDS instance's ARN.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateRdsDbInstanceRequest withRdsDbInstanceArn(String rdsDbInstanceArn) {
        this.rdsDbInstanceArn = rdsDbInstanceArn;
        return this;
    }

    /**
     * The master user name.
     *
     * @return The master user name.
     */
    public String getDbUser() {
        return dbUser;
    }
    
    /**
     * The master user name.
     *
     * @param dbUser The master user name.
     */
    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }
    
    /**
     * The master user name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dbUser The master user name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateRdsDbInstanceRequest withDbUser(String dbUser) {
        this.dbUser = dbUser;
        return this;
    }

    /**
     * The database password.
     *
     * @return The database password.
     */
    public String getDbPassword() {
        return dbPassword;
    }
    
    /**
     * The database password.
     *
     * @param dbPassword The database password.
     */
    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }
    
    /**
     * The database password.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dbPassword The database password.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateRdsDbInstanceRequest withDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRdsDbInstanceArn() != null) sb.append("RdsDbInstanceArn: " + getRdsDbInstanceArn() + ",");
        if (getDbUser() != null) sb.append("DbUser: " + getDbUser() + ",");
        if (getDbPassword() != null) sb.append("DbPassword: " + getDbPassword() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRdsDbInstanceArn() == null) ? 0 : getRdsDbInstanceArn().hashCode()); 
        hashCode = prime * hashCode + ((getDbUser() == null) ? 0 : getDbUser().hashCode()); 
        hashCode = prime * hashCode + ((getDbPassword() == null) ? 0 : getDbPassword().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateRdsDbInstanceRequest == false) return false;
        UpdateRdsDbInstanceRequest other = (UpdateRdsDbInstanceRequest)obj;
        
        if (other.getRdsDbInstanceArn() == null ^ this.getRdsDbInstanceArn() == null) return false;
        if (other.getRdsDbInstanceArn() != null && other.getRdsDbInstanceArn().equals(this.getRdsDbInstanceArn()) == false) return false; 
        if (other.getDbUser() == null ^ this.getDbUser() == null) return false;
        if (other.getDbUser() != null && other.getDbUser().equals(this.getDbUser()) == false) return false; 
        if (other.getDbPassword() == null ^ this.getDbPassword() == null) return false;
        if (other.getDbPassword() != null && other.getDbPassword().equals(this.getDbPassword()) == false) return false; 
        return true;
    }
    
    @Override
    public UpdateRdsDbInstanceRequest clone() {
        
            return (UpdateRdsDbInstanceRequest) super.clone();
    }

}
    