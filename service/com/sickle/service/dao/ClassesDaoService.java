/**
 * 
 */
package com.sickle.service.dao;

import org.hibernate.Query;

import com.sickle.dao.HibernateSupport;
import com.sickle.pojo.edu.Classes;
import com.sickle.service.IClassesService;


/**
 * @author chenhao
 *
 */
public class ClassesDaoService extends HibernateSupport<Classes> implements IClassesService
{

	@Override
	public Classes getClassById( Integer id )
	{
		Query query = getSession( ).createQuery( "from Classes where id = ? " );
		query.setInteger( 0, id );
		if(query.list( ) == null || query.list( ).size( ) == 0 )
		{
			return null;
		}
		return (Classes)query.list( ).get( 0 );
	}


}
