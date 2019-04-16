package com.evry.restaurantservice.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Restaurant")
public class Restaurant {
	
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="restaurant_id")
	private int restaurantId;
	@Column(name="restaurant_name")
	private String restaurantName;
	@Column(name="restaurant_address")
	private String restaurantAddress;
	
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getRestaurantAddress() {
		return restaurantAddress;
	}
	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}
	
	
	@OneToMany(cascade= {CascadeType.ALL})
	private Set<Menu> itemList;

	public Set<Menu> getItemList() {
		return itemList;
	}
	public void setItemList(Set<Menu> itemList) {
		this.itemList = itemList;
	}
	
	
	

}
