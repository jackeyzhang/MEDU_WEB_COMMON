/**
 * 
 */
package com.sickle.dao;

import java.util.List;

import org.hibernate.Query;

import com.sickle.dao.support.HibernateSupport;
import com.sickle.pojo.edu.Member;
import com.sickle.service.itf.IMemberService;

/**
 * 老师dao服务
 * 
 * @author chenhao
 * 
 */
public class MemberDaoService extends HibernateSupport<Member> implements
		IMemberService {

	@Override
	public Member getMemberById(Integer id) {
		Query query = getSession().createQuery("from Member where id = ? ");
		query.setInteger(0, id);
		if (query.list() == null || query.list().size() == 0) {
			return null;
		}
		return (Member) query.list().get(0);
	}

	@Override
	public Member addMember(Member member) {
		return this.save(member);
	}

	@Override
	public Member modifyMember(Member member) {
		return this.update(member);
	}

	@Override
	public boolean removeMemberById(Integer memberid) throws Exception {
		Member member = getMemberById(memberid);
		try {
			delete(member);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@Override
	public boolean removeMemberByLoginName(String memberName)
			throws Exception {
		Member member = getMemberByLoginName(memberName);
		try {
			delete(member);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@Override
	public Member getMemberByLoginName(String name) {
		Query query = getSession().createQuery("from Member where name = ? or email = ? ");
		query.setString(0, name);
		query.setString(1, name);
		if (query.list() == null || query.list().size() == 0) {
			return null;
		}
		return (Member) query.list().get(0);
	}

	@Override
	public List<Member> getPopularMember() throws Exception {
		String hql = "from Member";
		Query query = getSession().createQuery(hql);
		query.setFirstResult(1);
		query.setMaxResults(10);
		@SuppressWarnings("unchecked")
		List<Member> ls = query.list();
		return ls;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Member> listAllMembers( ) throws Exception
	{
		Query query = getSession().createQuery("from Member");
		if (query.list() == null || query.list().size() == 0) {
			return null;
		}
		return query.list();
	}

	@Override
	public List<Member> listMembers( int startindex, int length )
			throws Exception
	{
		String hql = "from Member";
		Query query = getSession().createQuery(hql);
		query.setFirstResult(startindex);
		query.setMaxResults(length);
		@SuppressWarnings("unchecked")
		List<Member> ls = query.list();
		return ls;
	}

}
