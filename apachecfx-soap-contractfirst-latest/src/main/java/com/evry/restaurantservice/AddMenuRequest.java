
package com.evry.restaurantservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="restId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "restId",
    "itemName",
    "itemPrice",
    "itemType"
})
@XmlRootElement(name = "AddMenuRequest")
public class AddMenuRequest {

    @XmlElement(required = true)
    protected String restId;
    @XmlElement(required = true)
    protected String itemName;
    @XmlElement(required = true)
    protected String itemPrice;
    @XmlElement(required = true)
    protected String itemType;

    /**
     * Gets the value of the restId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestId() {
        return restId;
    }

    /**
     * Sets the value of the restId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestId(String value) {
        this.restId = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the itemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemPrice() {
        return itemPrice;
    }

    /**
     * Sets the value of the itemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemPrice(String value) {
        this.itemPrice = value;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemType(String value) {
        this.itemType = value;
    }

}
