/**
 * 
 */

package com.sickle.uireflect;

/**
 * 控制可见性 可编辑性的掩码
 * 
 * @author chenhao
 * 
 */
public enum Mask {
	
	nevershow(-1),

	showInList(1),

	showInEdit(2),

	showInAdd(4), 
	
	showAll(7),// show all 7

	enInAdd(8),//enable only add 15

	enInEdit(16),//enable only edit 23
	
	enAll(24),//enable all
	
	All(31);//show and enable all

	private int value;

	private Mask( int _v )
	{
		this.value = _v;
	}

	/**
	 * @return the value
	 */
	public Integer getValue( )
	{
		return value;
	}

}
