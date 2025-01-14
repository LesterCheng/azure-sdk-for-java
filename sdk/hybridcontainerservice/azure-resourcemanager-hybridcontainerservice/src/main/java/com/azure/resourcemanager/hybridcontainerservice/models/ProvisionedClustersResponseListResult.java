// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.ProvisionedClustersResponseInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ProvisionedClustersResponseListResult model. */
@Fluent
public final class ProvisionedClustersResponseListResult {
    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private List<ProvisionedClustersResponseInner> value;

    /*
     * The nextLink property.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of ProvisionedClustersResponseListResult class. */
    public ProvisionedClustersResponseListResult() {
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public List<ProvisionedClustersResponseInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the ProvisionedClustersResponseListResult object itself.
     */
    public ProvisionedClustersResponseListResult withValue(List<ProvisionedClustersResponseInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The nextLink property.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The nextLink property.
     *
     * @param nextLink the nextLink value to set.
     * @return the ProvisionedClustersResponseListResult object itself.
     */
    public ProvisionedClustersResponseListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
