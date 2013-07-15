/**
 * 
 */
package com.sickle.pojo.website;

import java.io.Serializable;


/**
 * 网站页面对象
 * 
 * @author chenhao
 *
 */
public class Ui implements Serializable
{

	private static final long serialVersionUID = -5826288428166053748L;
	
	private Integer id;
	
	private String title;
	
	private String context;
	
	private String hint;
	
	private String alert;

	/**
	 * 
	 */
	public Ui( )
	{
		super( );
	}

	
	/**
	 * @return the id
	 */
	public Integer getId( )
	{
		return id;
	}

	
	/**
	 * @param id the id to set
	 */
	public void setId( Integer id )
	{
		this.id = id;
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
	 * @return the context
	 */
	public String getContext( )
	{
		return context;
	}

	
	/**
	 * @param context the context to set
	 */
	public void setContext( String context )
	{
		this.context = context;
	}

	
	/**
	 * @return the hint
	 */
	public String getHint( )
	{
		return hint;
	}

	
	/**
	 * @param hint the hint to set
	 */
	public void setHint( String hint )
	{
		this.hint = hint;
	}

	
	/**
	 * @return the alert
	 */
	public String getAlert( )
	{
		return alert;
	}

	
	/**
	 * @param alert the alert to set
	 */
	public void setAlert( String alert )
	{
		this.alert = alert;
	}
}
