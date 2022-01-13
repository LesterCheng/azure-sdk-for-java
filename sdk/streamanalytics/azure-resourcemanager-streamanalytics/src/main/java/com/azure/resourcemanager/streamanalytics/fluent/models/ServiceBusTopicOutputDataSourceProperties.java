// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.streamanalytics.models.AuthenticationMode;
import com.azure.resourcemanager.streamanalytics.models.ServiceBusDataSourceProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The properties that are associated with a Service Bus Topic output. */
@Fluent
public final class ServiceBusTopicOutputDataSourceProperties extends ServiceBusDataSourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceBusTopicOutputDataSourceProperties.class);

    /*
     * The name of the Service Bus Topic. Required on PUT (CreateOrReplace)
     * requests.
     */
    @JsonProperty(value = "topicName")
    private String topicName;

    /*
     * A string array of the names of output columns to be attached to Service
     * Bus messages as custom properties.
     */
    @JsonProperty(value = "propertyColumns")
    private List<String> propertyColumns;

    /*
     * The system properties associated with the Service Bus Topic Output. The
     * following system properties are supported: ReplyToSessionId,
     * ContentType, To, Subject, CorrelationId, TimeToLive, PartitionKey,
     * SessionId, ScheduledEnqueueTime, MessageId, ReplyTo, Label,
     * ScheduledEnqueueTimeUtc.
     */
    @JsonProperty(value = "systemPropertyColumns")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> systemPropertyColumns;

    /**
     * Get the topicName property: The name of the Service Bus Topic. Required on PUT (CreateOrReplace) requests.
     *
     * @return the topicName value.
     */
    public String topicName() {
        return this.topicName;
    }

    /**
     * Set the topicName property: The name of the Service Bus Topic. Required on PUT (CreateOrReplace) requests.
     *
     * @param topicName the topicName value to set.
     * @return the ServiceBusTopicOutputDataSourceProperties object itself.
     */
    public ServiceBusTopicOutputDataSourceProperties withTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * Get the propertyColumns property: A string array of the names of output columns to be attached to Service Bus
     * messages as custom properties.
     *
     * @return the propertyColumns value.
     */
    public List<String> propertyColumns() {
        return this.propertyColumns;
    }

    /**
     * Set the propertyColumns property: A string array of the names of output columns to be attached to Service Bus
     * messages as custom properties.
     *
     * @param propertyColumns the propertyColumns value to set.
     * @return the ServiceBusTopicOutputDataSourceProperties object itself.
     */
    public ServiceBusTopicOutputDataSourceProperties withPropertyColumns(List<String> propertyColumns) {
        this.propertyColumns = propertyColumns;
        return this;
    }

    /**
     * Get the systemPropertyColumns property: The system properties associated with the Service Bus Topic Output. The
     * following system properties are supported: ReplyToSessionId, ContentType, To, Subject, CorrelationId, TimeToLive,
     * PartitionKey, SessionId, ScheduledEnqueueTime, MessageId, ReplyTo, Label, ScheduledEnqueueTimeUtc.
     *
     * @return the systemPropertyColumns value.
     */
    public Map<String, String> systemPropertyColumns() {
        return this.systemPropertyColumns;
    }

    /**
     * Set the systemPropertyColumns property: The system properties associated with the Service Bus Topic Output. The
     * following system properties are supported: ReplyToSessionId, ContentType, To, Subject, CorrelationId, TimeToLive,
     * PartitionKey, SessionId, ScheduledEnqueueTime, MessageId, ReplyTo, Label, ScheduledEnqueueTimeUtc.
     *
     * @param systemPropertyColumns the systemPropertyColumns value to set.
     * @return the ServiceBusTopicOutputDataSourceProperties object itself.
     */
    public ServiceBusTopicOutputDataSourceProperties withSystemPropertyColumns(
        Map<String, String> systemPropertyColumns) {
        this.systemPropertyColumns = systemPropertyColumns;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceBusTopicOutputDataSourceProperties withServiceBusNamespace(String serviceBusNamespace) {
        super.withServiceBusNamespace(serviceBusNamespace);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceBusTopicOutputDataSourceProperties withSharedAccessPolicyName(String sharedAccessPolicyName) {
        super.withSharedAccessPolicyName(sharedAccessPolicyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceBusTopicOutputDataSourceProperties withSharedAccessPolicyKey(String sharedAccessPolicyKey) {
        super.withSharedAccessPolicyKey(sharedAccessPolicyKey);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceBusTopicOutputDataSourceProperties withAuthenticationMode(AuthenticationMode authenticationMode) {
        super.withAuthenticationMode(authenticationMode);
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
    }
}