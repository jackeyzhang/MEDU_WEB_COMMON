/**
 * 
 */

package com.sickle.dto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sickle.pojo.edu.Org;
import com.sickle.pojo.edu.School;

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
