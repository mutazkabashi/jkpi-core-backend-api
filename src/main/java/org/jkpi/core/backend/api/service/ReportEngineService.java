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

import java.util.List;
import java.util.Map;

import org.jkpi.core.backend.api.domain.*;

/**
 *{@code ReportEngineService}  provides various  operations  which can be done 
 * on a {@code Report} such as {@link #extract(String)}
 * , which converts the uploaded file (Excel sheet,Xml,Json ) to {@code Report} Instance
 * <br>
 * TODO {@link #compress(Report)} ,which converts a @{code Report} Object to a 
 * (Excel Sheet,Xml,Json) file and others
 * 
 * @author Mutaz Hussein Kabashi
 * @version 1.0.0
 * @since 1.0.0
 * @see Report
 * @see ReportGroup
 * @see ReportRow
 * @see ReportColumnDetails
 */
public interface ReportEngineService {

	/**
	 * Converts the uploaded/submitted file (Excel sheet,Xml,Json ) to {@code Report} Instance
	 * @param filePath
	 * @return
	 */
	public Map<Report, Map<ReportGroup, Map<ReportRow, List<ReportColumnDetails>>>> extract(String filePath);

}
