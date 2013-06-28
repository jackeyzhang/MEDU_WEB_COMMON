/**
 * 
 */
package impl;

import java.util.List;

import bean.education.MClass;
import bean.education.Student;
import bean.education.Teacher;
import itf.IStudentService;


/**
 * @author zhangchenhao
 *
 *
 * 2013-5-31
 * 下午5:01:02
 *
 * TODO:
 */
public class StudentService implements IStudentService
{

	/* (non-Javadoc)
	 * @see itf.IStudentService#addStudent(bean.education.Student)
	 */
	@Override
	public boolean addStudent( Student student )
	{
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see itf.IStudentService#listAllStudents()
	 */
	@Override
	public List<Student> listAllStudents( )
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see itf.IStudentService#listStudentsByClass(bean.education.MClass)
	 */
	@Override
	public List<Student> listStudentsByClass( MClass mClass )
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see itf.IStudentService#listStudentsByTeacher(bean.education.Teacher)
	 */
	@Override
	public List<Student> listStudentsByTeacher( Teacher teacher )
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see itf.IStudentService#modifyStudent(bean.education.Student)
	 */
	@Override
	public Student modifyStudent( Student student )
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see itf.IStudentService#deleteStudent(bean.education.Student)
	 */
	@Override
	public boolean deleteStudent( Student student )
	{
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see itf.IStudentService#deleteStudents(java.util.List)
	 */
	@Override
	public List<Student> deleteStudents( List<Student> students )
	{
		// TODO Auto-generated method stub
		return null;
	}

}
