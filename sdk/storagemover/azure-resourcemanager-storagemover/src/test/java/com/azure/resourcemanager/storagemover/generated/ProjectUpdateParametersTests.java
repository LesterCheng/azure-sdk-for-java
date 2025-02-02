// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagemover.models.ProjectUpdateParameters;
import org.junit.jupiter.api.Assertions;

public final class ProjectUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProjectUpdateParameters model =
            BinaryData
                .fromString("{\"properties\":{\"description\":\"coejctbzaqs\"}}")
                .toObject(ProjectUpdateParameters.class);
        Assertions.assertEquals("coejctbzaqs", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProjectUpdateParameters model = new ProjectUpdateParameters().withDescription("coejctbzaqs");
        model = BinaryData.fromObject(model).toObject(ProjectUpdateParameters.class);
        Assertions.assertEquals("coejctbzaqs", model.description());
    }
}
