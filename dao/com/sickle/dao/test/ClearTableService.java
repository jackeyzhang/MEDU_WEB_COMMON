/**
 * 
 */
package com.sickle.dao.test;

import com.sickle.dao.MemberDaoService;
import com.sickle.dao.OrgDaoService;
import com.sickle.dao.SchoolDaoService;


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
		OrgDaoService oservice = new OrgDaoService();
		oservice.getSession( ).beginTransaction( );
		oservice.getSession( ).createQuery( "delete from Org where id>0" ).executeUpdate( );
		oservice.getSession( ).beginTransaction( ).commit( );
		
		SchoolDaoService sservice = new SchoolDaoService();
		sservice.getSession( ).beginTransaction( );
		sservice.getSession( ).createQuery( "delete from School where id>0" ).executeUpdate( );
		sservice.getSession( ).beginTransaction( ).commit( );
		
		MemberDaoService tservice = new MemberDaoService();
		tservice.getSession( ).beginTransaction( );
		tservice.getSession( ).createQuery( "delete from Teacher where id>0" ).executeUpdate( );
		tservice.getSession( ).beginTransaction( ).commit( );
	}

}
