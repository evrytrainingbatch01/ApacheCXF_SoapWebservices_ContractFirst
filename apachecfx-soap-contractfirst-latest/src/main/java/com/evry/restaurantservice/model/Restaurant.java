package com.evry.restaurantservice.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author srinivasa.nayana
 * @Entity 
 *      this annotation is used to mark the Restaurant class as an entity to be used with Hibernate
 * @Table
 *      this annotation is used to define customized table name. if it's not used , class name is considered as table name by default 
 *      by hibernate.
 *          
 */
@Entity
@Table(name="Restaurant")
public class Restaurant {
	
	/*
	 * defined the property 'restaurant_id' of type int with private scope
	 * @Id
	 *   this is used to make this property as primary key column in the table
	 * @Column
	 *    this is used to define the customized column name. if not used , the property name is considered as column name by default  
	 */
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="restaurant_id")
	private int restaurantId;
	@Column(name="restaurant_name")
	private String restaurantName;
	@Column(name="restaurant_address")
	private String restaurantAddress;
	
	
	/*
	 * Get the value of restaurantId property
	 * 
	 * @return 
	 *       returns value is of int type
	 */
	public int getRestaurantId() {
		return restaurantId;
	}
	
	/*
	 * Set the value of restaurantId property
	 * possible accepted value is of int type
	 */
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	
	/*
	 * get the value of restaurantName property
	 * 
	 * returns the value of String type
	 */
	public String getRestaurantName() {
		return restaurantName;
	}
	
	/*
	 * set the value of restaurantName property
	 *possible accept value is of String type
	 */
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	
	/*
	 * get value of restaurnatAddress property
	 * returns the String type value
	 */
	public String getRestaurantAddress() {
		return restaurantAddress;
	}
	
	/*
	 * set the value of property restaurantAddress
	 * possible accept value is of String type
	 */
	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}
	
	
	
	/*
	 * @OneToMany
	 *       this annotation is used to establish the one to many  association between Restaurant and Menu entities 
	 * cascadeType.ALL is used to instruct the hibernate that if any action is performed on parent object such as persist , remove , delete etc,
	 * the corresponding actions needs to be taken child object .
	 *   
	 *  as it's one to many associatoin , the property itemList of List<Menu> type is taken    
	 */
	@OneToMany(cascade= {CascadeType.ALL})
	private List<Menu> itemList;

	
	/*
	 * get the list of items to the itemList property
	 * 
	 * returns List<Menu>
	 */
	public List<Menu> getItemList() {
		return itemList;
	}
	
	/*
	 * set the value of property
	 * possible value of accepted  is List<Menu>
	 */
	public void setItemList(List<Menu> itemList) {
		this.itemList = itemList;
	}

	
	
	

}
