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
 * {@code ReportRecordDao} provides persistence access to {@code ReportRecordDao} instances.
 *
 * @author Mutaz Hussein Kabashi
 * @version 1.0.0
 * @since 1.0.0
 * @see Report
 * @see ReportGroup
 * @see ReportColumn
 */
public interface ReportRecordDao {
	
	/**
     * Retrieve a {@code ReportRecord} instance by its primary key
     *
     * @param reportRecordId the primary key of the {@code ReportRecord}
     * @return the {@code ReportRecord}  at the specified primary key
     */
	public ReportRecord readById(Long reportRecordId);

	/**
     * Persist a {@code ReportRecord} instance to the datastore
     *
     * @param reportRecord the {@code ReportRecord} instance
     * @return the updated state of the passed in {@code ReportRecord} after being persisted
     */
	public   ReportRecord  save(ReportRecord reportRecord);

	/**
     * Remove  a {@code ReportRecord} instance from the datastore by passed date
     *
     * @param reportDate the {@code ReportRecord}'s date, which will be used to remove {@code ReportRecord}
     *        instance from datastore
     * @return the state of delete operation success/fail
     */
	public int deleteReportRecordsByDate(String reportDate);
	
	/**
     * Retrieve the last uploaded/saved  {@code Report}   to datastore  as a list of {@code ReportRecord} instances 
     * using {@code Report}'s name
     *
     * @param reportName the name of the report
     * @return a list of  {@code ReportRecord} instances  for a specified {@code Report} 
     */
	public List<ReportRecord> getLastUploadedReportByName(String reportName);
	
	/**
	 * FIXME
     * Retrieve the Previously (before the last one) uploaded/saved  {@code Report}   to datastore  as a list of {@code ReportRecord} instances 
     * using {@code Report}'s name
     *
     * @param reportName the name of the report
     * @return a list of  {@code ReportRecord} instances  for a specified {@code Report} 
     */
	public List<ReportRecord> getPreviousUploadedReport(String reportName);
	
	/**
     * Retrieve the last uploaded/saved  {@code Report}   to datastore  as a list of {@code ReportRecord} instances 
     * using {@code Report}'s name and {@code ReportGroup}'s name
     *
     * @param reportName the name of the report
     * @param groupName the name of the reportGroup
     * @return a list of {@code ReportRecord} instances for a specified {@code Report} and specified {@code ReportGroup}
     */
	public List<ReportRecord> getLastUploadedReportByReportNameAndGroupName(String reportName,String groupName);
	
	/**
     * Retrieve a  {@code Report}  from  datastore  as a list of {@code ReportRecord} instances 
     * using {@code Report}'s name and  insertion {@code Date}
     *
     * @param reportName the name of the report
     * @param insertionDate the Report's insertion date
     * @return a list of {@code ReportRecord} instances for a specified {@code Report} and specified {@code Date}
     */
	public List<ReportRecord> getReportByReportNameAndInsertionDate(String reportName,Date insertionDate);
	
	/**
     * Retrieve a  {@code Report}  from  datastore  as a list of {@code ReportRecord} instances 
     * using {@code Report}'s name and  Period   (startDate {@code Date} and endDate {@code Date})
     *
     * @param reportName the name of the report
     * @param startDate the start Date of the period
     * @param endDate the end Date of the period
     * @return a list of {@code ReportRecord} instances for a specified {@code Report} and specified period
     */
	public List<ReportRecord> getReportByPeriod(String reportName, Date startDate, Date endDate);
	
	/**
     * Retrieve a  {@code Report}  from  datastore  as a list of {@code ReportRecord} instances 
     * using {@code Report}'s name , {@code ReportGroup}'s name and  insertion {@code Date}
     *
     * @param reportName the name of the report
     * @param groupName the name of the reportGroup
     * @param insertionDate the Report's insertion date
     * @return a list of {@code ReportRecord} instances for a specified {@code Report},specified {@code ReportGroup}  and specified {@code Date}
     */
	public List<ReportRecord> getReportByReportNameGroupNameAndInsertionDate(String reportName,String groupName,Date insertionDate);
	
	/**
     * Retrieve a  {@code Report}  from  datastore  as a list of {@code ReportRecord} instances 
     * using {@code Report}'s name , {@code ReportGroup}'s name ,and Period   (startDate {@code Date} and endDate {@code Date})
     *
     * @param reportName the name of the report
     * @param groupName the name of the reportGroup
     * @param startDate the start Date of the period
     * @param endDate the end Date of the period
     * @return a list of {@code ReportRecord} instances for a specified {@code Report},specified {@code ReportGroup}  and specified period
     */
	public List<ReportRecord> getReportByReportNameGroupNameAndPeriod(String reportName,String groupName,Date startDate,Date endDate);
	
	/**
     * Retrieve   {@code ReportColumn}'s values  from  datastore  as a list of {@code ReportRecord} instances 
     * using {@code Report}'s name , {@code ReportGroup}'s name ,{@code ReportColumn}'s name and insertion {@code Date}
     *
     * @param reportName the name of the report
     * @param groupName the name of the reportGroup
     * @param columnName the Column's name  in the report
     * @param insetionDate the insertion Date of the report
     * @return a list of {@code ReportRecord} instances for a specified {@code Report},specified {@code ReportGroup}  and specified period
     */
	public List<ReportRecord> getReportColumnValueByColumnNameGroupNameReportNameAndInsertionDate(String columnName,String groupName,
			String reportName,Date insetionDate);
	
	/**
     * Retrieve {@code ReportColumn}'s values  from  datastore  as a list of {@code ReportRecord} instances 
     * using {@code Report}'s name , {@code ReportGroup}'s name ,{@code ReportColumn}'s name and Period   (startDate {@code Date} and endDate {@code Date})
     *
     * @param reportName the name of the report
     * @param groupName the name of the reportGroup
     * @param columnName the Column's name  in the report
     * @param startDate the start Date of the period
     * @param endDate the end Date of the period
     * @return a list of {@code ReportRecord} instances for a specified {@code Report},specified {@code ReportGroup}  and specified period
     */
	public List<ReportRecord> getReportColumnValueByColumnNameGroupNameReportNameAndPeriod(String columnName,String groupName,
			String reportName,Date startDate,Date endDate);
	
	/**
     * Retrieve Accomulated {@code ReportColumn}'s values  from  datastore  as a list of {@code ReportRecord} instances 
     * using {@code Report}'s name , {@code ReportGroup}'s name ,{@code ReportColumn}'s name and Period   (startDate {@code Date} and endDate {@code Date})
     *
     * @param reportName the name of the report
     * @param groupName the name of the reportGroup
     * @param columnName the Column's name  in the report
     * @param startDate the start Date of the period
     * @param endDate the end Date of the period
     * @return a list of {@code ReportRecord} instances for a specified {@code Report},specified {@code ReportGroup}  and specified period
     */
	public List<ReportRecord> getReportAccomulatedColumnValueByColumnNameGroupNameReportNameAndPeriod(String columnName,String groupName,
			String reportName,Date startDate,Date endDate);
	
	/**
	 * Retrieve {@code Report}'s {@code ReportRecord} for a specified period 
	 * @param reportName the {@code Report}'s name
	 * @param startDate  period's start date
	 * @param endDate    period's   end date
	 * @return {@code List} of {@code ReportRecord}
	 */
	public List<ReportRecord> getReportByPeriodForSummaryReport(String reportName,Date startDate,Date endDate);
	
	/**
	 * Retrieve a {@code List} of {@code Report}'s Uploaded dates 
     *
     * @param reportName the {@code Report}'s Name 
     * @return a {@code List} of {@code Report}'s Uploaded dates 
	 */
	public List<ReportDate>  getReportDates(String reportName);

}
