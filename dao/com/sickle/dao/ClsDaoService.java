/**
 * 
 */
package com.sickle.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.sickle.dao.support.HibernateSupport;
import com.sickle.exception.NotExistException;
import com.sickle.pojo.edu.Cls;
import com.sickle.pojo.edu.Member;
import com.sickle.service.itf.IClsService;


/**
 * 班级dao服务
 * 
 * @author chenhao
 *
 */
public class ClsDaoService extends HibernateSupport<Cls> implements IClsService
{

	@SuppressWarnings("unchecked")
	@Override
	public Cls getClassById( Integer id )
	{
		Session session = getSession();
		Query query = session.createQuery("from Cls where id = ? ");
		query.setInteger(0, id);
		List<Cls> li = query.list();
		if (li == null || li.size() == 0) {
			return null;
		}
		session.close( );
		return li.get(0);
	}

	@Override
	public Cls addCls( Cls classes )
	{
		return this.save( classes );
	}

	@Override
	public Cls modifyCls( Cls classes )
	{
		return this.saveorupdate( classes );
	}

	@Override
	public boolean removeClsById( Integer classesid ) throws Exception
	{
		Cls classes = getClassById( classesid );
		try
		{
			delete( classes );
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}

	@Override
	public boolean removeClsByName( String schoolName ) throws Exception
	{
		Cls classes = getClassByName( schoolName );
		try
		{
			delete( classes );
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public Cls getClassByName( String name )
	{
		Session session = getSession();
		Query query = session.createQuery("from Cls where name = ? ");
		query.setString(0, name);
		List<Cls> li = query.list();
		if (li == null || li.size() == 0) {
			return null;
		}
		session.close( );
		return li.get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cls> listCls( int startindex, int length )
			throws Exception
	{
		Session session = getSession();
		Query query = session.createQuery("from Cls");
		query.setFirstResult(startindex);
		query.setMaxResults(length);
		List<Cls> li = query.list();
		if (li == null || li.size() == 0) {
			return null;
		}
		session.close( );
		return li;
	}

	@Override
	public Cls addCls( int memberid, Cls clses ) throws NotExistException
	{
		Session session = getSession( );
		session.beginTransaction();
		Query query = session.createQuery( "from Member where id = ? " );
		query.setInteger( 0, memberid );
		if(query.list( ) == null || query.list( ).size( ) == 0 )
		{
			throw new NotExistException();
		}
		Member member = (Member) query.list( ).get( 0 );
		clses.setTeacher(member);
		session.save( clses );
		session.getTransaction().commit();
		session.close();
		return clses;
	}

}
