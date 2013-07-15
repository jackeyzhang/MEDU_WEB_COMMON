package com.sickle.pojo.edu;
import java.util.HashSet;
import java.util.Set;

public class Teacher implements java.io.Serializable
{
	private static final long serialVersionUID = -6913802896040250403L;
	private Integer id;
	private String name;
	private String sex;
	private String hobby;
	private String contact;
	private String email;
	private Integer workage;
	private Float grade;
	private Integer openStatus;
	private String loginName;
	private String password;
	private Set<Classes> classeses = new HashSet<Classes>( 0 );

	public Teacher( )
	{
	}

	public Teacher( String name, String email, String loginName, String password )
	{
		this.name = name;
		this.email = email;
		this.loginName = loginName;
		this.password = password;
	}

	public Teacher( String name, String sex, String hobby, String contact,
			String email, Integer workage, Float grade, Integer openStatus,
			String loginName, String password, Set<Classes> classeses )
	{
		this.name = name;
		this.sex = sex;
		this.hobby = hobby;
		this.contact = contact;
		this.email = email;
		this.workage = workage;
		this.grade = grade;
		this.openStatus = openStatus;
		this.loginName = loginName;
		this.password = password;
		this.classeses = classeses;
	}

	public Integer getId( )
	{
		return this.id;
	}

	public void setId( Integer id )
	{
		this.id = id;
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

	public String getHobby( )
	{
		return this.hobby;
	}

	public void setHobby( String hobby )
	{
		this.hobby = hobby;
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

	public Integer getWorkage( )
	{
		return this.workage;
	}

	public void setWorkage( Integer workage )
	{
		this.workage = workage;
	}

	public Float getGrade( )
	{
		return this.grade;
	}

	public void setGrade( Float grade )
	{
		this.grade = grade;
	}

	public Integer getOpenStatus( )
	{
		return this.openStatus;
	}

	public void setOpenStatus( Integer openStatus )
	{
		this.openStatus = openStatus;
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

	public Set<Classes> getClasseses( )
	{
		return this.classeses;
	}

	public void setClasseses( Set<Classes> classeses )
	{
		this.classeses = classeses;
	}

}
