/*******************************************************************************
 * Copyright (c) 1998, 2015 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Oracle - initial API and implementation from Oracle TopLink
******************************************************************************/
// Contributors:
//     Oracle - initial API and implementation from Oracle TopLink
package org.eclipse.persistence.tools.workbench.mappingsplugin;

import org.eclipse.persistence.tools.workbench.framework.Plugin;
import org.eclipse.persistence.tools.workbench.framework.PluginFactory;
import org.eclipse.persistence.tools.workbench.framework.context.ApplicationContext;

/**
 * singleton implementation
 */
public final class MappingsPluginFactory implements PluginFactory {

    // singleton
    private static PluginFactory INSTANCE;


    /**
     * Return the singleton.
     */
    public static synchronized PluginFactory instance() {
        if (INSTANCE == null) {
            INSTANCE = new MappingsPluginFactory();
        }
        return INSTANCE;
    }

    /**
     * Ensure non-instantiability.
     */
    private MappingsPluginFactory() {
        super();
    }


    // ********** PluginFactory implementation **********

    public Plugin createPlugin(ApplicationContext context) {
        return new MappingsPlugin(context);
    }

}
