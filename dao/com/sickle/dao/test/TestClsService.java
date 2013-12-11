/**
 * 
 */

package com.sickle.dao.test;



import com.sickle.dao.ClsDaoService;
import com.sickle.exception.CodeException;
import com.sickle.pojo.edu.Cls;
import com.sickle.pojo.edu.Student;

/**
 * 清掉所有表
 * 
 * @author chenhao
 * 
 */
public class TestClsService
{

	/**
	 * @param args
	 * @throws CodeException 
	 */
	public static void main( String[] args ) throws CodeException
	{
		ClsDaoService dao = new ClsDaoService();
		
		Cls cl2 = new Cls();
		cl2.setName( "周三语文课3" );
		cl2.setClasstime( "时间描述" );
		cl2.setContact( "362365332" );
		cl2.setTeachername( "张老师" );
		cl2.setClassaddress( "浦东新区张杨路123号" );
		
		Student student = new Student();
		student.setName( "小孩子2" );
		student.setEmail( "xiaohaizi2@139.com" );
		student.setPassword( "123" );
		
		cl2.getStudents( ).add( student );
		student.getClses( ).add( cl2 );
		
		try
		{
			dao.addCls( 81 , cl2 );
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}
		
		
		Cls cl = dao.getClassById(32);
		System.out.println(cl);
		
		/*try
		{
			dao.removeClsById( 31 );
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}*/
			
		
	}

}
