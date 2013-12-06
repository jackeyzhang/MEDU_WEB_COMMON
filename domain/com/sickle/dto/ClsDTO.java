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
public class ClsDTO
{

	public Cls to( Cls classes )
	{
		Set<Member> stus = new HashSet<Member>( );
	
		for ( Member stu : classes.getStudents( ) )
		{
			Set<Cls> clss = new HashSet<Cls>();
			for( Cls stucls : stu.getInclasseses( ) )
			{
				stucls.setStudents( new HashSet<Member>(0) );
				clss.add( stucls );
			}
			stu.setInclasseses( clss );
			
			Set<Cls> opclss = new HashSet<Cls>();
			for( Cls stucls : stu.getOpenclasseses( ) )
			{
				stucls.setStudents( new HashSet<Member>(0) );
				opclss.add( stucls );
			}
			stu.setOpenclasseses( opclss );
			
			stus.add( stu );
		}
		classes.setStudents( stus );
		
		Member mem = classes.getCreatedmember();
		if( mem != null )
		{
			classes.setCreatedmember(new MemberDTO().to(mem));
		}
		return classes;
	}

	public List<Cls> to( List<Cls> classes )
	{
		for ( Cls cls : classes )
		{
			to(cls);
		}
		return classes;
	}
}
