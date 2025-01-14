// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.MabProtectionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.SchedulePolicy;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MabProtectionPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MabProtectionPolicy model =
            BinaryData
                .fromString(
                    "{\"backupManagementType\":\"MAB\",\"schedulePolicy\":{\"schedulePolicyType\":\"SchedulePolicy\"},\"retentionPolicy\":{\"retentionPolicyType\":\"RetentionPolicy\"},\"protectedItemsCount\":1309345071,\"resourceGuardOperationRequests\":[\"u\",\"hlkyqltqsrog\",\"uwkffdjktsysid\"]}")
                .toObject(MabProtectionPolicy.class);
        Assertions.assertEquals(1309345071, model.protectedItemsCount());
        Assertions.assertEquals("u", model.resourceGuardOperationRequests().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MabProtectionPolicy model =
            new MabProtectionPolicy()
                .withProtectedItemsCount(1309345071)
                .withResourceGuardOperationRequests(Arrays.asList("u", "hlkyqltqsrog", "uwkffdjktsysid"))
                .withSchedulePolicy(new SchedulePolicy())
                .withRetentionPolicy(new RetentionPolicy());
        model = BinaryData.fromObject(model).toObject(MabProtectionPolicy.class);
        Assertions.assertEquals(1309345071, model.protectedItemsCount());
        Assertions.assertEquals("u", model.resourceGuardOperationRequests().get(0));
    }
}
