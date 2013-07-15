/**
 * 
 */
package com.sickle.pojo.edu;

import java.io.Serializable;
import java.util.Date;


/**
 * 学生信息
 * 
 * @author chenhao
 *
 */
public class Student implements Serializable
{

	private static final long serialVersionUID = -334993948424696271L;

	private Integer id;
	
	//班级id
	private Integer classId;
	
	//学生名字
	private String name;
	
	//性别
	private String sex;
	
	//生日
	private Date birthday;
	
	//家庭住址
	private String address;
	
	//联系方式
	private String contact;
	
	//邮箱
	private String email;
	
	//家长姓名
	private String parent;
	
	//登陆名字 可根据规则生成：邮箱，编号等
	private String loginName;
	
	//登陆密码 可根据规则生成
	private String password;

	
	/**
	 * 
	 */
	public Student( )
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
	 * @return the classId
	 */
	public Integer getClassId( )
	{
		return classId;
	}

	
	/**
	 * @param classId the classId to set
	 */
	public void setClassId( Integer classId )
	{
		this.classId = classId;
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
	 * @return the birthday
	 */
	public Date getBirthday( )
	{
		return birthday;
	}

	
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday( Date birthday )
	{
		this.birthday = birthday;
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
	 * @return the parent
	 */
	public String getParent( )
	{
		return parent;
	}

	
	/**
	 * @param parent the parent to set
	 */
	public void setParent( String parent )
	{
		this.parent = parent;
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
