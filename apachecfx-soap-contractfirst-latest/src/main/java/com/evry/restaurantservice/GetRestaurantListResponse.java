
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
 *         &lt;element name="restaurants">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="restaurant" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="restId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="restName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="restAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "restaurants"
})
@XmlRootElement(name = "GetRestaurantListResponse")
public class GetRestaurantListResponse {

    @XmlElement(required = true)
    protected GetRestaurantListResponse.Restaurants restaurants;

    /**
     * Gets the value of the restaurants property.
     * 
     * @return
     *     possible object is
     *     {@link GetRestaurantListResponse.Restaurants }
     *     
     */
    public GetRestaurantListResponse.Restaurants getRestaurants() {
        return restaurants;
    }

    /**
     * Sets the value of the restaurants property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRestaurantListResponse.Restaurants }
     *     
     */
    public void setRestaurants(GetRestaurantListResponse.Restaurants value) {
        this.restaurants = value;
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
     *         &lt;element name="restaurant" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="restId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="restName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="restAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "restaurant"
    })
    public static class Restaurants {

        @XmlElement(required = true)
        protected List<GetRestaurantListResponse.Restaurants.Restaurant> restaurant;

        /**
         * Gets the value of the restaurant property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the restaurant property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRestaurant().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetRestaurantListResponse.Restaurants.Restaurant }
         * 
         * 
         */
        public List<GetRestaurantListResponse.Restaurants.Restaurant> getRestaurant() {
            if (restaurant == null) {
                restaurant = new ArrayList<GetRestaurantListResponse.Restaurants.Restaurant>();
            }
            return this.restaurant;
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
         *         &lt;element name="restId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="restName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="restAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "restName",
            "restAddress"
        })
        public static class Restaurant {

            @XmlElement(required = true)
            protected String restId;
            @XmlElement(required = true)
            protected String restName;
            @XmlElement(required = true)
            protected String restAddress;

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
             * Gets the value of the restAddress property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRestAddress() {
                return restAddress;
            }

            /**
             * Sets the value of the restAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRestAddress(String value) {
                this.restAddress = value;
            }

        }

    }

}
