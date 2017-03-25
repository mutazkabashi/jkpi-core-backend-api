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

import org.jkpi.core.backend.api.domain.*;

/**
 * {@code ReportRecordService} provides methods/services which can be used to
 * persist/Update/Delete {@code ReportRecord} from/To DataStore.
 * 
 * @author Mutaz Hussein Kabashi
 * @version 1.0.0
 * @since 1.0.0
 * @see ReportRecordDao
 * @see ReportRecord
 */

public interface ReportRecordService {

	/**
	 * Persist a passed {@code ReportRecord} instance to dataStore , by passing the passed {@code ReportRecord}  Instance to DAO/DAL Layer
	 * @param reportRecord a {@code ReportRecord} Instance to be saved in data store
	 * @return
	 */
	public ReportRecord saveReportRecord(ReportRecord reportRecord);

	/**
     * Remove  a {@code ReportRecord} instance from the datastore ,by passing  passed date to DAO/DAL Layer
     *
     * @param reportDate the {@code ReportRecord}'s date, which will be used to remove {@code ReportRecord}
     *        instance from datastore
     * @return the state of delete operation success/fail
     */
	public int deleteReportRecordsByDate(String reportDate);

	/**
     * Retrieve the last uploaded/saved  {@code Report}   to datastore  as a list of {@code ReportRecord} instances 
     * using {@code Report}'s name, by passing the passed {@code Report}'s name to DAO/DAL Layer
     *
     * @param reportName the name of the report
     * @return a list of  {@code ReportRecord} instances  for a specified {@code Report} 
     */
	public List<ReportRecord> getLastUploadedReportByName(String reportName);

	/**
     * Retrieve the last uploaded/saved  {@code Report}   to datastore  as a list of {@code ReportRecord} instances 
     * by passing the passed  {@code Report}'s name and {@code ReportGroup}'s name to DAO/DAL Layer
     *
     * @param reportName the name of the report
     * @param groupName the name of the reportGroup
     * @return a list of {@code ReportRecord} instances for a specified {@code Report} and specified {@code ReportGroup}
     */
	public List<ReportRecord> getLastUploadedReportByReportNameAndGroupName(String reportName, String groupName);

	/**
     * Retrieve a  {@code Report}  from  datastore  as a list of {@code ReportRecord} instances 
     * by passing the passed  {@code Report}'s name and  insertion {@code Date} to DAO,DAL Layer
     *
     * @param reportName the name of the report
     * @param insertionDate the Report's insertion date
     * @return a list of {@code ReportRecord} instances for a specified {@code Report} and specified {@code Date}
     */
	public List<ReportRecord> getReportByReportNameAndInsertionDate(String reportName, Date insertionDate);

	/**
     * Retrieve a  {@code Report}  from  datastore  as a list of {@code ReportRecord} instances 
     * by passing the passed  {@code Report}'s name , {@code ReportGroup}'s name and  insertion {@code Date} to DAO,DAL Layer
     *
     * @param reportName the name of the report
     * @param groupName the name of the reportGroup
     * @param insertionDate the Report's insertion date
     * @return a list of {@code ReportRecord} instances for a specified {@code Report},specified {@code ReportGroup}  and specified {@code Date}
     */
	public List<ReportRecord> getReportByReportNameGroupNameAndInsertionDate(String reportName, String groupName,
			Date insertionDate);

	/**
     * Retrieve a  {@code Report}  from  datastore  as a list of {@code ReportRecord} instances 
     * by passing the passed {@code Report}'s name , {@code ReportGroup}'s name ,and Period   (startDate {@code Date} and endDate {@code Date}) to DAO/DAL Layer
     *
     * @param reportName the name of the report
     * @param groupName the name of the reportGroup
     * @param startDate the start Date of the period
     * @param endDate the end Date of the period
     * @return a list of {@code ReportRecord} instances for a specified {@code Report},specified {@code ReportGroup}  and specified period
     */
	public List<ReportRecord> getReportByReportNameGroupNameAndPeriod(String reportName, String groupName,
			Date startDate, Date endDate);

	/**
     * Retrieve   {@code ReportColumn}'s values  from  datastore  as a list of {@code ReportRecord} instances 
     * by passing the passed  {@code Report}'s name , {@code ReportGroup}'s name ,{@code ReportColumn}'s name and insertion {@code Date} to DAO/DAL Layer
     *
     * @param reportName the name of the report
     * @param groupName the name of the reportGroup
     * @param columnName the Column's name  in the report
     * @param insetionDate the insertion Date of the report
     * @return a list of {@code ReportRecord} instances for a specified {@code Report},specified {@code ReportGroup}  and specified period
     */
	public List<ReportRecord> getReportColumnValueByColumnNameGroupNameReportNameAndInsertionDate(String columnName,
			String groupName, String reportName, Date insetionDate);

	/**
     * Retrieve {@code ReportColumn}'s values  from  datastore  as a list of {@code ReportRecord} instances 
     * by passing the passed  {@code Report}'s name , {@code ReportGroup}'s name ,{@code ReportColumn}'s name and Period   (startDate {@code Date} and endDate {@code Date})
     * to DAO/DAL Layer
     *
     * @param reportName the name of the report
     * @param groupName the name of the reportGroup
     * @param columnName the Column's name  in the report
     * @param startDate the start Date of the period
     * @param endDate the end Date of the period
     * @return a list of {@code ReportRecord} instances for a specified {@code Report},specified {@code ReportGroup}  and specified period
     */
	public List<ReportRecord> getReportColumnValueByColumnNameGroupNameReportNameAndPeriod(String columnName,
			String groupName, String reportName, Date startDate, Date endDate);

	/**
     * Retrieve Accomulated {@code ReportColumn}'s values  from  datastore  as a list of {@code ReportRecord} instances 
     * by passing the passed  {@code Report}'s name , {@code ReportGroup}'s name ,{@code ReportColumn}'s name and Period   (startDate {@code Date} and endDate {@code Date})
     * to DAO/DAL Layer
     *
     * @param reportName the name of the report
     * @param groupName the name of the reportGroup
     * @param columnName the Column's name  in the report
     * @param startDate the start Date of the period
     * @param endDate the end Date of the period
     * @return a list of {@code ReportRecord} instances for a specified {@code Report},specified {@code ReportGroup}  and specified period
     */
	public List<ReportRecord> getReportAccomulatedColumnValueByColumnNameGroupNameReportNameAndPeriod(String columnName,
			String groupName, String reportName, Date startDate, Date endDate);

	/**
	 * Retrieve all {@code ReportRecord}s for a specified {@code Report}'s from
	 * the data store , by passing the passed {@code reportName} to DAO/DAL
	 * Layer <br>
	 * <br>
	 * 
	 * @param reportName  a @{code Report}'s name, which will be used to retrieve the reports
	 * @return a list of all the {@code Report} instances in the data store
	 */
	public List<ReportRecord> getReportByName(String reportName);

	/**
	 * Retrieve the last uploaded/submitted {@code ReportRecord}s for a specified {@code Report}'s from
	 * the data store , by passing the passed {@code reportName} to DAO/DAL
	 * Layer <br>
	 * <br>
	 * 
	 * @param reportName  a @{code Report}'s name, which will be used to retrieve the reports
	 * @return a list of all the {@code Report} instances in the data store
	 */
	public List<ReportRecord> getLastUploadedReportsByName(String reportName);
	
	public List<ReportRecord> getReportByPeriod(String reportName, Date startDate, Date endDate);

	public List<ReportRecord> getReportByPeriodForSummaryReport(String reportName, Date startDate, Date endDate);

	public List<ReportRecord> getPreviousUploadedReport(String reportName);


}
