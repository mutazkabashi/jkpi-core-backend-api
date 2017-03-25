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
 * {@code ReportColumnDao} provides persistence access to {@code ReportColumn} instances.
 *
 * @author Mutaz Hussein Kabashi
 * @version 1.0.0
 * @since 1.0.0
 * @see ReportColumn
 */
public interface ReportColumnDao {

	/**
     * Retrieve a {@code ReportColumn} instance by its primary key
     *
     * @param reportColumnId the primary key of the {@code ReportColumn}
     * @return the {@code ReportColumn}  at the specified primary key
     */
	public ReportColumn readById(Long reportColumnId);

	/**
     * Persist a {@code ReportColumn} instance to the datastore
     *
     * @param reportColumn the {@code ReportColumn} instance
     * @return the updated state of the passed in {@code ReportColumn} after being persisted
     */
	public   ReportColumn  save(ReportColumn reportColumn);

	/**
     * Removed the passed in {@code ReportColumn} instance from the datastore
     *
     * @param reportColumn the {@code ReportColumn} instance to remove
     */
	public void delete(ReportColumn reportColumn);

}
