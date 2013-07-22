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
	
	/**
	 * 老师权限:修改老师个人信息 查看自己授课班级 修改自己授课的班级 查看所在班级的学生 修改所在班级学生 增加所在班级学生
	 */
	private static final Integer TEACHER_OP_VALUE = OpAndValue.MODIFY_CLASSES.getValue( )
			+ OpAndValue.LOOK_CLASSES.getValue( ) + OpAndValue.ADD_CLASSES.getValue( )
			+ OpAndValue.MODIFY_STUDENT.getValue( ) + OpAndValue.ADD_STUDENT.getValue( );
	
	/**
	 * 主管权限:查看该
	 */
	private static final Integer MANAGER_OP_VALUE = TEACHER_OP_VALUE ;
			
	
	public static final Role TEACHER = new Role(1,"teacher",TEACHER_OP_VALUE);
	
	public static final Role MANAGER = new Role(2,"manger",MANAGER_OP_VALUE);

}
