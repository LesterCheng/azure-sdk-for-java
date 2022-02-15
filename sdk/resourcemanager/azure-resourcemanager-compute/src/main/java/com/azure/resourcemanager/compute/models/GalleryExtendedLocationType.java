// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for GalleryExtendedLocationType. */
public final class GalleryExtendedLocationType extends ExpandableStringEnum<GalleryExtendedLocationType> {
    /** Static value EdgeZone for GalleryExtendedLocationType. */
    public static final GalleryExtendedLocationType EDGE_ZONE = fromString("EdgeZone");

    /** Static value Unknown for GalleryExtendedLocationType. */
    public static final GalleryExtendedLocationType UNKNOWN = fromString("Unknown");

    /**
     * Creates or finds a GalleryExtendedLocationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GalleryExtendedLocationType.
     */
    @JsonCreator
    public static GalleryExtendedLocationType fromString(String name) {
        return fromString(name, GalleryExtendedLocationType.class);
    }

    /** @return known GalleryExtendedLocationType values. */
    public static Collection<GalleryExtendedLocationType> values() {
        return values(GalleryExtendedLocationType.class);
    }
}