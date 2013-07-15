/**
 * 
 */
package com.sickle.pojo.edu;

import java.io.Serializable;


/**
 * 班级信息
 * 
 * @author chenhao
 *
 */
public class Classes implements Serializable
{

	private static final long serialVersionUID = -334993948424696271L;

	//班级标示
	private Integer id;
	
	//学校标示
	private Integer schoolId;
	
	//班级名称
	private String name;
	
	//现任代课老师
	private Integer teacherId;
	
	//上课时间
	private String classTime;
	
	/**
	 * 
	 */
	public Classes( )
	{
		super( );
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
	 * @return the schoolId
	 */
	public Integer getSchoolId( )
	{
		return schoolId;
	}

	
	/**
	 * @param schoolId the schoolId to set
	 */
	public void setSchoolId( Integer schoolId )
	{
		this.schoolId = schoolId;
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
	 * @return the teacherId
	 */
	public Integer getTeacherId( )
	{
		return teacherId;
	}

	
	/**
	 * @param teacherId the teacherId to set
	 */
	public void setTeacherId( Integer teacherId )
	{
		this.teacherId = teacherId;
	}

	
	/**
	 * @return the classTime
	 */
	public String getClassTime( )
	{
		return classTime;
	}

	
	/**
	 * @param classTime the classTime to set
	 */
	public void setClassTime( String classTime )
	{
		this.classTime = classTime;
	}
	
	
}
