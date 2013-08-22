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

	everywhere(0),

	showInList(1),

	showInEdit(2),

	showInAdd(4), // show all 7

	enInAdd(8),//show all and enable only add 15

	enInEdit(16);//show all and enable only edit 23

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
