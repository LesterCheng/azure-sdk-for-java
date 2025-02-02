// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.digitaltwins.models.DigitalTwinsPatchProperties;
import com.azure.resourcemanager.digitaltwins.models.PublicNetworkAccess;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DigitalTwinsPatchPropertiesTests {
    @Test
    public void testDeserialize() {
        DigitalTwinsPatchProperties model =
            BinaryData.fromString("{\"publicNetworkAccess\":\"Enabled\"}").toObject(DigitalTwinsPatchProperties.class);
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.publicNetworkAccess());
    }

    @Test
    public void testSerialize() {
        DigitalTwinsPatchProperties model =
            new DigitalTwinsPatchProperties().withPublicNetworkAccess(PublicNetworkAccess.ENABLED);
        model = BinaryData.fromObject(model).toObject(DigitalTwinsPatchProperties.class);
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.publicNetworkAccess());
    }
}
