package com.sickle.service;

import com.sickle.pojo.edu.Classes;

/**
 * 班级server服务
 * @author chenhao
 *
 */
public interface IClassesService
{

	/**
	 * 根据id号获取对象
	 * @param id
	 * @return
	 */
	Classes getClassById(Integer id);
	
}
