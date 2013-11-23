/**
 * 
 */

package com.sickle.dao.test;

import com.sickle.dao.MemberDaoService;
import com.sickle.pojo.edu.Member;

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
		/*OrgDaoService oservice = new OrgDaoService( );
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
*/
		
		MemberDaoService tservice = new MemberDaoService( );
		for(int i = 0;i < 1;i++)
		{
			Member t = new Member("老师"+ i,"email"+ i +"@139.com","登录名","密码");
			t.setResume( "个人简历" + i );
			t.setOrgname( "公司名称" + i);
			t.setTitle( "title" +  i );
			tservice.addMember( t );
			System.out.println("congratulation "+ t.getLoginName());
		}
		
//		ClassesDaoService cservice = new ClassesDaoService();
//		for(int i = 0;i < 30;i++ )
//		{
//			Classes c = new Classes();
//			c.setName( "XX课程"+ i );
//			c.setClasstime( "每周五" );
//			cservice.addClasses( c );
//		}
		
		/*NoticeDaoService cservice = new NoticeDaoService();
		for(int i = 0;i < 30;i++ )
		{
			Notice notice = new Notice();
			notice.setPassed( i % 2 == 0? false:true );
			notice.setPublisherid( 12 );
			notice.setContent( "notice content:" + i );
			notice.setAddress( "notice address:" + i );
			notice.setDatedesc( "1/2/3 per week: " + i );
			cservice.addNotice( notice );
		}*/
		
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
