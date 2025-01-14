// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadPointInTimeRestoreRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.OverwriteOptions;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryMode;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryType;
import com.azure.resourcemanager.recoveryservicesbackup.models.TargetRestoreInfo;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureWorkloadPointInTimeRestoreRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureWorkloadPointInTimeRestoreRequest model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureWorkloadPointInTimeRestoreRequest\",\"pointInTime\":\"2021-08-31T14:00:37Z\",\"recoveryType\":\"Invalid\",\"sourceResourceId\":\"qgsjjxun\",\"propertyBag\":{\"muvgp\":\"ketwzhhzjhfjmhv\",\"uzjyihsasbhudypo\":\"uneqsxvmhf\",\"slynsqyrpfoo\":\"yue\"},\"targetInfo\":{\"overwriteOption\":\"FailOnConflict\",\"containerId\":\"y\",\"databaseName\":\"jnygq\",\"targetDirectoryForFileRestore\":\"fwqzdz\"},\"recoveryMode\":\"FileRecovery\",\"targetVirtualMachineId\":\"axhnfh\"}")
                .toObject(AzureWorkloadPointInTimeRestoreRequest.class);
        Assertions.assertEquals(RecoveryType.INVALID, model.recoveryType());
        Assertions.assertEquals("qgsjjxun", model.sourceResourceId());
        Assertions.assertEquals("ketwzhhzjhfjmhv", model.propertyBag().get("muvgp"));
        Assertions.assertEquals(OverwriteOptions.FAIL_ON_CONFLICT, model.targetInfo().overwriteOption());
        Assertions.assertEquals("y", model.targetInfo().containerId());
        Assertions.assertEquals("jnygq", model.targetInfo().databaseName());
        Assertions.assertEquals("fwqzdz", model.targetInfo().targetDirectoryForFileRestore());
        Assertions.assertEquals(RecoveryMode.FILE_RECOVERY, model.recoveryMode());
        Assertions.assertEquals("axhnfh", model.targetVirtualMachineId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-31T14:00:37Z"), model.pointInTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureWorkloadPointInTimeRestoreRequest model =
            new AzureWorkloadPointInTimeRestoreRequest()
                .withRecoveryType(RecoveryType.INVALID)
                .withSourceResourceId("qgsjjxun")
                .withPropertyBag(
                    mapOf("muvgp", "ketwzhhzjhfjmhv", "uzjyihsasbhudypo", "uneqsxvmhf", "slynsqyrpfoo", "yue"))
                .withTargetInfo(
                    new TargetRestoreInfo()
                        .withOverwriteOption(OverwriteOptions.FAIL_ON_CONFLICT)
                        .withContainerId("y")
                        .withDatabaseName("jnygq")
                        .withTargetDirectoryForFileRestore("fwqzdz"))
                .withRecoveryMode(RecoveryMode.FILE_RECOVERY)
                .withTargetVirtualMachineId("axhnfh")
                .withPointInTime(OffsetDateTime.parse("2021-08-31T14:00:37Z"));
        model = BinaryData.fromObject(model).toObject(AzureWorkloadPointInTimeRestoreRequest.class);
        Assertions.assertEquals(RecoveryType.INVALID, model.recoveryType());
        Assertions.assertEquals("qgsjjxun", model.sourceResourceId());
        Assertions.assertEquals("ketwzhhzjhfjmhv", model.propertyBag().get("muvgp"));
        Assertions.assertEquals(OverwriteOptions.FAIL_ON_CONFLICT, model.targetInfo().overwriteOption());
        Assertions.assertEquals("y", model.targetInfo().containerId());
        Assertions.assertEquals("jnygq", model.targetInfo().databaseName());
        Assertions.assertEquals("fwqzdz", model.targetInfo().targetDirectoryForFileRestore());
        Assertions.assertEquals(RecoveryMode.FILE_RECOVERY, model.recoveryMode());
        Assertions.assertEquals("axhnfh", model.targetVirtualMachineId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-31T14:00:37Z"), model.pointInTime());
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
