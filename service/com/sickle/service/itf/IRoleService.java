/**
 * 
 */
package com.sickle.service.itf;

import java.util.List;

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
	boolean validateOp(Role role,OpAndValue op);
	
	
	/**
	 *  获取某个角色在某个模块的操作
	 * @param role
	 * @param module
	 * @return
	 */
	List<OpAndValue> getOp(Role role);
}
