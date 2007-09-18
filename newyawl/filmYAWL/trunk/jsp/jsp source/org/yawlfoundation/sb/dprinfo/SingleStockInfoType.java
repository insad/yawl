//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.06.02 at 12:04:03 PM EST 
//


package org.yawlfoundation.sb.dprinfo;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for singleStockInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="singleStockInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loaded" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="gross" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="exposed" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="print" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="N_G" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="waste" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="shotEnds" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="sound" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "singleStockInfoType", propOrder = {
    "loaded",
    "gross",
    "exposed",
    "print",
    "ng",
    "waste",
    "shotEnds",
    "sound"
})
public class SingleStockInfoType {

    @XmlElement(required = true)
    protected BigInteger loaded;
    @XmlElement(required = true)
    protected BigInteger gross;
    @XmlElement(required = true)
    protected BigInteger exposed;
    @XmlElement(required = true)
    protected BigInteger print;
    @XmlElement(name = "N_G", required = true)
    protected BigInteger ng;
    @XmlElement(required = true)
    protected BigInteger waste;
    @XmlElement(required = true)
    protected BigInteger shotEnds;
    @XmlElement(required = true)
    protected BigInteger sound;

    /**
     * Gets the value of the loaded property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLoaded() {
        return loaded;
    }

    /**
     * Sets the value of the loaded property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLoaded(BigInteger value) {
        this.loaded = value;
    }

    /**
     * Gets the value of the gross property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGross() {
        return gross;
    }

    /**
     * Sets the value of the gross property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGross(BigInteger value) {
        this.gross = value;
    }

    /**
     * Gets the value of the exposed property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExposed() {
        return exposed;
    }

    /**
     * Sets the value of the exposed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExposed(BigInteger value) {
        this.exposed = value;
    }

    /**
     * Gets the value of the print property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrint() {
        return print;
    }

    /**
     * Sets the value of the print property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrint(BigInteger value) {
        this.print = value;
    }

    /**
     * Gets the value of the ng property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNG() {
        return ng;
    }

    /**
     * Sets the value of the ng property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNG(BigInteger value) {
        this.ng = value;
    }

    /**
     * Gets the value of the waste property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWaste() {
        return waste;
    }

    /**
     * Sets the value of the waste property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWaste(BigInteger value) {
        this.waste = value;
    }

    /**
     * Gets the value of the shotEnds property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getShotEnds() {
        return shotEnds;
    }

    /**
     * Sets the value of the shotEnds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setShotEnds(BigInteger value) {
        this.shotEnds = value;
    }

    /**
     * Gets the value of the sound property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSound() {
        return sound;
    }

    /**
     * Sets the value of the sound property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSound(BigInteger value) {
        this.sound = value;
    }

}