/**
 * 
 */
package com.sickle.service.itf;

import com.sickle.pojo.edu.Teacher;


/**
 * teacher service
 * 
 * @author chenhao
 *
 */
public interface ITeacherService
{

	/**
	 * 根据id获取teacher对象
	 * 
	 * @param id
	 * @return
	 */
	Teacher getTeacherById(Integer id);
	
	/**
	 * 根据登录名/昵称获取到teacher对象
	 * 
	 * @param loginName
	 * @return
	 */
	Teacher getTeacherByLoginName(String loginName);
	
	
	/**
	 * 增加teacher对象
	 * 
	 * @param teacher
	 * @return
	 * @throws Exception
	 */
	Teacher addTeacher(Teacher teacher)throws Exception;
	
	/**
	 * 根据id删除teacher对象
	 * 
	 * @param teacher
	 * @return
	 * @throws Exception
	 */
	boolean removeTeacherById(Integer teacherId)throws Exception;
	
	/**
	 * 根据登陆名/昵称删除teacher对象
	 * 
	 * @param teacher
	 * @return
	 * @throws Exception
	 */
	boolean removeTeacherByLoginName(String loginName)throws Exception;
	
	/**
	 * 修改teacher对象
	 * 
	 * @param teacher
	 * @return
	 * @throws Exception
	 */
	Teacher modifyTeacher(Teacher teacher)throws Exception;
	
}
