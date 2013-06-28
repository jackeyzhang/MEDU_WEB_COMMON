/**
 * 
 */
package test;

import java.util.Date;

import bean.edu.MClass;
import bean.edu.Person;
import bean.edu.Student;
import data.dao.MClassDAO;
import data.dao.PersonDAO;
import data.dao.StudentDAO;

/**
 * @author zhangchenhao
 *
 *
 * 2013-6-8
 * 下午5:49:19
 *
 * TODO:
 */
public class TestStudentDao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("jackey");
		person.setAddress("address");
		person.setBirthday(new Date());
		
		PersonDAO pdao = new PersonDAO();
		pdao.getSession().beginTransaction();
		pdao.save(person);
		pdao.getSession().getTransaction().commit();
		
		MClass mClass = new MClass();
		mClass.setClassroom("classroom");
		MClassDAO mdao = new MClassDAO();
		mdao.getSession().beginTransaction();
		mdao.save(mClass);
		mdao.getSession().getTransaction().commit();
		
		StudentDAO dao = new StudentDAO();
		dao.getSession().beginTransaction();
		dao.save(new Student(person,mClass));
		dao.getSession().getTransaction().commit();
	}

}
