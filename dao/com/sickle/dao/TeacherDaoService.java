/**
 * 
 */
package com.sickle.dao;

import org.hibernate.Query;

import com.sickle.dao.support.HibernateSupport;
import com.sickle.pojo.edu.Teacher;
import com.sickle.service.itf.ITeacherService;


/**
 * 老师dao服务
 * 
 * @author chenhao
 *
 */
public class TeacherDaoService extends HibernateSupport<Teacher> implements ITeacherService
{

	@Override
	public Teacher getTeacherById( Integer id )
	{
		Query query = getSession( ).createQuery( "from Teacher where id = ? " );
		query.setInteger( 0, id );
		if(query.list( ) == null || query.list( ).size( ) == 0 )
		{
			return null;
		}
		return (Teacher)query.list( ).get( 0 );
	}

	@Override
	public Teacher addTeacher( Teacher teacher )
	{
		return this.save( teacher );
	}

	@Override
	public Teacher modifyTeacher( Teacher teacher )
	{
		return this.update( teacher );
	}

	@Override
	public boolean removeTeacherById( Integer teacherid ) throws Exception
	{
		Teacher teacher = getTeacherById( teacherid );
		try
		{
			delete( teacher );
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}

	@Override
	public boolean removeTeacherByLoginName( String teacherName ) throws Exception
	{
		Teacher teacher = getTeacherByLoginName( teacherName );
		try
		{
			delete( teacher );
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}

	
	@Override
	public Teacher getTeacherByLoginName( String name )
	{
		Query query = getSession( ).createQuery( "from Teacher where name = ? " );
		query.setString( 0, name );
		if(query.list( ) == null || query.list( ).size( ) == 0 )
		{
			return null;
		}
		return (Teacher)query.list( ).get( 0 );
	}


}
