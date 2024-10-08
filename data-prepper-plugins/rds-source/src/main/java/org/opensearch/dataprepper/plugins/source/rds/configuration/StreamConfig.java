/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.source.rds.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class StreamConfig {

    private static final int DEFAULT_S3_FOLDER_PARTITION_COUNT = 100;
    private static final int DEFAULT_NUM_WORKERS = 1;

    @JsonProperty("partition_count")
    @Min(1)
    @Max(1000)
    private int s3FolderPartitionCount = DEFAULT_S3_FOLDER_PARTITION_COUNT;

    @JsonProperty("workers")
    @Min(1)
    @Max(1000)
    private int numWorkers = DEFAULT_NUM_WORKERS;

    public int getPartitionCount() {
        return s3FolderPartitionCount;
    }

    public int getNumWorkers() {
        return numWorkers;
    }
}
