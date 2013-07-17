/**
 * 
 */
package com.sickle.dao;

import org.hibernate.Query;

import com.sickle.dao.support.HibernateSupport;
import com.sickle.pojo.edu.School;
import com.sickle.service.ISchoolService;


/**
 * 学校dao服务
 * 
 * @author chenhao
 *
 */
public class SchoolDaoService extends HibernateSupport<School> implements ISchoolService
{

	@Override
	public School getSchoolById( Integer id )
	{
		Query query = getSession( ).createQuery( "from School where id = ? " );
		query.setInteger( 0, id );
		if(query.list( ) == null || query.list( ).size( ) == 0 )
		{
			return null;
		}
		return (School)query.list( ).get( 0 );
	}

	@Override
	public School addSchool( School school )
	{
		return this.save( school );
	}

	@Override
	public School modifySchool( School school )
	{
		return this.update( school );
	}

	@Override
	public boolean removeSchoolById( Integer schoolid ) throws Exception
	{
		School school = getSchoolById( schoolid );
		try
		{
			delete( school );
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}

	@Override
	public boolean removeSchoolByLoginName( String schoolName ) throws Exception
	{
		School school = getSchoolByLoginName( schoolName );
		try
		{
			delete( school );
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}

	
	@Override
	public School getSchoolByLoginName( String name )
	{
		Query query = getSession( ).createQuery( "from School where name = ? " );
		query.setString( 0, name );
		if(query.list( ) == null || query.list( ).size( ) == 0 )
		{
			return null;
		}
		return (School)query.list( ).get( 0 );
	}


}
