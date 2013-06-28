/**
 * 
 */
package impl;

import java.util.Date;
import java.util.List;

import bean.education.MClass;
import bean.education.Teacher;
import itf.IClassesService;


/**
 * @author zhangchenhao
 *
 *
 * 2013-5-31
 * 下午5:01:49
 *
 * TODO:
 */
public class ClassService implements IClassesService
{

	/* (non-Javadoc)
	 * @see itf.IClassesService#addClass(bean.education.MClass)
	 */
	@Override
	public boolean addClass( MClass mClass )
	{
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see itf.IClassesService#listClassesByTeacher(bean.education.Teacher)
	 */
	@Override
	public List<MClass> listClassesByTeacher( Teacher teacher )
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see itf.IClassesService#listClassesByClassroom(java.lang.String)
	 */
	@Override
	public List<MClass> listClassesByClassroom( String classRoom )
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see itf.IClassesService#listClassesByDate(java.util.Date)
	 */
	@Override
	public List<MClass> listClassesByDate( Date date )
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see itf.IClassesService#modifyClass(bean.education.MClass)
	 */
	@Override
	public MClass modifyClass( MClass mClass )
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see itf.IClassesService#deleteClass(bean.education.MClass)
	 */
	@Override
	public boolean deleteClass( MClass mClass )
	{
		// TODO Auto-generated method stub
		return false;
	}

}
