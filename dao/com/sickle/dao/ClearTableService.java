/**
 * 
 */
package com.sickle.dao;


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
	}

}
