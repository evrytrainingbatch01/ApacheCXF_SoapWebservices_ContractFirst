
package com.evry.restaurantservice;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="restName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="itemPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="itemType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "restName",
    "itemList"
})
@XmlRootElement(name = "GetMenuListResponse")
public class GetMenuListResponse {

    @XmlElement(required = true)
    protected String restName;
    @XmlElement(required = true)
    protected GetMenuListResponse.ItemList itemList;

    /**
     * Gets the value of the restName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestName() {
        return restName;
    }

    /**
     * Sets the value of the restName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestName(String value) {
        this.restName = value;
    }

    /**
     * Gets the value of the itemList property.
     * 
     * @return
     *     possible object is
     *     {@link GetMenuListResponse.ItemList }
     *     
     */
    public GetMenuListResponse.ItemList getItemList() {
        return itemList;
    }

    /**
     * Sets the value of the itemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMenuListResponse.ItemList }
     *     
     */
    public void setItemList(GetMenuListResponse.ItemList value) {
        this.itemList = value;
    }


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
     *         &lt;element name="item" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="itemPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="itemType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "item"
    })
    public static class ItemList {

        @XmlElement(required = true)
        protected List<GetMenuListResponse.ItemList.Item> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetMenuListResponse.ItemList.Item }
         * 
         * 
         */
        public List<GetMenuListResponse.ItemList.Item> getItem() {
            if (item == null) {
                item = new ArrayList<GetMenuListResponse.ItemList.Item>();
            }
            return this.item;
        }


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
         *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "itemId",
            "itemName",
            "itemPrice",
            "itemType"
        })
        public static class Item {

            @XmlElement(required = true)
            protected String itemId;
            @XmlElement(required = true)
            protected String itemName;
            @XmlElement(required = true)
            protected String itemPrice;
            @XmlElement(required = true)
            protected String itemType;

            /**
             * Gets the value of the itemId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemId() {
                return itemId;
            }

            /**
             * Sets the value of the itemId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemId(String value) {
                this.itemId = value;
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

    }

}
