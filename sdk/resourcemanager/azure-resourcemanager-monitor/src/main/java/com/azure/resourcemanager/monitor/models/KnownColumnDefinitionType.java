// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The type of the column data. */
public final class KnownColumnDefinitionType extends ExpandableStringEnum<KnownColumnDefinitionType> {
    /** Static value string for KnownColumnDefinitionType. */
    public static final KnownColumnDefinitionType STRING = fromString("string");

    /** Static value int for KnownColumnDefinitionType. */
    public static final KnownColumnDefinitionType INT = fromString("int");

    /** Static value long for KnownColumnDefinitionType. */
    public static final KnownColumnDefinitionType LONG = fromString("long");

    /** Static value real for KnownColumnDefinitionType. */
    public static final KnownColumnDefinitionType REAL = fromString("real");

    /** Static value boolean for KnownColumnDefinitionType. */
    public static final KnownColumnDefinitionType BOOLEAN = fromString("boolean");

    /** Static value datetime for KnownColumnDefinitionType. */
    public static final KnownColumnDefinitionType DATETIME = fromString("datetime");

    /** Static value dynamic for KnownColumnDefinitionType. */
    public static final KnownColumnDefinitionType DYNAMIC = fromString("dynamic");

    /**
     * Creates or finds a KnownColumnDefinitionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding KnownColumnDefinitionType.
     */
    @JsonCreator
    public static KnownColumnDefinitionType fromString(String name) {
        return fromString(name, KnownColumnDefinitionType.class);
    }

    /**
     * Gets known KnownColumnDefinitionType values.
     *
     * @return known KnownColumnDefinitionType values.
     */
    public static Collection<KnownColumnDefinitionType> values() {
        return values(KnownColumnDefinitionType.class);
    }
}
