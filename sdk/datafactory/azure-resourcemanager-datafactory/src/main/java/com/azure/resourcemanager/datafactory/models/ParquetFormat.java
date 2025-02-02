// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The data stored in Parquet format. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ParquetFormat")
@Fluent
public final class ParquetFormat extends DatasetStorageFormat {
    /** Creates an instance of ParquetFormat class. */
    public ParquetFormat() {
    }

    /** {@inheritDoc} */
    @Override
    public ParquetFormat withSerializer(Object serializer) {
        super.withSerializer(serializer);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ParquetFormat withDeserializer(Object deserializer) {
        super.withDeserializer(deserializer);
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
