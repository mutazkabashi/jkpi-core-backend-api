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
 * {@code Report} is an Interface ,which specify the report Specifications/contracts (methods).<br>
 * {@code Report} represents the base object in Jkpi-backend.
 * {@code Report} Could Be Excel sheet,Xml file,Json,....etc, which will be exported to a Data Repository such as RDBMS,NOSQL,FOLDER
 * @author Mutaz Hussein Kabashi
 * @version 1.0.0
 * @since 1.0.0
 */
public interface Report extends Serializable {

	/**
	 * @return the ID/primary key value of the Report.
	 */
	public Long getReportId();
    
	/**
	 * Set value for report ID/PrimaryKey field 
	 * @param reportid report's ID/primaryKey value
	 */	
	public void setReportId(Long reportid);

	/**
	 * 
	 * @return Report Name such as excelsheet tab name,xml file name,json file name
	 */
	public String getReportName();

	/**
	 * Set a name for a Report
	 * @param reportName  Report Name such as excelsheet tab name,xml file name,json file name
	 */
	public void setReportName(String reportName);

	
	/**
	 * 
	 * @return Report's Groups 
	 * @see ReportGroup
	 */
	public Set<ReportGroup> getReportGroups();

	/**
	 * 
	 * @param reportReportGroups
	 */
	public void setReportGroups(Set<ReportGroup> reportReportGroups);

}
