// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.models.StorageTargetSpaceAllocation;
import org.junit.jupiter.api.Assertions;

public final class StorageTargetSpaceAllocationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageTargetSpaceAllocation model =
            BinaryData
                .fromString("{\"name\":\"oxuscrpabgyepsbj\",\"allocationPercentage\":300871013}")
                .toObject(StorageTargetSpaceAllocation.class);
        Assertions.assertEquals("oxuscrpabgyepsbj", model.name());
        Assertions.assertEquals(300871013, model.allocationPercentage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageTargetSpaceAllocation model =
            new StorageTargetSpaceAllocation().withName("oxuscrpabgyepsbj").withAllocationPercentage(300871013);
        model = BinaryData.fromObject(model).toObject(StorageTargetSpaceAllocation.class);
        Assertions.assertEquals("oxuscrpabgyepsbj", model.name());
        Assertions.assertEquals(300871013, model.allocationPercentage());
    }
}
