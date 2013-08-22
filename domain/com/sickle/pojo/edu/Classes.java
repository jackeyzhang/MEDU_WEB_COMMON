package com.sickle.pojo.edu;

import java.util.HashSet;
import java.util.Set;

import com.gwtent.reflection.client.annotations.Reflect_Domain;
import com.sickle.uireflect.FieldType;
import com.sickle.uireflect.Reflect_Field;
@Reflect_Domain
public class Classes implements java.io.Serializable
{

	private static final long serialVersionUID = 8836404241907066509L;
	@Reflect_Field(type = FieldType.Integer,isId = true)
	private Integer id;
	@Reflect_Field(title="老师")
	private Teacher teacher;
	@Reflect_Field(title="学校")
	private School school;
	@Reflect_Field(title="名字")
	private String name;
	@Reflect_Field(title="授课时间")
	private String classtime;
	private Set<Student> students = new HashSet<Student>( 0 );

	public Classes( )
	{
	}

	public Classes( Teacher teacher, School school )
	{
		this.teacher = teacher;
		this.school = school;
	}

	public Classes( Teacher teacher, School school, String name,
			String classtime, Set<Student> students )
	{
		this.teacher = teacher;
		this.school = school;
		this.name = name;
		this.classtime = classtime;
		this.students = students;
	}

	public Integer getId( )
	{
		return this.id;
	}

	public void setId( Integer id )
	{
		this.id = id;
	}

	public Teacher getTeacher( )
	{
		return this.teacher;
	}

	public void setTeacher( Teacher teacher )
	{
		this.teacher = teacher;
	}

	public School getSchool( )
	{
		return this.school;
	}

	public void setSchool( School school )
	{
		this.school = school;
	}

	public String getName( )
	{
		return this.name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public String getClasstime( )
	{
		return this.classtime;
	}

	public void setClasstime( String classtime )
	{
		this.classtime = classtime;
	}

	public Set<Student> getStudents( )
	{
		return this.students;
	}

	public void setStudents( Set<Student> students )
	{
		this.students = students;
	}

}
