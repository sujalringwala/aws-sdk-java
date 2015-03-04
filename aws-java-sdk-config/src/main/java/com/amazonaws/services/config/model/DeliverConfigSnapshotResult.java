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
package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * <p>
 * The output for the DeliverConfigSnapshot action in JSON format.
 * </p>
 */
public class DeliverConfigSnapshotResult implements Serializable, Cloneable {

    /**
     * The ID of the snapshot that is being created.
     */
    private String configSnapshotId;

    /**
     * The ID of the snapshot that is being created.
     *
     * @return The ID of the snapshot that is being created.
     */
    public String getConfigSnapshotId() {
        return configSnapshotId;
    }
    
    /**
     * The ID of the snapshot that is being created.
     *
     * @param configSnapshotId The ID of the snapshot that is being created.
     */
    public void setConfigSnapshotId(String configSnapshotId) {
        this.configSnapshotId = configSnapshotId;
    }
    
    /**
     * The ID of the snapshot that is being created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configSnapshotId The ID of the snapshot that is being created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeliverConfigSnapshotResult withConfigSnapshotId(String configSnapshotId) {
        this.configSnapshotId = configSnapshotId;
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
        if (getConfigSnapshotId() != null) sb.append("ConfigSnapshotId: " + getConfigSnapshotId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConfigSnapshotId() == null) ? 0 : getConfigSnapshotId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeliverConfigSnapshotResult == false) return false;
        DeliverConfigSnapshotResult other = (DeliverConfigSnapshotResult)obj;
        
        if (other.getConfigSnapshotId() == null ^ this.getConfigSnapshotId() == null) return false;
        if (other.getConfigSnapshotId() != null && other.getConfigSnapshotId().equals(this.getConfigSnapshotId()) == false) return false; 
        return true;
    }
    
    @Override
    public DeliverConfigSnapshotResult clone() {
        try {
            return (DeliverConfigSnapshotResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    