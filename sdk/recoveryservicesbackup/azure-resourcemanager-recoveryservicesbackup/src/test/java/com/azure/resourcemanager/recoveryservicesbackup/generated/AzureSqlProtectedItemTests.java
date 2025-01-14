// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureSqlProtectedItem;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureSqlProtectedItemExtendedInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.CreateMode;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectedItemState;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureSqlProtectedItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureSqlProtectedItem model =
            BinaryData
                .fromString(
                    "{\"protectedItemType\":\"Microsoft.Sql/servers/databases\",\"protectedItemDataId\":\"xakvvjgslor\",\"protectionState\":\"Protected\",\"extendedInfo\":{\"oldestRecoveryPoint\":\"2021-09-26T08:03:32Z\",\"recoveryPointCount\":229675569,\"policyState\":\"gkxnyedabg\"},\"backupManagementType\":\"AzureBackupServer\",\"workloadType\":\"Client\",\"containerName\":\"uewbc\",\"sourceResourceId\":\"xuuwhcj\",\"policyId\":\"ccybvp\",\"lastRecoveryPoint\":\"2021-09-20T03:02:08Z\",\"backupSetName\":\"kudzpxgwj\",\"createMode\":\"Default\",\"deferredDeleteTimeInUTC\":\"2021-07-30T18:11:26Z\",\"isScheduledForDeferredDelete\":true,\"deferredDeleteTimeRemaining\":\"yohpfkyrkdbdgiog\",\"isDeferredDeleteScheduleUpcoming\":true,\"isRehydrate\":false,\"resourceGuardOperationRequests\":[\"jnobaiyh\",\"d\",\"iacegfnmn\",\"fpmvmemfnczd\"],\"isArchiveEnabled\":true,\"policyName\":\"alxlllchp\",\"softDeleteRetentionPeriod\":1628077523}")
                .toObject(AzureSqlProtectedItem.class);
        Assertions.assertEquals("uewbc", model.containerName());
        Assertions.assertEquals("xuuwhcj", model.sourceResourceId());
        Assertions.assertEquals("ccybvp", model.policyId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-20T03:02:08Z"), model.lastRecoveryPoint());
        Assertions.assertEquals("kudzpxgwj", model.backupSetName());
        Assertions.assertEquals(CreateMode.DEFAULT, model.createMode());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-30T18:11:26Z"), model.deferredDeleteTimeInUtc());
        Assertions.assertEquals(true, model.isScheduledForDeferredDelete());
        Assertions.assertEquals("yohpfkyrkdbdgiog", model.deferredDeleteTimeRemaining());
        Assertions.assertEquals(true, model.isDeferredDeleteScheduleUpcoming());
        Assertions.assertEquals(false, model.isRehydrate());
        Assertions.assertEquals("jnobaiyh", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(true, model.isArchiveEnabled());
        Assertions.assertEquals("alxlllchp", model.policyName());
        Assertions.assertEquals(1628077523, model.softDeleteRetentionPeriod());
        Assertions.assertEquals("xakvvjgslor", model.protectedItemDataId());
        Assertions.assertEquals(ProtectedItemState.PROTECTED, model.protectionState());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-09-26T08:03:32Z"), model.extendedInfo().oldestRecoveryPoint());
        Assertions.assertEquals(229675569, model.extendedInfo().recoveryPointCount());
        Assertions.assertEquals("gkxnyedabg", model.extendedInfo().policyState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureSqlProtectedItem model =
            new AzureSqlProtectedItem()
                .withContainerName("uewbc")
                .withSourceResourceId("xuuwhcj")
                .withPolicyId("ccybvp")
                .withLastRecoveryPoint(OffsetDateTime.parse("2021-09-20T03:02:08Z"))
                .withBackupSetName("kudzpxgwj")
                .withCreateMode(CreateMode.DEFAULT)
                .withDeferredDeleteTimeInUtc(OffsetDateTime.parse("2021-07-30T18:11:26Z"))
                .withIsScheduledForDeferredDelete(true)
                .withDeferredDeleteTimeRemaining("yohpfkyrkdbdgiog")
                .withIsDeferredDeleteScheduleUpcoming(true)
                .withIsRehydrate(false)
                .withResourceGuardOperationRequests(Arrays.asList("jnobaiyh", "d", "iacegfnmn", "fpmvmemfnczd"))
                .withIsArchiveEnabled(true)
                .withPolicyName("alxlllchp")
                .withSoftDeleteRetentionPeriod(1628077523)
                .withProtectedItemDataId("xakvvjgslor")
                .withProtectionState(ProtectedItemState.PROTECTED)
                .withExtendedInfo(
                    new AzureSqlProtectedItemExtendedInfo()
                        .withOldestRecoveryPoint(OffsetDateTime.parse("2021-09-26T08:03:32Z"))
                        .withRecoveryPointCount(229675569)
                        .withPolicyState("gkxnyedabg"));
        model = BinaryData.fromObject(model).toObject(AzureSqlProtectedItem.class);
        Assertions.assertEquals("uewbc", model.containerName());
        Assertions.assertEquals("xuuwhcj", model.sourceResourceId());
        Assertions.assertEquals("ccybvp", model.policyId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-20T03:02:08Z"), model.lastRecoveryPoint());
        Assertions.assertEquals("kudzpxgwj", model.backupSetName());
        Assertions.assertEquals(CreateMode.DEFAULT, model.createMode());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-30T18:11:26Z"), model.deferredDeleteTimeInUtc());
        Assertions.assertEquals(true, model.isScheduledForDeferredDelete());
        Assertions.assertEquals("yohpfkyrkdbdgiog", model.deferredDeleteTimeRemaining());
        Assertions.assertEquals(true, model.isDeferredDeleteScheduleUpcoming());
        Assertions.assertEquals(false, model.isRehydrate());
        Assertions.assertEquals("jnobaiyh", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(true, model.isArchiveEnabled());
        Assertions.assertEquals("alxlllchp", model.policyName());
        Assertions.assertEquals(1628077523, model.softDeleteRetentionPeriod());
        Assertions.assertEquals("xakvvjgslor", model.protectedItemDataId());
        Assertions.assertEquals(ProtectedItemState.PROTECTED, model.protectionState());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-09-26T08:03:32Z"), model.extendedInfo().oldestRecoveryPoint());
        Assertions.assertEquals(229675569, model.extendedInfo().recoveryPointCount());
        Assertions.assertEquals("gkxnyedabg", model.extendedInfo().policyState());
    }
}
