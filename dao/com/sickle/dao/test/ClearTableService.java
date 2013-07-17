/**
 * 
 */
package com.sickle.dao.test;

import com.sickle.dao.ClassesDaoService;
import com.sickle.dao.OrgDaoService;
import com.sickle.dao.SchoolDaoService;
import com.sickle.dao.StudentDaoService;
import com.sickle.dao.TeacherDaoService;


/**
 * 清掉所有表
 * @author chenhao
 *
 */
public class ClearTableService
{

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		StudentDaoService service = new StudentDaoService();
		service.getSession( ).beginTransaction( );
		service.getSession( ).createQuery( "delete from Student where id>0" ).executeUpdate( );
		service.getSession( ).beginTransaction( ).commit( );
		
		ClassesDaoService cservice = new ClassesDaoService();
		cservice.getSession( ).beginTransaction( );
		cservice.getSession( ).createQuery( "delete from Classes where id>0" ).executeUpdate( );
		cservice.getSession( ).beginTransaction( ).commit( );
		
		OrgDaoService oservice = new OrgDaoService();
		oservice.getSession( ).beginTransaction( );
		oservice.getSession( ).createQuery( "delete from Org where id>0" ).executeUpdate( );
		oservice.getSession( ).beginTransaction( ).commit( );
		
		SchoolDaoService sservice = new SchoolDaoService();
		sservice.getSession( ).beginTransaction( );
		sservice.getSession( ).createQuery( "delete from School where id>0" ).executeUpdate( );
		sservice.getSession( ).beginTransaction( ).commit( );
		
		TeacherDaoService tservice = new TeacherDaoService();
		tservice.getSession( ).beginTransaction( );
		tservice.getSession( ).createQuery( "delete from Teacher where id>0" ).executeUpdate( );
		tservice.getSession( ).beginTransaction( ).commit( );
	}

}
