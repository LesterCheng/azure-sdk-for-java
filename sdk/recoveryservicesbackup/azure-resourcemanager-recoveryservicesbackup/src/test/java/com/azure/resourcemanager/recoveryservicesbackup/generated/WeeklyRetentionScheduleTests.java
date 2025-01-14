// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DayOfWeek;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDuration;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDurationType;
import com.azure.resourcemanager.recoveryservicesbackup.models.WeeklyRetentionSchedule;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class WeeklyRetentionScheduleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WeeklyRetentionSchedule model =
            BinaryData
                .fromString(
                    "{\"daysOfTheWeek\":[\"Tuesday\",\"Friday\"],\"retentionTimes\":[\"2021-08-02T08:34:03Z\",\"2021-11-12T19:35:08Z\"],\"retentionDuration\":{\"count\":1038771362,\"durationType\":\"Months\"}}")
                .toObject(WeeklyRetentionSchedule.class);
        Assertions.assertEquals(DayOfWeek.TUESDAY, model.daysOfTheWeek().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-02T08:34:03Z"), model.retentionTimes().get(0));
        Assertions.assertEquals(1038771362, model.retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.MONTHS, model.retentionDuration().durationType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WeeklyRetentionSchedule model =
            new WeeklyRetentionSchedule()
                .withDaysOfTheWeek(Arrays.asList(DayOfWeek.TUESDAY, DayOfWeek.FRIDAY))
                .withRetentionTimes(
                    Arrays
                        .asList(
                            OffsetDateTime.parse("2021-08-02T08:34:03Z"), OffsetDateTime.parse("2021-11-12T19:35:08Z")))
                .withRetentionDuration(
                    new RetentionDuration().withCount(1038771362).withDurationType(RetentionDurationType.MONTHS));
        model = BinaryData.fromObject(model).toObject(WeeklyRetentionSchedule.class);
        Assertions.assertEquals(DayOfWeek.TUESDAY, model.daysOfTheWeek().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-02T08:34:03Z"), model.retentionTimes().get(0));
        Assertions.assertEquals(1038771362, model.retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.MONTHS, model.retentionDuration().durationType());
    }
}
