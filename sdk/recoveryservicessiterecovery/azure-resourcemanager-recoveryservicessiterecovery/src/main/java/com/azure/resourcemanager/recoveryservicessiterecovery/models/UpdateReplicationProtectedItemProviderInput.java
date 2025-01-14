// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Update replication protected item provider specific input. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = UpdateReplicationProtectedItemProviderInput.class)
@JsonTypeName("UpdateReplicationProtectedItemProviderInput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "A2A", value = A2AUpdateReplicationProtectedItemInput.class),
    @JsonSubTypes.Type(
        name = "HyperVReplicaAzure",
        value = HyperVReplicaAzureUpdateReplicationProtectedItemInput.class),
    @JsonSubTypes.Type(name = "InMageAzureV2", value = InMageAzureV2UpdateReplicationProtectedItemInput.class),
    @JsonSubTypes.Type(name = "InMageRcm", value = InMageRcmUpdateReplicationProtectedItemInput.class)
})
@Immutable
public class UpdateReplicationProtectedItemProviderInput {
    /** Creates an instance of UpdateReplicationProtectedItemProviderInput class. */
    public UpdateReplicationProtectedItemProviderInput() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
