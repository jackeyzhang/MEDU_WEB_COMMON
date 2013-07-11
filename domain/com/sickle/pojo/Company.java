/**
 * 
 */
package com.sickle.pojo;

import java.io.Serializable;


/**
 * 公司信息
 * 
 * @author chenhao
 *
 */
public class Company implements Serializable
{

	private static final long serialVersionUID = 1672304943726861087L;
	
	private Integer id;
	
	private String companyName;
	
	private String address;
	
	private String telephone;

	
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
	 * @return the companyName
	 */
	public String getCompanyName( )
	{
		return companyName;
	}

	
	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName( String companyName )
	{
		this.companyName = companyName;
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
	
	

}
