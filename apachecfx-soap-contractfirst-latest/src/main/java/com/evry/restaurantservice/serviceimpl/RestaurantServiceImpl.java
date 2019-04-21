package com.evry.restaurantservice.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evry.restaurantservice.AddMenuRequest;
import com.evry.restaurantservice.AddMenuResponse;
import com.evry.restaurantservice.AddRestaurantRequest;
import com.evry.restaurantservice.AddRestaurantResponse;
import com.evry.restaurantservice.DeleteMenuRequest;
import com.evry.restaurantservice.DeleteMenuResponse;
import com.evry.restaurantservice.GetMenuListRequest;
import com.evry.restaurantservice.GetMenuListResponse;
import com.evry.restaurantservice.GetRestaurantListRequest;
import com.evry.restaurantservice.GetRestaurantListResponse;
import com.evry.restaurantservice.IRestaurantService;
import com.evry.restaurantservice.dao.RestaurantDao;
import com.evry.restaurantservice.model.Menu;
import com.evry.restaurantservice.model.Restaurant;

/**
 * 
 * @author srinivasa.nayana class implements the IRestaurantServcie interface to
 *         define it's methods in it
 */
@Service
public class RestaurantServiceImpl implements IRestaurantService {

	/*
	 * @Autowired this annotation is used to have the corresponding objects injected
	 * by spring container
	 */
	@Autowired
	private RestaurantDao restaurantDao;

	@Autowired
	private Restaurant restaurant;

	@Autowired
	private Menu menu;

	@Autowired
	private AddRestaurantResponse addRestaurantResponse;

	@Autowired
	private GetRestaurantListResponse getRestaurantListResponse;

	@Autowired
	private AddMenuResponse addMenuResponse;

	@Autowired
	private DeleteMenuResponse deleteMenuResponse;

	@Autowired
	private GetMenuListResponse getMenuListResponse;

	private boolean flag;

	/*
	 * this method is called to store restaurant details into the corresponding
	 * table through DAP layer service
	 * 
	 * @param accept the object of type AddRestaurantRequest
	 * 
	 * @return returns the object of type AddRestaurantResponse
	 */
	public AddRestaurantResponse addRestaurant(AddRestaurantRequest parameters) {

		System.out.println(parameters.getRestName() + "  " + parameters.getRestAddress());

		restaurant.setRestaurantName(parameters.getRestName());
		restaurant.setRestaurantAddress(parameters.getRestAddress());

		flag = restaurantDao.addRestaurant(restaurant);

		if (flag) {
			addRestaurantResponse.setMessage("success");
		} else {
			addRestaurantResponse.setMessage("failure");
		}

		return addRestaurantResponse;

	}

	/*
	 * this method is called to get the list of restaurants
	 * 
	 * @param accept the object of type GetRestaurantListRequest
	 * 
	 * @return returns the object of type GetRestaurantListResponse
	 */

	public GetRestaurantListResponse getRestaurantList(GetRestaurantListRequest parameters) {

		GetRestaurantListResponse.Restaurants restaurants = new GetRestaurantListResponse.Restaurants();

		System.out.println(parameters.isRequired());
		if (parameters.isRequired()) {
			List<Restaurant> restaurantList = restaurantDao.getRestaurantList();
			if (restaurantList != null) {
				for (Restaurant rest : restaurantList) {
					GetRestaurantListResponse.Restaurants.Restaurant restaurant = new GetRestaurantListResponse.Restaurants.Restaurant();
					System.out.println(rest.getRestaurantId() + " " + rest.getRestaurantName() + " "
							+ rest.getRestaurantAddress());

					restaurant.setRestId(Integer.toString(rest.getRestaurantId()));
					restaurant.setRestName(rest.getRestaurantName());
					restaurant.setRestAddress(rest.getRestaurantAddress());
					System.out.println(restaurant.getRestId() + " " + restaurant.getRestName() + " "
							+ restaurant.getRestAddress());
					restaurants.getRestaurant().add(restaurant);
				}

				getRestaurantListResponse.setRestaurants(restaurants);
			}

			else {
				System.out.println("Something went wrong");
			}
		}

		return getRestaurantListResponse;
	}

	/*
	 * this method is used to store menu item into the table by invoking the
	 * corresponding service in DAO layer
	 * 
	 * @param accepts the object of type AddMenuRequest
	 * 
	 * @return returns the object of type AddMenuResponse
	 */

	public AddMenuResponse addMenu(AddMenuRequest parameters) {
		System.out.println(parameters.getRestId() + "  " + parameters.getItemName() + " " + parameters.getItemPrice()
				+ " " + parameters.getItemType());

		List<Menu> items = new ArrayList<Menu>();
		menu.setItemName(parameters.getItemName());
		menu.setItemPrice(Double.parseDouble(parameters.getItemPrice()));
		menu.setItemType(parameters.getItemType());
		items.add(menu);
		restaurant.setRestaurantId(Integer.parseInt(parameters.getRestId()));
		restaurant.setItemList(items);

		flag = restaurantDao.addMenu(restaurant);
		if (flag) {

			addMenuResponse.setMessage("success");
		} else {
			addMenuResponse.setMessage("failure");
		}

		return addMenuResponse;
	}

	/*
	 * this method is called to delete the item from 'menu' table by calling the
	 * corresponding service in DAO layer
	 * 
	 * @param accepts the object of type DeleteMenuRequest
	 * 
	 * @return returns the object of type DeleteMenuResponse
	 */
	public DeleteMenuResponse deleteMenu(DeleteMenuRequest parameters) {

		System.out.println(parameters.getRestId() + " " + parameters.getItemId());
		flag = restaurantDao.deleteMenu(Integer.parseInt(parameters.getRestId()),
				Integer.parseInt(parameters.getItemId()));

		if (flag) {

			deleteMenuResponse.setMessage("success");
		} else {
			deleteMenuResponse.setMessage("failure");
		}
		return deleteMenuResponse;
	}

	/*
	 * this method is used to get the list of items from the 'menu' table related to
	 * specific restaurant by calling the corresponding service in DAO layer
	 * 
	 * @param accepts the object of type GetMenuListRequest
	 * 
	 * @return returns the object of type GetMenuListResponse
	 */
	public GetMenuListResponse getMenuList(GetMenuListRequest parameters) {

		GetMenuListResponse.ItemList itemList = new GetMenuListResponse.ItemList();
		System.out.println(parameters.getRestId());
		restaurant = restaurantDao.getMenuList(Integer.parseInt(parameters.getRestId()));

		for (Menu item : restaurant.getItemList()) {
			GetMenuListResponse.ItemList.Item itemGMLR = new GetMenuListResponse.ItemList.Item();
			System.out.println(
					item.getItemId() + " " + item.getItemName() + " " + item.getItemPrice() + " " + item.getItemType());

			itemGMLR.setItemId(Integer.toString(item.getItemId()));
			itemGMLR.setItemName(item.getItemName());
			itemGMLR.setItemPrice(Double.toString(item.getItemPrice()) + " INR");
			itemGMLR.setItemType(item.getItemType());
			itemList.getItem().add(itemGMLR);
		}

		getMenuListResponse.setRestName(restaurant.getRestaurantName());
		getMenuListResponse.setItemList(itemList);

		return getMenuListResponse;
	}

}
