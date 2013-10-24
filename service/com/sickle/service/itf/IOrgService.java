/**
 * 
 */
package com.sickle.service.itf;

import java.util.List;

import com.sickle.pojo.edu.Org;


/**
 * org service
 * 
 * @author chenhao
 *
 */
public interface IOrgService
{

	/**
	 * 列出所有org
	 * 
	 * @return
	 */
	List<Org> listAllOrg();
	
	/**
	 * 根据id获取org对象
	 * 
	 * @param id
	 * @return
	 */
	Org getOrgById(Integer id);
	
	/**
	 * 根据登录名/昵称获取到org对象
	 * 
	 * @param loginName
	 * @return
	 */
	Org getOrgByLoginName(String loginName);
	
	
	/**
	 * 增加org对象
	 * 
	 * @param org
	 * @return
	 * @throws Exception
	 */
	Org addOrg(Org org)throws Exception;
	
	/**
	 * 根据id删除org对象
	 * 
	 * @param org
	 * @return
	 * @throws Exception
	 */
	boolean removeOrgById(Integer orgId)throws Exception;
	
	/**
	 * 根据登陆名/昵称删除org对象
	 * 
	 * @param org
	 * @return
	 * @throws Exception
	 */
	boolean removeOrgByLoginName(String loginName)throws Exception;
	
	/**
	 * 修改org对象
	 * 
	 * @param org
	 * @return
	 * @throws Exception
	 */
	Org modifyOrg(Org org)throws Exception;
	
	/**
	 * 列出所有org
	 * 
	 * @return
	 */
	List<Org> listOrg(int startIndex, int length);
	
}
