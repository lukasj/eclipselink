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
package org.eclipse.persistence.tools.workbench.mappingsplugin.ui.mapping;

import java.awt.BorderLayout;

import org.eclipse.persistence.tools.workbench.framework.context.WorkbenchContext;
import org.eclipse.persistence.tools.workbench.framework.ui.view.AbstractPropertiesPage;


/**
 * simple panel containing an icon and the attribute name and type
 */
public final class UnmappedMappingPropertiesPage
    extends AbstractPropertiesPage
{

    // this value is queried reflectively during plug-in initialization
    private static final Class[] REQUIRED_RESOURCE_BUNDLES = new Class[0];

    public UnmappedMappingPropertiesPage(WorkbenchContext context) {
        super(context);
    }

    protected void initializeLayout() {
        this.add(this.buildTitlePanel(), BorderLayout.PAGE_START);
    }

}
