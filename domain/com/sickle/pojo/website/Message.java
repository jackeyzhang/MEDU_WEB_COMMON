package com.sickle.pojo.website;

import java.util.Date;

import com.gwtent.reflection.client.annotations.Reflect_Domain;
import com.sickle.uireflect.FieldType;
import com.sickle.uireflect.Reflect_Field;

/**
 * Message generated by hbm2java
 */
@Reflect_Domain
public class Message implements java.io.Serializable
{

	private static final long serialVersionUID = 7346379941099118836L;
	
	@Reflect_Field(type = FieldType.Long,isId = true)
	private Long id;
	
	@Reflect_Field(title="发信人",type=FieldType.Integer,mask= -1)
	private int send;
	
	@Reflect_Field(title="收信人",type=FieldType.Integer,mask= -1 )
	private int receiver;
	
	@Reflect_Field(title="是否已读",mask= 1)
	private String hasread;
	
	@Reflect_Field(title="接收时间",type=FieldType.DateTime,mask= -1)
	private Date receivetime;
	
	@Reflect_Field(title="内容")
	private String content;
	
	@Reflect_Field(title="标题")
	private String title;
	
	@Reflect_Field(title="类型",mask= -1)
	private String type;

	public Message( )
	{
	}

	public Message( int send, int receiver )
	{
		this.send = send;
		this.receiver = receiver;
	}

	public Message( int send, int receiver, String hasread, Date receivetime,
			String content, String title, String type )
	{
		this.send = send;
		this.receiver = receiver;
		this.hasread = hasread;
		this.receivetime = receivetime;
		this.content = content;
		this.title = title;
		this.type = type;
	}

	public Long getId( )
	{
		return this.id;
	}

	public void setId( Long id )
	{
		this.id = id;
	}

	public int getSend( )
	{
		return this.send;
	}

	public void setSend( int send )
	{
		this.send = send;
	}

	public int getReceiver( )
	{
		return this.receiver;
	}

	public void setReceiver( int receiver )
	{
		this.receiver = receiver;
	}

	public String getHasread( )
	{
		return this.hasread;
	}

	public void setHasread( String hasread )
	{
		this.hasread = hasread;
	}
	
	/**
	 * @return the receivetime
	 */
	public Date getReceivetime( )
	{
		return receivetime;
	}
	
	/**
	 * @param receivetime the receivetime receiver set
	 */
	public void setReceivetime( Date receivetime )
	{
		this.receivetime = receivetime;
	}

	public String getContent( )
	{
		return this.content;
	}

	public void setContent( String content )
	{
		this.content = content;
	}

	public String getTitle( )
	{
		return this.title;
	}

	public void setTitle( String title )
	{
		this.title = title;
	}

	public String getType( )
	{
		return this.type;
	}

	public void setType( String type )
	{
		this.type = type;
	}

}
