/**
 * 
 */
package com.sickle.dao;

import java.util.List;

import org.hibernate.Query;

import com.sickle.dao.support.HibernateSupport;
import com.sickle.pojo.edu.Classes;
import com.sickle.service.itf.IClassesService;


/**
 * 班级dao服务
 * 
 * @author chenhao
 *
 */
public class ClassesDaoService extends HibernateSupport<Classes> implements IClassesService
{

	@Override
	public Classes getClassById( Integer id )
	{
		Query query = getSession( ).createQuery( "from Classes where id = ? " );
		query.setInteger( 0, id );
		if(query.list( ) == null || query.list( ).size( ) == 0 )
		{
			return null;
		}
		return (Classes)query.list( ).get( 0 );
	}

	@Override
	public Classes addClasses( Classes classes )
	{
		return this.save( classes );
	}

	@Override
	public Classes modifyClasses( Classes classes )
	{
		return this.update( classes );
	}

	@Override
	public boolean removeClassesById( Integer classesid ) throws Exception
	{
		Classes classes = getClassById( classesid );
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
	public boolean removeClassesByName( String schoolName ) throws Exception
	{
		Classes classes = getClassByName( schoolName );
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
	public Classes getClassByName( String name )
	{
		Query query = getSession( ).createQuery( "from Classes where name = ? " );
		query.setString( 0, name );
		if(query.list( ) == null || query.list( ).size( ) == 0 )
		{
			return null;
		}
		return (Classes)query.list( ).get( 0 );
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Classes> listClasses( int startindex, int length )
			throws Exception
	{
		Query query = getSession( ).createQuery( "from Classes " );
		query.setFirstResult(startindex);
		query.setMaxResults(length);
		return query.list( );
	}

}
