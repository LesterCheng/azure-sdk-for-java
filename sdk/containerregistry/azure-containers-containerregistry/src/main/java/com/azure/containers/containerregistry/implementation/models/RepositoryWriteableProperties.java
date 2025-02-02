// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/** Changeable attributes for Repository. */
@Fluent
public final class RepositoryWriteableProperties implements JsonSerializable<RepositoryWriteableProperties> {
    /*
     * Delete enabled
     */
    private Boolean deleteEnabled;

    /*
     * Write enabled
     */
    private Boolean writeEnabled;

    /*
     * List enabled
     */
    private Boolean listEnabled;

    /*
     * Read enabled
     */
    private Boolean readEnabled;

    /** Creates an instance of RepositoryWriteableProperties class. */
    public RepositoryWriteableProperties() {}

    /**
     * Get the deleteEnabled property: Delete enabled.
     *
     * @return the deleteEnabled value.
     */
    public Boolean isDeleteEnabled() {
        return this.deleteEnabled;
    }

    /**
     * Set the deleteEnabled property: Delete enabled.
     *
     * @param deleteEnabled the deleteEnabled value to set.
     * @return the RepositoryWriteableProperties object itself.
     */
    public RepositoryWriteableProperties setDeleteEnabled(Boolean deleteEnabled) {
        this.deleteEnabled = deleteEnabled;
        return this;
    }

    /**
     * Get the writeEnabled property: Write enabled.
     *
     * @return the writeEnabled value.
     */
    public Boolean isWriteEnabled() {
        return this.writeEnabled;
    }

    /**
     * Set the writeEnabled property: Write enabled.
     *
     * @param writeEnabled the writeEnabled value to set.
     * @return the RepositoryWriteableProperties object itself.
     */
    public RepositoryWriteableProperties setWriteEnabled(Boolean writeEnabled) {
        this.writeEnabled = writeEnabled;
        return this;
    }

    /**
     * Get the listEnabled property: List enabled.
     *
     * @return the listEnabled value.
     */
    public Boolean isListEnabled() {
        return this.listEnabled;
    }

    /**
     * Set the listEnabled property: List enabled.
     *
     * @param listEnabled the listEnabled value to set.
     * @return the RepositoryWriteableProperties object itself.
     */
    public RepositoryWriteableProperties setListEnabled(Boolean listEnabled) {
        this.listEnabled = listEnabled;
        return this;
    }

    /**
     * Get the readEnabled property: Read enabled.
     *
     * @return the readEnabled value.
     */
    public Boolean isReadEnabled() {
        return this.readEnabled;
    }

    /**
     * Set the readEnabled property: Read enabled.
     *
     * @param readEnabled the readEnabled value to set.
     * @return the RepositoryWriteableProperties object itself.
     */
    public RepositoryWriteableProperties setReadEnabled(Boolean readEnabled) {
        this.readEnabled = readEnabled;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("deleteEnabled", this.deleteEnabled);
        jsonWriter.writeBooleanField("writeEnabled", this.writeEnabled);
        jsonWriter.writeBooleanField("listEnabled", this.listEnabled);
        jsonWriter.writeBooleanField("readEnabled", this.readEnabled);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RepositoryWriteableProperties from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RepositoryWriteableProperties if the JsonReader was pointing to an instance of it, or null
     *     if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RepositoryWriteableProperties.
     */
    public static RepositoryWriteableProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    Boolean deleteEnabled = null;
                    Boolean writeEnabled = null;
                    Boolean listEnabled = null;
                    Boolean readEnabled = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("deleteEnabled".equals(fieldName)) {
                            deleteEnabled = reader.getNullable(JsonReader::getBoolean);
                        } else if ("writeEnabled".equals(fieldName)) {
                            writeEnabled = reader.getNullable(JsonReader::getBoolean);
                        } else if ("listEnabled".equals(fieldName)) {
                            listEnabled = reader.getNullable(JsonReader::getBoolean);
                        } else if ("readEnabled".equals(fieldName)) {
                            readEnabled = reader.getNullable(JsonReader::getBoolean);
                        } else {
                            reader.skipChildren();
                        }
                    }
                    RepositoryWriteableProperties deserializedValue = new RepositoryWriteableProperties();
                    deserializedValue.deleteEnabled = deleteEnabled;
                    deserializedValue.writeEnabled = writeEnabled;
                    deserializedValue.listEnabled = listEnabled;
                    deserializedValue.readEnabled = readEnabled;

                    return deserializedValue;
                });
    }
}
