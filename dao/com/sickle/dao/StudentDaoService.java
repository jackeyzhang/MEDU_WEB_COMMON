package com.sickle.dao;

import java.util.List;

import org.hibernate.Query;

import com.sickle.dao.support.HibernateSupport;
import com.sickle.pojo.edu.Classes;
import com.sickle.pojo.edu.Student;
import com.sickle.service.IStudentService;

/**
 * 学生dao服务
 * 
 * @author chenhao
 *
 */
public class StudentDaoService extends HibernateSupport<Student> implements IStudentService 
{

	@Override
	public Student getStudentById( Integer id )
	{
		Query query = getSession( ).createQuery( "from Student where id = ? " );
		query.setInteger( 0, id );
		if(query.list( ) == null || query.list( ).size( ) == 0 )
		{
			return null;
		}
		return (Student)query.list( ).get( 0 );
	}

	@Override
	public Student getStudentByLoginName( String loginName )
	{
		Query query = getSession( ).createQuery( "from Student where loginName = ? " );
		query.setString( 0, loginName );
		if(query.list( ) == null || query.list( ).size( ) == 0 )
		{
			return null;
		}
		return (Student)query.list( ).get( 0 );
	}

	@Override
	public Student addStudent( Student stu ) throws Exception
	{
		return save( stu );
	}

	@Override
	public boolean removeStudentById( Integer id ) throws Exception
	{
		Student removed = getStudentById(id);
		try
		{
			delete( removed );
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}

	@Override
	public boolean removeStudentByLoginName( String loginName )
			throws Exception
	{
		Student removed = getStudentByLoginName(loginName);
		try
		{
			delete( removed );
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}

	@Override
	public List<Student> removeStudentByClassesId( Integer classid )
			throws Exception
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Student modifyStudent( Student student ) throws Exception
	{
		return this.update( student );
	}
	
	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		StudentDaoService service = new StudentDaoService();
		ClassesDaoService cservice = new ClassesDaoService();
		Classes cls = new Classes();
		cls.setId( 1 );
		cls.setName( "mary" );
		cls.setClasstime( "classtime" );
		cservice.save( cls );
		Student stu = new Student(cls,"jackey","13622532223","nicheng","password");
		cls.getStudents( ).add( stu );
		service.save( stu );
		service.getStudentById( 1 );
	}


}
