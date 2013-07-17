/**
 * 
 */
package com.sickle.pojo.website;

import java.io.Serializable;
import java.util.Date;


/**
 * 站内信或通知
 * 
 * @author chenhao
 *
 */
public class Message implements Serializable
{

	private static final long serialVersionUID = 3992721219616799776L;
	
	private Long id;
	
	private String from;
	
	private String to;
	
	private boolean hasRead;
	
	private Date date;
	
	private String content;
	
	private String messageType;
	
	private String title;
	
	//默认保存天数
	private Integer defaultSaveDay;
	
	/**
	 * 
	 */
	public Message( )
	{
		super( );
	}

	/**
	 * @return the id
	 */
	public Long getId( )
	{
		return id;
	}

	
	/**
	 * @param id the id to set
	 */
	public void setId( Long id )
	{
		this.id = id;
	}

	
	/**
	 * @return the from
	 */
	public String getFrom( )
	{
		return from;
	}

	
	/**
	 * @param from the from to set
	 */
	public void setFrom( String from )
	{
		this.from = from;
	}

	
	/**
	 * @return the to
	 */
	public String getTo( )
	{
		return to;
	}

	
	/**
	 * @param to the to to set
	 */
	public void setTo( String to )
	{
		this.to = to;
	}

	
	/**
	 * @return the hasRead
	 */
	public boolean isHasRead( )
	{
		return hasRead;
	}

	
	/**
	 * @param hasRead the hasRead to set
	 */
	public void setHasRead( boolean hasRead )
	{
		this.hasRead = hasRead;
	}

	
	/**
	 * @return the date
	 */
	public Date getDate( )
	{
		return date;
	}

	
	/**
	 * @param date the date to set
	 */
	public void setDate( Date date )
	{
		this.date = date;
	}

	
	/**
	 * @return the content
	 */
	public String getContent( )
	{
		return content;
	}

	
	/**
	 * @param content the content to set
	 */
	public void setContent( String content )
	{
		this.content = content;
	}


	
	/**
	 * @return the messageType
	 */
	public String getMessageType( )
	{
		return messageType;
	}


	
	/**
	 * @param messageType the messageType to set
	 */
	public void setMessageType( String messageType )
	{
		this.messageType = messageType;
	}

	
	/**
	 * @return the title
	 */
	public String getTitle( )
	{
		return title;
	}

	
	/**
	 * @param title the title to set
	 */
	public void setTitle( String title )
	{
		this.title = title;
	}

	
	/**
	 * @return the defaultSaveDay
	 */
	public Integer getDefaultSaveDay( )
	{
		return defaultSaveDay;
	}

	
	/**
	 * @param defaultSaveDay the defaultSaveDay to set
	 */
	public void setDefaultSaveDay( Integer defaultSaveDay )
	{
		this.defaultSaveDay = defaultSaveDay;
	}

	
}
