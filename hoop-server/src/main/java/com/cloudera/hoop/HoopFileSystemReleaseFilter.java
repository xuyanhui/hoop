/*
 * Copyright (c) 2011, Cloudera, Inc. All Rights Reserved.
 *
 * Cloudera, Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"). You may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for
 * the specific language governing permissions and limitations under the
 * License.
 */
package com.cloudera.hoop;

import com.cloudera.lib.service.Hadoop;
import com.cloudera.lib.servlet.FileSystemReleaseFilter;

/**
 * Filter that releases Hadoop filesystem instances upon HTTP request
 * completion.
 */
public class HoopFileSystemReleaseFilter extends FileSystemReleaseFilter {

  /**
   * Returns the {@link Hadoop} service to return the Hadoop filesystem
   * instance to.
   * @return the Hadoop service.
   */
  @Override
  protected Hadoop getHadoop() {
    return HoopServer.get().get(Hadoop.class);
  }

}
