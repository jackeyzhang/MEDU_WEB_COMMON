/**
 * 
 */

package com.sickle.dto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sickle.pojo.edu.Cls;
import com.sickle.pojo.edu.Member;

/**
 * @author chenhao
 * 
 */
public class MemberDTO
{

	public Member to( Member member )
	{
		Set<Cls> classes = new HashSet<Cls>( 0 );
		for ( Cls clss : member.getClasseses( ) )
		{
			Set<Member> stus = new HashSet<Member>( );
			for ( Member stu : clss.getStudents( ) )
			{
				stu.setClasseses( new HashSet<Cls>(0) );
				stu.setOpenclasseses(  new HashSet<Cls>(0)  );
				stus.add( stu );
			}
			clss.setStudents( stus );
			classes.add( clss );
		}
		member.setClasseses( classes );
		
		Set<Cls> opclasses = new HashSet<Cls>( 0 );
		for ( Cls clss : member.getOpenclasseses( ))
		{
			Set<Member> stus = new HashSet<Member>( );
			for ( Member stu : clss.getStudents( ) )
			{
				stu.setClasseses( new HashSet<Cls>(0) );
				stu.setOpenclasseses(  new HashSet<Cls>(0)  );
				stus.add( stu );
			}
			clss.setStudents( stus );
			classes.add( clss );
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
