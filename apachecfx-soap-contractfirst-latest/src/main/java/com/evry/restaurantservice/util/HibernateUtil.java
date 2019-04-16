package com.evry.restaurantservice.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class HibernateUtil {
	
	@Autowired
	private SessionFactory sessionFactory;
	private static ThreadLocal<Session> threadLocal =new ThreadLocal<Session>();
	private Session session;
	
	public Session getSession()
	{
		
		if(threadLocal.get()==null)
		{
			System.out.println("if");
			session=sessionFactory.openSession();
			threadLocal.set(session);
			
		
			
		}
		else {
			System.out.println("else");
		session=threadLocal.get();
		}
		return session;
	}
	
	public  void closeSession()
	{
	
	session=threadLocal.get();
	session.close();
	threadLocal.remove();
}
	public  void closeSessionFactory()
	{
		sessionFactory.close();
	}

}
