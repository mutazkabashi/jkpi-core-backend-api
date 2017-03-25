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

import java.math.BigDecimal;

/**
 * <Code>ReportColumnDetails</Code> is an Interface ,which specify the ReportColumnDetails Specifications/contracts (methods).<br>
 * <Code>ReportColumnDetails</Code> represents {@link ReportColumn} properties such as column's name and column's color in addition to column's value
 * @author Mutaz Hussein Kabashi
 * @version 1.0.0
 * @since 1.0.0
 */
public interface ReportColumnDetails {
	
	/**
	 * 
	 * @return {@link ReportColumn}'s name, such as excelSheet Column name,xml name property of Column Tag , ..etc
	 * @see {@link ReportColumn#getColumnName()}
	 */
	public String getColumnName();
	
	/**
     * Set {@link ReportColumn}'s name,such as excelSheet Column name,xml name property of  column Tag , ..etc
     * @param columnName
     * @see {@link ReportColumn#setColumnName(String)}
     */
	public void setColumnName(String columnName);
	
	/**
	 * 
	 * @return {@link ReportColumn}'s actual value (Column value for  this row/record)
	 */
	public BigDecimal getColumnValue();
	
	/**
	 * set {@link ReportColumn}'s actual value (Column value for  this row/record)
	 * @param columnValue
	 */
	public void setColumnValue(BigDecimal columnValue);
	
	/**
	 * 
	 * @return {@link ReportColumn}'s color value , like excelshhet column's cell color, xml color property of column tag  ...etc
	 * @see {@link ReportColumn#getColumnColor()}
	 */
	public String getColumnColor();
	
	/**
	 * Set {@link ReportColumn}'s color value , like excelshhet column's cell color, xml color property of column tag  ...etc
	 * @param columnColor
	 * @see {@link ReportColumn#setColumnColor(String)}
	 */
	public void setColumnColor(String columnColor);

}
