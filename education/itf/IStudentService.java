package itf;
import java.util.List;

import bean.education.MClass;
import bean.education.Student;
import bean.education.Teacher;


/**
 * 学生服务
 * 
 * @author zhangchenhao
 *
 *
 * 2013-5-31
 * 下午4:15:44
 *
 */
public interface IStudentService{

	// add student
	boolean addStudent(Student student);
	
	// query student
	
	List<Student> listAllStudents();
	
	List<Student> listStudentsByClass(MClass mClass);
	
	List<Student> listStudentsByTeacher(Teacher teacher);
	
	//modify student
	Student modifyStudent(Student student);
	
	//delete student
	boolean deleteStudent(Student student);
	List<Student> deleteStudents(List<Student> students);
	
	
}
