package com.evry.restaurantservice.daoimpl;




import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.evry.restaurantservice.dao.RestaurantDao;
import com.evry.restaurantservice.model.Restaurant;
import com.evry.restaurantservice.util.HibernateUtil;

public class RestaurantDaoImpl implements RestaurantDao {
	
	@Autowired
	private HibernateUtil util;
	
	@Autowired
	private Restaurant restaurant;
	private Session session;
	private Transaction tn;
    private boolean flag=true;
    private List<Restaurant> restaurantList;
    

	public boolean addRestaurant(Restaurant restaurant) {
		
		
		
try {
        
            session=util.getSession();
            
            tn=session.beginTransaction();

			
			
			
			
			session.save(restaurant);
			
			
			tn.commit();
			

			}
			catch(Exception e)
			{
				
					tn.rollback();
			
				flag=false;
				e.printStackTrace();
			}
		/*finally {
			
		
			util.closeSession();
			util.closeSessionFactory();
			}*/
			
		
		return flag;
	}


	public List<Restaurant> getRestaurantList() {
		
		try {
	        
            session=util.getSession();
            
            tn=session.beginTransaction();

			
			
			
			String sql=("from Restaurant");
			Query query=session.createQuery(sql);
			restaurantList=query.list();
			
			
			tn.commit();
			

			}
			catch(Exception e)
			{
				
					tn.rollback();
				e.printStackTrace();
			}
		
		return restaurantList;
	}


	public boolean addMenu(Restaurant rest) {
		
		try {
	        
            session=util.getSession();
            restaurant=(Restaurant)session.get(Restaurant.class,rest.getRestaurantId());
            System.out.println(restaurant.getRestaurantId());
            
            
            tn=session.beginTransaction();
            
            restaurant.getItemList().addAll(rest.getItemList());
            
			tn.commit();
			

			}
			catch(Exception e)
			{
				
					tn.rollback();
			
				flag=false;
				e.printStackTrace();
			}
		/*finally {
			
		
			util.closeSession();
			util.closeSessionFactory();
			}*/
			
		
		return flag;
	}

}
