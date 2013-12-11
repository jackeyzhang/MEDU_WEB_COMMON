/**
 * 
 */
package com.sickle.service.itf;

import java.util.List;

import com.sickle.pojo.edu.Student;


/**
 * student service
 * 
 * @author chenhao
 *
 */
public interface IStudentService
{

	/**
	 * 根据id获取student对象
	 * 
	 * @param id
	 * @return
	 */
	Student getStudentById(Integer id);
	
	/**
	 * 根据登录名/昵称获取到student对象
	 * 
	 * @param loginName
	 * @return
	 */
	Student getStudentByLoginName(String loginName);
	
	
	/**
	 * 增加student对象
	 * 
	 * @param student
	 * @return
	 * @throws Exception
	 */
	Student addStudent(int classid,Student student)throws Exception;
	
	/**
	 * 根据id删除student对象
	 * 
	 * @param student
	 * @return
	 * @throws Exception
	 */
	boolean removeStudentById(Integer studentId)throws Exception;
	
	/**
	 * 根据登陆名/昵称删除student对象
	 * 
	 * @param student
	 * @return
	 * @throws Exception
	 */
//	boolean removeStudentByLoginName(String loginName)throws Exception;
	
	/**
	 * 修改student对象
	 * 
	 * @param student
	 * @return
	 * @throws Exception
	 */
	Student modifyStudent(Student student)throws Exception;
	
	List<Student> listAllStudents() throws Exception;
	
	List<Student> listStudents( int startindex, int length )throws Exception;
}
