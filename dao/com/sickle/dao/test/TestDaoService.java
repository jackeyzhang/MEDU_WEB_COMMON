/**
 * 
 */
package com.sickle.dao.test;

import com.sickle.dao.OrgDaoService;
import com.sickle.dao.SchoolDaoService;
import com.sickle.pojo.edu.Org;
import com.sickle.pojo.edu.School;


/**
 * 清掉所有表
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
		OrgDaoService oservice = new OrgDaoService();
		Org org = new Org("汲原堂","延平路69号601B","15236362525","MisMa","jiyuantang","123456");
		oservice.save( org );
		
		SchoolDaoService sservice = new SchoolDaoService();
		School school = new School("静安教学点","jingan");
		school.setOrg( org );
		
		org.getSchools( ).add( school );
		sservice.save( school );
		
		//		TeacherDaoService tservice = new TeacherDaoService();
//		tservice.getSession( ).beginTransaction( );
//		tservice.getSession( ).createQuery( "delete from Teacher where id>0" ).executeUpdate( );
//		tservice.getSession( ).beginTransaction( ).commit( );
//		
//		StudentDaoService service = new StudentDaoService();
//		service.getSession( ).beginTransaction( );
//		service.getSession( ).createQuery( "delete from Student where id>0" ).executeUpdate( );
//		service.getSession( ).beginTransaction( ).commit( );
//		
//		ClassesDaoService cservice = new ClassesDaoService();
//		cservice.getSession( ).beginTransaction( );
//		cservice.getSession( ).createQuery( "delete from Classes where id>0" ).executeUpdate( );
//		cservice.getSession( ).beginTransaction( ).commit( );
	}

}
