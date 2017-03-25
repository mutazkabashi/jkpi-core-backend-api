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
 * <Code>ReportColumn</Code> is an Interface ,which specify the ReportColumn Specifications/contracts (methods).
 * <Code>ReportColumn</Code> represents a column/field in   {@link ReportRow}.it holds the column/fields properties
 * such as column's name,color,...etc , while the column's actual value will be held in {@link ReportRecord}
 * @author Mutaz Hussein Kabashi
 * @version 1.0.0
 * @since 1.0.0
 */
public interface ReportColumn extends Serializable {

	/**
	 * @return the ID/primary key value of the ReportColumn.
	 */
	public Long getReportColumnID();
	
	/**
	 * Set reportColumn ID/PrimaryKey field's value 
	 * @param reportColumnId report's ID/primaryKey value
	 */	
	public void setReportColumnID(Long reportColumnId);

	/**
	 * 
	 * @return ReportRow ,which this ReportColumn is a part of 
	 * @see ReportRow
	 */
	public ReportRow getReportRow();

	/**
	 *  Set ReportRow of this ReportColumn
	 * @param reportRow
	 * @see   ReportRow
	 */
	public void setReportRow(ReportRow reportRow);

	/**
	 * 
	 * @return ReportColumn's name,such as excelSheet Column name,xml name property of Column Tag , ..etc
	 */
	public String getColumnName();
	
	
    /**
     * Set ReportColumn's name,such as excelSheet Column name,xml name property of  column Tag , ..etc
     * @param columnName
     */
	public void setColumnName(String columnName);
	
	/**
	 * 
	 * @return ReportColumn's color value , like excelshhet column's cell color, xml color property of column tag  ...etc
	 */
	public String getColumnColor();
	
	/**
	 * Set ReportColumn's color value , like excelshhet column's cell color, xml color property of column tag  ...etc
	 * @param columnColor
	 */
	public void setColumnColor(String columnColor);
	
	/**
	 * FIXME JavaDoc not clear
	 * @return  ReportRecords (Actual values) of ReportColumn, for example in excelsheet which has 1 column let say (name)
	 *  and 10 records/rows , it returns a {@link Set} of 10  values.
	 */
	public Set<ReportRecord> getReportRecords() ;
 
	/**
	 * Set ReportRecords (Actual values) for this  ReportColumn
	 * @param reportRows
	 */
	public void setReportRecords(Set<ReportRecord> reportRows);
	
	

}
