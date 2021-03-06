/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.sentry.provider.cache;

import java.util.Set;

import org.apache.sentry.core.common.ActiveRoleSet;

public interface PrivilegeCache {
  /**
   * Get the privileges for the give set of groups with the give active roles
   * from the cache
   */
  Set<String> listPrivileges(Set<String> groups,
      ActiveRoleSet roleSet);

  /**
   * Get the privileges for the give set of groups and users with the give active
   * roles from the cache. For performance issue, it is recommended to use
   * listPrivileges with authorization hierarchy
   */
  @Deprecated
  Set<String> listPrivileges(Set<String> groups, Set<String> users,
      ActiveRoleSet roleSet);

  void close();
}
