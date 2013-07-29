package com.sickle.pojo.edu;
import java.util.HashSet;
import java.util.Set;

import com.gwtent.reflection.client.annotations.Reflect_Domain;
import com.sickle.uireflect.Reflect_Field;

@Reflect_Domain
public class Org implements java.io.Serializable
{
	private static final long serialVersionUID = 2563453980930335917L;
	@Reflect_Field(type = "int",isId = true)
	private Integer id;
	@Reflect_Field(title="名字")
	private String name;
	@Reflect_Field(title="地址")
	private String address;
	@Reflect_Field(title="电话")
	private String telephone;
	@Reflect_Field(title="管理人")
	private String manager;
	@Reflect_Field(title="登录名")
	private String loginName;
	@Reflect_Field(title="密码")
	private String password;
	private Set<School> schools = new HashSet<School>( 0 );

	public Org( )
	{
	}

	public Org( String name, String address, String telephone, String manager,
			String loginName, String password)
	{
		this.name = name;
		this.address = address;
		this.telephone = telephone;
		this.manager = manager;
		this.loginName = loginName;
		this.password = password;
	}

	public Org( String name, String address, String telephone, String manager,
			String loginName, String password, Set<School> schools )
	{
		this.name = name;
		this.address = address;
		this.telephone = telephone;
		this.manager = manager;
		this.loginName = loginName;
		this.password = password;
		this.schools = schools;
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

	public String getAddress( )
	{
		return this.address;
	}

	public void setAddress( String address )
	{
		this.address = address;
	}

	public String getTelephone( )
	{
		return this.telephone;
	}

	public void setTelephone( String telephone )
	{
		this.telephone = telephone;
	}

	public String getManager( )
	{
		return this.manager;
	}

	public void setManager( String manager )
	{
		this.manager = manager;
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


	public Set<School> getSchools( )
	{
		return this.schools;
	}

	public void setSchools( Set<School> schools )
	{
		this.schools = schools;
	}

}
