package data.dao;
// default package

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bean.edu.MClass;

/**
 	* A data access object (DAO) providing persistence and search support for MClass entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .MClass
  * @author MyEclipse Persistence Tools 
 */

public class MClassDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(MClassDAO.class);
		//property constants
	public static final String CLASSTIME = "classtime";
	public static final String CLASSROOM = "classroom";



    
    public void save(MClass transientInstance) {
        log.debug("saving MClass instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(MClass persistentInstance) {
        log.debug("deleting MClass instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public MClass findById( java.lang.Integer id) {
        log.debug("getting MClass instance with id: " + id);
        try {
            MClass instance = (MClass) getSession()
                    .get("MClass", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(MClass instance) {
        log.debug("finding MClass instance by example");
        try {
            List results = getSession()
                    .createCriteria("MClass")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding MClass instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from MClass as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByClasstime(Object classtime
	) {
		return findByProperty(CLASSTIME, classtime
		);
	}
	
	public List findByClassroom(Object classroom
	) {
		return findByProperty(CLASSROOM, classroom
		);
	}
	

	public List findAll() {
		log.debug("finding all MClass instances");
		try {
			String queryString = "from MClass";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public MClass merge(MClass detachedInstance) {
        log.debug("merging MClass instance");
        try {
            MClass result = (MClass) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(MClass instance) {
        log.debug("attaching dirty MClass instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(MClass instance) {
        log.debug("attaching clean MClass instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}