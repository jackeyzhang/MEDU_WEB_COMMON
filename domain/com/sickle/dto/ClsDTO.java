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
public class ClsDTO
{

	public Cls to( Cls classes )
	{
		Set<Student> stus = new HashSet<Student>( );
	
		for ( Student stu : classes.getStudents( ) )
		{
			Set<Cls> opclss = new HashSet<Cls>();
			for( Cls stucls : stu.getClses( ) )
			{
				stucls.setStudents( new HashSet<Student>(0) );
				opclss.add( stucls );
			}
			stu.setClses( opclss );
			
			stus.add( stu );
		}
		classes.setStudents( stus );
		
		Member mem = classes.getTeacher();
		if( mem != null )
		{
			classes.setTeacher(new MemberDTO().to(mem));
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
