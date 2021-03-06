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

	@Reflect_Field(index=0,type = FieldType.Integer,isId = true)
	private Integer id;
	
	@Reflect_Field(index=1,title="名称",reqiured = true)
	private String name;
	
	@Reflect_Field(index=2,title="授课老师",reqiured = true)
	private String teachername;
	
	@Reflect_Field(index=3,title="老师联系方式",type=FieldType.Mobile)
	private String contact;
	
	@Reflect_Field(index=4,title="授课时间")
	private String classtime;
	
	@Reflect_Field(index=5,title="授课地址")
	private String classaddress;
	
	private Member teacher;
	
	private Set<Student> students = new HashSet<Student>( 0 );

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
			String classtime, String classaddress, Set<Student> students )
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
	public Set<Student> getStudents( )
	{
		return students;
	}

	
	/**
	 * @param students the students to set
	 */
	public void setStudents( Set<Student> students )
	{
		this.students = students;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString( )
	{
		return "Cls [id=" + id + ", name=" + name + ", teachername="
				+ teachername + ", contact=" + contact + ", classtime="
				+ classtime + ", classaddress=" + classaddress + ", students="
				+ students + "]";
	}

	public Member getTeacher() {
		return teacher;
	}

	public void setTeacher(Member teacher) {
		this.teacher = teacher;
	}
	
	public void removeStudent(Student stu)
	{
		Student removeone = null;
		for(Student s : getStudents( ))
		{
			if(s.getId( ).equals(stu.getId( )))
			{
				removeone = s;
			}
		}
		if( null != removeone )
		{
			students.remove( removeone );
		}
	}
}
