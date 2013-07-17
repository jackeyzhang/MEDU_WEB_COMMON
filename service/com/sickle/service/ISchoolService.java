/**
 * 
 */
package com.sickle.service;

import com.sickle.pojo.edu.School;


/**
 * school service
 * 
 * @author chenhao
 *
 */
public interface ISchoolService
{

	/**
	 * 根据id获取school对象
	 * 
	 * @param id
	 * @return
	 */
	School getSchoolById(Integer id);
	
	/**
	 * 根据登录名/昵称获取到school对象
	 * 
	 * @param loginName
	 * @return
	 */
	School getSchoolByLoginName(String loginName);
	
	
	/**
	 * 增加school对象
	 * 
	 * @param school
	 * @return
	 * @throws Exception
	 */
	School addSchool(School school)throws Exception;
	
	/**
	 * 根据id删除school对象
	 * 
	 * @param school
	 * @return
	 * @throws Exception
	 */
	boolean removeSchoolById(Integer schoolId)throws Exception;
	
	/**
	 * 根据登陆名/昵称删除school对象
	 * 
	 * @param school
	 * @return
	 * @throws Exception
	 */
	boolean removeSchoolByLoginName(String loginName)throws Exception;
	
	/**
	 * 修改school对象
	 * 
	 * @param school
	 * @return
	 * @throws Exception
	 */
	School modifySchool(School school)throws Exception;
	
}
