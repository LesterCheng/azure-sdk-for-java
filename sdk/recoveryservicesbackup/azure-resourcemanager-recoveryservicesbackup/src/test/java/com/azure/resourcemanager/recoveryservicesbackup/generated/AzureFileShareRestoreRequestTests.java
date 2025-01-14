// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureFileShareRestoreRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.CopyOptions;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RestoreFileSpecs;
import com.azure.resourcemanager.recoveryservicesbackup.models.RestoreRequestType;
import com.azure.resourcemanager.recoveryservicesbackup.models.TargetAfsRestoreInfo;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureFileShareRestoreRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureFileShareRestoreRequest model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureFileShareRestoreRequest\",\"recoveryType\":\"RestoreDisks\",\"sourceResourceId\":\"khbejdznxc\",\"copyOptions\":\"Invalid\",\"restoreRequestType\":\"ItemLevelRestore\",\"restoreFileSpecs\":[{\"path\":\"volvtn\",\"fileSpecType\":\"qfzgemjdftul\",\"targetFolderPath\":\"tduceamt\"},{\"path\":\"zuo\",\"fileSpecType\":\"jw\",\"targetFolderPath\":\"wqiok\"},{\"path\":\"sx\",\"fileSpecType\":\"jmsvpkjp\",\"targetFolderPath\":\"kwcf\"}],\"targetDetails\":{\"name\":\"jyxgtczh\",\"targetResourceId\":\"dbsdshm\"}}")
                .toObject(AzureFileShareRestoreRequest.class);
        Assertions.assertEquals(RecoveryType.RESTORE_DISKS, model.recoveryType());
        Assertions.assertEquals("khbejdznxc", model.sourceResourceId());
        Assertions.assertEquals(CopyOptions.INVALID, model.copyOptions());
        Assertions.assertEquals(RestoreRequestType.ITEM_LEVEL_RESTORE, model.restoreRequestType());
        Assertions.assertEquals("volvtn", model.restoreFileSpecs().get(0).path());
        Assertions.assertEquals("qfzgemjdftul", model.restoreFileSpecs().get(0).fileSpecType());
        Assertions.assertEquals("tduceamt", model.restoreFileSpecs().get(0).targetFolderPath());
        Assertions.assertEquals("jyxgtczh", model.targetDetails().name());
        Assertions.assertEquals("dbsdshm", model.targetDetails().targetResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureFileShareRestoreRequest model =
            new AzureFileShareRestoreRequest()
                .withRecoveryType(RecoveryType.RESTORE_DISKS)
                .withSourceResourceId("khbejdznxc")
                .withCopyOptions(CopyOptions.INVALID)
                .withRestoreRequestType(RestoreRequestType.ITEM_LEVEL_RESTORE)
                .withRestoreFileSpecs(
                    Arrays
                        .asList(
                            new RestoreFileSpecs()
                                .withPath("volvtn")
                                .withFileSpecType("qfzgemjdftul")
                                .withTargetFolderPath("tduceamt"),
                            new RestoreFileSpecs().withPath("zuo").withFileSpecType("jw").withTargetFolderPath("wqiok"),
                            new RestoreFileSpecs()
                                .withPath("sx")
                                .withFileSpecType("jmsvpkjp")
                                .withTargetFolderPath("kwcf")))
                .withTargetDetails(new TargetAfsRestoreInfo().withName("jyxgtczh").withTargetResourceId("dbsdshm"));
        model = BinaryData.fromObject(model).toObject(AzureFileShareRestoreRequest.class);
        Assertions.assertEquals(RecoveryType.RESTORE_DISKS, model.recoveryType());
        Assertions.assertEquals("khbejdznxc", model.sourceResourceId());
        Assertions.assertEquals(CopyOptions.INVALID, model.copyOptions());
        Assertions.assertEquals(RestoreRequestType.ITEM_LEVEL_RESTORE, model.restoreRequestType());
        Assertions.assertEquals("volvtn", model.restoreFileSpecs().get(0).path());
        Assertions.assertEquals("qfzgemjdftul", model.restoreFileSpecs().get(0).fileSpecType());
        Assertions.assertEquals("tduceamt", model.restoreFileSpecs().get(0).targetFolderPath());
        Assertions.assertEquals("jyxgtczh", model.targetDetails().name());
        Assertions.assertEquals("dbsdshm", model.targetDetails().targetResourceId());
    }
}
