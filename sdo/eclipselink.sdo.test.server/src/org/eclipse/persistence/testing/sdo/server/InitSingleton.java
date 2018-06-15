/*******************************************************************************
 * Copyright (c) 2014, 2015  Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Iaroslav Savytskyi - August 13/2014 - 2.6.0 - Initial implementation
 ******************************************************************************/
// Contributors:
//     Iaroslav Savytskyi - August 13/2014 - 2.6.0 - Initial implementation
package org.eclipse.persistence.testing.sdo.server;

import org.eclipse.persistence.sdo.helper.SDOHelperContext;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Context startup listener.
 *
 * Responsible for the initialization process.
 */
@Singleton
@Startup
public class InitSingleton {

    private static final Logger LOGGER = Logger.getLogger(InitSingleton.class.getName());

    @PostConstruct
    public void init() {
        LOGGER.info("\n********** init() called **********\n");
        try {
            ClassLoader cl = Thread.currentThread().getContextClassLoader();
            URL url = cl.getResource("org/eclipse/persistence/testing/sdo/server/Dept.xsd");
            String path = url.toExternalForm();
            SDOHelperContext.getHelperContext().getXSDHelper().define(url.openStream(), path.substring(0, path.lastIndexOf('/') + 1));
            LOGGER.info("\n********** initialized **********\n");
        } catch (Exception e) {
            if (LOGGER.isLoggable(Level.INFO)) {
                LOGGER.info("init() failed with error: " + e.getMessage());
            }
            e.printStackTrace();
            throw new DeptServiceInitException(e);
        }
    }
}
