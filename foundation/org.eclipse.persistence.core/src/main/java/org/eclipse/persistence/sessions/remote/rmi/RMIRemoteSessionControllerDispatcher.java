/*
 * Copyright (c) 1998, 2023 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     Oracle - initial API and implementation from Oracle TopLink
package org.eclipse.persistence.sessions.remote.rmi;

import org.eclipse.persistence.internal.sessions.AbstractSession;
import org.eclipse.persistence.internal.sessions.remote.RemoteSessionController;
import org.eclipse.persistence.internal.sessions.remote.Transporter;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * RemoteSessionController sits between the remote session and the session. Any interaction between these
 * two classes takes place through this object. As the object extends unicast remote object it listens to
 * only single remote session during runtime.
 */
public class RMIRemoteSessionControllerDispatcher extends UnicastRemoteObject implements RMIRemoteSessionController {

    /** Store the real controller. */
    protected RemoteSessionController controller;

    public RMIRemoteSessionControllerDispatcher(AbstractSession session) throws RemoteException {
        // This call to the super is required in RMI.
        super();
        this.controller = new RemoteSessionController(session);
    }

    public RMIRemoteSessionControllerDispatcher(org.eclipse.persistence.sessions.Session session) throws RemoteException {
        this((AbstractSession)session);
    }

    /**
     * INTERNAL:
     * This method is intended to be used by by sessions that wish to execute a command on a
     * remote session
     * @param remoteTransporter The Transporter carrying the command to be executed on the remote session
     */
    @Override
    public Transporter processCommand(Transporter remoteTransporter) {
        return getController().processCommand(remoteTransporter);
    }

    /**
     * Begin a transaction on the database.
     */
    @Override
    public Transporter beginTransaction() {
        return getController().beginTransaction();
    }

    /**
     * Begin an early unit of work transaction.
     */
    @Override
    public Transporter beginEarlyTransaction() {
        return getController().beginEarlyTransaction();
    }

    /**
     * Remote unit of work after serialization is committed locally.
     */
    @Override
    public Transporter commitRootUnitOfWork(Transporter remoteUnitOfWork) {
        return getController().commitRootUnitOfWork(remoteUnitOfWork);
    }

    /**
     * Commit a transaction on the database.
     */
    @Override
    public Transporter commitTransaction() {
        return getController().commitTransaction();
    }

    /**
     * Used for closing cursored streams across RMI.
     */
    @Override
    public Transporter cursoredStreamClose(Transporter remoteCursoredStreamID) {
        return getController().cursoredStreamClose(remoteCursoredStreamID);
    }

    /**
     * Retrieve next page size of objects from the remote cursored stream
     */
    @Override
    public Transporter cursoredStreamNextPage(Transporter remoteCursoredStream, int pageSize) {
        return getController().cursoredStreamNextpage(remoteCursoredStream, pageSize);
    }

    /**
     * Return the cursored stream size
     */
    @Override
    public Transporter cursoredStreamSize(Transporter remoteCursoredStreamOid) {
        return getController().cursoredStreamSize(remoteCursoredStreamOid);
    }

    /**
     * Returns a remote cursor stub in a transporter
     */
    @Override
    public Transporter cursorSelectObjects(Transporter remoteTransporter) {
        Transporter transporter = getController().cursorSelectObjects(remoteTransporter);

        return transporter;
    }

    /**
     * A remote query after serialization is executed locally.
     */
    @Override
    public Transporter executeNamedQuery(Transporter nameTransporter, Transporter classTransporter, Transporter argumentsTransporter) {
        return getController().executeNamedQuery(nameTransporter, classTransporter, argumentsTransporter);
    }

    /**
     * A remote query after serialization is executed locally.
     */
    @Override
    public Transporter executeQuery(Transporter query) {
        return getController().executeQuery(query);
    }

    /**
     * Return the controller.  All work is dispatched to the controller.
     * This is required to be protocol independent.
     */
    protected RemoteSessionController getController() {
        return controller;
    }

    /**
     * Get the default read-only classes
     **/
    @Override
    public Transporter getDefaultReadOnlyClasses() {
        return getController().getDefaultReadOnlyClasses();
    }

    /**
     * Extract descriptor from the session
     */
    @Override
    public Transporter getDescriptor(Transporter theClass) {
        return getController().getDescriptor(theClass);
    }

    /**
     * Extract descriptor from the session
     */
    @Override
    public Transporter getDescriptorForAlias(Transporter alias) {
        return getController().getDescriptorForAlias(alias);
    }

    /**
     * Get the associated session login.
     */
    @Override
    public Transporter getLogin() {
        return getController().getLogin();
    }

    /**
     * INTERNAL:
     * Get the value returned by remote function call
     */
    @Override
    public Transporter getSequenceNumberNamed(Transporter remoteFunctionCall) {
        return getController().getSequenceNumberNamed(remoteFunctionCall);
    }

    @Override
    public Transporter initializeIdentityMapsOnServerSession() {
        return getController().initializeIdentityMapsOnServerSession();
    }

    /**
     * The corresponding original value holder is instantiated.
     */
    @Override
    public Transporter instantiateRemoteValueHolderOnServer(Transporter remoteValueHolder) {
        return getController().instantiateRemoteValueHolderOnServer(remoteValueHolder);
    }

    /**
     * Rollback a transaction on the database.
     */
    @Override
    public Transporter rollbackTransaction() {
        return getController().rollbackTransaction();
    }

    /**
     * Moves the cursor to the given row number in the result set
     */
    @Override
    public Transporter scrollableCursorAbsolute(Transporter remoteScrollableCursorOid, int rows) {
        return getController().scrollableCursorAbsolute(remoteScrollableCursorOid, rows);
    }

    /**
     * Moves the cursor to the end of the result set, just after the last row.
     */
    @Override
    public Transporter scrollableCursorAfterLast(Transporter remoteScrollableCursorOid) {
        return getController().scrollableCursorAfterLast(remoteScrollableCursorOid);
    }

    /**
     * Moves the cursor to the front of the result set, just before the first row
     */
    @Override
    public Transporter scrollableCursorBeforeFirst(Transporter remoteScrollableCursor) {
        return getController().scrollableCursorBeforeFirst(remoteScrollableCursor);
    }

    /**
     * Used for closing scrollable cursor across RMI.
     */
    @Override
    public Transporter scrollableCursorClose(Transporter remoteScrollableCursorOid) {
        return getController().scrollableCursorClose(remoteScrollableCursorOid);
    }

    /**
     * Retrieves the current row index number
     */
    @Override
    public Transporter scrollableCursorCurrentIndex(Transporter remoteScrollableCursor) {
        return getController().scrollableCursorCurrentIndex(remoteScrollableCursor);
    }

    /**
     * Moves the cursor to the first row in the result set
     */
    @Override
    public Transporter scrollableCursorFirst(Transporter remoteScrollableCursor) {
        return getController().scrollableCursorFirst(remoteScrollableCursor);
    }

    /**
     * Indicates whether the cursor is after the last row in the result set.
     */
    @Override
    public Transporter scrollableCursorIsAfterLast(Transporter remoteScrollableCursor) {
        return getController().scrollableCursorIsAfterLast(remoteScrollableCursor);
    }

    /**
     * Indicates whether the cursor is before the first row in the result set.
     */
    @Override
    public Transporter scrollableCursorIsBeforeFirst(Transporter remoteScrollableCursor) {
        return getController().scrollableCursorIsBeforeFirst(remoteScrollableCursor);
    }

    /**
     * Indicates whether the cursor is on the first row of the result set.
     */
    @Override
    public Transporter scrollableCursorIsFirst(Transporter remoteScrollableCursor) {
        return getController().scrollableCursorIsFirst(remoteScrollableCursor);
    }

    /**
     * Indicates whether the cursor is on the last row of the result set.
     */
    @Override
    public Transporter scrollableCursorIsLast(Transporter remoteScrollableCursor) {
        return getController().scrollableCursorIsLast(remoteScrollableCursor);
    }

    /**
     * Moves the cursor to the last row in the result set
     */
    @Override
    public Transporter scrollableCursorLast(Transporter remoteScrollableCursor) {
        return getController().scrollableCursorLast(remoteScrollableCursor);
    }

    /**
     * Retrieve next object from the scrollable cursor
     */
    @Override
    public Transporter scrollableCursorNextObject(Transporter scrollableCursorOid) {
        return getController().scrollableCursorNextObject(scrollableCursorOid);
    }

    /**
     * Retrieve previous object from the scrollable cursor
     */
    @Override
    public Transporter scrollableCursorPreviousObject(Transporter scrollableCursorOid) {
        return getController().scrollableCursorPreviousObject(scrollableCursorOid);
    }

    /**
     * Moves the cursor to the given row number in the result set
     */
    @Override
    public Transporter scrollableCursorRelative(Transporter remoteScrollableCursor, int rows) {
        return getController().scrollableCursorRelative(remoteScrollableCursor, rows);
    }

    /**
     * Return the cursor size
     */
    @Override
    public Transporter scrollableCursorSize(Transporter remoteCursorOid) {
        return getController().scrollableCursorSize(remoteCursorOid);
    }

    /**
     * Set the controller.  All work is dispatched to the controller.
     * This is required to be protocol independent.
     */
    protected void setController(RemoteSessionController controller) {
        this.controller = controller;
    }
}
