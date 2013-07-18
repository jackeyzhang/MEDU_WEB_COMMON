package com.sickle.pojo.role;

import java.io.Serializable;

/**
 * 角色对象
 * 
 * @author chenhao
 *
 */
public class Role implements Serializable
{

	private static final long serialVersionUID = -2119490375818004600L;
	
	//角色ID
	private Integer id;
	
	//角色名称
	private String  displayName;
	
	//操作值
	private Integer opvalue;
	

	
	/**
	 * @param id
	 * @param displayName
	 * @param modulevalue
	 * @param opvalue
	 */
	public Role( Integer id, String displayName,
			Integer opvalue )
	{
		super( );
		this.id = id;
		this.displayName = displayName;
		this.opvalue = opvalue;
	}


	/**
	 * @return the id
	 */
	public Integer getId( )
	{
		return id;
	}

	
	/**
	 * @param id the id to set
	 */
	public void setId( Integer id )
	{
		this.id = id;
	}

	
	/**
	 * @return the displayName
	 */
	public String getDisplayName( )
	{
		return displayName;
	}

	
	/**
	 * @param displayName the displayName to set
	 */
	public void setDisplayName( String displayName )
	{
		this.displayName = displayName;
	}


	
	/**
	 * @return the opvalue
	 */
	public Integer getOpvalue( )
	{
		return opvalue;
	}


	
	/**
	 * @param opvalue the opvalue to set
	 */
	public void setOpvalue( Integer opvalue )
	{
		this.opvalue = opvalue;
	}

}
