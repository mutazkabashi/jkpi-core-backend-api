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
 * <Code>ReportGroup</Code> is an Interface ,which specify the ReportGroup Specifications/contracts (methods).<br>
 * <Code>ReportGroup</Code> represents a group of {@link ReportRow}, 
 * @author Mutaz Hussein Kabashi
 * @version 1.0.0
 * @since 1.0.0
 */
public interface ReportGroup extends Serializable {

	/**
	 * 
	 * @return the ID/primary key value of the ReportGroup.
	 */
	public Long getReportGroupID();

	/**
	 * Set ReportGroup ID/PrimaryKey field's value 
	 * @param reportid
	 */
	public void setReportGroupID(Long reportid);

	/**
	 * 
	 * @return {@link Report} which this ReportGroup belong to 
	 */
	public Report getReport();

	/**
	 * Set a {@link Report} which this ReportGroup belong to 
	 * @param report
	 */
	public void setReport(Report report);

	/**
	 * 
	 * @return ReportGroup's name
	 */
	public String getGroupName();

	/**
	 * Set ReportGroup's name
	 * @param rowName
	 */
	public void setGroupName(String rowName);

	/**
	 * @return ReportGroup's Components , which are a set of one or more of {@link ReportRow}s
	 */
	public Set<ReportRow> getReportRows();

	/**
	 * Set ReportGroup's Components , which are a set of one ore more of {@link ReportRow}s
	 * @param reportRows
	 */
	public void setReportRows(Set<ReportRow> reportRows);

}
