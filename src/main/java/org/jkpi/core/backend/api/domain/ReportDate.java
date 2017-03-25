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

import java.util.Date;

/**
 * <Code>ReportDate</Code> is an Interface ,which specify the ReportDate Specifications/contracts (methods).<br>
 * <Code>ReportDate</Code> represents the exporting date of the {@link Report}. <Code>ReportDate</Code> could be
 * used to get the exported Date of the <Code>Report</Code> in {@link Date} format or customized String format
 * @author Mutaz Hussein Kabashi
 * @version 1.0.0
 * @since 1.0.0
 */

public interface ReportDate {
	
	/**
	 * 
	 * @return customized String format of {@link Report}'s exporting date 
	 */
	public String getStringDate();
	
	/**
	 * Set  {@link Report}'s exporting date using customized String format
	 * @param stringDate
	 */
	public void setStringDate(String stringDate);
	
	/**
	 * 
	 * @return {@link Report}'s exporting date  as a {@link Date} Object
	 */
	public Date getActualDate();
	
	/**
	 * Set {@link Report}'s exporting date  using {@link Date} Class
	 * @param actualDate
	 */
	public void setActualDate(Date actualDate);

}
