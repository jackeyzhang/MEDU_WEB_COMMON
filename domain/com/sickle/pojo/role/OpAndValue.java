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
	
	LIST("list",4),
	LOOK("look",5),
	ADD("add",6),
	MODIFY("modify",7),
	REMOVE("remove",8);
	
	
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
