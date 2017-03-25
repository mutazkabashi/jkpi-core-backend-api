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

import java.util.List;

import org.jkpi.core.backend.api.domain.*;

/**
 * {@code ReportDao} provides persistence access to {@code Report} instances.
 *
 * @see Report
 * @author Mutaz Hussein Kabashi
 * @version 1.0.0
 * @since 1.0.0
 */
public interface ReportDao {

	/**
     * Retrieve a {@code Report} instance by its primary key
     *
     * @param reportId the primary key of the {@code Report}
     * @return the {@code Report}  at the specified primary key
     */
	public Report readById(Long reportId);

	/**
     * Persist a {@code Report} instance to the datastore
     *
     * @param report the {@code Report} instance
     * @return the updated state of the passed in {@code Report} after being persisted
     */
	public Report save(Report report);

	/**
     * Removed the passed in {@code Report} instance from the datastore
     *
     * @param report the {@code Report} instance to remove
     */
	public void delete(Report report);

	/**
     * Retrieve all reports from the datastore
     *
     * @return a list of all the {@code Report} instances in the datastore
     */
	public List<Report> getAllReports();

	 /**
     * Retrieve  {@code Report} instances by its name.
     *
     * @param reportName the name of the report
     * @return a list of all {@code Report}s having the specified name
     */
	public List<Report> getReportsByName(String reportName);

}
