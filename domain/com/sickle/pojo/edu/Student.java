package com.sickle.pojo.edu;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.gwtent.reflection.client.annotations.Reflect_Domain;
import com.sickle.uireflect.FieldType;
import com.sickle.uireflect.Reflect_Field;

@Reflect_Domain
public class Student implements java.io.Serializable
{
	private static final long serialVersionUID = -6913802896040250403L;
	@Reflect_Field(type = FieldType.Integer,isId = true)
	private Integer id;
	
	@Reflect_Field(index=0,title="称谓",reqiured = true)
	private String name;
	
	@Reflect_Field(title="密码",reqiured = true,type = FieldType.Password,mask=14)
	private String password;
	
	@Reflect_Field(title="电子邮箱",type=FieldType.Email,reqiured = true)
	private String email;
	
	@Reflect_Field(index=1,title="头像",reqiured = true,mask=14)
	private String icon;
	
	@Reflect_Field(title="出生日期",type=FieldType.DateTime)
	private Date birthday;
	
	@Reflect_Field(index=2,title="性别",reqiured = true)
	private String sex;
	
	@Reflect_Field(title="爱好",mask=14)
	private String hobby;
	
	@Reflect_Field(title="联系方式",type=FieldType.Mobile)
	private String contact;
	
	@Reflect_Field(title="父母")
	private String parents;
	
	@Reflect_Field(title="备注1")
	private String detail1;
	
	@Reflect_Field(title="备注2")
	private String detail2;
	
	@Reflect_Field(title="备注3")
	private String detail3;
	
	@Reflect_Field(title="备注4")
	private String detail4;
	
	@Reflect_Field(title="备注5")
	private String detail5;
	
	@Reflect_Field(title="备注6")
	private String detail6;
	
	
	private Set<Cls> clses = new HashSet<Cls>();
	
	/**
	 * 
	 */
	public Student( )
	{
		super( );
	}


	/**
	 * @param name
	 * @param password
	 * @param email
	 */
	public Student( String name, String password, String email )
	{
		super( );
		this.name = name;
		this.password = password;
		this.email = email;
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
	 * @return the parents
	 */
	public String getParents( )
	{
		return parents;
	}

	
	/**
	 * @param parents the parents to set
	 */
	public void setParents( String parents )
	{
		this.parents = parents;
	}

	
	/**
	 * @return the detail1
	 */
	public String getDetail1( )
	{
		return detail1;
	}

	
	/**
	 * @param detail1 the detail1 to set
	 */
	public void setDetail1( String detail1 )
	{
		this.detail1 = detail1;
	}

	
	/**
	 * @return the detail2
	 */
	public String getDetail2( )
	{
		return detail2;
	}

	
	/**
	 * @param detail2 the detail2 to set
	 */
	public void setDetail2( String detail2 )
	{
		this.detail2 = detail2;
	}

	
	/**
	 * @return the detail3
	 */
	public String getDetail3( )
	{
		return detail3;
	}

	
	/**
	 * @param detail3 the detail3 to set
	 */
	public void setDetail3( String detail3 )
	{
		this.detail3 = detail3;
	}

	
	/**
	 * @return the detail4
	 */
	public String getDetail4( )
	{
		return detail4;
	}

	
	/**
	 * @param detail4 the detail4 to set
	 */
	public void setDetail4( String detail4 )
	{
		this.detail4 = detail4;
	}

	
	/**
	 * @return the detail5
	 */
	public String getDetail5( )
	{
		return detail5;
	}

	
	/**
	 * @param detail5 the detail5 to set
	 */
	public void setDetail5( String detail5 )
	{
		this.detail5 = detail5;
	}

	
	/**
	 * @return the detail6
	 */
	public String getDetail6( )
	{
		return detail6;
	}

	
	/**
	 * @param detail6 the detail6 to set
	 */
	public void setDetail6( String detail6 )
	{
		this.detail6 = detail6;
	}


	
	/**
	 * @return the clses
	 */
	public Set<Cls> getClses( )
	{
		return clses;
	}


	
	/**
	 * @param clses the clses to set
	 */
	public void setClses( Set<Cls> clses )
	{
		this.clses = clses;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString( )
	{
		return "Student [name=" + name + ", password=" + password + ", email="
				+ email + ", icon=" + icon + ", birthday=" + birthday
				+ ", sex=" + sex + ", hobby=" + hobby + ", contact=" + contact
				+ ", parents=" + parents + ", detail1=" + detail1
				+ ", detail2=" + detail2 + ", detail3=" + detail3
				+ ", detail4=" + detail4 + ", detail5=" + detail5
				+ ", detail6=" + detail6 ;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals( Object obj )
	{
		return this.id == ((Student)obj).getId( );
	}

}
