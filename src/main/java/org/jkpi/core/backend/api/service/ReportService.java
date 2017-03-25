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
package org.jkpi.core.backend.api.service;

import java.util.List;

import org.jkpi.core.backend.api.dao.ReportDao;
import org.jkpi.core.backend.api.domain.*;

/**
 * {@code ReportService} provides methods/services which can be used to persist/Update/Delete {@code Report}
 * from/To DataStore. 
 * @author Mutaz Hussein Kabashi
 * @version 1.0.0
 * @since 1.0.0
 * @see ReportDao
 * @see Report
 */

public interface ReportService {

	/**
	 * Persist a passed {@code Report} instance to dataStore , by passing the passed {@code Report} report Instance to DAO/DAL Layer
	 * @param report a {@code Report} Instance to be saved in data store
	 * @return
	 */
	public Report saveReport(Report report);

	/**
     * Retrieve all {@code Report}s from the data store , by Calling DAO/DAL layer
     *
     * @return a list of all the {@code Report} instances in the data store
     */
	public List<Report> getAllReports();

	/**
     * Removed the passed in {@code Report} instance from the data store,by passing the passed {@code Report} report Instance to DAO/DAL Layer
     *
     * @param report the {@code Report} instance to remove
     */
	public void deleteReport(Report report);

	/**
	 * Remove all {@code Report}s from data store , by Calling DAO/DAL layer
	 */
	public void deleteAllReports();

}
