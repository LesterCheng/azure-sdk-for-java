// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.mysqlflexibleserver.models.DataEncryption;
import com.azure.resourcemanager.mysqlflexibleserver.models.DataEncryptionType;
import com.azure.resourcemanager.mysqlflexibleserver.models.EnableStatusEnum;
import com.azure.resourcemanager.mysqlflexibleserver.models.Identity;
import com.azure.resourcemanager.mysqlflexibleserver.models.MaintenanceWindow;
import com.azure.resourcemanager.mysqlflexibleserver.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.mysqlflexibleserver.models.Server;
import com.azure.resourcemanager.mysqlflexibleserver.models.Storage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/** Samples for Servers Update. */
public final class ServersUpdateSamples {
    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/preview/2021-12-01-preview/examples/ServerUpdateWithCustomerMaintenanceWindow.json
     */
    /**
     * Sample code: Update server customer maintenance window.
     *
     * @param manager Entry point to MySqlManager.
     */
    public static void updateServerCustomerMaintenanceWindow(
        com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager) {
        Server resource =
            manager
                .servers()
                .getByResourceGroupWithResponse("testrg", "mysqltestserver", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withMaintenanceWindow(
                new MaintenanceWindow()
                    .withCustomWindow("Enabled")
                    .withStartHour(8)
                    .withStartMinute(0)
                    .withDayOfWeek(1))
            .apply();
    }

    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/preview/2021-12-01-preview/examples/ServerUpdateWithBYOK.json
     */
    /**
     * Sample code: Update server with byok.
     *
     * @param manager Entry point to MySqlManager.
     */
    public static void updateServerWithByok(com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager)
        throws IOException {
        Server resource =
            manager
                .servers()
                .getByResourceGroupWithResponse("testrg", "mysqltestserver", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withIdentity(
                new Identity()
                    .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testrg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/test-identity",
                            SerializerFactory
                                .createDefaultManagementSerializerAdapter()
                                .deserialize("{}", Object.class, SerializerEncoding.JSON))))
            .withDataEncryption(
                new DataEncryption()
                    .withPrimaryUserAssignedIdentityId(
                        "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testrg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/test-identity")
                    .withPrimaryKeyUri("fakeTokenPlaceholder")
                    .withGeoBackupUserAssignedIdentityId(
                        "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testrg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/test-geo-identity")
                    .withGeoBackupKeyUri("fakeTokenPlaceholder")
                    .withType(DataEncryptionType.AZURE_KEY_VAULT))
            .apply();
    }

    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/preview/2021-12-01-preview/examples/ServerUpdate.json
     */
    /**
     * Sample code: Update a server.
     *
     * @param manager Entry point to MySqlManager.
     */
    public static void updateAServer(com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager) {
        Server resource =
            manager
                .servers()
                .getByResourceGroupWithResponse("testrg", "mysqltestserver", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withStorage(
                new Storage()
                    .withStorageSizeGB(30)
                    .withIops(200)
                    .withAutoGrow(EnableStatusEnum.DISABLED)
                    .withAutoIoScaling(EnableStatusEnum.DISABLED))
            .apply();
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
