//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.23 at 04:45:00 PM CDT 
//

package org.usd.edu.btl.betsconverter.GalaxyV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="embeddedValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ftype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dbkey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestParam", propOrder = {
    "embeddedValue"
})
public class TestParam {

    /**
     *
     */
    protected String embeddedValue;

    /**
     *
     */
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     *
     */
    @XmlAttribute(name = "value")
    protected String value;

    /**
     *
     */
    @XmlAttribute(name = "ftype")
    protected String ftype;

    /**
     *
     */
    @XmlAttribute(name = "dbkey")
    protected String dbkey;

    /**
     * Gets the value of the embeddedValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbeddedValue() {
        return embeddedValue;
    }

    /**
     * Sets the value of the embeddedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbeddedValue(String value) {
        this.embeddedValue = value;
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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the ftype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtype() {
        return ftype;
    }

    /**
     * Sets the value of the ftype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtype(String value) {
        this.ftype = value;
    }

    /**
     * Gets the value of the dbkey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbkey() {
        return dbkey;
    }

    /**
     * Sets the value of the dbkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbkey(String value) {
        this.dbkey = value;
    }

}