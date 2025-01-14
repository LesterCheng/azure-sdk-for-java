// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

import com.azure.resourcemanager.storagemover.models.Project;

/** Samples for Projects Update. */
public final class ProjectsUpdateSamples {
    /*
     * x-ms-original-file: specification/storagemover/resource-manager/Microsoft.StorageMover/stable/2023-03-01/examples/Projects_Update.json
     */
    /**
     * Sample code: Projects_Update.
     *
     * @param manager Entry point to StorageMoverManager.
     */
    public static void projectsUpdate(com.azure.resourcemanager.storagemover.StorageMoverManager manager) {
        Project resource =
            manager
                .projects()
                .getWithResponse(
                    "examples-rg",
                    "examples-storageMoverName",
                    "examples-projectName",
                    com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withDescription("Example Project Description").apply();
    }
}
