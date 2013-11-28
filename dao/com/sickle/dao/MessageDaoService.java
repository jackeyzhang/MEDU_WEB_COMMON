/**
 * 
 */
package com.sickle.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.sickle.dao.support.HibernateSupport;
import com.sickle.pojo.website.Message;
import com.sickle.service.itf.IMessageService;


/**
 * 消息dao服务
 * 
 * @author chenhao
 *
 */
public class MessageDaoService extends HibernateSupport<Message> implements IMessageService
{

	@Override
	public Message getMessageById( Long id )
	{
		Query query = getSession( ).createQuery( "from Message where id = ? " );
		query.setLong( 0, id );
		if(query.list( ) == null || query.list( ).size( ) == 0 )
		{
			return null;
		}
		return (Message)query.list( ).get( 0 );
	}

	@Override
	public Message addMessage( Message Message )
	{
		return this.save( Message );
	}

	@Override
	public Message modifyMessage( Message Message )
	{
		return this.update( Message );
	}

	@Override
	public boolean removeMessageById( Long Messageid ) throws Exception
	{
		Message Message = getMessageById( Messageid );
		try
		{
			delete( Message );
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}


	
	@SuppressWarnings("unchecked")
	@Override
	public List<Message> getMessageByUserId( Integer userid )
	{
		Query query = getSession( ).createQuery( "from Message where receiver > ? " );
		query.setInteger( 0, userid );
		if(query.list( ) == null || query.list( ).size( ) == 0 )
		{
			return new ArrayList<Message>();
		}
		return query.list( );
	}


}
