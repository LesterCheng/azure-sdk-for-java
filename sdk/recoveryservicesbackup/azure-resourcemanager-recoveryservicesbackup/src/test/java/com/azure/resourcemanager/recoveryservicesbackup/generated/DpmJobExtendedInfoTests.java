// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DpmJobExtendedInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.DpmJobTaskDetails;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DpmJobExtendedInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DpmJobExtendedInfo model =
            BinaryData
                .fromString(
                    "{\"tasksList\":[{\"taskId\":\"winhehfqpo\",\"startTime\":\"2021-02-06T22:44:11Z\",\"endTime\":\"2021-06-10T04:43:01Z\",\"duration\":\"PT171H51M19S\",\"status\":\"mbnkb\"},{\"taskId\":\"qvxkd\",\"startTime\":\"2020-12-21T03:34:37Z\",\"endTime\":\"2021-06-07T23:42:50Z\",\"duration\":\"PT11H18M6S\",\"status\":\"tswbzuwfmd\"},{\"taskId\":\"agegiz\",\"startTime\":\"2021-12-02T00:47:56Z\",\"endTime\":\"2021-08-27T01:37:11Z\",\"duration\":\"PT50H33M35S\",\"status\":\"djub\"},{\"taskId\":\"bqigkx\",\"startTime\":\"2021-04-08T18:01:03Z\",\"endTime\":\"2021-11-10T07:11:50Z\",\"duration\":\"PT65H22M58S\",\"status\":\"gacyrcmjdmspo\"}],\"propertyBag\":{\"frzgbzjed\":\"vuhrylni\"},\"dynamicErrorMessage\":\"tkvnlvxbcuiiznkt\"}")
                .toObject(DpmJobExtendedInfo.class);
        Assertions.assertEquals("winhehfqpo", model.tasksList().get(0).taskId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-06T22:44:11Z"), model.tasksList().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-10T04:43:01Z"), model.tasksList().get(0).endTime());
        Assertions.assertEquals(Duration.parse("PT171H51M19S"), model.tasksList().get(0).duration());
        Assertions.assertEquals("mbnkb", model.tasksList().get(0).status());
        Assertions.assertEquals("vuhrylni", model.propertyBag().get("frzgbzjed"));
        Assertions.assertEquals("tkvnlvxbcuiiznkt", model.dynamicErrorMessage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DpmJobExtendedInfo model =
            new DpmJobExtendedInfo()
                .withTasksList(
                    Arrays
                        .asList(
                            new DpmJobTaskDetails()
                                .withTaskId("winhehfqpo")
                                .withStartTime(OffsetDateTime.parse("2021-02-06T22:44:11Z"))
                                .withEndTime(OffsetDateTime.parse("2021-06-10T04:43:01Z"))
                                .withDuration(Duration.parse("PT171H51M19S"))
                                .withStatus("mbnkb"),
                            new DpmJobTaskDetails()
                                .withTaskId("qvxkd")
                                .withStartTime(OffsetDateTime.parse("2020-12-21T03:34:37Z"))
                                .withEndTime(OffsetDateTime.parse("2021-06-07T23:42:50Z"))
                                .withDuration(Duration.parse("PT11H18M6S"))
                                .withStatus("tswbzuwfmd"),
                            new DpmJobTaskDetails()
                                .withTaskId("agegiz")
                                .withStartTime(OffsetDateTime.parse("2021-12-02T00:47:56Z"))
                                .withEndTime(OffsetDateTime.parse("2021-08-27T01:37:11Z"))
                                .withDuration(Duration.parse("PT50H33M35S"))
                                .withStatus("djub"),
                            new DpmJobTaskDetails()
                                .withTaskId("bqigkx")
                                .withStartTime(OffsetDateTime.parse("2021-04-08T18:01:03Z"))
                                .withEndTime(OffsetDateTime.parse("2021-11-10T07:11:50Z"))
                                .withDuration(Duration.parse("PT65H22M58S"))
                                .withStatus("gacyrcmjdmspo")))
                .withPropertyBag(mapOf("frzgbzjed", "vuhrylni"))
                .withDynamicErrorMessage("tkvnlvxbcuiiznkt");
        model = BinaryData.fromObject(model).toObject(DpmJobExtendedInfo.class);
        Assertions.assertEquals("winhehfqpo", model.tasksList().get(0).taskId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-06T22:44:11Z"), model.tasksList().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-10T04:43:01Z"), model.tasksList().get(0).endTime());
        Assertions.assertEquals(Duration.parse("PT171H51M19S"), model.tasksList().get(0).duration());
        Assertions.assertEquals("mbnkb", model.tasksList().get(0).status());
        Assertions.assertEquals("vuhrylni", model.propertyBag().get("frzgbzjed"));
        Assertions.assertEquals("tkvnlvxbcuiiznkt", model.dynamicErrorMessage());
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
