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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * 
 */
public class DetachVolumeResult implements Serializable, Cloneable {

    /**
     * 
     */
    private VolumeAttachment attachment;

    /**
     * 
     *
     * @return 
     */
    public VolumeAttachment getAttachment() {
        return attachment;
    }
    
    /**
     * 
     *
     * @param attachment 
     */
    public void setAttachment(VolumeAttachment attachment) {
        this.attachment = attachment;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachment 
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DetachVolumeResult withAttachment(VolumeAttachment attachment) {
        this.attachment = attachment;
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
        if (getAttachment() != null) sb.append("Attachment: " + getAttachment() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAttachment() == null) ? 0 : getAttachment().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DetachVolumeResult == false) return false;
        DetachVolumeResult other = (DetachVolumeResult)obj;
        
        if (other.getAttachment() == null ^ this.getAttachment() == null) return false;
        if (other.getAttachment() != null && other.getAttachment().equals(this.getAttachment()) == false) return false; 
        return true;
    }
    
    @Override
    public DetachVolumeResult clone() {
        try {
            return (DetachVolumeResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    