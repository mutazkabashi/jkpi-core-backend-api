/*
 * JKPI Framework
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkpi.core.backend.api.dao;

import org.jkpi.core.backend.api.domain.*;

/**
 * {@code ReportGroupDao} provides persistence access to {@code ReportGroupDao} instances.
 *
 * @see ReportGroup
 * @author Mutaz Hussein Kabashi
 */
public interface ReportGroupDao {

	/**
     * Retrieve a {@code ReportGroup} instance by its primary key
     *
     * @param reportGroupId the primary key of the {@code ReportGroup}
     * @return the {@code ReportGroup}  at the specified primary key
     */
	public ReportGroup readById(Long reportGroupId);

	/**
     * Persist a {@code ReportGroup} instance to the datastore
     *
     * @param reportGroup the {@code ReportGroup} instance
     * @return the updated state of the passed in {@code reportGroup} after being persisted
     */
	public ReportGroup save(ReportGroup reportGroup);

	/**
     * Removed the passed in {@code ReportGroup} instance from the datastore
     *
     * @param reportGroup the {@code ReportGroup} instance to remove
     */
	public void delete(ReportGroup reportGroup);

}
