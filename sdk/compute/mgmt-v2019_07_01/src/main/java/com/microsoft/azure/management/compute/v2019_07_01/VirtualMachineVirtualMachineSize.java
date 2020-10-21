/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.compute.v2019_07_01.implementation.VirtualMachineSizeInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2019_07_01.implementation.ComputeManager;

/**
 * Type representing VirtualMachineVirtualMachineSize.
 */
public interface VirtualMachineVirtualMachineSize extends HasInner<VirtualMachineSizeInner>, HasManager<ComputeManager> {
    /**
     * @return the maxDataDiskCount value.
     */
    Integer maxDataDiskCount();

    /**
     * @return the memoryInMB value.
     */
    Integer memoryInMB();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the numberOfCores value.
     */
    Integer numberOfCores();

    /**
     * @return the osDiskSizeInMB value.
     */
    Integer osDiskSizeInMB();

    /**
     * @return the resourceDiskSizeInMB value.
     */
    Integer resourceDiskSizeInMB();

}