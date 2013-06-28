/**
 * 
 */
package bean.education;

import java.io.Serializable;


/**
 * 老师
 * 
 * @author zhangchenhao
 *
 *
 * 2013-5-31
 * 下午3:37:51
 *
 */
public class Teacher extends Person implements Serializable{

	private static final long serialVersionUID = -3062154238042846611L;
	
	private String grade;//级别
	
	private float baseSalary;//基础工资
	
	private float classSalary;//课时工资 本月课时工资= 课时工资 * 课时数
	
	private float bonus;//奖金和提成 主观计算 界面提供该计算机 主管计算后方才有值

	
	/**
	 * @return the grade
	 */
	public String getGrade( )
	{
		return grade;
	}

	
	/**
	 * @param grade the grade to set
	 */
	public void setGrade( String grade )
	{
		this.grade = grade;
	}

	
	/**
	 * @return the baseSalary
	 */
	public float getBaseSalary( )
	{
		return baseSalary;
	}

	
	/**
	 * @param baseSalary the baseSalary to set
	 */
	public void setBaseSalary( float baseSalary )
	{
		this.baseSalary = baseSalary;
	}

	
	/**
	 * @return the classSalary
	 */
	public float getClassSalary( )
	{
		return classSalary;
	}

	
	/**
	 * @param classSalary the classSalary to set
	 */
	public void setClassSalary( float classSalary )
	{
		this.classSalary = classSalary;
	}

	
	/**
	 * @return the bonus
	 */
	public float getBonus( )
	{
		return bonus;
	}

	
	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus( float bonus )
	{
		this.bonus = bonus;
	}

}
