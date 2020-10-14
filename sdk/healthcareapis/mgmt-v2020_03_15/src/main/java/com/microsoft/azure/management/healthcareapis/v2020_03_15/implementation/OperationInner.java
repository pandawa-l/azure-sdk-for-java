/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.healthcareapis.v2020_03_15.implementation;

import com.microsoft.azure.management.healthcareapis.v2020_03_15.OperationDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Service REST API operation.
 */
public class OperationInner {
    /**
     * Operation name: {provider}/{resource}/{read | write | action | delete}.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Default value is 'user,system'.
     */
    @JsonProperty(value = "origin", access = JsonProperty.Access.WRITE_ONLY)
    private String origin;

    /**
     * The information displayed about the operation.
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /**
     * Get operation name: {provider}/{resource}/{read | write | action | delete}.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get default value is 'user,system'.
     *
     * @return the origin value
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Get the information displayed about the operation.
     *
     * @return the display value
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the information displayed about the operation.
     *
     * @param display the display value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

}