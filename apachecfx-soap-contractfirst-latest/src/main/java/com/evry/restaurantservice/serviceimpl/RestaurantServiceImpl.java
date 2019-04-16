package com.evry.restaurantservice.serviceimpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

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

public class RestaurantServiceImpl implements IRestaurantService {

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
	private boolean flag;

	public AddRestaurantResponse addRestaurant(AddRestaurantRequest parameters) {

		System.out.println(parameters.getRestName() + "  " + parameters.getRestAddress());

		/*
		 * Set<Menu> items=new HashSet<Menu>(); Menu m1=new Menu();
		 * m1.setItemName("biryani"); m1.setItemPrice(100); m1.setItemType("non-veg");
		 * Menu m2=new Menu(); m2.setItemName("meals"); m2.setItemPrice(80);
		 * m2.setItemType("veg"); m2.setItemType("veg"); items.add(m1); items.add(m2);
		 */
		restaurant.setRestaurantName(parameters.getRestName());
		restaurant.setRestaurantAddress(parameters.getRestAddress());
//			restaurant.setItemList(items);

//			System.out.println(restaurant.getRestaurantName()+""+restaurant.getRestaurantAddress());
		flag = restaurantDao.addRestaurant(restaurant);

		if (flag) {
			addRestaurantResponse.setMessage("success");
		} else {
			addRestaurantResponse.setMessage("failure");
		}

		return addRestaurantResponse;

	}

	public GetRestaurantListResponse getRestaurantList(GetRestaurantListRequest parameters) {

		GetRestaurantListResponse.Restaurants.Restaurant restaurant = new GetRestaurantListResponse.Restaurants.Restaurant();
		GetRestaurantListResponse.Restaurants restaurants=new GetRestaurantListResponse.Restaurants();

		System.out.println(parameters.isRequired());
		if (parameters.isRequired()) {
			List<Restaurant> restaurantList = restaurantDao.getRestaurantList();
			if (restaurantList != null) {
				for (Restaurant rest : restaurantList) {
					System.out.println(rest.getRestaurantId() + " " + rest.getRestaurantName() + " "
							+ rest.getRestaurantAddress());

//					System.out.println(restaurant.getRestId()+" "+restaurant.getRestName()+" "+restaurant.getRestAddress());
					restaurant.setRestId(Integer.toString(rest.getRestaurantId()));
					restaurant.setRestName(rest.getRestaurantName());
					restaurant.setRestAddress(rest.getRestaurantAddress());
					System.out.println(restaurant.getRestId()+" "+restaurant.getRestName()+" "+restaurant.getRestAddress());
					restaurants.getRestaurant().add(restaurant);
				}
				getRestaurantListResponse.setRestaurants(restaurants);
				
			} else {
				System.out.println("Something went wrong");
			}
		}

return getRestaurantListResponse;
	}

	public AddMenuResponse addMenu(AddMenuRequest parameters) {
		System.out.println(parameters.getRestId() + "  " + parameters.getItemName()+" "+parameters.getItemPrice()+" "+parameters.getItemType());
		
		
		
		Set<Menu> items=new HashSet<Menu>();
		menu.setItemName(parameters.getItemName());
		menu.setItemPrice(Double.parseDouble(parameters.getItemPrice()));
		menu.setItemType(parameters.getItemType());
		items.add(menu);
		restaurant.setRestaurantId(Integer.parseInt(parameters.getRestId()));
		restaurant.setItemList(items);
		
		flag=restaurantDao.addMenu(restaurant);
		if (flag) {
			
			addMenuResponse.setMessage("success");
		} else {
			addMenuResponse.setMessage("failure");
		}

		return addMenuResponse;
	}

	public DeleteMenuResponse deleteMenu(DeleteMenuRequest parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	public GetMenuListResponse getMenuList(GetMenuListRequest parameters) {
		// TODO Auto-generated method stub
		return null;
	}

}
