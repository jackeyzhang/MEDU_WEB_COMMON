/**
 * 
 */
package bean.education;

import java.io.Serializable;


/**
 * 课程类
 * 
 * @author zhangchenhao
 *
 *
 * 2013-5-31
 * 下午3:36:25
 *
 */
public class MClass implements Serializable{

	private static final long serialVersionUID = 7111702127668210229L;
	
	private int number;//课程号 
	
	private String classTime;//上课时间
	
	private Teacher teacher;//授课老师

	private String classRoom;//教室
	
	/**
	 * @return the number
	 */
	public int getNumber( )
	{
		return number;
	}

	
	/**
	 * @param number the number to set
	 */
	public void setNumber( int number )
	{
		this.number = number;
	}

	
	/**
	 * @return the classTime
	 */
	public String getClassTime( )
	{
		return classTime;
	}

	
	/**
	 * @param classTime the classTime to set
	 */
	public void setClassTime( String classTime )
	{
		this.classTime = classTime;
	}

	
	/**
	 * @return the teachers
	 */
	public Teacher getTeacher( )
	{
		return teacher;
	}
	
	/**
	 * @param teachers the teachers to set
	 */
	public void setTeacher( Teacher teacher )
	{
		this.teacher = teacher;
	}


	/**
	 * @return the classRoom
	 */
	public String getClassRoom( )
	{
		return classRoom;
	}


	
	/**
	 * @param classRoom the classRoom to set
	 */
	public void setClassRoom( String classRoom )
	{
		this.classRoom = classRoom;
	}
	
	
	public String toDbString(String displayString)
	{
		return "";
	}
	
	public String toDisplayString(String dbString)
	{
		return "";
	}
}
