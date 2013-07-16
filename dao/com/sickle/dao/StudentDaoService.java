package com.sickle.dao;

import org.hibernate.Query;

import com.sickle.pojo.edu.Classes;
import com.sickle.pojo.edu.Student;
import com.sickle.service.IStudentService;

/**
 * 学生dao服务
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
