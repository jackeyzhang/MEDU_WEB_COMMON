/**
 * 
 */

package com.sickle.dto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sickle.pojo.edu.Classes;
import com.sickle.pojo.edu.Org;
import com.sickle.pojo.edu.School;
import com.sickle.pojo.edu.Student;

/**
 * @author chenhao
 * 
 */
public class OrgDTO
{

	public Org to( Org org )
	{
		Set<School> schools = new HashSet<School>( 0 );
		for ( School sc : org.getSchools( ) )
		{
			Set<Classes> classes = new HashSet<Classes>( 0 );
			for ( Classes clss : sc.getClasseses( ) )
			{
				Set<Student> stus = new HashSet<Student>( );

				for ( Student stu : clss.getStudents( ) )
				{
					stus.add( stu );
				}
				clss.setStudents( stus );
				classes.add( clss );
			}
			sc.setClasseses( classes );
			schools.add( sc );
		}
		org.setSchools( schools );
		return org;
	}

	public List<Org> to( List<Org> orgs )
	{
		for ( Org org : orgs )
		{
			to(org);
		}
		return orgs;
	}
}
