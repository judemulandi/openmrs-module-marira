/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.marira;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.BaseModuleActivator;
import org.openmrs.module.Module;
import org.openmrs.module.ModuleFactory;
import org.openmrs.module.marira.api.util.MariraConstants;
import org.openmrs.module.web.WebModuleUtil;

/**
 * This class contains the logic that is run every time this module is either started or shutdown
 */
public class ModuleActivator extends BaseModuleActivator {
	private static final Log LOG = LogFactory.getLog(ModuleActivator.class);

	/**
	 * @see BaseModuleActivator#contextRefreshed()
	 */
	@Override
	public void contextRefreshed() {
		LOG.info("OpenHMIS Inventory Module refreshed");
	}

	/**
	 * @see BaseModuleActivator#started()
	 */
	@Override
	public void started() {
		LOG.info("OpenHMIS Inventory Module started");
	}

	/**
	 * @see BaseModuleActivator#stopped()
	 */
	@Override
	public void stopped() {
		LOG.info("OpenHMIS Inventory Module stopped");
	}

}
