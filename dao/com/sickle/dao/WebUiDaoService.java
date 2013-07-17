/**
 * 
 */
package com.sickle.dao;

import org.hibernate.Query;

import com.sickle.dao.support.HibernateSupport;
import com.sickle.pojo.website.WebUi;
import com.sickle.service.IWebUiService;


/**
 * webui dao service
 *  
 * @author chenhao
 *
 */
public class WebUiDaoService extends HibernateSupport<WebUi> implements IWebUiService
{

	@Override
	public WebUi addWebUi( WebUi webui ) throws Exception
	{
		return save( webui );
	}

	@Override
	public boolean removeWebUiById( Integer id ) throws Exception
	{
		WebUi webui = getWebUiById( id );
		try
		{
			delete( webui );
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}

	@Override
	public WebUi getWebUiById( Integer id )
	{
		Query query = getSession( ).createQuery( "from WebUi where id = ? " );
		query.setInteger( 0, id );
		if(query.list( ) == null || query.list( ).size( ) == 0 )
		{
			return null;
		}
		return (WebUi)query.list( ).get( 0 );
	}

	@Override
	public WebUi modifyWebUi( WebUi webui ) throws Exception
	{
		return update( webui );
	}

}
