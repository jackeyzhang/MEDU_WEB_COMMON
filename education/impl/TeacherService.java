/**
 * 
 */
package impl;

import java.util.List;

import bean.education.MClass;
import bean.education.Teacher;
import itf.ITeacherService;


/**
 * @author zhangchenhao
 *
 *
 * 2013-5-31
 * 下午5:01:20
 *
 * TODO:
 */
public class TeacherService implements ITeacherService
{

	/* (non-Javadoc)
	 * @see itf.ITeacherService#addTeacher(bean.education.Teacher)
	 */
	@Override
	public Boolean addTeacher( Teacher teacher )
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see itf.ITeacherService#listAllTeacher()
	 */
	@Override
	public List<Teacher> listAllTeacher( )
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see itf.ITeacherService#listTeacherByClass(bean.education.MClass)
	 */
	@Override
	public List<Teacher> listTeacherByClass( MClass mClass )
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see itf.ITeacherService#listTeacherByAddress(java.lang.String)
	 */
	@Override
	public List<Teacher> listTeacherByAddress( String address )
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see itf.ITeacherService#modifyTeacher(bean.education.Teacher)
	 */
	@Override
	public Teacher modifyTeacher( Teacher teacher )
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see itf.ITeacherService#deleteTeacher(bean.education.Teacher)
	 */
	@Override
	public Boolean deleteTeacher( Teacher teacher )
	{
		// TODO Auto-generated method stub
		return null;
	}

}
