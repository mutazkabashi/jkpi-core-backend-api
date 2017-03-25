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

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.jkpi.core.backend.api.domain.*;

/**
 * {@code ReportRowService} provides methods/services which can be used to
 * persist/Update/Delete {@code ReportRow} from/To DataStore.
 * 
 * @author Mutaz Hussein Kabashi
 * @version 1.0.0
 * @since 1.0.0
 * @see ReportRowDao
 * @see ReportRow
 */

public interface ReportRowService {

	/**
	 * Retrieve the last uploaded/submitted {@code ReportRow}s for a specified {@code Report}'s from
	 * the data store , by passing the passed {@code reportName} to DAO/DAL
	 * Layer <br>
	 * <br>
	 * 
	 * @param reportName  a @{code Report}'s name, which will be used to retrieve the reports
	 * @return a list of all the {@code Report} instances in the data store
	 */
	//public List<ReportRow> getLastUploadedReportRowsByName(String reportName);

	// TODO this method should be moved to ReportRecordService
	/**
	 * Retrieve a {@code Report}'s uploaded/submitted {@code ReportDate}, by passing the passed {@code Report}'s name to DAO/DAL Layer
	 * @param reportName
	 * @return
	 */
	//public List<ReportDate> getReportDates(String reportName);

	/**
	 * Persist a passed {@code ReportRow} instance to dataStore , by passing the passed {@code ReportRow} report Instance to DAO/DAL Layer
	 * @param reportRow a {@code ReportRow} Instance to be saved in data store
	 * @return
	 */
	public ReportRow saveReportRow(ReportRow reportRow);

	/**
	 * Persist a New {@code Report} to dataStore , by passing a{@code Map} which consists of {@code Report}'s components, 
	 * a {@code Report} , which is the map belong to , and a {@code Report}'s date in {@code String} format. 
	 * This method Will be used to persist a New {@code Report} in DataStore, that means this {@code Report} haven't been saved before
	 * @param reportRows a {@code Report}'s component presented as a {@code Map} of {@code ReportGroup},{@code ReportRow} and {@code ReportColumnDetails}
	 * @param report a {@code Report} instance , which is the  reportRows belong to.
	 * @param creationDate {@code Report}'s date in {@code String} format 
	 * @return
	 */
	public void saveNewReportRows(Map<ReportGroup, Map<ReportRow, List<ReportColumnDetails>>> reportRows, Report report,
			String creationDate);

	/**
	 * Persist an existing {@code Report} to dataStore , by passing a{@code List} of  {@code Report}'s {@code ReportRecord}s , 
	 * a {@code Report}'s Upload/submit date in {@code String} format,  and a {@code Report}'s {@code Date} . 
	 * <br>
	 * Notice
	 * <br>
	 * reportDate is the reports date, for example the report could by may report and the insertion date is the actual submission date
	 * to the system , which could be june july ...
	 * <br>
	 * This method Will be used to persist an existing  {@code Report} to DataStore, that means this {@code Report} have been saved before
	 * @param reportRecords a {@code List} of  {@code Report}'s {@code ReportRecord} 
	 * @param reportDate a {@code Report} 's date in {@code String} format  
	 * @param insertionDate {@code Report}'s submission's date 
	 * @return
	 */
	public void saveExistingReportRows(List<ReportRecord> reportRecords, String reportDate, Date insertionDate);

	
}
