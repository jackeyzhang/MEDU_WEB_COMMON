/**
 * 
 */
package itf;

import java.util.Date;
import java.util.List;

import bean.education.MClass;
import bean.education.Teacher;


/**
 * 课程服务
 * 
 * @author zhangchenhao
 *
 *
 * 2013-5-31
 * 下午4:22:30
 *
 */
public interface IClassesService{

	//add class
	boolean addClass(MClass mClass);
	
	//query classes
	
	List<MClass> listClassesByTeacher(Teacher teacher);
	
	List<MClass> listClassesByClassroom(String classRoom);
	
	List<MClass> listClassesByDate(Date date);
	
	//modify classes
	MClass modifyClass(MClass mClass);
	
	//delete classes
	boolean deleteClass(MClass mClass);
}
