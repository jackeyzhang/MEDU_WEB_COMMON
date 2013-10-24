/**
 * 
 */

package com.sickle.dao.test;

import com.sickle.dao.OrgDaoService;
import com.sickle.dao.SchoolDaoService;
import com.sickle.dao.TeacherDaoService;
import com.sickle.pojo.edu.Org;
import com.sickle.pojo.edu.School;
import com.sickle.pojo.edu.Teacher;

/**
 * 清掉所有表
 * 
 * @author chenhao
 * 
 */
public class TestDaoService
{

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		OrgDaoService oservice = new OrgDaoService( );
		SchoolDaoService sservice = new SchoolDaoService( );

		for ( int i = 0; i < 10; i++ )
		{
			Org org = new Org( "汲原堂"+ i, "延平路69号601B", "15236362525", "MisMa",
					"jiyuantang", "123456" );
			oservice.save( org );

			School school = new School( "静安教学点"+ i, "jingan" );
			school.setOrg( org );
			org.getSchools( ).add( school );

			sservice.save( school );
		}

		
		TeacherDaoService tservice = new TeacherDaoService( );
		for(int i = 0;i < 20;i++)
		{
			Teacher t = new Teacher("老师名字"+ i,"email"+ i +"@139.com","登录名","密码");
			tservice.addTeacher( t );
		}
		
//		TeacherDaoService tservice = new TeacherDaoService( );
//		tservice.getSession( ).beginTransaction( );
//		tservice.getSession( ).createQuery( "delete from Teacher where id>0" )
//				.executeUpdate( );
//		tservice.getSession( ).beginTransaction( ).commit( );
		//
		// StudentDaoService service = new StudentDaoService();
		// service.getSession( ).beginTransaction( );
		// service.getSession( ).createQuery( "delete from Student where id>0"
		// ).executeUpdate( );
		// service.getSession( ).beginTransaction( ).commit( );
		//
		// ClassesDaoService cservice = new ClassesDaoService();
		// cservice.getSession( ).beginTransaction( );
		// cservice.getSession( ).createQuery( "delete from Classes where id>0"
		// ).executeUpdate( );
		// cservice.getSession( ).beginTransaction( ).commit( );
	}

}
