/**
 * 
 */
package com.sickle.dao;

import java.util.List;

import org.hibernate.Query;

import com.sickle.dao.support.HibernateSupport;
import com.sickle.pojo.edu.Notice;
import com.sickle.service.itf.INoticeService;


/**
 * Notice dao服务
 * 
 * @author chenhao
 *
 */
public class NoticeDaoService extends HibernateSupport<Notice> implements INoticeService
{

	@Override
	public Notice getNoticeById( Integer id )
	{
		Query query = getSession( ).createQuery( "from Notice where id = ? " );
		query.setInteger( 0, id );
		if(query.list( ) == null || query.list( ).size( ) == 0 )
		{
			return null;
		}
		return (Notice)query.list( ).get( 0 );
	}

	@Override
	public Notice addNotice( Notice notice )
	{
		return this.save( notice );
	}

	@Override
	public Notice modifyNotice( Notice notice )
	{
		return this.update( notice );
	}

	@Override
	public boolean removeNoticeById( Integer noticeid ) throws Exception
	{
		Notice notice = getNoticeById( noticeid );
		try
		{
			delete( notice );
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}

	@Override
	public boolean removeNoticeByLoginName( String schoolName ) throws Exception
	{
		Notice notice = getNoticeByLoginName( schoolName );
		try
		{
			delete( notice );
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}

	
	@Override
	public Notice getNoticeByLoginName( String name )
	{
		Query query = getSession( ).createQuery( "from Notice where name = ? " );
		query.setString( 0, name );
		if(query.list( ) == null || query.list( ).size( ) == 0 )
		{
			return null;
		}
		return (Notice)query.list( ).get( 0 );
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Notice> listAllNotice( )
	{
		Query query = getSession( ).createQuery( "from Notice " );
		if(query.list( ) == null || query.list( ).size( ) == 0 )
		{
			return null;
		}
		return query.list( );
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Notice> listNotice( int startIndex, int length )
	{
		Query query = getSession( ).createQuery( "from Notice " );
		query.setFirstResult(startIndex);
		query.setMaxResults(length);
		return query.list( );
	}


}
