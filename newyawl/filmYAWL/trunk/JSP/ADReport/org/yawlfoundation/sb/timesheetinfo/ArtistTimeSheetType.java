//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.05.21 at 04:49:32 PM EST 
//


package org.yawlfoundation.sb.timesheetinfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for artistTimeSheetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="artistTimeSheetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="singleArtist" type="{http://www.yawlfoundation.org/sb/timeSheetInfo}singleArtistType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "artistTimeSheetType", propOrder = {
    "singleArtist"
})
public class ArtistTimeSheetType {

    @XmlElement(required = true)
    protected List<SingleArtistType> singleArtist;

    /**
     * Gets the value of the singleArtist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the singleArtist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSingleArtist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SingleArtistType }
     * 
     * 
     */
    public List<SingleArtistType> getSingleArtist() {
        if (singleArtist == null) {
            singleArtist = new ArrayList<SingleArtistType>();
        }
        return this.singleArtist;
    }

}