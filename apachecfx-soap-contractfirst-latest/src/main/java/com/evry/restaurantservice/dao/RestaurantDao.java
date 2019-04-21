package com.evry.restaurantservice.dao;

import java.util.List;

import com.evry.restaurantservice.model.Restaurant;

/**
 * 
 * @author srinivasa.nayana
 * interface RestaurantDao contains the method specifications of Restaurant functionality 
 */
public interface RestaurantDao {
	
	
	/*
	 * @param
	 *  accepts the object of Restaurant type as parameter
	 * 
	 * @return 
	 *   returns the boolean type value (either true or false)
	 */
	public boolean addRestaurant(Restaurant restaurant);
	
	/*
	 * @return
	 *  returns the List of objects of Restaurant type ( List<Restaurant>)
	 */
	public List<Restaurant> getRestaurantList();
	
	/*
	 * @param
	 *  accepts the object of Restaurant type as parameter
	 * 
	 * @return 
	 *   returns the boolean type value (either true or false)
	 */
	public boolean addMenu(Restaurant restaurant);
	
	/*
	 * @param
	 *  accepts restaurand id and item id of type int
	 * 
	 * @return
	 *   returns the boolean type value(either true or false)
	 */
	public boolean deleteMenu(int restId,int itemId);
	
	/*
	 * @param
	 *    accepts the restaurant id of type int
	 *    
	 * @return
	 * 
	 *    returns the object of Restaurant type
	 */
	public Restaurant getMenuList(int restId);

}
