// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MediaStreamingTransportTypeInternal. */
public final class MediaStreamingTransportTypeInternal
        extends ExpandableStringEnum<MediaStreamingTransportTypeInternal> {
    /** Static value websocket for MediaStreamingTransportTypeInternal. */
    public static final MediaStreamingTransportTypeInternal WEBSOCKET = fromString("websocket");

    /**
     * Creates or finds a MediaStreamingTransportTypeInternal from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MediaStreamingTransportTypeInternal.
     */
    @JsonCreator
    public static MediaStreamingTransportTypeInternal fromString(String name) {
        return fromString(name, MediaStreamingTransportTypeInternal.class);
    }

    /**
     * Gets known MediaStreamingTransportTypeInternal values.
     *
     * @return known MediaStreamingTransportTypeInternal values.
     */
    public static Collection<MediaStreamingTransportTypeInternal> values() {
        return values(MediaStreamingTransportTypeInternal.class);
    }
}
