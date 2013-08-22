package com.sickle.pojo.edu;
import java.util.Date;

import com.gwtent.reflection.client.annotations.Reflect_Domain;
import com.sickle.uireflect.FieldType;
import com.sickle.uireflect.Reflect_Field;
@Reflect_Domain
public class Student implements java.io.Serializable
{
	private static final long serialVersionUID = 3214724826217009615L;
	@Reflect_Field(type = FieldType.Integer,isId = true)
	private Integer id;
	@Reflect_Field(title="班级")
	private Classes classes;
	@Reflect_Field(title="名字")
	private String name;
	@Reflect_Field(title="性别")
	private String sex;
	@Reflect_Field(title="生日")
	private Date birthday;
	@Reflect_Field(title="地址")
	private String address;
	@Reflect_Field(title="联系方式")
	private String contact;
	@Reflect_Field(title="电子邮箱")
	private String email;
	@Reflect_Field(title="家长信息")
	private String parent;
	@Reflect_Field(title="登录名")
	private String loginName;
	@Reflect_Field(title="密码")
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
