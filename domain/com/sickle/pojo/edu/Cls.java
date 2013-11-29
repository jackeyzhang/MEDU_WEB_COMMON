package com.sickle.pojo.edu;
import java.util.HashSet;
import java.util.Set;

import com.gwtent.reflection.client.annotations.Reflect_Domain;
import com.sickle.uireflect.FieldType;
import com.sickle.uireflect.Reflect_Field;

@Reflect_Domain
public class Cls implements java.io.Serializable
{
	
	private static final long serialVersionUID = -5929960522288754395L;

	@Reflect_Field(type = FieldType.Integer,isId = true)
	private Integer id;
	
	@Reflect_Field(title="名称",reqiured = true)
	private String name;
	
	@Reflect_Field(title="授课老师",reqiured = true)
	private String teachername;
	
	@Reflect_Field(title="老师联系方式",type=FieldType.Mobile)
	private String contact;
	
	@Reflect_Field(title="授课时间")
	private String classtime;
	
	@Reflect_Field(title="授课地址")
	private String classaddress;
	
	private Set<Member> students = new HashSet<Member>( 0 );

	public Cls( )
	{
	}
	
	/**
	 * @param name
	 */
	public Cls( String name )
	{
		super( );
		this.name = name;
	}


	/**
	 * @param name
	 * @param teachername
	 * @param contact
	 * @param classtime
	 * @param classaddress
	 */
	public Cls( String name, String teachername, String contact,
			String classtime, String classaddress )
	{
		super( );
		this.name = name;
		this.teachername = teachername;
		this.contact = contact;
		this.classtime = classtime;
		this.classaddress = classaddress;
	}


	/**
	 * @param id
	 * @param name
	 * @param teachername
	 * @param contact
	 * @param classtime
	 * @param classaddress
	 * @param students
	 */
	public Cls( Integer id, String name, String teachername, String contact,
			String classtime, String classaddress, Set<Member> students )
	{
		super( );
		this.id = id;
		this.name = name;
		this.teachername = teachername;
		this.contact = contact;
		this.classtime = classtime;
		this.classaddress = classaddress;
		this.students = students;
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
	 * @return the teachername
	 */
	public String getTeachername( )
	{
		return teachername;
	}

	
	/**
	 * @param teachername the teachername to set
	 */
	public void setTeachername( String teachername )
	{
		this.teachername = teachername;
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
	 * @return the classtime
	 */
	public String getClasstime( )
	{
		return classtime;
	}

	
	/**
	 * @param classtime the classtime to set
	 */
	public void setClasstime( String classtime )
	{
		this.classtime = classtime;
	}

	
	/**
	 * @return the classaddress
	 */
	public String getClassaddress( )
	{
		return classaddress;
	}

	
	/**
	 * @param classaddress the classaddress to set
	 */
	public void setClassaddress( String classaddress )
	{
		this.classaddress = classaddress;
	}

	
	/**
	 * @return the students
	 */
	public Set<Member> getStudents( )
	{
		return students;
	}

	
	/**
	 * @param students the students to set
	 */
	public void setStudents( Set<Member> students )
	{
		this.students = students;
	}

	
}
