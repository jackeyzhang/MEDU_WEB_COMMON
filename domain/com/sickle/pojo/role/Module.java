/**
 * 
 */
package com.sickle.pojo.role;


/**
 * 模块划分
 * 
 * @author chenhao
 *
 */
public enum Module{

	All(-1),
	
	ORG(1),
	
	SCHOOL(2),
	
	CLASSES(3),
	
	TEACHER(4),
	
	STUDENT(5),
	
	WEBSITE(6),
	
	EXTEND(7);
	
	private Integer index;
	
	Module(Integer index)
	{
		this.index = index;
	}

	
	/**
	 * @return the modulevalue
	 */
	public Integer getModulevalue( )
	{
		return 1 << (index - 1);
	}
	
	/**
	 * @return the index
	 */
	public Integer getIndex( )
	{
		return index;
	}
}
