package com.sickle.service.itf;

import com.sickle.pojo.edu.Classes;

/**
 * 班级server服务
 * @author chenhao
 *
 */
public interface IClassesService
{

	/**
	 * 根据id号获取班级对象
	 * @param id
	 * @return
	 */
	Classes getClassById(Integer id);
	
	/**
	 * 根据名字获取班级对象
	 * 
	 * @param name
	 * @return
	 */
	Classes getClassByName(String name);
	
	/**
	 * 增加班级信息
	 * 
	 * @param classes
	 * @return
	 */
	Classes addClasses(Classes classes);
	
	/**
	 * 修改班级信息
	 * 
	 * @param classes
	 * @return
	 */
	Classes modifyClasses(Classes classes);
	
	/**
	 * 根据id删除班级
	 * 
	 * @param classesid
	 * @return
	 */
	boolean removeClassesById(Integer classesid)throws Exception;
	
	/**
	 * 根据学校名删除班级
	 * 
	 * @param schoolName
	 * @return
	 */
	boolean removeClassesByName(String schoolName)throws Exception;
	
}
