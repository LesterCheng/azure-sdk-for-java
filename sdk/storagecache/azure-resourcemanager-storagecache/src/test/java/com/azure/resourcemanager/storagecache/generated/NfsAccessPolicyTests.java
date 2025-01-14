// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.models.NfsAccessPolicy;
import com.azure.resourcemanager.storagecache.models.NfsAccessRule;
import com.azure.resourcemanager.storagecache.models.NfsAccessRuleAccess;
import com.azure.resourcemanager.storagecache.models.NfsAccessRuleScope;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NfsAccessPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NfsAccessPolicy model =
            BinaryData
                .fromString(
                    "{\"name\":\"sncghkjeszz\",\"accessRules\":[{\"scope\":\"network\",\"filter\":\"htxfvgxbfsmxnehm\",\"access\":\"ro\",\"suid\":false,\"submountAccess\":true,\"rootSquash\":true,\"anonymousUID\":\"bfqkkr\",\"anonymousGID\":\"pukgriwflzlfb\"},{\"scope\":\"host\",\"filter\":\"uzycispnqza\",\"access\":\"rw\",\"suid\":true,\"submountAccess\":false,\"rootSquash\":true,\"anonymousUID\":\"dhibnuq\",\"anonymousGID\":\"pikad\"},{\"scope\":\"host\",\"filter\":\"tqagnbuynh\",\"access\":\"rw\",\"suid\":true,\"submountAccess\":false,\"rootSquash\":true,\"anonymousUID\":\"iarbutrcvpna\",\"anonymousGID\":\"mhjrunmpxttdbhr\"}]}")
                .toObject(NfsAccessPolicy.class);
        Assertions.assertEquals("sncghkjeszz", model.name());
        Assertions.assertEquals(NfsAccessRuleScope.NETWORK, model.accessRules().get(0).scope());
        Assertions.assertEquals("htxfvgxbfsmxnehm", model.accessRules().get(0).filter());
        Assertions.assertEquals(NfsAccessRuleAccess.RO, model.accessRules().get(0).access());
        Assertions.assertEquals(false, model.accessRules().get(0).suid());
        Assertions.assertEquals(true, model.accessRules().get(0).submountAccess());
        Assertions.assertEquals(true, model.accessRules().get(0).rootSquash());
        Assertions.assertEquals("bfqkkr", model.accessRules().get(0).anonymousUid());
        Assertions.assertEquals("pukgriwflzlfb", model.accessRules().get(0).anonymousGid());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NfsAccessPolicy model =
            new NfsAccessPolicy()
                .withName("sncghkjeszz")
                .withAccessRules(
                    Arrays
                        .asList(
                            new NfsAccessRule()
                                .withScope(NfsAccessRuleScope.NETWORK)
                                .withFilter("htxfvgxbfsmxnehm")
                                .withAccess(NfsAccessRuleAccess.RO)
                                .withSuid(false)
                                .withSubmountAccess(true)
                                .withRootSquash(true)
                                .withAnonymousUid("bfqkkr")
                                .withAnonymousGid("pukgriwflzlfb"),
                            new NfsAccessRule()
                                .withScope(NfsAccessRuleScope.HOST)
                                .withFilter("uzycispnqza")
                                .withAccess(NfsAccessRuleAccess.RW)
                                .withSuid(true)
                                .withSubmountAccess(false)
                                .withRootSquash(true)
                                .withAnonymousUid("dhibnuq")
                                .withAnonymousGid("pikad"),
                            new NfsAccessRule()
                                .withScope(NfsAccessRuleScope.HOST)
                                .withFilter("tqagnbuynh")
                                .withAccess(NfsAccessRuleAccess.RW)
                                .withSuid(true)
                                .withSubmountAccess(false)
                                .withRootSquash(true)
                                .withAnonymousUid("iarbutrcvpna")
                                .withAnonymousGid("mhjrunmpxttdbhr")));
        model = BinaryData.fromObject(model).toObject(NfsAccessPolicy.class);
        Assertions.assertEquals("sncghkjeszz", model.name());
        Assertions.assertEquals(NfsAccessRuleScope.NETWORK, model.accessRules().get(0).scope());
        Assertions.assertEquals("htxfvgxbfsmxnehm", model.accessRules().get(0).filter());
        Assertions.assertEquals(NfsAccessRuleAccess.RO, model.accessRules().get(0).access());
        Assertions.assertEquals(false, model.accessRules().get(0).suid());
        Assertions.assertEquals(true, model.accessRules().get(0).submountAccess());
        Assertions.assertEquals(true, model.accessRules().get(0).rootSquash());
        Assertions.assertEquals("bfqkkr", model.accessRules().get(0).anonymousUid());
        Assertions.assertEquals("pukgriwflzlfb", model.accessRules().get(0).anonymousGid());
    }
}
