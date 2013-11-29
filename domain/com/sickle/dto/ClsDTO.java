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
		}
		classes.setStudents( stus );
		return classes;
	}

	public List<Cls> to( List<Cls> Clss )
	{
		for ( Cls Cls : Clss )
		{
			to(Cls);
		}
		return Clss;
	}
}
