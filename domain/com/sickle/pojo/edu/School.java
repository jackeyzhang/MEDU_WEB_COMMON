package com.sickle.pojo.edu;
import java.util.HashSet;
import java.util.Set;

import com.gwtent.reflection.client.annotations.Reflect_Domain;
import com.sickle.uireflect.FieldType;
import com.sickle.uireflect.Reflect_Field;
@Reflect_Domain
public class School implements java.io.Serializable
{
	private static final long serialVersionUID = -7356876508819459715L;
	@Reflect_Field(type = FieldType.Integer,isId = true)
	private Integer id;
	@Reflect_Field(title="组织结构")
	private Org org;
	@Reflect_Field(title="名字")
	private String name;
	@Reflect_Field(title="所在城市")
	private String city;
	@Reflect_Field(title="登陆名字")
	private String loginname;
	@Reflect_Field(title="密码")
	private String password;
	private Set<Classes> classeses = new HashSet<Classes>( 0 );

	public School( )
	{
	}

	public School( String name, String loginname )
	{
		this.name = name;
		this.loginname = loginname;
	}

	public School( Org org, String name, String city, String loginname,
			String password, Set<Classes> classeses )
	{
		this.org = org;
		this.name = name;
		this.city = city;
		this.loginname = loginname;
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

	public Org getOrg( )
	{
		return this.org;
	}

	public void setOrg( Org org )
	{
		this.org = org;
	}

	public String getName( )
	{
		return this.name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public String getCity( )
	{
		return this.city;
	}

	public void setCity( String city )
	{
		this.city = city;
	}

	public String getLoginname( )
	{
		return this.loginname;
	}

	public void setLoginname( String loginname )
	{
		this.loginname = loginname;
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
