/**
 * 
 */

package com.sickle.dto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sickle.pojo.edu.Classes;
import com.sickle.pojo.edu.Student;
import com.sickle.pojo.edu.Teacher;

/**
 * @author chenhao
 * 
 */
public class TeacherDTO
{

	public Teacher to( Teacher teacher )
	{
		Set<Classes> classes = new HashSet<Classes>( 0 );
		for ( Classes clss : teacher.getClasseses( ) )
		{
			Set<Student> stus = new HashSet<Student>( );

			for ( Student stu : clss.getStudents( ) )
			{
				stus.add( stu );
			}
			clss.setStudents( stus );
			classes.add( clss );
		}
		teacher.setClasseses( classes );
		return teacher;
	}

	public List<Teacher> to( List<Teacher> teachers )
	{
		for ( Teacher teacher : teachers )
		{
			to( teacher );
		}
		return teachers;
	}
}
