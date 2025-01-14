// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.WindowsConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class WindowsConfigurationTests {
    @Test
    public void testDeserialize() {
        WindowsConfiguration model =
            BinaryData.fromString("{\"enableAutomaticUpdates\":true}").toObject(WindowsConfiguration.class);
        Assertions.assertEquals(true, model.enableAutomaticUpdates());
    }

    @Test
    public void testSerialize() {
        WindowsConfiguration model = new WindowsConfiguration().withEnableAutomaticUpdates(true);
        model = BinaryData.fromObject(model).toObject(WindowsConfiguration.class);
        Assertions.assertEquals(true, model.enableAutomaticUpdates());
    }
}
