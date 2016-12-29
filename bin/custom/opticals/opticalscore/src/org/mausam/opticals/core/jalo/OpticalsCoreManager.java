/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE or an SAP affiliate company.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package org.mausam.opticals.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.mausam.opticals.core.constants.OpticalsCoreConstants;
import org.mausam.opticals.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
@SuppressWarnings("PMD")
public class OpticalsCoreManager extends GeneratedOpticalsCoreManager
{
	public static final OpticalsCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (OpticalsCoreManager) em.getExtension(OpticalsCoreConstants.EXTENSIONNAME);
	}
}
