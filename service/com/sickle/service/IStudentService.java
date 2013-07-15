package com.sickle.service;

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
}
