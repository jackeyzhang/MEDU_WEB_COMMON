/**
 * 
 */
package com.sickle.dao;

import org.hibernate.Query;

import com.sickle.dao.support.HibernateSupport;
import com.sickle.pojo.edu.Org;
import com.sickle.service.itf.IOrgService;


/**
 * Org dao服务
 * 
 * @author chenhao
 *
 */
public class OrgDaoService extends HibernateSupport<Org> implements IOrgService
{

	@Override
	public Org getOrgById( Integer id )
	{
		Query query = getSession( ).createQuery( "from Org where id = ? " );
		query.setInteger( 0, id );
		if(query.list( ) == null || query.list( ).size( ) == 0 )
		{
			return null;
		}
		return (Org)query.list( ).get( 0 );
	}

	@Override
	public Org addOrg( Org org )
	{
		return this.save( org );
	}

	@Override
	public Org modifyOrg( Org org )
	{
		return this.update( org );
	}

	@Override
	public boolean removeOrgById( Integer orgid ) throws Exception
	{
		Org org = getOrgById( orgid );
		try
		{
			delete( org );
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}

	@Override
	public boolean removeOrgByLoginName( String schoolName ) throws Exception
	{
		Org org = getOrgByLoginName( schoolName );
		try
		{
			delete( org );
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}

	
	@Override
	public Org getOrgByLoginName( String name )
	{
		Query query = getSession( ).createQuery( "from Org where name = ? " );
		query.setString( 0, name );
		if(query.list( ) == null || query.list( ).size( ) == 0 )
		{
			return null;
		}
		return (Org)query.list( ).get( 0 );
	}


}
