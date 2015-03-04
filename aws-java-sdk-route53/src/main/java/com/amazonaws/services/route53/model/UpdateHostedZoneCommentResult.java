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
package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type containing information about the specified hosted zone
 * after the update.
 * </p>
 */
public class UpdateHostedZoneCommentResult implements Serializable, Cloneable {

    /**
     * A complex type that contain information about the specified hosted
     * zone.
     */
    private HostedZone hostedZone;

    /**
     * A complex type that contain information about the specified hosted
     * zone.
     *
     * @return A complex type that contain information about the specified hosted
     *         zone.
     */
    public HostedZone getHostedZone() {
        return hostedZone;
    }
    
    /**
     * A complex type that contain information about the specified hosted
     * zone.
     *
     * @param hostedZone A complex type that contain information about the specified hosted
     *         zone.
     */
    public void setHostedZone(HostedZone hostedZone) {
        this.hostedZone = hostedZone;
    }
    
    /**
     * A complex type that contain information about the specified hosted
     * zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostedZone A complex type that contain information about the specified hosted
     *         zone.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateHostedZoneCommentResult withHostedZone(HostedZone hostedZone) {
        this.hostedZone = hostedZone;
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
        if (getHostedZone() != null) sb.append("HostedZone: " + getHostedZone() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHostedZone() == null) ? 0 : getHostedZone().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateHostedZoneCommentResult == false) return false;
        UpdateHostedZoneCommentResult other = (UpdateHostedZoneCommentResult)obj;
        
        if (other.getHostedZone() == null ^ this.getHostedZone() == null) return false;
        if (other.getHostedZone() != null && other.getHostedZone().equals(this.getHostedZone()) == false) return false; 
        return true;
    }
    
    @Override
    public UpdateHostedZoneCommentResult clone() {
        try {
            return (UpdateHostedZoneCommentResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    