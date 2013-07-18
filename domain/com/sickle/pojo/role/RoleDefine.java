/**
 * 
 */
package com.sickle.pojo.role;

import java.io.Serializable;


/**
 * 角色定义
 * 
 * @author chenhao
 *
 */
public class RoleDefine implements Serializable
{

	private static final long serialVersionUID = -753531881487087669L;
	
	private static final Integer TEACHER_OP_VALUE = 1;
			
	public static final Role TEACHER = new Role(1,"teacher",TEACHER_OP_VALUE);

}
