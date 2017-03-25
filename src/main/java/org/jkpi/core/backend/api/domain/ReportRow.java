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
package org.jkpi.core.backend.api.domain;

import java.io.Serializable;
import java.util.Set;

/**
 * <Code>ReportRow</Code> is an Interface ,which specify the reportRow Specifications/contracts (methods).
 * <Code>ReportRow</Code> represents a record/row on {@link Report} ,such as row in an Excelsheet,tag in Xml file and so on
 * <Code>ReportRow</Code> holds the properties of <Code>Report</Code> row , like row columns {@link ReportColumn}
 * The Actual value of the row will be held in {@link ReportRecord}
 * @author Mutaz Hussein Kabashi
 * @version 1.0.0
 * @since 1.0.0
 */
public interface ReportRow extends Serializable {

	/**
	 * 
	 * @return the ID/primary key value of the ReportRow.
	 */
	public Long getReportRowID();
	
	/**
	 * Set ReportRow ID/PrimaryKey field's value 
	 * @param reportId  Long value
	 */
	public void setReportRowID(Long reportId);

	/**
	 * 
	 * @return ReportGoup which is this ReportRow belong to/part of
	 */
	public ReportGroup getReportGroup();

	/**
	 * Set ReportGoup which is this ReportRow will be  belong to/part of
	 * @param reportGroup
	 */
	public void setReportGroup(ReportGroup reportGroup);

	/**
	 * 
	 * @return ReportRow's name
	 */
	public String getRowName();

	/**
	 * Set ReportRow's name
	 * @param rowName
	 */
	public void setRowName(String rowName);
	
	
	/**
	 * 
	 * @return ReportRow's Components {@link ReportColumn}
	 */
	public Set<ReportColumn> getReportColumns() ;
 
	/**
	 * Set  ReportRow's Components {@link ReportColumn}
	 * @param reportColumns
	 */
	public void setReportColumns(Set<ReportColumn> reportColumns) ;
	
	

}
