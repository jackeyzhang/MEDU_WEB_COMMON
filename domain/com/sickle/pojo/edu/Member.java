package com.sickle.pojo.edu;
import java.util.HashSet;
import java.util.Set;

import com.gwtent.reflection.client.annotations.Reflect_Domain;
import com.sickle.uireflect.FieldType;
import com.sickle.uireflect.Reflect_Field;

@Reflect_Domain
public class Member implements java.io.Serializable
{
	private static final long serialVersionUID = -6913802896040250403L;
	@Reflect_Field(type = FieldType.Integer,isId = true)
	private Integer id;
	@Reflect_Field(title="名字",reqiured = true,mask = 15)
	private String name;
	@Reflect_Field(title="性别",reqiured = true)
	private String sex;
	@Reflect_Field(title="爱好")
	private String hobby;
	@Reflect_Field(title="联系方式",type=FieldType.Mobile,reqiured = true)
	private String contact;
	@Reflect_Field(title="电子邮箱",type=FieldType.Email,reqiured = true)
	private String email;
	@Reflect_Field(title="级别",type=FieldType.Float)
	private Float grade;
	@Reflect_Field(title="开放状态",type=FieldType.Integer)
	private Integer openStatus;
	@Reflect_Field(title="登陆名字",reqiured = true,mask = 15)
	private String loginName;
	@Reflect_Field(title="密码",reqiured = true,type = FieldType.Password)
	private String password;
	@Reflect_Field(title="个人介绍",reqiured = true)
	private String resume;
	@Reflect_Field(title="工作单位",reqiured = true)
	private String orgname;
	@Reflect_Field(title="职位",reqiured = true)
	private String title;
	private Set<Classes> classeses = new HashSet<Classes>( 0 );

	public Member( )
	{
	}

	public Member( String name, String email, String loginName, String password )
	{
		this.name = name;
		this.email = email;
		this.loginName = loginName;
		this.password = password;
	}

	public Member( String name, String sex, String hobby, String contact,
			String email, Float grade, Integer openStatus,
			String loginName, String password, String resume,String orgname,
			String title,Set<Classes> classeses )
	{
		this.name = name;
		this.sex = sex;
		this.hobby = hobby;
		this.contact = contact;
		this.email = email;
		this.grade = grade;
		this.openStatus = openStatus;
		this.loginName = loginName;
		this.password = password;
		this.resume = resume;
		this.orgname = orgname;
		this.title = title;
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

	
	/**
	 * @return the resume
	 */
	public String getResume( )
	{
		return resume;
	}

	
	/**
	 * @param resume the resume to set
	 */
	public void setResume( String resume )
	{
		this.resume = resume;
	}

	
	/**
	 * @return the orgname
	 */
	public String getOrgname( )
	{
		return orgname;
	}

	
	/**
	 * @param orgname the orgname to set
	 */
	public void setOrgname( String orgname )
	{
		this.orgname = orgname;
	}

	
	/**
	 * @return the title
	 */
	public String getTitle( )
	{
		return title;
	}

	
	/**
	 * @param title the title to set
	 */
	public void setTitle( String title )
	{
		this.title = title;
	}

}
