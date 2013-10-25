/**
 * 
 */
package com.sickle.pojo.edu;


/**
 * 机构或教师发布的广告通知
 * 
 * @author chenhao
 *
 */
public class Notice implements java.io.Serializable
{

	private static final long serialVersionUID = -8799038302048405123L;
	
	private Integer id;
	
	private Integer publisherid;
	
	private String address;
	
	private String date;
	
	private String content;
	
	private boolean passed;//是否审核通过
	
	public Notice(){}
	
	
	/**
	 * @param publisherid
	 * @param address
	 * @param date
	 * @param content
	 */
	public Notice( Integer publisherid, String address, String date,
			String content )
	{
		super( );
		this.publisherid = publisherid;
		this.address = address;
		this.date = date;
		this.content = content;
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
	 * @return the publisherid
	 */
	public Integer getPublisherid( )
	{
		return publisherid;
	}

	
	/**
	 * @param publisherid the publisherid to set
	 */
	public void setPublisherid( Integer publisherid )
	{
		this.publisherid = publisherid;
	}

	
	/**
	 * @return the address
	 */
	public String getAddress( )
	{
		return address;
	}

	
	/**
	 * @param address the address to set
	 */
	public void setAddress( String address )
	{
		this.address = address;
	}

	
	/**
	 * @return the date
	 */
	public String getDate( )
	{
		return date;
	}

	
	/**
	 * @param date the date to set
	 */
	public void setDate( String date )
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
	 * @return the passed
	 */
	public boolean isPassed( )
	{
		return passed;
	}


	
	/**
	 * @param passed the passed to set
	 */
	public void setPassed( boolean passed )
	{
		this.passed = passed;
	}
	
}
