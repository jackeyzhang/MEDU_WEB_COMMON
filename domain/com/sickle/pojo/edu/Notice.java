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
	
	private String orgname;//机构名称
	
	private String address;
	
	private String datedesc;
	
	private String content;
	
	private boolean passed;//是否审核通过
	
	
	
	public Notice(){}
	
	
	/**
	 * @param publisherid
	 * @param address
	 * @param datedesc
	 * @param content
	 */
	public Notice( Integer publisherid, String orgname,String address, String datedesc,
			String content )
	{
		super( );
		this.orgname = orgname;
		this.publisherid = publisherid;
		this.address = address;
		this.datedesc = datedesc;
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
	public String getDatedesc( )
	{
		return datedesc;
	}

	
	/**
	 * @param date the date to set
	 */
	public void setDatedesc( String datedesc )
	{
		this.datedesc = datedesc;
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


	
	/**
	 * @return the orgname
	 */
	public String getOrgname( )
	{
		return orgname;
	}


	
	/**
	 * @param orgname the orgname to set
	 */
	public void setOrgname( String orgname )
	{
		this.orgname = orgname;
	}
}
