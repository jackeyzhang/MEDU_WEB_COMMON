/**
 * 
 */
package com.sickle.pojo.website;

import java.io.Serializable;


/**
 * 网站配置信息
 * 
 * @author chenhao
 *
 */
public class Configuration implements Serializable
{

	private static final long serialVersionUID = -334993948424696271L;

	//非会员学生数量限制
	private Integer studentLimit;
	
	//非会员学校数量限制
	private Integer schoolLimit;


	
	/**
	 * @return the studentLimit
	 */
	public Integer getStudentLimit( )
	{
		return studentLimit;
	}

	
	/**
	 * @return the schoolLimit
	 */
	public Integer getSchoolLimit( )
	{
		return schoolLimit;
	}
	
}
