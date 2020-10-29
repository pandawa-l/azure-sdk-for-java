/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.communication.v2020_08_20_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An ARM resource with that can accept tags.
 */
public class TaggedResource {
    /**
     * Tags of the service which is a list of key value pairs that describe the
     * resource.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get tags of the service which is a list of key value pairs that describe the resource.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set tags of the service which is a list of key value pairs that describe the resource.
     *
     * @param tags the tags value to set
     * @return the TaggedResource object itself.
     */
    public TaggedResource withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}