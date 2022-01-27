// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.models.EntityCommonProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** File entity property bag. */
@Immutable
public final class FileEntityProperties extends EntityCommonProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FileEntityProperties.class);

    /*
     * The full path to the file.
     */
    @JsonProperty(value = "directory", access = JsonProperty.Access.WRITE_ONLY)
    private String directory;

    /*
     * The file hash entity identifiers associated with this file
     */
    @JsonProperty(value = "fileHashEntityIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> fileHashEntityIds;

    /*
     * The file name without path (some alerts might not include path).
     */
    @JsonProperty(value = "fileName", access = JsonProperty.Access.WRITE_ONLY)
    private String fileName;

    /*
     * The Host entity id which the file belongs to
     */
    @JsonProperty(value = "hostEntityId", access = JsonProperty.Access.WRITE_ONLY)
    private String hostEntityId;

    /**
     * Get the directory property: The full path to the file.
     *
     * @return the directory value.
     */
    public String directory() {
        return this.directory;
    }

    /**
     * Get the fileHashEntityIds property: The file hash entity identifiers associated with this file.
     *
     * @return the fileHashEntityIds value.
     */
    public List<String> fileHashEntityIds() {
        return this.fileHashEntityIds;
    }

    /**
     * Get the fileName property: The file name without path (some alerts might not include path).
     *
     * @return the fileName value.
     */
    public String fileName() {
        return this.fileName;
    }

    /**
     * Get the hostEntityId property: The Host entity id which the file belongs to.
     *
     * @return the hostEntityId value.
     */
    public String hostEntityId() {
        return this.hostEntityId;
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