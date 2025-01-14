// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierInformation;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierType;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class RecoveryPointTierInformationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecoveryPointTierInformation model =
            BinaryData
                .fromString(
                    "{\"type\":\"Invalid\",\"status\":\"Deleted\",\"extendedInfo\":{\"ghfcfiwrxgkneuvy\":\"m\",\"hoxgsgbpf\":\"nzqodfvpg\",\"aqvlgafcqusr\":\"zdjtxvzflbqv\",\"lduycv\":\"vetnwsdtutn\"}}")
                .toObject(RecoveryPointTierInformation.class);
        Assertions.assertEquals(RecoveryPointTierType.INVALID, model.type());
        Assertions.assertEquals(RecoveryPointTierStatus.DELETED, model.status());
        Assertions.assertEquals("m", model.extendedInfo().get("ghfcfiwrxgkneuvy"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecoveryPointTierInformation model =
            new RecoveryPointTierInformation()
                .withType(RecoveryPointTierType.INVALID)
                .withStatus(RecoveryPointTierStatus.DELETED)
                .withExtendedInfo(
                    mapOf(
                        "ghfcfiwrxgkneuvy",
                        "m",
                        "hoxgsgbpf",
                        "nzqodfvpg",
                        "aqvlgafcqusr",
                        "zdjtxvzflbqv",
                        "lduycv",
                        "vetnwsdtutn"));
        model = BinaryData.fromObject(model).toObject(RecoveryPointTierInformation.class);
        Assertions.assertEquals(RecoveryPointTierType.INVALID, model.type());
        Assertions.assertEquals(RecoveryPointTierStatus.DELETED, model.status());
        Assertions.assertEquals("m", model.extendedInfo().get("ghfcfiwrxgkneuvy"));
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
