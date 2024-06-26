/*
 * Copyright (c) 1998, 2021 Oracle and/or its affiliates. All rights reserved.
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
// Denise Smith - 2.3
package org.eclipse.persistence.testing.jaxb.xmlschema.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for complexType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="complexType">
 *   <complexContent>
 *     <extension base="{http://www.w3.org/2001/XMLSchema}annotated">
 *       <group ref="{http://www.w3.org/2001/XMLSchema}complexTypeModel"/>
 *       <attribute name="name" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       <attribute name="mixed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="abstract" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="final" type="{http://www.w3.org/2001/XMLSchema}derivationSet" />
 *       <attribute name="block" type="{http://www.w3.org/2001/XMLSchema}derivationSet" />
 *       <anyAttribute processContents='lax' namespace='##other'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complexType", propOrder = {
    "simpleContent",
    "complexContent",
    "group",
    "all",
    "choice",
    "sequence",
    "attributeOrAttributeGroup",
    "anyAttribute"
})
@XmlSeeAlso({
    TopLevelComplexType.class,
    LocalComplexType.class
})
public abstract class ComplexType
    extends Annotated
{

    protected SimpleContent simpleContent;
    protected ComplexContent complexContent;
    protected GroupRef group;
    protected All all;
    protected ExplicitGroup choice;
    protected ExplicitGroup sequence;
    @XmlElements({
        @XmlElement(name = "attribute", type = Attribute.class),
        @XmlElement(name = "attributeGroup", type = AttributeGroupRef.class)
    })
    protected List<Annotated> attributeOrAttributeGroup;
    protected Wildcard anyAttribute;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "mixed")
    protected Boolean mixed;
    @XmlAttribute(name = "abstract")
    protected Boolean _abstract;
    @XmlAttribute(name = "final")
    @XmlSchemaType(name = "derivationSet")
    protected List<String> _final;
    @XmlAttribute(name = "block")
    @XmlSchemaType(name = "derivationSet")
    protected List<String> block;

    /**
     * Gets the value of the simpleContent property.
     *
     * @return
     *     possible object is
     *     {@link SimpleContent }
     *
     */
    public SimpleContent getSimpleContent() {
        return simpleContent;
    }

    /**
     * Sets the value of the simpleContent property.
     *
     * @param value
     *     allowed object is
     *     {@link SimpleContent }
     *
     */
    public void setSimpleContent(SimpleContent value) {
        this.simpleContent = value;
    }

    /**
     * Gets the value of the complexContent property.
     *
     * @return
     *     possible object is
     *     {@link ComplexContent }
     *
     */
    public ComplexContent getComplexContent() {
        return complexContent;
    }

    /**
     * Sets the value of the complexContent property.
     *
     * @param value
     *     allowed object is
     *     {@link ComplexContent }
     *
     */
    public void setComplexContent(ComplexContent value) {
        this.complexContent = value;
    }

    /**
     * Gets the value of the group property.
     *
     * @return
     *     possible object is
     *     {@link GroupRef }
     *
     */
    public GroupRef getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     *
     * @param value
     *     allowed object is
     *     {@link GroupRef }
     *
     */
    public void setGroup(GroupRef value) {
        this.group = value;
    }

    /**
     * Gets the value of the all property.
     *
     * @return
     *     possible object is
     *     {@link All }
     *
     */
    public All getAll() {
        return all;
    }

    /**
     * Sets the value of the all property.
     *
     * @param value
     *     allowed object is
     *     {@link All }
     *
     */
    public void setAll(All value) {
        this.all = value;
    }

    /**
     * Gets the value of the choice property.
     *
     * @return
     *     possible object is
     *     {@link ExplicitGroup }
     *
     */
    public ExplicitGroup getChoice() {
        return choice;
    }

    /**
     * Sets the value of the choice property.
     *
     * @param value
     *     allowed object is
     *     {@link ExplicitGroup }
     *
     */
    public void setChoice(ExplicitGroup value) {
        this.choice = value;
    }

    /**
     * Gets the value of the sequence property.
     *
     * @return
     *     possible object is
     *     {@link ExplicitGroup }
     *
     */
    public ExplicitGroup getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     *
     * @param value
     *     allowed object is
     *     {@link ExplicitGroup }
     *
     */
    public void setSequence(ExplicitGroup value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the attributeOrAttributeGroup property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeOrAttributeGroup property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeOrAttributeGroup().add(newItem);
     * }</pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attribute }
     * {@link AttributeGroupRef }
     *
     *
     */
    public List<Annotated> getAttributeOrAttributeGroup() {
        if (attributeOrAttributeGroup == null) {
            attributeOrAttributeGroup = new ArrayList<Annotated>();
        }
        return this.attributeOrAttributeGroup;
    }

    /**
     * Gets the value of the anyAttribute property.
     *
     * @return
     *     possible object is
     *     {@link Wildcard }
     *
     */
    public Wildcard getAnyAttribute() {
        return anyAttribute;
    }

    /**
     * Sets the value of the anyAttribute property.
     *
     * @param value
     *     allowed object is
     *     {@link Wildcard }
     *
     */
    public void setAnyAttribute(Wildcard value) {
        this.anyAttribute = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the mixed property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isMixed() {
        if (mixed == null) {
            return false;
        } else {
            return mixed;
        }
    }

    /**
     * Sets the value of the mixed property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setMixed(Boolean value) {
        this.mixed = value;
    }

    /**
     * Gets the value of the abstract property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isAbstract() {
        if (_abstract == null) {
            return false;
        } else {
            return _abstract;
        }
    }

    /**
     * Sets the value of the abstract property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setAbstract(Boolean value) {
        this._abstract = value;
    }

    /**
     * Gets the value of the final property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the final property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinal().add(newItem);
     * }</pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getFinal() {
        if (_final == null) {
            _final = new ArrayList<String>();
        }
        return this._final;
    }

    /**
     * Gets the value of the block property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the block property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlock().add(newItem);
     * }</pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getBlock() {
        if (block == null) {
            block = new ArrayList<String>();
        }
        return this.block;
    }

}
