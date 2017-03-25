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
import java.math.BigDecimal;
import java.util.Date;


/**
 * <Code>ReportRecord</Code> is an Interface ,which specify the ReportRecord Specifications/contracts (methods).
 * <Code>ReportRecord</Code> represents a {@link ReportColumn} column/field value ,along with its insertion timesDate and reportDate.
 * @author Mutaz Hussein Kabashi
 * @version 1.0.0
 * @since 1.0.0
 */
public interface ReportRecord extends Serializable {

	/**
	 * 
	 * @return the ID/primary key value of the ReportRecord.
	 */
	public Long getReportRecordID();

	/**
	 * Set ReportRecord ID/PrimaryKey field's value 
	 * @param reportRecordId  Long value
	 */
	public void setReportRecordID(Long reportRecordId);

	/**
	 * 
	 * @return ReportRecord's  {@link ReportColumn}
	 */
	public ReportColumn getReportColumn();

	/**
	 * Set ReportRecord's  {@link ReportColumn}
	 * @param reportColumn
	 */
	public void setReportColumn(ReportColumn reportColumn);

	/**
	 * 
	 * @return {@link ReportColumn} actual value
	 */
	public BigDecimal getColumnValue();

	/**
	 * Set {@link ReportColumn} actual value 
	 * @param columnValue
	 */
	public void setColumnValue(BigDecimal columnValue);

	/**
	 * 
	 * @return {@link Report} exporting/insertion date in String Format
	 */
	public String getReportDate();

	/**
	 * Set {@link Report} exporting/insertion date in String Format
	 * @param reportDate
	 */
	public void setReportDate(String reportDate);

	/**
	 * 
	 * @return {@link Report} exporting/insertion date as a {@link Date} object
	 */
	public Date getInsertionDate();

	/**
	 * Set {@link Report} exporting/insertion date using  {@link Date} Class
	 * @param insertionDate
	 */
	public void setInsertionDate(Date insertionDate);

}
