/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.digitaltwins.v2020_10_31;

import rx.Observable;
import com.microsoft.azure.management.digitaltwins.v2020_10_31.DigitalTwinsDescription;
import rx.Completable;

/**
 * Type representing DigitalTwins.
 */
public interface DigitalTwins {
    /**
     * Begins definition for a new DigitalTwinsInstance resource.
     * @param name resource name.
     * @return the first stage of the new DigitalTwinsInstance definition.
     */
    DigitalTwinsDescription.DefinitionStages.Blank defineDigitalTwinsInstance(String name);

    /**
     * Get DigitalTwinsInstances resource.
     *
     * @param resourceGroupName resource group name
     * @param name resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DigitalTwinsDescription> getByResourceGroupAsync(String resourceGroupName, String name);

    /**
     * Get all the DigitalTwinsInstances in a resource group.
     *
     * @param resourceGroupName resource group name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DigitalTwinsDescription> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Get all the DigitalTwinsInstances in a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DigitalTwinsDescription> listAsync();

    /**
     * Delete a DigitalTwinsInstance.
     *
     * @param resourceGroupName resource group name
     * @param name resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String name);

    /**
     * Check if a DigitalTwinsInstance name is available.
     *
     * @param location Location of DigitalTwinsInstance.
     * @param name Resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CheckNameResult> checkNameAvailabilityAsync(String location, String name);

}