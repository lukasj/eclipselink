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
package org.eclipse.persistence.tools.workbench.mappingsplugin.ui.mapping.relational;

import org.eclipse.persistence.tools.workbench.framework.context.WorkbenchContext;
import org.eclipse.persistence.tools.workbench.mappingsmodel.descriptor.MWMappingDescriptor;
import org.eclipse.persistence.tools.workbench.mappingsmodel.descriptor.relational.MWRelationalClassDescriptor;
import org.eclipse.persistence.tools.workbench.mappingsmodel.mapping.MWMapping;
import org.eclipse.persistence.tools.workbench.mappingsmodel.mapping.relational.MWOneToOneMapping;
import org.eclipse.persistence.tools.workbench.mappingsmodel.meta.MWClassAttribute;
import org.eclipse.persistence.tools.workbench.mappingsplugin.ui.mapping.ChangeMappingTypeAction;


final class MapAsOneToOneAction
    extends ChangeMappingTypeAction
{
    MapAsOneToOneAction(WorkbenchContext context) {
        super(context);
    }

    protected void initialize() {
        super.initialize();
        this.initializeIcon("mapping.oneToOne");
        this.initializeText("MAP_AS_ONE_TO_ONE_ACTION");
        this.initializeMnemonic("MAP_AS_ONE_TO_ONE_ACTION");
        this.initializeToolTipText("MAP_AS_ONE_TO_ONE_ACTION.toolTipText");
    }

    protected MWMapping morphMapping(MWMapping mapping) {
        return mapping.asMWOneToOneMapping();
    }

    protected MWMapping addMapping(MWMappingDescriptor descriptor, MWClassAttribute attribute) {
        return ((MWRelationalClassDescriptor) descriptor).addOneToOneMapping(attribute);
    }

    protected Class mappingClass() {
        return MWOneToOneMapping.class;
    }

}
