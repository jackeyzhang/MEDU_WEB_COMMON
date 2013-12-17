/**
 * 
 */
package com.sickle.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

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
		Session session = getSession();
		Query query = session.createQuery( "from Message where id = ? " );
		query.setLong( 0, id );
		@SuppressWarnings("unchecked")
		List<Message> li = query.list();
		if (li == null || li.size() == 0) {
			return null;
		}
		session.close( );
		return li.get(0);
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
		Session session = getSession();
		Query query = session.createQuery( "from Message where receiver = ? " );
		query.setInteger( 0, userid );
		List<Message> li = query.list();
		if (li == null || li.size() == 0) {
			return null;
		}
		session.close( );
		return li;
	}

	@Override
	public List<Message> getMessageBySendAndRecevie( Integer sendid,
			Integer recevireid,Integer type)
	{
		Session session = getSession();
		String hql = "";
		if( type == 0 )
		{
			 hql = "from Message where (send = ? and receiver = ?)" ;
		}
		else if ( type == 1 )
		{
			hql = "from Message where (receiver = ? and send = ?)" ;
		}
		else
		{
			hql = "from Message where (send = ? and receiver = ?) or (send = ? and receiver = ?) " ;
		}
		Query query = session.createQuery( hql );
		query.setInteger( 0, sendid );
		query.setInteger( 1, recevireid );
		if( type == 2)
		{
			query.setInteger( 2, recevireid );
			query.setInteger( 3, sendid );
		}		
		@SuppressWarnings("unchecked")
		List<Message> li = query.list();
		if (li == null || li.size() == 0) {
			return null;
		}
		session.close( );
		return li;
	}
}
