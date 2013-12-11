/**
 * 
 */

package com.sickle.dao.test;



import com.sickle.dao.ClsDaoService;
import com.sickle.exception.CodeException;
import com.sickle.pojo.edu.Cls;

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
	 * @throws CodeException 
	 */
	public static void main( String[] args ) throws CodeException
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
		
		/*MemberDaoService tservice = new MemberDaoService( );
		for(int i = 0;i < 1;i++)
		{
			Member t = new Member("老师"+ i,"email"+ i +"@139.com","登录名","密码");
			t.setResume( "个人简历" + i );
			t.setOrgname( "公司名称" + i);
			t.setTitle( "title" +  i );
			tservice.addMember( t );
			System.out.println("congratulation "+ t.getLoginName());
		}*/
		
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
		
//		MessageDaoService s = new MessageDaoService();
//		Message message = new Message(1,2,"n", new Date(),"c","t","y");
//		s.addMessage( message );
		
		ClsDaoService clsdao = new ClsDaoService();
		Cls cl = clsdao.getClassById(31);
		System.out.println(cl);
		
//		Cls cl = new Cls();
//		cl.setName( "周三语文课2" );
//		cl.setClasstime( "时间描述" );
//		cl.setContact( "362365332" );
//		cl.setTeachername( "张老师" );
//		cl.setClassaddress( "浦东新区张杨路123号" );
		
//		Member member = new Member();
//		member.setName( "魏斌斌" );
//		member.setCity( "上海" );
//		member.setEmail( "zhangchenhao@139.com" );
//		member.setTitle( "学生" );
//		member.setPassword( "123" );
//		member.setResume( "resume" );
//		member.setOrgname( "orgname" );
		
//		cl.getStudents( ).add( member );
		
//		clsdao.addCls( 94 , cl );
		
			
	}

}
