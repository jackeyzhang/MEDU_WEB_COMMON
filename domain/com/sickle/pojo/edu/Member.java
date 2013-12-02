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
	
	@Reflect_Field(index=0,title="称谓",reqiured = true)
	private String name;
	
	@Reflect_Field(index=1,title="头像",reqiured = true,mask=14)
	private String icon;
	
	@Reflect_Field(index=2,title="性别",reqiured = true)
	private String sex;
	
	@Reflect_Field(title="电子邮箱",type=FieldType.Email,reqiured = true)
	private String email;
	
	@Reflect_Field(title="密码",reqiured = true,type = FieldType.Password,mask=14)
	private String password;
	
	@Reflect_Field(title="爱好",mask=14)
	private String hobby;
	
	@Reflect_Field(title="身份",mask=14)
	private String character = "normal";
	
	@Reflect_Field(title="联系方式",type=FieldType.Mobile)
	private String contact;
	
	@Reflect_Field(title="简历")
	private String resume;
	
	@Reflect_Field(title="工作单位",mask=14)
	private String orgname;
	
	@Reflect_Field(title="职位",mask=14)
	private String title;
	
	@Reflect_Field(title="城市")
	private String city;
	
	@Reflect_Field(title="区域")
	private String area;
	
	@Reflect_Field(title="开放状态",type=FieldType.Integer,mask=14)
	private Integer openStatus;
	
	@Reflect_Field(title="级别",type=FieldType.Float,mask=14)
	private Float grade;
	
	private Set<Cls> classeses = new HashSet<Cls>( 0 );

	public Member( )
	{
	}

	public Member( String name, String email, String password )
	{
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public Member( String name, String sex, String hobby, String contact,
			String email, Float grade, Integer openStatus,
			String password, String resume,String orgname,
			String title,Set<Cls> classeses )
	{
		this.name = name;
		this.sex = sex;
		this.hobby = hobby;
		this.contact = contact;
		this.email = email;
		this.grade = grade;
		this.openStatus = openStatus;
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

	public String getPassword( )
	{
		return this.password;
	}

	public void setPassword( String password )
	{
		this.password = password;
	}
	
	
	/**
	 * @return the classeses
	 */
	public Set<Cls> getClasseses( )
	{
		return classeses;
	}

	
	/**
	 * @param classeses the classeses to set
	 */
	public void setClasseses( Set<Cls> classeses )
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

	
	/**
	 * @return the character
	 */
	public String getCharacter( )
	{
		return character;
	}

	
	/**
	 * @param character the character to set
	 */
	public void setCharacter( String character )
	{
		this.character = character;
	}

	
	/**
	 * @return the city
	 */
	public String getCity( )
	{
		return city;
	}

	
	/**
	 * @param city the city to set
	 */
	public void setCity( String city )
	{
		this.city = city;
	}

	
	/**
	 * @return the area
	 */
	public String getArea( )
	{
		return area;
	}

	
	/**
	 * @param area the area to set
	 */
	public void setArea( String area )
	{
		this.area = area;
	}

	
	/**
	 * @return the icon
	 */
	public String getIcon( )
	{
		return icon;
	}

	
	/**
	 * @param icon the icon to set
	 */
	public void setIcon( String icon )
	{
		this.icon = icon;
	}

	
	public boolean isTeacher()
	{
		return this.character.equalsIgnoreCase("teacher" );
	}

}
