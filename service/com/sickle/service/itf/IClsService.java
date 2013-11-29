package com.sickle.service.itf;

import java.util.List;

import com.sickle.pojo.edu.Cls;

/**
 * 班级server服务
 * @author chenhao
 *
 */
public interface IClsService
{

	/**
	 * 根据id号获取班级对象
	 * @param id
	 * @return
	 */
	Cls getClassById(Integer id);
	
	/**
	 * 根据名字获取班级对象
	 * 
	 * @param name
	 * @return
	 */
	Cls getClassByName(String name);
	
	/**
	 * 增加班级信息
	 * 
	 * @param clses
	 * @return
	 */
	Cls addCls(Cls clses);
	
	/**
	 * 修改班级信息
	 * 
	 * @param clses
	 * @return
	 */
	Cls modifyCls(Cls clses);
	
	/**
	 * 根据id删除班级
	 * 
	 * @param clsesid
	 * @return
	 */
	boolean removeClsById(Integer clsesid)throws Exception;
	
	/**
	 * 根据学校名删除班级
	 * 
	 * @param schoolName
	 * @return
	 */
	boolean removeClsByName(String schoolName)throws Exception;
	
	List<Cls> listCls(int startindex,int length) throws Exception;
	
}
