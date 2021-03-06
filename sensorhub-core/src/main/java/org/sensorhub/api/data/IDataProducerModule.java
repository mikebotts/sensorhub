/***************************** BEGIN LICENSE BLOCK ***************************

The contents of this file are subject to the Mozilla Public License, v. 2.0.
If a copy of the MPL was not distributed with this file, You can obtain one
at http://mozilla.org/MPL/2.0/.

Software distributed under the License is distributed on an "AS IS" basis,
WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
for the specific language governing rights and limitations under the License.
 
Copyright (C) 2012-2015 Sensia Software LLC. All Rights Reserved.
 
******************************* END LICENSE BLOCK ***************************/

package org.sensorhub.api.data;

import java.util.Map;
import org.sensorhub.api.common.SensorHubException;
import org.sensorhub.api.module.IModule;
import org.sensorhub.api.module.ModuleConfig;


/**
 * <p>
 * Base interface for all modules producing streaming data
 * </p>
 *
 * @author Alex Robin <alex.robin@sensiasoftware.com>
 * @param <ConfigType> Type of module configuration
 * @since Feb 21, 2015
 */
public interface IDataProducerModule<ConfigType extends ModuleConfig> extends IModule<ConfigType>, IModuleWithDescription
{

    /**
     * Retrieves the list of data outputs
     * @return map of output names -> data interface objects
     * @throws SensorHubException 
     */
    public Map<String, ? extends IStreamingDataInterface> getAllOutputs() throws SensorHubException;
    
}
