/**
 * 
 */
package com.sickle.pojo.edu;

import java.io.Serializable;


/**
 * 教学点信息
 * 
 * @author chenhao
 *
 */
public class School implements Serializable
{

	private static final long serialVersionUID = -334993948424696271L;
	
	private Integer id;
	
	//学校名称
	private String name;
	
	//所在城市
	private String city;
	
	//机构名称
	private Integer orgId;
	
	//学校登陆名称
	private String loginName;
	
	//登陆密码
	private String loginPassword;

	/**
	 * 
	 */
	public School( )
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
	 * @return the city
	 */
	public String getCity( )
	{
		return city;
	}

	
	/**
	 * @param city the city to set
	 */
	public void setCity( String city )
	{
		this.city = city;
	}

	
	/**
	 * @return the orgId
	 */
	public Integer getOrgId( )
	{
		return orgId;
	}

	
	/**
	 * @param orgId the orgId to set
	 */
	public void setOrgId( Integer orgId )
	{
		this.orgId = orgId;
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
