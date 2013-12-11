/**
 * 
 */

package com.sickle.dto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sickle.pojo.edu.Cls;
import com.sickle.pojo.edu.Student;

/**
 * @author chenhao
 * 
 */
public class StudentDTO
{

	public Student to( Student student )
	{
		Set<Cls> opclasses = new HashSet<Cls>( 0 );
		for ( Cls clss : student.getClses( ))
		{
			Set<Student> stus = new HashSet<Student>( );
			for ( Student stu : clss.getStudents( ) )
			{
				stu.setClses(  new HashSet<Cls>(0)  );
				stus.add( stu );
			}
			clss.setStudents( stus );
			opclasses.add( clss );
		}
		student.setClses( opclasses );
		
		return student;
	}

	public List<Student> to( List<Student> students )
	{
		for ( Student stu : students )
		{
			to( stu );
		}
		return students;
	}
}
