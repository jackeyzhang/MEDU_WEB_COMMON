/**
 * 
 */
package itf;

import java.util.List;

import bean.education.MClass;
import bean.education.Teacher;


/**
 * 教师service
 * 
 * @author zhangchenhao
 *
 *
 * 2013-5-31
 * 下午4:48:03
 *
 * TODO:
 */
public interface ITeacherService{
	
	//add teacher
	Boolean addTeacher(Teacher teacher);
	
	//query teachers
	List<Teacher> listAllTeacher();
	List<Teacher> listTeacherByClass(MClass mClass);
	List<Teacher> listTeacherByAddress(String address);

	//modify teacher
	Teacher modifyTeacher(Teacher teacher);
	
	//delete teacher
	Boolean deleteTeacher(Teacher teacher); 
}
