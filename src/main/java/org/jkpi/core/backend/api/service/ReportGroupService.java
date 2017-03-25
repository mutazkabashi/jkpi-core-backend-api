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

import org.jkpi.core.backend.api.domain.ReportGroup;

/**
 * {@code ReportGroupService} provides methods/services which can be used to persist/Update/Delete {@code ReportGroup}
 * from/To DataStore. 
 * 
 * @author Mutaz Hussein Kabashi
 * @version 1.0.0
 * @since 1.0.0
 * @see ReportGroupDao
 * @see ReportGroup
 */
public interface ReportGroupService {
	
	/**
	 * Persist a passed {@code ReportGroup} instance to dataStore , by passing the passed {@code ReportGroup} reportGroup Instance to DAO/DAL Layer
	 * @param reportGroup a {@code ReportGroup} Instance to be saved in data store
	 * @return
	 */
	public ReportGroup saveReportGroup(ReportGroup reportGroup);
	

}
