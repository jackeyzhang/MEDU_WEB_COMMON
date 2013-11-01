/**
 * 
 */

package com.sickle.dto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sickle.pojo.edu.Classes;
import com.sickle.pojo.edu.Student;
import com.sickle.pojo.edu.Member;

/**
 * @author chenhao
 * 
 */
public class MemberDTO
{

	public Member to( Member teacher )
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

	public List<Member> to( List<Member> teachers )
	{
		for ( Member teacher : teachers )
		{
			to( teacher );
		}
		return teachers;
	}
}
