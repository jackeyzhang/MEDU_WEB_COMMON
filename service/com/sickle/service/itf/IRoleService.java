/**
 * 
 */
package com.sickle.service.itf;

import java.util.List;

import com.sickle.pojo.role.Module;
import com.sickle.pojo.role.OpAndValue;
import com.sickle.pojo.role.Role;


/**
 * 角色和权限服务
 * 
 * @author chenhao
 *
 */
public interface IRoleService
{

	/**
	 * 校验操作角色是否可以执行该操作
	 * 
	 * @param role
	 * @param opname
	 * @return
	 */
	boolean validateOp(Role role,Module module,OpAndValue op);
	
	/**
	 *  获取到角色的可操作模块
	 *  
	 * @param role
	 * @return
	 */
	List<Module> getModule(Role role);
	
	/**
	 *  获取某个角色在某个模块的操作
	 * @param role
	 * @param module
	 * @return
	 */
	List<OpAndValue> getOp(Role role,Module module);
}
