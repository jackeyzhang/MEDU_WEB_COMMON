package com.sickle.pojo.website;
public class WebUi implements java.io.Serializable
{
	private static final long serialVersionUID = 8112115786876536310L;
	private int id;
	private String title;
	private String context;
	private String hint;
	private String alert;

	public WebUi( )
	{
	}

	public WebUi( int id )
	{
		this.id = id;
	}

	public WebUi( int id, String title, String context, String hint,
			String alert )
	{
		this.id = id;
		this.title = title;
		this.context = context;
		this.hint = hint;
		this.alert = alert;
	}

	public int getId( )
	{
		return this.id;
	}

	public void setId( int id )
	{
		this.id = id;
	}

	public String getTitle( )
	{
		return this.title;
	}

	public void setTitle( String title )
	{
		this.title = title;
	}

	public String getContext( )
	{
		return this.context;
	}

	public void setContext( String context )
	{
		this.context = context;
	}

	public String getHint( )
	{
		return this.hint;
	}

	public void setHint( String hint )
	{
		this.hint = hint;
	}

	public String getAlert( )
	{
		return this.alert;
	}

	public void setAlert( String alert )
	{
		this.alert = alert;
	}

}
