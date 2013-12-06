/**
 * 
 */
package com.sickle.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.sickle.dao.support.HibernateSupport;
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

	@Override
	public Cls getClassById( Integer id )
	{
		Query query = getSession( ).createQuery( "from Cls where id = ? " );
		query.setInteger( 0, id );
		if(query.list( ) == null || query.list( ).size( ) == 0 )
		{
			return null;
		}
		return (Cls)query.list( ).get( 0 );
	}

	@Override
	public Cls addCls( Cls classes )
	{
		return this.save( classes );
	}

	@Override
	public Cls modifyCls( Cls classes )
	{
		return this.update( classes );
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

	
	@Override
	public Cls getClassByName( String name )
	{
		Query query = getSession( ).createQuery( "from Cls where name = ? " );
		query.setString( 0, name );
		if(query.list( ) == null || query.list( ).size( ) == 0 )
		{
			return null;
		}
		return (Cls)query.list( ).get( 0 );
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cls> listCls( int startindex, int length )
			throws Exception
	{
		Query query = getSession( ).createQuery( "from Cls " );
		query.setFirstResult(startindex);
		query.setMaxResults(length);
		return query.list( );
	}

	@Override
	public Cls addCls( int memberid, Cls clses )
	{
		Session session = getSession( );
		session.beginTransaction();
		Query query = session.createQuery( "from Member where id = ? " );
		query.setInteger( 0, memberid );
		if(query.list( ) == null || query.list( ).size( ) == 0 )
		{
			return null;
		}
		Member member = (Member) query.list( ).get( 0 );
		clses.setCreateMember( member );
		session.save( clses );
		session.getTransaction().commit();
		session.close();
		return clses;
	}

}
