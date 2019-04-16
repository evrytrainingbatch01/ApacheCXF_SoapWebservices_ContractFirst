
package com.evry.restaurantservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.evry.restaurantservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.evry.restaurantservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMenuListResponse }
     * 
     */
    public GetMenuListResponse createGetMenuListResponse() {
        return new GetMenuListResponse();
    }

    /**
     * Create an instance of {@link GetRestaurantListResponse }
     * 
     */
    public GetRestaurantListResponse createGetRestaurantListResponse() {
        return new GetRestaurantListResponse();
    }

    /**
     * Create an instance of {@link GetRestaurantListResponse.Restaurants }
     * 
     */
    public GetRestaurantListResponse.Restaurants createGetRestaurantListResponseRestaurants() {
        return new GetRestaurantListResponse.Restaurants();
    }

    /**
     * Create an instance of {@link GetMenuListResponse.ItemList }
     * 
     */
    public GetMenuListResponse.ItemList createGetMenuListResponseItemList() {
        return new GetMenuListResponse.ItemList();
    }

    /**
     * Create an instance of {@link AddRestaurantResponse }
     * 
     */
    public AddRestaurantResponse createAddRestaurantResponse() {
        return new AddRestaurantResponse();
    }

    /**
     * Create an instance of {@link AddMenuRequest }
     * 
     */
    public AddMenuRequest createAddMenuRequest() {
        return new AddMenuRequest();
    }

    /**
     * Create an instance of {@link AddRestaurantRequest }
     * 
     */
    public AddRestaurantRequest createAddRestaurantRequest() {
        return new AddRestaurantRequest();
    }

    /**
     * Create an instance of {@link AddMenuResponse }
     * 
     */
    public AddMenuResponse createAddMenuResponse() {
        return new AddMenuResponse();
    }

    /**
     * Create an instance of {@link GetRestaurantListRequest }
     * 
     */
    public GetRestaurantListRequest createGetRestaurantListRequest() {
        return new GetRestaurantListRequest();
    }

    /**
     * Create an instance of {@link DeleteMenuRequest }
     * 
     */
    public DeleteMenuRequest createDeleteMenuRequest() {
        return new DeleteMenuRequest();
    }

    /**
     * Create an instance of {@link DeleteMenuResponse }
     * 
     */
    public DeleteMenuResponse createDeleteMenuResponse() {
        return new DeleteMenuResponse();
    }

    /**
     * Create an instance of {@link GetMenuListRequest }
     * 
     */
    public GetMenuListRequest createGetMenuListRequest() {
        return new GetMenuListRequest();
    }

    /**
     * Create an instance of {@link GetRestaurantListResponse.Restaurants.Restaurant }
     * 
     */
    public GetRestaurantListResponse.Restaurants.Restaurant createGetRestaurantListResponseRestaurantsRestaurant() {
        return new GetRestaurantListResponse.Restaurants.Restaurant();
    }

    /**
     * Create an instance of {@link GetMenuListResponse.ItemList.Item }
     * 
     */
    public GetMenuListResponse.ItemList.Item createGetMenuListResponseItemListItem() {
        return new GetMenuListResponse.ItemList.Item();
    }

}
