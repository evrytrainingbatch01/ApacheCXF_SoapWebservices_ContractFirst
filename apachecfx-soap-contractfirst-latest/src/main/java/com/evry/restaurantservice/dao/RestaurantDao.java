package com.evry.restaurantservice.dao;

import java.util.List;

import com.evry.restaurantservice.model.Restaurant;

public interface RestaurantDao {
	
	public boolean addRestaurant(Restaurant restaurant);
	public List<Restaurant> getRestaurantList();
	public boolean addMenu(Restaurant restaurant);

}
