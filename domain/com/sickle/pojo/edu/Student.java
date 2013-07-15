package com.sickle.pojo.edu;
import java.util.Date;

public class Student implements java.io.Serializable
{
	private static final long serialVersionUID = 3214724826217009615L;
	private Integer id;
	private Classes classes;
	private String name;
	private String sex;
	private Date birthday;
	private String address;
	private String contact;
	private String email;
	private String parent;
	private String loginName;
	private String password;

	public Student( )
	{
	}

	public Student( Classes classes, String name, String contact,
			String loginName, String password )
	{
		this.classes = classes;
		this.name = name;
		this.contact = contact;
		this.loginName = loginName;
		this.password = password;
	}

	public Student( Classes classes, String name, String sex, Date birthday,
			String address, String contact, String email, String parent,
			String loginName, String password )
	{
		this.classes = classes;
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
		this.address = address;
		this.contact = contact;
		this.email = email;
		this.parent = parent;
		this.loginName = loginName;
		this.password = password;
	}

	public Integer getId( )
	{
		return this.id;
	}

	public void setId( Integer id )
	{
		this.id = id;
	}

	public Classes getClasses( )
	{
		return this.classes;
	}

	public void setClasses( Classes classes )
	{
		this.classes = classes;
	}

	public String getName( )
	{
		return this.name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public String getSex( )
	{
		return this.sex;
	}

	public void setSex( String sex )
	{
		this.sex = sex;
	}

	public Date getBirthday( )
	{
		return this.birthday;
	}

	public void setBirthday( Date birthday )
	{
		this.birthday = birthday;
	}

	public String getAddress( )
	{
		return this.address;
	}

	public void setAddress( String address )
	{
		this.address = address;
	}

	public String getContact( )
	{
		return this.contact;
	}

	public void setContact( String contact )
	{
		this.contact = contact;
	}

	public String getEmail( )
	{
		return this.email;
	}

	public void setEmail( String email )
	{
		this.email = email;
	}

	public String getParent( )
	{
		return this.parent;
	}

	public void setParent( String parent )
	{
		this.parent = parent;
	}

	public String getLoginName( )
	{
		return this.loginName;
	}

	public void setLoginName( String loginName )
	{
		this.loginName = loginName;
	}

	public String getPassword( )
	{
		return this.password;
	}

	public void setPassword( String password )
	{
		this.password = password;
	}

}
