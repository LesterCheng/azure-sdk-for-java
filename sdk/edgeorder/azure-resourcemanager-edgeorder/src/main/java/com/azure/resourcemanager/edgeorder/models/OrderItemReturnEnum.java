// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OrderItemReturnEnum. */
public final class OrderItemReturnEnum extends ExpandableStringEnum<OrderItemReturnEnum> {
    /** Static value Returnable for OrderItemReturnEnum. */
    public static final OrderItemReturnEnum RETURNABLE = fromString("Returnable");

    /** Static value ReturnableWithFee for OrderItemReturnEnum. */
    public static final OrderItemReturnEnum RETURNABLE_WITH_FEE = fromString("ReturnableWithFee");

    /** Static value NotReturnable for OrderItemReturnEnum. */
    public static final OrderItemReturnEnum NOT_RETURNABLE = fromString("NotReturnable");

    /**
     * Creates or finds a OrderItemReturnEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OrderItemReturnEnum.
     */
    @JsonCreator
    public static OrderItemReturnEnum fromString(String name) {
        return fromString(name, OrderItemReturnEnum.class);
    }

    /** @return known OrderItemReturnEnum values. */
    public static Collection<OrderItemReturnEnum> values() {
        return values(OrderItemReturnEnum.class);
    }
}