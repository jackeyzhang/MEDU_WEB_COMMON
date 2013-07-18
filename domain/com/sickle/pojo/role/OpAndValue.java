/**
 * 
 */
package com.sickle.pojo.role;


/**
 * 操作的枚举定义
 * 
 * opname and opvalue
 * opvalue有int值和value值
 * int值是1、2、3、4~~~
 * value值是1、2、4、8~~
 * 
 * @author chenhao
 *
 */
public enum OpAndValue {
	
	REGISTER("register",0),
	LOGIN("login",1),
	LOGOUT("logout",2),
	
	LIST_TEACHER("listallteacher",4),
	LOOK_TEACHER("lookteacher",5),
	ADD_TEACHER("addteacher",6),
	MODIFY_TEACHER("modifyteacher",7),
	REMOVE_TEACHER("removeteacher",8),
	
	LIST_STUDENT("listallstudent",11),
	LOOK_STUDENT("lookstudent",12),
	ADD_STUDENT("addstudent",13),
	MODIFY_STUDENT("modifystudent",14),
	REMOVE_STUDENT("removestudent",15),
	
	LIST_ORG("listallorg",20),
	LOOK_ORG("lookorg",21),
	ADD_ORG("addorg",22),
	MODIFY_ORG("modifyorg",23),
	REMOVE_ORG("removeorg",24),
	
	LIST_CLASSES("listallclasses",26),
	LOOK_CLASSES("lookclasses",27),
	ADD_CLASSES("addclasses",28),
	MODIFY_CLASSES("modifyclasses",29),
	REMOVE_CLASSES("removeclasses",30);
	
	
	private String opname;
	
	private Integer index;
	
	OpAndValue(String opname,Integer index)
	{
		this.opname = opname;
		this.index = index;
	}
	
	/**
	 * @return the opname
	 */
	public String getOpname( )
	{
		return opname;
	}

	
	/**
	 * @return the index
	 */
	public Integer getIndex( )
	{
		return index;
	}
	
	public Integer getValue( )
	{
		return 1 << (index -1);
	}
	
}
