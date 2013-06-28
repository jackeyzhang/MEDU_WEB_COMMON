/**
 * 
 */
package bean.education;

import java.io.Serializable;
import java.util.Date;


/**
 * @author zhangchenhao
 *
 *
 * 2013-5-31
 * 下午3:29:49
 *
 */
public class Person implements Serializable
{

	private static final long serialVersionUID = 212648443633480015L;
	
	private int id;//唯一标示
	
	private String name;//名字
	
	private Date birthDay;//出生日期
	
	private String hobby;//喜好
	
	private String nativePlace;//籍贯
	
	private String sex;//性别
	
	private String normallyCity;//常驻城市

	private String phone;//电话
	
	private String address;//地址
	
	/**
	 * @return the id
	 */
	public int getId( )
	{
		return id;
	}

	
	/**
	 * @param id the id to set
	 */
	public void setId( int id )
	{
		this.id = id;
	}

	
	/**
	 * @return the name
	 */
	public String getName( )
	{
		return name;
	}

	
	/**
	 * @param name the name to set
	 */
	public void setName( String name )
	{
		this.name = name;
	}

	
	/**
	 * @return the birthDay
	 */
	public Date getBirthDay( )
	{
		return birthDay;
	}

	
	/**
	 * @param birthDay the birthDay to set
	 */
	public void setBirthDay( Date birthDay )
	{
		this.birthDay = birthDay;
	}

	
	/**
	 * @return the hobby
	 */
	public String getHobby( )
	{
		return hobby;
	}

	
	/**
	 * @param hobby the hobby to set
	 */
	public void setHobby( String hobby )
	{
		this.hobby = hobby;
	}

	
	/**
	 * @return the nativePlace
	 */
	public String getNativePlace( )
	{
		return nativePlace;
	}

	
	/**
	 * @param nativePlace the nativePlace to set
	 */
	public void setNativePlace( String nativePlace )
	{
		this.nativePlace = nativePlace;
	}

	
	/**
	 * @return the sex
	 */
	public String getSex( )
	{
		return sex;
	}

	
	/**
	 * @param sex the sex to set
	 */
	public void setSex( String sex )
	{
		this.sex = sex;
	}

	
	/**
	 * @return the normallyCity
	 */
	public String getNormallyCity( )
	{
		return normallyCity;
	}

	
	/**
	 * @param normallyCity the normallyCity to set
	 */
	public void setNormallyCity( String normallyCity )
	{
		this.normallyCity = normallyCity;
	}


	
	/**
	 * @return the phone
	 */
	public String getPhone( )
	{
		return phone;
	}


	
	/**
	 * @param phone the phone to set
	 */
	public void setPhone( String phone )
	{
		this.phone = phone;
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
	
}
