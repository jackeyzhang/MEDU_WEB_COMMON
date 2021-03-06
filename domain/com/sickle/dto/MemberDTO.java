/**
 * 
 */

package com.sickle.dto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sickle.pojo.edu.Cls;
import com.sickle.pojo.edu.Member;
import com.sickle.pojo.edu.Student;

/**
 * @author chenhao
 * 
 */
public class MemberDTO
{

	public Member to( Member member )
	{
		Set<Cls> opclasses = new HashSet<Cls>( 0 );
		for ( Cls clss : member.getOpenclasseses( ))
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
		member.setOpenclasseses( opclasses );
		
		return member;
	}

	public List<Member> to( List<Member> members )
	{
		for ( Member teacher : members )
		{
			to( teacher );
		}
		return members;
	}
}
