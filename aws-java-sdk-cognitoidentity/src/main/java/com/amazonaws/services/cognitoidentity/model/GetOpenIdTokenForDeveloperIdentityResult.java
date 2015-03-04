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
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

/**
 * <p>
 * Returned in response to a successful
 * <code>GetOpenIdTokenForDeveloperIdentity</code> request.
 * </p>
 */
public class GetOpenIdTokenForDeveloperIdentityResult implements Serializable, Cloneable {

    /**
     * A unique identifier in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityId;

    /**
     * An OpenID token.
     */
    private String token;

    /**
     * A unique identifier in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return A unique identifier in the format REGION:GUID.
     */
    public String getIdentityId() {
        return identityId;
    }
    
    /**
     * A unique identifier in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityId A unique identifier in the format REGION:GUID.
     */
    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }
    
    /**
     * A unique identifier in the format REGION:GUID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityId A unique identifier in the format REGION:GUID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetOpenIdTokenForDeveloperIdentityResult withIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }

    /**
     * An OpenID token.
     *
     * @return An OpenID token.
     */
    public String getToken() {
        return token;
    }
    
    /**
     * An OpenID token.
     *
     * @param token An OpenID token.
     */
    public void setToken(String token) {
        this.token = token;
    }
    
    /**
     * An OpenID token.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param token An OpenID token.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetOpenIdTokenForDeveloperIdentityResult withToken(String token) {
        this.token = token;
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
        if (getIdentityId() != null) sb.append("IdentityId: " + getIdentityId() + ",");
        if (getToken() != null) sb.append("Token: " + getToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode()); 
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetOpenIdTokenForDeveloperIdentityResult == false) return false;
        GetOpenIdTokenForDeveloperIdentityResult other = (GetOpenIdTokenForDeveloperIdentityResult)obj;
        
        if (other.getIdentityId() == null ^ this.getIdentityId() == null) return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false) return false; 
        if (other.getToken() == null ^ this.getToken() == null) return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false) return false; 
        return true;
    }
    
    @Override
    public GetOpenIdTokenForDeveloperIdentityResult clone() {
        try {
            return (GetOpenIdTokenForDeveloperIdentityResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    