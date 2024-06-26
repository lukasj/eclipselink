/*
 * Copyright (c) 1998, 2022 Oracle and/or its affiliates. All rights reserved.
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
//     09/23/2008-1.1 Guy Pelletier
//       - 241651: JPA 2.0 Access Type support
//     03/27/2009-2.0 Guy Pelletier
//       - 241413: JPA 2.0 Add EclipseLink support for Map type attributes
package org.eclipse.persistence.testing.models.jpa.xml.merge.inherited;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;

import java.sql.Timestamp;

import static jakarta.persistence.FetchType.LAZY;

/**
 * This class is mapped in:
 * resource/eclipselink-ddl-generation-model/merge-inherited-superclasses.xml
 * <p>
 * All annotations should be ignored in this class as the XML definition is
 * declared as metadata-complete=true. Not to mention the access is field
 * therefore any annotations on methods are not processed (where they were
 * before I moved them to the fields).
 */
public class Beer extends Beverage {
    // The version is defined in XML
    private Timestamp version;

    @Basic
    @Column(name="ALCOHOL_CONTENT")
    private double alcoholContent;

    @ManyToOne(fetch=LAZY)
    @JoinColumn(name="TOTALLY_WRONG_ID")
    private BeerConsumer beerConsumer;

    private EmbeddedSerialNumber embeddedSerialNumber;

    public static int BEER_PRE_PERSIST_COUNT = 0;

    public Beer() {}

    @PrePersist
    public void celebrate() {
        BEER_PRE_PERSIST_COUNT++;
    }

    public double getAlcoholContent() {
        return alcoholContent;
    }

    public BeerConsumer getBeerConsumer() {
        return beerConsumer;
    }

    public Timestamp getVersion() {
        return version;
    }

    public void setAlcoholContent(double alcoholContent) {
        this.alcoholContent = alcoholContent;
    }

    public void setBeerConsumer(BeerConsumer beerConsumer) {
        this.beerConsumer = beerConsumer;
    }

    public void setVersion(Timestamp version) {
        this.version = version;
    }

    public EmbeddedSerialNumber getEmbeddedSerialNumber() {
        return this.embeddedSerialNumber;
    }

    public void setEmbeddedSerialNumber(EmbeddedSerialNumber embeddedSerialNumber) {
        this.embeddedSerialNumber = embeddedSerialNumber;
    }
}
