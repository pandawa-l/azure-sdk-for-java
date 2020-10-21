/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01.implementation;

import com.microsoft.azure.management.compute.v2020_06_01.UpgradeOperationHistoricalStatusInfo;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2020_06_01.UpgradeOperationHistoricalStatusInfoProperties;

class UpgradeOperationHistoricalStatusInfoImpl extends WrapperImpl<UpgradeOperationHistoricalStatusInfoInner> implements UpgradeOperationHistoricalStatusInfo {
    private final ComputeManager manager;
    UpgradeOperationHistoricalStatusInfoImpl(UpgradeOperationHistoricalStatusInfoInner inner, ComputeManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public UpgradeOperationHistoricalStatusInfoProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}