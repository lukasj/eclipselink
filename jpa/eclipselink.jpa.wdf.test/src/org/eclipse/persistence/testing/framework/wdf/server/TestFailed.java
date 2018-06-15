/*******************************************************************************
 * Copyright (c) 2005, 2015 SAP. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     SAP - initial API and implementation
 ******************************************************************************/
// Contributors:
//     SAP - initial API and implementation
// CPR:: Copyright (c) 2005, 2015 SAP. All rights reserved.
package org.eclipse.persistence.testing.framework.wdf.server;

import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;

/**
 * A notification indicating that at test failed.
 */
public class TestFailed implements Notification {

    private static final long serialVersionUID = 1L;
    private final SerializableFailure failure;

    public TestFailed(Failure aFailure) {
        failure = SerializableFailure.create(aFailure);
    }

    @Override
    public void notify(RunNotifier notifier) {
        notifier.fireTestFailure(failure.restore());
    }

}
