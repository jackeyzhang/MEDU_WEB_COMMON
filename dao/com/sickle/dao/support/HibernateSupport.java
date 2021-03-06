package com.sickle.dao.support;

import org.hibernate.Session;


/**
 * dao service都要继承此类
 * 
 * @author chenhao
 *
 * @param <T>
 */
public class HibernateSupport<T>{
	
	public T save(T t){
		Session session = getSession();
		session.beginTransaction();
		session.save(t);
		session.getTransaction().commit();
		session.close();
		return t;
	}
	
	public T delete(T t){
		Session session = getSession();
		session.beginTransaction();
		session.delete(t);
		session.getTransaction().commit();
		session.close();
		return t;
	}
	
	public T update(T t){
		Session session = getSession();
		session.beginTransaction();
		session.merge(t);
		session.getTransaction().commit();
		session.close();
		return t;
	}
	
	public T saveorupdate(T t){
		Session session = getSession();
		session.beginTransaction();
		session.saveOrUpdate(t);
		session.getTransaction().commit();
		session.close();
		return t;
	}
	
	public Session getSession(){
		return SessionManager.getInstance().getSession();
	}

}
