/**
 * 
 */
package com.sickle.dao;

import java.util.List;

import org.hibernate.Query;

import com.sickle.dao.support.HibernateSupport;
import com.sickle.pojo.edu.Teacher;
import com.sickle.service.itf.ITeacherService;

/**
 * 老师dao服务
 * 
 * @author chenhao
 * 
 */
public class TeacherDaoService extends HibernateSupport<Teacher> implements
		ITeacherService {

	@Override
	public Teacher getTeacherById(Integer id) {
		Query query = getSession().createQuery("from Teacher where id = ? ");
		query.setInteger(0, id);
		if (query.list() == null || query.list().size() == 0) {
			return null;
		}
		return (Teacher) query.list().get(0);
	}

	@Override
	public Teacher addTeacher(Teacher teacher) {
		return this.save(teacher);
	}

	@Override
	public Teacher modifyTeacher(Teacher teacher) {
		return this.update(teacher);
	}

	@Override
	public boolean removeTeacherById(Integer teacherid) throws Exception {
		Teacher teacher = getTeacherById(teacherid);
		try {
			delete(teacher);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@Override
	public boolean removeTeacherByLoginName(String teacherName)
			throws Exception {
		Teacher teacher = getTeacherByLoginName(teacherName);
		try {
			delete(teacher);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@Override
	public Teacher getTeacherByLoginName(String name) {
		Query query = getSession().createQuery("from Teacher where name = ? ");
		query.setString(0, name);
		if (query.list() == null || query.list().size() == 0) {
			return null;
		}
		return (Teacher) query.list().get(0);
	}

	@Override
	public List<Teacher> getPopularTeacher() throws Exception {
		String hql = "from Teacher";
		Query query = getSession().createQuery(hql);
		query.setFirstResult(1);
		query.setMaxResults(10);
		@SuppressWarnings("unchecked")
		List<Teacher> ls = query.list();
		return ls;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Teacher> listAllTeachers( ) throws Exception
	{
		Query query = getSession().createQuery("from Teacher");
		if (query.list() == null || query.list().size() == 0) {
			return null;
		}
		return query.list();
	}

	@Override
	public List<Teacher> listTeachers( int startindex, int length )
			throws Exception
	{
		String hql = "from Teacher";
		Query query = getSession().createQuery(hql);
		query.setFirstResult(startindex);
		query.setMaxResults(length);
		@SuppressWarnings("unchecked")
		List<Teacher> ls = query.list();
		return ls;
	}

}
