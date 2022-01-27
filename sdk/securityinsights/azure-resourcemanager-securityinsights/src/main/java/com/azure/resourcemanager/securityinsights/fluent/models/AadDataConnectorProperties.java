// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.models.AlertsDataTypeOfDataConnector;
import com.azure.resourcemanager.securityinsights.models.DataConnectorTenantId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** AAD (Azure Active Directory) data connector properties. */
@Fluent
public final class AadDataConnectorProperties extends DataConnectorTenantId {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AadDataConnectorProperties.class);

    /*
     * The available data types for the connector.
     */
    @JsonProperty(value = "dataTypes")
    private AlertsDataTypeOfDataConnector dataTypes;

    /**
     * Get the dataTypes property: The available data types for the connector.
     *
     * @return the dataTypes value.
     */
    public AlertsDataTypeOfDataConnector dataTypes() {
        return this.dataTypes;
    }

    /**
     * Set the dataTypes property: The available data types for the connector.
     *
     * @param dataTypes the dataTypes value to set.
     * @return the AadDataConnectorProperties object itself.
     */
    public AadDataConnectorProperties withDataTypes(AlertsDataTypeOfDataConnector dataTypes) {
        this.dataTypes = dataTypes;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AadDataConnectorProperties withTenantId(String tenantId) {
        super.withTenantId(tenantId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (dataTypes() != null) {
            dataTypes().validate();
        }
    }
}