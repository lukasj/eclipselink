/*
 * Copyright (c) 2014, 2021 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

//  Contributors:
//      Dmitry Kornilov - Initial implementation
package org.eclipse.persistence.jpa.rs.util;

import org.eclipse.persistence.internal.jpa.rs.metadata.model.LinkV2;

import java.util.List;

/**
 * JPARS 2.0 collection proxy interface. Implemented by all REST collection proxies.
 *
 * @author Dmitry Kornilov
 * @since EclipseLink 2.6.0.
 */
public interface CollectionProxy {

    List<LinkV2> getLinks();

    void setLinks(List<LinkV2> links);
}
