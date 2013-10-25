/**
 * 
 */

package com.sickle.dto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sickle.pojo.edu.Classes;
import com.sickle.pojo.edu.Student;

/**
 * @author chenhao
 * 
 */
public class ClassesDTO
{

	public Classes to( Classes classes )
	{
		Set<Student> stus = new HashSet<Student>( );
	
		for ( Student stu : classes.getStudents( ) )
		{
			stus.add( stu );
		}
		classes.setStudents( stus );
		return classes;
	}

	public List<Classes> to( List<Classes> Classess )
	{
		for ( Classes Classes : Classess )
		{
			to(Classes);
		}
		return Classess;
	}
}
