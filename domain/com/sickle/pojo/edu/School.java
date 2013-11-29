package com.sickle.pojo.edu;
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
	@Reflect_Field(title="登陆名字")
	private String loginname;
	@Reflect_Field(title="密码")
	private String password;
	@Reflect_Field(title="所在省市")
	private String provinceCity;
	@Reflect_Field(title="地区")
	private String area;
	@Reflect_Field(title="地址")
	private String address;

	public School( )
	{
	}

	public School( String name, String loginname )
	{
		this.name = name;
		this.loginname = loginname;
	}

	public School( Org org, String name, String provinceCity, String loginname,
			String password )
	{
		this.org = org;
		this.name = name;
		this.provinceCity = provinceCity;
		this.loginname = loginname;
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

	public String getProvinceCity() {
		return provinceCity;
	}

	public void setProvinceCity(String provinceCity) {
		this.provinceCity = provinceCity;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
