/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * <p>
 * A distribution.
 * </p>
 */
public class Distribution implements Serializable {

    /**
     * The identifier for the distribution. For example: EDFDVBD632BHDS5.
     */
    private String id;

    /**
     * This response element indicates the current status of the
     * distribution. When the status is Deployed, the distribution's
     * information is fully propagated throughout the Amazon CloudFront
     * system.
     */
    private String status;

    /**
     * The date and time the distribution was last modified.
     */
    private java.util.Date lastModifiedTime;

    /**
     * The number of invalidation batches currently in progress.
     */
    private Integer inProgressInvalidationBatches;

    /**
     * The domain name corresponding to the distribution. For example:
     * d604721fxaaqy9.cloudfront.net.
     */
    private String domainName;

    /**
     * CloudFront automatically adds this element to the response only if
     * you've set up the distribution to serve private content with signed
     * URLs. The element lists the key pair IDs that CloudFront is aware of
     * for each trusted signer. The Signer child element lists the AWS
     * account number of the trusted signer (or an empty Self element if the
     * signer is you). The Signer element also includes the IDs of any active
     * key pairs associated with the trusted signer's AWS account. If no
     * KeyPairId element appears for a Signer, that signer can't create
     * working signed URLs.
     */
    private ActiveTrustedSigners activeTrustedSigners;

    /**
     * The current configuration information for the distribution.
     */
    private DistributionConfig distributionConfig;

    /**
     * Default constructor for a new Distribution object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Distribution() {}
    
    /**
     * Constructs a new Distribution object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param id The identifier for the distribution. For example:
     * EDFDVBD632BHDS5.
     * @param status This response element indicates the current status of
     * the distribution. When the status is Deployed, the distribution's
     * information is fully propagated throughout the Amazon CloudFront
     * system.
     * @param domainName The domain name corresponding to the distribution.
     * For example: d604721fxaaqy9.cloudfront.net.
     */
    public Distribution(String id, String status, String domainName) {
        setId(id);
        setStatus(status);
        setDomainName(domainName);
    }

    /**
     * The identifier for the distribution. For example: EDFDVBD632BHDS5.
     *
     * @return The identifier for the distribution. For example: EDFDVBD632BHDS5.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The identifier for the distribution. For example: EDFDVBD632BHDS5.
     *
     * @param id The identifier for the distribution. For example: EDFDVBD632BHDS5.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The identifier for the distribution. For example: EDFDVBD632BHDS5.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id The identifier for the distribution. For example: EDFDVBD632BHDS5.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Distribution withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * This response element indicates the current status of the
     * distribution. When the status is Deployed, the distribution's
     * information is fully propagated throughout the Amazon CloudFront
     * system.
     *
     * @return This response element indicates the current status of the
     *         distribution. When the status is Deployed, the distribution's
     *         information is fully propagated throughout the Amazon CloudFront
     *         system.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * This response element indicates the current status of the
     * distribution. When the status is Deployed, the distribution's
     * information is fully propagated throughout the Amazon CloudFront
     * system.
     *
     * @param status This response element indicates the current status of the
     *         distribution. When the status is Deployed, the distribution's
     *         information is fully propagated throughout the Amazon CloudFront
     *         system.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * This response element indicates the current status of the
     * distribution. When the status is Deployed, the distribution's
     * information is fully propagated throughout the Amazon CloudFront
     * system.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status This response element indicates the current status of the
     *         distribution. When the status is Deployed, the distribution's
     *         information is fully propagated throughout the Amazon CloudFront
     *         system.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Distribution withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The date and time the distribution was last modified.
     *
     * @return The date and time the distribution was last modified.
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }
    
    /**
     * The date and time the distribution was last modified.
     *
     * @param lastModifiedTime The date and time the distribution was last modified.
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }
    
    /**
     * The date and time the distribution was last modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastModifiedTime The date and time the distribution was last modified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Distribution withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * The number of invalidation batches currently in progress.
     *
     * @return The number of invalidation batches currently in progress.
     */
    public Integer getInProgressInvalidationBatches() {
        return inProgressInvalidationBatches;
    }
    
    /**
     * The number of invalidation batches currently in progress.
     *
     * @param inProgressInvalidationBatches The number of invalidation batches currently in progress.
     */
    public void setInProgressInvalidationBatches(Integer inProgressInvalidationBatches) {
        this.inProgressInvalidationBatches = inProgressInvalidationBatches;
    }
    
    /**
     * The number of invalidation batches currently in progress.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param inProgressInvalidationBatches The number of invalidation batches currently in progress.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Distribution withInProgressInvalidationBatches(Integer inProgressInvalidationBatches) {
        this.inProgressInvalidationBatches = inProgressInvalidationBatches;
        return this;
    }

    /**
     * The domain name corresponding to the distribution. For example:
     * d604721fxaaqy9.cloudfront.net.
     *
     * @return The domain name corresponding to the distribution. For example:
     *         d604721fxaaqy9.cloudfront.net.
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * The domain name corresponding to the distribution. For example:
     * d604721fxaaqy9.cloudfront.net.
     *
     * @param domainName The domain name corresponding to the distribution. For example:
     *         d604721fxaaqy9.cloudfront.net.
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * The domain name corresponding to the distribution. For example:
     * d604721fxaaqy9.cloudfront.net.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainName The domain name corresponding to the distribution. For example:
     *         d604721fxaaqy9.cloudfront.net.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Distribution withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * CloudFront automatically adds this element to the response only if
     * you've set up the distribution to serve private content with signed
     * URLs. The element lists the key pair IDs that CloudFront is aware of
     * for each trusted signer. The Signer child element lists the AWS
     * account number of the trusted signer (or an empty Self element if the
     * signer is you). The Signer element also includes the IDs of any active
     * key pairs associated with the trusted signer's AWS account. If no
     * KeyPairId element appears for a Signer, that signer can't create
     * working signed URLs.
     *
     * @return CloudFront automatically adds this element to the response only if
     *         you've set up the distribution to serve private content with signed
     *         URLs. The element lists the key pair IDs that CloudFront is aware of
     *         for each trusted signer. The Signer child element lists the AWS
     *         account number of the trusted signer (or an empty Self element if the
     *         signer is you). The Signer element also includes the IDs of any active
     *         key pairs associated with the trusted signer's AWS account. If no
     *         KeyPairId element appears for a Signer, that signer can't create
     *         working signed URLs.
     */
    public ActiveTrustedSigners getActiveTrustedSigners() {
        return activeTrustedSigners;
    }
    
    /**
     * CloudFront automatically adds this element to the response only if
     * you've set up the distribution to serve private content with signed
     * URLs. The element lists the key pair IDs that CloudFront is aware of
     * for each trusted signer. The Signer child element lists the AWS
     * account number of the trusted signer (or an empty Self element if the
     * signer is you). The Signer element also includes the IDs of any active
     * key pairs associated with the trusted signer's AWS account. If no
     * KeyPairId element appears for a Signer, that signer can't create
     * working signed URLs.
     *
     * @param activeTrustedSigners CloudFront automatically adds this element to the response only if
     *         you've set up the distribution to serve private content with signed
     *         URLs. The element lists the key pair IDs that CloudFront is aware of
     *         for each trusted signer. The Signer child element lists the AWS
     *         account number of the trusted signer (or an empty Self element if the
     *         signer is you). The Signer element also includes the IDs of any active
     *         key pairs associated with the trusted signer's AWS account. If no
     *         KeyPairId element appears for a Signer, that signer can't create
     *         working signed URLs.
     */
    public void setActiveTrustedSigners(ActiveTrustedSigners activeTrustedSigners) {
        this.activeTrustedSigners = activeTrustedSigners;
    }
    
    /**
     * CloudFront automatically adds this element to the response only if
     * you've set up the distribution to serve private content with signed
     * URLs. The element lists the key pair IDs that CloudFront is aware of
     * for each trusted signer. The Signer child element lists the AWS
     * account number of the trusted signer (or an empty Self element if the
     * signer is you). The Signer element also includes the IDs of any active
     * key pairs associated with the trusted signer's AWS account. If no
     * KeyPairId element appears for a Signer, that signer can't create
     * working signed URLs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activeTrustedSigners CloudFront automatically adds this element to the response only if
     *         you've set up the distribution to serve private content with signed
     *         URLs. The element lists the key pair IDs that CloudFront is aware of
     *         for each trusted signer. The Signer child element lists the AWS
     *         account number of the trusted signer (or an empty Self element if the
     *         signer is you). The Signer element also includes the IDs of any active
     *         key pairs associated with the trusted signer's AWS account. If no
     *         KeyPairId element appears for a Signer, that signer can't create
     *         working signed URLs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Distribution withActiveTrustedSigners(ActiveTrustedSigners activeTrustedSigners) {
        this.activeTrustedSigners = activeTrustedSigners;
        return this;
    }

    /**
     * The current configuration information for the distribution.
     *
     * @return The current configuration information for the distribution.
     */
    public DistributionConfig getDistributionConfig() {
        return distributionConfig;
    }
    
    /**
     * The current configuration information for the distribution.
     *
     * @param distributionConfig The current configuration information for the distribution.
     */
    public void setDistributionConfig(DistributionConfig distributionConfig) {
        this.distributionConfig = distributionConfig;
    }
    
    /**
     * The current configuration information for the distribution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param distributionConfig The current configuration information for the distribution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Distribution withDistributionConfig(DistributionConfig distributionConfig) {
        this.distributionConfig = distributionConfig;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getLastModifiedTime() != null) sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getInProgressInvalidationBatches() != null) sb.append("InProgressInvalidationBatches: " + getInProgressInvalidationBatches() + ",");
        if (getDomainName() != null) sb.append("DomainName: " + getDomainName() + ",");
        if (getActiveTrustedSigners() != null) sb.append("ActiveTrustedSigners: " + getActiveTrustedSigners() + ",");
        if (getDistributionConfig() != null) sb.append("DistributionConfig: " + getDistributionConfig() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode()); 
        hashCode = prime * hashCode + ((getInProgressInvalidationBatches() == null) ? 0 : getInProgressInvalidationBatches().hashCode()); 
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        hashCode = prime * hashCode + ((getActiveTrustedSigners() == null) ? 0 : getActiveTrustedSigners().hashCode()); 
        hashCode = prime * hashCode + ((getDistributionConfig() == null) ? 0 : getDistributionConfig().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Distribution == false) return false;
        Distribution other = (Distribution)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null) return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false) return false; 
        if (other.getInProgressInvalidationBatches() == null ^ this.getInProgressInvalidationBatches() == null) return false;
        if (other.getInProgressInvalidationBatches() != null && other.getInProgressInvalidationBatches().equals(this.getInProgressInvalidationBatches()) == false) return false; 
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.getActiveTrustedSigners() == null ^ this.getActiveTrustedSigners() == null) return false;
        if (other.getActiveTrustedSigners() != null && other.getActiveTrustedSigners().equals(this.getActiveTrustedSigners()) == false) return false; 
        if (other.getDistributionConfig() == null ^ this.getDistributionConfig() == null) return false;
        if (other.getDistributionConfig() != null && other.getDistributionConfig().equals(this.getDistributionConfig()) == false) return false; 
        return true;
    }
    
}
    