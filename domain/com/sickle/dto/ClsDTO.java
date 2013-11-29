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
			stus.add( stu );
			
			Set<Cls> clss = new HashSet<Cls>();
			for( Cls stucls : stu.getClasseses( ) )
			{
				clss.add( stucls );
			}
			stu.setClasseses( clss );
		}
		classes.setStudents( stus );
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
