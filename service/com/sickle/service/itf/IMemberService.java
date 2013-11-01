/**
 * 
 */
package com.sickle.service.itf;

import java.util.List;

import com.sickle.pojo.edu.Member;


/**
 * member service
 * 
 * @author chenhao
 *
 */
public interface IMemberService
{

	/**
	 * 根据id获取member对象
	 * 
	 * @param id
	 * @return
	 */
	Member getMemberById(Integer id);
	
	/**
	 * 根据登录名/昵称获取到member对象
	 * 
	 * @param loginName
	 * @return
	 */
	Member getMemberByLoginName(String loginName);
	
	
	/**
	 * 增加member对象
	 * 
	 * @param member
	 * @return
	 * @throws Exception
	 */
	Member addMember(Member member)throws Exception;
	
	/**
	 * 根据id删除member对象
	 * 
	 * @param member
	 * @return
	 * @throws Exception
	 */
	boolean removeMemberById(Integer memberId)throws Exception;
	
	/**
	 * 根据登陆名/昵称删除member对象
	 * 
	 * @param member
	 * @return
	 * @throws Exception
	 */
	boolean removeMemberByLoginName(String loginName)throws Exception;
	
	/**
	 * 修改member对象
	 * 
	 * @param member
	 * @return
	 * @throws Exception
	 */
	Member modifyMember(Member member)throws Exception;
	
	/**
	 * 查找好评比较高的老师
	 * @return
	 * @throws Exception
	 */
	List<Member> getPopularMember() throws Exception;
	
	List<Member> listAllMembers() throws Exception;
	
	List<Member> listMembers( int startindex, int length )throws Exception;
}
