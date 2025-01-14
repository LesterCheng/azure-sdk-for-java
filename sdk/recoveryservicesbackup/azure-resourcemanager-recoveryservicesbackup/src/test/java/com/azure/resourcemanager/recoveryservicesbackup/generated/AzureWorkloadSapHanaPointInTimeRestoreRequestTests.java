// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadSapHanaPointInTimeRestoreRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.OverwriteOptions;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryMode;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryType;
import com.azure.resourcemanager.recoveryservicesbackup.models.TargetRestoreInfo;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureWorkloadSapHanaPointInTimeRestoreRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureWorkloadSapHanaPointInTimeRestoreRequest model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureWorkloadSAPHanaPointInTimeRestoreRequest\",\"pointInTime\":\"2021-11-22T18:27:05Z\",\"recoveryType\":\"Offline\",\"sourceResourceId\":\"efdeesve\",\"propertyBag\":{\"sawddjibabxvi\":\"jpxtxsuwprtuj\",\"tfgle\":\"itvtzeexavo\"},\"targetInfo\":{\"overwriteOption\":\"Invalid\",\"containerId\":\"bwpypqtgsfjacb\",\"databaseName\":\"hhxud\",\"targetDirectoryForFileRestore\":\"vodhtn\"},\"recoveryMode\":\"Invalid\",\"targetVirtualMachineId\":\"dhzmmesckdlp\"}")
                .toObject(AzureWorkloadSapHanaPointInTimeRestoreRequest.class);
        Assertions.assertEquals(RecoveryType.OFFLINE, model.recoveryType());
        Assertions.assertEquals("efdeesve", model.sourceResourceId());
        Assertions.assertEquals("jpxtxsuwprtuj", model.propertyBag().get("sawddjibabxvi"));
        Assertions.assertEquals(OverwriteOptions.INVALID, model.targetInfo().overwriteOption());
        Assertions.assertEquals("bwpypqtgsfjacb", model.targetInfo().containerId());
        Assertions.assertEquals("hhxud", model.targetInfo().databaseName());
        Assertions.assertEquals("vodhtn", model.targetInfo().targetDirectoryForFileRestore());
        Assertions.assertEquals(RecoveryMode.INVALID, model.recoveryMode());
        Assertions.assertEquals("dhzmmesckdlp", model.targetVirtualMachineId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-22T18:27:05Z"), model.pointInTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureWorkloadSapHanaPointInTimeRestoreRequest model =
            new AzureWorkloadSapHanaPointInTimeRestoreRequest()
                .withRecoveryType(RecoveryType.OFFLINE)
                .withSourceResourceId("efdeesve")
                .withPropertyBag(mapOf("sawddjibabxvi", "jpxtxsuwprtuj", "tfgle", "itvtzeexavo"))
                .withTargetInfo(
                    new TargetRestoreInfo()
                        .withOverwriteOption(OverwriteOptions.INVALID)
                        .withContainerId("bwpypqtgsfjacb")
                        .withDatabaseName("hhxud")
                        .withTargetDirectoryForFileRestore("vodhtn"))
                .withRecoveryMode(RecoveryMode.INVALID)
                .withTargetVirtualMachineId("dhzmmesckdlp")
                .withPointInTime(OffsetDateTime.parse("2021-11-22T18:27:05Z"));
        model = BinaryData.fromObject(model).toObject(AzureWorkloadSapHanaPointInTimeRestoreRequest.class);
        Assertions.assertEquals(RecoveryType.OFFLINE, model.recoveryType());
        Assertions.assertEquals("efdeesve", model.sourceResourceId());
        Assertions.assertEquals("jpxtxsuwprtuj", model.propertyBag().get("sawddjibabxvi"));
        Assertions.assertEquals(OverwriteOptions.INVALID, model.targetInfo().overwriteOption());
        Assertions.assertEquals("bwpypqtgsfjacb", model.targetInfo().containerId());
        Assertions.assertEquals("hhxud", model.targetInfo().databaseName());
        Assertions.assertEquals("vodhtn", model.targetInfo().targetDirectoryForFileRestore());
        Assertions.assertEquals(RecoveryMode.INVALID, model.recoveryMode());
        Assertions.assertEquals("dhzmmesckdlp", model.targetVirtualMachineId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-22T18:27:05Z"), model.pointInTime());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
