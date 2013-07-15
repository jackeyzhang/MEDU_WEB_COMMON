/**
 * 
 */
package com.sickle.pojo.edu;

import java.io.Serializable;


/**
 * 公司信息
 * 
 * @author chenhao
 *
 */
public class Org implements Serializable
{

	private static final long serialVersionUID = 1672304943726861087L;
	
	private Integer id;
	
	//公司名称
	private String name;
	
	//公司地址
	private String address;
	
	//联系电话
	private String telephone;

	//联系人名称
	private String manager;
	
	//登陆名
	private String loginName;
	
	//登陆密码
	private String loginPassword;
	
	
	/**
	 * 
	 */
	public Org( )
	{
		super( );
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
	 * @return the name
	 */
	public String getName( )
	{
		return name;
	}

	
	/**
	 * @param name the name to set
	 */
	public void setName( String name )
	{
		this.name = name;
	}

	
	/**
	 * @return the address
	 */
	public String getAddress( )
	{
		return address;
	}

	
	/**
	 * @param address the address to set
	 */
	public void setAddress( String address )
	{
		this.address = address;
	}

	
	/**
	 * @return the telephone
	 */
	public String getTelephone( )
	{
		return telephone;
	}

	
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone( String telephone )
	{
		this.telephone = telephone;
	}

	
	/**
	 * @return the manager
	 */
	public String getManager( )
	{
		return manager;
	}

	
	/**
	 * @param manager the manager to set
	 */
	public void setManager( String manager )
	{
		this.manager = manager;
	}

	
	/**
	 * @return the loginName
	 */
	public String getLoginName( )
	{
		return loginName;
	}

	
	/**
	 * @param loginName the loginName to set
	 */
	public void setLoginName( String loginName )
	{
		this.loginName = loginName;
	}

	
	/**
	 * @return the loginPassword
	 */
	public String getLoginPassword( )
	{
		return loginPassword;
	}

	
	/**
	 * @param loginPassword the loginPassword to set
	 */
	public void setLoginPassword( String loginPassword )
	{
		this.loginPassword = loginPassword;
	}
	
	

}
