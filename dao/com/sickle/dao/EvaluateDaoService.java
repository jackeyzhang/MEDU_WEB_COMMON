/**
 * 
 */
package com.sickle.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.sickle.dao.support.HibernateSupport;
import com.sickle.pojo.website.Evaluate;
import com.sickle.service.itf.IEvaluateService;

/**
 * @author wangzhenhua
 * 
 */
public class EvaluateDaoService extends HibernateSupport<Evaluate> implements
		IEvaluateService {

	@SuppressWarnings("unchecked")
	@Override
	public Evaluate getEvaluateById(Long id) {
		Session session = getSession();
		Query query = session.createQuery("from Evaluate where id = ? ");
		query.setLong(0, id);
		List<Evaluate> list = query.list();
		if (list == null || list.size() == 0) {
			return null;
		}
		session.close();
		return list.get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Evaluate> getEvaluateByOrgId(Integer userid) {
		Session session = getSession();
		Query query = session.createQuery( "from Evaluate where org = ? " );
		query.setInteger( 0, userid );
		List<Evaluate> list = query.list();
		if (list == null || list.size() == 0) {
			return null;
		}
		session.close( );
		return list;
	}

	@Override
	public Evaluate addEvaluate(Evaluate evaluate) {
		return this.save(evaluate);
	}

	@Override
	public Evaluate modifyEvaluate(Evaluate evaluate) {
		return this.update(evaluate);
	}

	@Override
	public boolean removeEvaluateById(Long evaluateid) throws Exception {
		Evaluate evaluate = getEvaluateById(evaluateid);
		try {
			delete(evaluate);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
