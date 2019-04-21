package com.evry.restaurantservice.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.evry.restaurantservice.dao.RestaurantDao;
import com.evry.restaurantservice.model.Menu;
import com.evry.restaurantservice.model.Restaurant;
import com.evry.restaurantservice.util.HibernateUtil;

/**
 * 
 * @author srinivasa.nayana
 * this class implements RestaurantDao interface to define it's methods.
 *
 */

@Repository
public class RestaurantDaoImpl implements RestaurantDao {

	/*
	 * @Autowired annotation is used to get the HibernateUtil object injected by spring container
	 */
	@Autowired
	private HibernateUtil util;

	/*
	 * @Autowired annotation is used to get the Restaurant object injected by spring container
	 */
	@Autowired
	private Restaurant restaurant;
	
	// declared the variable session of Session type with private scope to access only with in the class
	private Session session;
	
	//declared the variable tn of Transaction type with private scope to access only with in the class
	private Transaction tn;
	
	//declared the variable flag of boolean type with private scope to access only with in the class
	private boolean flag = true;
	
	//declared the variable restaurantList of List with private scope to access only with in the class
	private List<Restaurant> restaurantList;

	
	/*
	 *@param
	 *    this method accepts the object of Restaurant type
	 *    
	 * @return
	 *    returns the boolan type value
	 *    
	 * this method is called to store details of the restaurant  to the table 'restaurant' under 'webservices' database
	 */
	public boolean addRestaurant(Restaurant restaurant) {

		try {

			session = util.getSession();

			tn = session.beginTransaction();

			session.save(restaurant);

			tn.commit();

		} catch (Exception e) {

			tn.rollback();

			flag = false;
			e.printStackTrace();
		}
		

		return flag;
	}

	
	/*
	 * @return
	 *       returns the list of restaurants ( List<Restaurant>) 
	 *  this method is called to retrieve the list of restaurant details from the table 'restaurant' under 'webservcie' database     
	 */
	public List<Restaurant> getRestaurantList() {

		try {

			session = util.getSession();

			tn = session.beginTransaction();

			String sql = ("from Restaurant");
			Query query = session.createQuery(sql);
			restaurantList = query.list();

			tn.commit();

		} catch (Exception e) {

			tn.rollback();
			e.printStackTrace();
		}

		return restaurantList;
	}

	
	/*
	 * @param
	 *      accepts the parameter of type Restaurant
	 * @return
	 *       returns the value of boolean type
	 * this method is called to store the menu details with respect to particualr restaurant into the table 'menu' under the 'webservices'
	 * database
	 */
	public boolean addMenu(Restaurant rest) {

		try {

			session = util.getSession();
			restaurant = (Restaurant) session.get(Restaurant.class, rest.getRestaurantId());
			System.out.println(restaurant.getRestaurantId());
			restaurant.getItemList().addAll(rest.getItemList());

			tn = session.beginTransaction();

			session.merge(restaurant);

			tn.commit();

		} catch (Exception e) {

			tn.rollback();

			flag = false;
			e.printStackTrace();
		}
		

		return flag;
	}

	
	/*
	 * @param
	 *     accepts 2 parameters restaurant id and item id of type int
	 *  @return 
	 *      returns value of boolean type
	 *      
	 *  this method is called to delete the specific item of desired restaurant from the table 'menu' under the 'webservices' database.
	 */
	public boolean deleteMenu(int restId, int itemId) {

		try {
			System.out.println(restId + " " + itemId);
			session = util.getSession();
			tn = session.beginTransaction();
			restaurant = session.get(Restaurant.class, restId);
			Menu menu = session.get(Menu.class, itemId);
			restaurant.getItemList().remove(menu);

			tn = session.beginTransaction();

			session.merge(restaurant);
			session.delete(menu);

			tn.commit();
		} catch (Exception e) {
			tn.rollback();

			flag = false;
			e.printStackTrace();
		}
		return flag;
	}

	
	/*
	 * @param
	 *      accept the restaurant id of type int
	 * @return
	 *      returns the object of type Restaurant.
	 *  
	 *  this method is called to retrieve the list of items in the 'menu' table 
	 */
	public Restaurant getMenuList(int restId) {
		try {
		session=util.getSession();
		tn=session.beginTransaction();
		restaurant=session.get(Restaurant.class,restId);
		tn.commit();
		}
		catch(Exception e)
		{
			tn.rollback();
			e.printStackTrace();
		}
		return restaurant;
	}

}
