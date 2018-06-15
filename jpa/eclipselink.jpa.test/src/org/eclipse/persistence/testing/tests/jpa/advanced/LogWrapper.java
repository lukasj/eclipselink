/*******************************************************************************
 * Copyright (c) 2015 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
// Contributors:
//     Oracle - initial API and implementation
package org.eclipse.persistence.testing.tests.jpa.advanced;

import org.eclipse.persistence.logging.DefaultSessionLog;
import org.eclipse.persistence.testing.tests.weaving.SimpleSessionLogWrapper;

public final class LogWrapper extends SimpleSessionLogWrapper {

        public LogWrapper() {
            this("configured_server_platform");
        }

        public LogWrapper(String expected) {
            super(new DefaultSessionLog());
            setExpectedMessage(expected);
            setLevel(sessionLog.getLevel());
        }
    }
