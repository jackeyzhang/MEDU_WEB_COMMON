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
import com.sickle.pojo.edu.Student;
import com.sickle.service.itf.IStudentService;

/**
 * 学生dao服务
 * 
 * @author chenhao
 * 
 */
public class StudentDaoService extends HibernateSupport<Student> implements
IStudentService {

	@SuppressWarnings("unchecked")
	@Override
	public Student getStudentById(Integer id) {
		Session session = getSession();
		Query query = session.createQuery("from Student where id = ? ");
		query.setInteger(0, id);
		List<Student> li = query.list();
		if (li == null || li.size() == 0) {
			return null;
		}
		session.close( );
		return li.get(0);
	}

	@Override
	public Student modifyStudent(Student student) {
		return this.update(student);
	}

	@Override
	public boolean removeStudentById(Integer studentid) throws Exception {
		Student student = getStudentById(studentid);
		try {
			for(Cls cls : student.getClses( ))
			{
				cls.getStudents( ).remove( student );
			}
			student.setClses( null );
			delete(student);
		} catch (Exception e) {
			throw e;
		}
		return true;
	}

	/*@Override
	public boolean removeStudentByLoginName(String studentName)
			throws Exception {
		Student student = getStudentByLoginName(studentName);
		try {
			for(Cls cls : student.getClses( ))
			{
				cls.getStudents( ).remove( student );
			}
			student.setClses( null );
			delete(student);
		} catch (Exception e) {
			throw e;
		}
		return true;
	}*/

	@SuppressWarnings("unchecked")
	@Override
	public Student getStudentByLoginName(String name) {
		Session session = getSession( );
		Query query = session.createQuery("from Student where name = ? or email = ? ");
		query.setString(0, name);
		query.setString(1, name);
		List<Student> li = query.list();
		if (li == null || li.size() == 0) {
			return null;
		}
		session.close( );
		return li.get( 0 );
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> listAllStudents( ) throws Exception
	{
		Session session = getSession();
		Query query = session.createQuery("from Student");
		List<Student> li = query.list();
		if (li == null || li.size() == 0) {
			return null;
		}
		session.close( );
		return li;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> listStudents( int startindex, int length )
			throws Exception
	{
		Session session = getSession();
		Query query = session.createQuery("from Student");
		query.setFirstResult(startindex);
		query.setMaxResults(length);
		List<Student> li = query.list();
		if (li == null || li.size() == 0) {
			return null;
		}
		session.close( );
		return li;
	}

	@Override
	public Student addStudent( int classid, Student student ) throws Exception
	{
		Session session = getSession( );
		session.beginTransaction();
		Query query = session.createQuery( "from Cls where id = ? " );
		query.setInteger( 0, classid );
		if(query.list( ) == null || query.list( ).size( ) == 0 )
		{
			throw new NotExistException();
		}
		Cls clses = (Cls)query.list( ).get( 0 );
		clses.getStudents( ).add( student );
		session.merge( clses );
		session.getTransaction().commit();
		session.close();
		return student;
	}

}
