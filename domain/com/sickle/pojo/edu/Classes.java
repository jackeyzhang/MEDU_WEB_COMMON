package com.sickle.pojo.edu;

import java.util.HashSet;
import java.util.Set;

public class Classes implements java.io.Serializable
{

	private static final long serialVersionUID = 8836404241907066509L;
	private Integer id;
	private Teacher teacher;
	private School school;
	private String name;
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
