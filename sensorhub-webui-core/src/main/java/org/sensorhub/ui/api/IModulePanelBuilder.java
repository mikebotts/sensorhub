/***************************** BEGIN LICENSE BLOCK ***************************

The contents of this file are subject to the Mozilla Public License, v. 2.0.
If a copy of the MPL was not distributed with this file, You can obtain one
at http://mozilla.org/MPL/2.0/.

Software distributed under the License is distributed on an "AS IS" basis,
WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
for the specific language governing rights and limitations under the License.
 
Copyright (C) 2012-2015 Sensia Software LLC. All Rights Reserved.
 
******************************* END LICENSE BLOCK ***************************/

package org.sensorhub.ui.api;

import org.sensorhub.api.module.IModule;
import org.sensorhub.api.module.ModuleConfig;
import org.sensorhub.ui.data.MyBeanItem;
import com.vaadin.ui.Component;


/**
 * <p>
 * Interface for all UI panels used to interact with modules
 * </p>
 *
 * @author Alex Robin <alex.robin@sensiasoftware.com>
 * @since 0.5
 */
public interface IModulePanelBuilder
{ 
    
    /**
     * Builds the whole panel allowing interaction with a module
     * @param beanItem bean item associated to the configuration properties
     * @param module module instance or null if module hasn't been loaded
     * @param formBuilder 
     * @return Vaadin component containing all widgets for interacting with the module
     */
    public Component buildPanel(MyBeanItem<ModuleConfig> beanItem, IModule<?> module, IModuleConfigFormBuilder formBuilder);
    
}
