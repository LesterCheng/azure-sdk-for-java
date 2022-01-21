// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** User resource properties used for updates. */
@Fluent
public class UserUpdateProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UserUpdateProperties.class);

    /*
     * The amount of usage quota time the user gets in addition to the lab
     * usage quota.
     */
    @JsonProperty(value = "additionalUsageQuota")
    private Duration additionalUsageQuota;

    /**
     * Get the additionalUsageQuota property: The amount of usage quota time the user gets in addition to the lab usage
     * quota.
     *
     * @return the additionalUsageQuota value.
     */
    public Duration additionalUsageQuota() {
        return this.additionalUsageQuota;
    }

    /**
     * Set the additionalUsageQuota property: The amount of usage quota time the user gets in addition to the lab usage
     * quota.
     *
     * @param additionalUsageQuota the additionalUsageQuota value to set.
     * @return the UserUpdateProperties object itself.
     */
    public UserUpdateProperties withAdditionalUsageQuota(Duration additionalUsageQuota) {
        this.additionalUsageQuota = additionalUsageQuota;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}