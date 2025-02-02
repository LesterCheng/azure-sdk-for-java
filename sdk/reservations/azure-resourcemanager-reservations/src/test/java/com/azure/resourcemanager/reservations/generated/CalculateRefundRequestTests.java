// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.reservations.models.CalculateRefundRequest;
import com.azure.resourcemanager.reservations.models.CalculateRefundRequestProperties;
import com.azure.resourcemanager.reservations.models.ReservationToReturn;
import org.junit.jupiter.api.Assertions;

public final class CalculateRefundRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CalculateRefundRequest model =
            BinaryData
                .fromString(
                    "{\"id\":\"gsxnkjzkdeslpv\",\"properties\":{\"scope\":\"wiyighxpkdw\",\"reservationToReturn\":{\"reservationId\":\"iuebbaumny\",\"quantity\":624396177}}}")
                .toObject(CalculateRefundRequest.class);
        Assertions.assertEquals("gsxnkjzkdeslpv", model.id());
        Assertions.assertEquals("wiyighxpkdw", model.properties().scope());
        Assertions.assertEquals("iuebbaumny", model.properties().reservationToReturn().reservationId());
        Assertions.assertEquals(624396177, model.properties().reservationToReturn().quantity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CalculateRefundRequest model =
            new CalculateRefundRequest()
                .withId("gsxnkjzkdeslpv")
                .withProperties(
                    new CalculateRefundRequestProperties()
                        .withScope("wiyighxpkdw")
                        .withReservationToReturn(
                            new ReservationToReturn().withReservationId("iuebbaumny").withQuantity(624396177)));
        model = BinaryData.fromObject(model).toObject(CalculateRefundRequest.class);
        Assertions.assertEquals("gsxnkjzkdeslpv", model.id());
        Assertions.assertEquals("wiyighxpkdw", model.properties().scope());
        Assertions.assertEquals("iuebbaumny", model.properties().reservationToReturn().reservationId());
        Assertions.assertEquals(624396177, model.properties().reservationToReturn().quantity());
    }
}
