//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.06.02 at 01:01:41 PM EST 
//


package org.yawlfoundation.sb.callsheetinfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for crewContactsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="crewContactsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="onSetMobile" type="{http://www.yawlfoundation.org/sb/callSheetInfo}singleCrewContactType"/>
 *         &lt;element name="unitMobile" type="{http://www.yawlfoundation.org/sb/callSheetInfo}singleCrewContactType"/>
 *         &lt;element name="more" type="{http://www.yawlfoundation.org/sb/callSheetInfo}singleCrewContactType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crewContactsType", propOrder = {
    "onSetMobile",
    "unitMobile",
    "more"
})
public class CrewContactsType {

    @XmlElement(required = true)
    protected SingleCrewContactType onSetMobile;
    @XmlElement(required = true)
    protected SingleCrewContactType unitMobile;
    protected List<SingleCrewContactType> more;

    /**
     * Gets the value of the onSetMobile property.
     * 
     * @return
     *     possible object is
     *     {@link SingleCrewContactType }
     *     
     */
    public SingleCrewContactType getOnSetMobile() {
        return onSetMobile;
    }

    /**
     * Sets the value of the onSetMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleCrewContactType }
     *     
     */
    public void setOnSetMobile(SingleCrewContactType value) {
        this.onSetMobile = value;
    }

    /**
     * Gets the value of the unitMobile property.
     * 
     * @return
     *     possible object is
     *     {@link SingleCrewContactType }
     *     
     */
    public SingleCrewContactType getUnitMobile() {
        return unitMobile;
    }

    /**
     * Sets the value of the unitMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleCrewContactType }
     *     
     */
    public void setUnitMobile(SingleCrewContactType value) {
        this.unitMobile = value;
    }

    /**
     * Gets the value of the more property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the more property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SingleCrewContactType }
     * 
     * 
     */
    public List<SingleCrewContactType> getMore() {
        if (more == null) {
            more = new ArrayList<SingleCrewContactType>();
        }
        return this.more;
    }

}