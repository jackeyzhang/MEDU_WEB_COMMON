/**
 * 
 */
package com.sickle.pojo.edu;

import java.io.Serializable;


/**
 * 老师信息
 * 
 * @author chenhao
 *
 */
public class Teacher implements Serializable
{

	private static final long serialVersionUID = -334993948424696271L;
	
	private Integer id;
	
	private String name;
	
	private String sex;
	
	//喜好或专业描述或特长描述
	private String hobby;
	
	//联系电话
	private String contact;
	
	//邮箱
	private String email;
	
	//工作年限
	private Integer workage;
	
	//老师总评分 根据人气和支持度计算得出 实时更新
	private float grade;
	
	// 个人信息公开度  所有人:1 	所教学生:2 	不开放:3
	private Integer openStatus;
	
	//登录名也就是昵称
	private String loginName;
	
	//登录密码
	private String password;

	
	/**
	 * 
	 */
	public Teacher( )
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
	 * @return the sex
	 */
	public String getSex( )
	{
		return sex;
	}

	
	/**
	 * @param sex the sex to set
	 */
	public void setSex( String sex )
	{
		this.sex = sex;
	}

	
	/**
	 * @return the hobby
	 */
	public String getHobby( )
	{
		return hobby;
	}

	
	/**
	 * @param hobby the hobby to set
	 */
	public void setHobby( String hobby )
	{
		this.hobby = hobby;
	}

	
	/**
	 * @return the contact
	 */
	public String getContact( )
	{
		return contact;
	}

	
	/**
	 * @param contact the contact to set
	 */
	public void setContact( String contact )
	{
		this.contact = contact;
	}

	
	/**
	 * @return the email
	 */
	public String getEmail( )
	{
		return email;
	}

	
	/**
	 * @param email the email to set
	 */
	public void setEmail( String email )
	{
		this.email = email;
	}

	
	/**
	 * @return the workage
	 */
	public Integer getWorkage( )
	{
		return workage;
	}

	
	/**
	 * @param workage the workage to set
	 */
	public void setWorkage( Integer workage )
	{
		this.workage = workage;
	}

	
	/**
	 * @return the grade
	 */
	public float getGrade( )
	{
		return grade;
	}

	
	/**
	 * @param grade the grade to set
	 */
	public void setGrade( float grade )
	{
		this.grade = grade;
	}

	
	/**
	 * @return the openStatus
	 */
	public Integer getOpenStatus( )
	{
		return openStatus;
	}

	
	/**
	 * @param openStatus the openStatus to set
	 */
	public void setOpenStatus( Integer openStatus )
	{
		this.openStatus = openStatus;
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
	 * @return the password
	 */
	public String getPassword( )
	{
		return password;
	}

	
	/**
	 * @param password the password to set
	 */
	public void setPassword( String password )
	{
		this.password = password;
	}
}
