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

import java.util.Date;
import java.util.List;

import org.jkpi.core.backend.api.domain.*;

/**
 * {@code ReportRowDao} provides persistence access to {@code ReportRow} instances.
 *
 * @see ReportRow
 * @author Mutaz Hussein Kabashi
 * @version 1.0.0
 * @since 1.0.0
 */
public interface ReportRowDao {

	/**
     * Retrieve a {@code ReportRow} instance by its primary key
     *
     * @param reportRowId the primary key of the {@code ReportRow}
     * @return the {@code ReportRow}  at the specified primary key
     */
	public ReportRow readById(Long reportRowId);

	/**
     * Persist a {@code ReportRow} instance to the datastore
     *
     * @param reportRow the {@code ReportRow} instance
     * @return the updated state of the passed in {@code ReportRow} after being persisted
     */
	public ReportRow save(ReportRow reportRow);

	
	//public List<ReportRecord> getReportsByName(String ReportName);

	/**
     * Retrieve the last uploaded/saved  {@code Report}   to datastore  as a list of {@code ReportRow} instances 
     * using {@code Report}'s name
     *
     * @param reportName the name of the report
     * @return a list of  {@code ReportRecord} instances  for a specified {@code Report} 
     */
	//public List<ReportRow> getLastUploadedReportRowsByName(String reportName);

	

	// TODO not the best Way
	/**
     * FIXME
     *
     * @param reportName the name of the report
     * @return a list of  {@code ReportRecord} instances  for a specified {@code Report} 
     */
	//public Report getReportIdWithoutCheckingDB(String id);


}
