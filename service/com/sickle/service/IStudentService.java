package com.sickle.service;

import java.util.List;

import com.sickle.pojo.edu.Student;

/**
 * 学生server服务
 * @author chenhao
 *
 */
public interface IStudentService
{

	/**
	 * 根据id号获取学生对象
	 * @param id
	 * @return
	 */
	Student getStudentById(Integer id);
	
	/**
	 * 根据登录名也就是昵称获取学生对象
	 * @param loginName
	 * @return
	 */
	Student getStudentByLoginName(String loginName);
	
	/**
	 * 增加一个学生 注册一个用户
	 * @param stu
	 * @return
	 * @throws Exception
	 */
	Student addStudent(Student stu)throws Exception;
	
	/**
	 * 根据id删除学生
	 * @param id
	 * @return
	 */
	boolean removeStudentById(Integer id)throws Exception;
	
	/**
	 * 根据登录名/昵称删除学生
	 * @param loginName
	 * @return
	 * @throws Exception
	 */
	boolean removeStudentByLoginName(String loginName)throws Exception;
	
	/**
	 * 删除班级里的所有学生
	 * 
	 * @param classid
	 * @return
	 * @throws Exception
	 */
	List<Student> removeStudentByClassesId(Integer classid)throws Exception;
	
	/**
	 * 修改学生
	 * @param student
	 * @return
	 * @throws Exception
	 */
	Student modifyStudent(Student student)throws Exception;
	
}
