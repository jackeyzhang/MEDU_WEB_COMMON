package data.dao;
// default package

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bean.edu.Payment;

/**
 	* A data access object (DAO) providing persistence and search support for Payment entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .Payment
  * @author MyEclipse Persistence Tools 
 */

public class PaymentDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(PaymentDAO.class);
		//property constants
	public static final String PAYED = "payed";
	public static final String PAYWAY = "payway";



    
    public void save(Payment transientInstance) {
        log.debug("saving Payment instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Payment persistentInstance) {
        log.debug("deleting Payment instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Payment findById( java.lang.Integer id) {
        log.debug("getting Payment instance with id: " + id);
        try {
            Payment instance = (Payment) getSession()
                    .get("Payment", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Payment instance) {
        log.debug("finding Payment instance by example");
        try {
            List results = getSession()
                    .createCriteria("Payment")
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
      log.debug("finding Payment instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Payment as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByPayed(Object payed
	) {
		return findByProperty(PAYED, payed
		);
	}
	
	public List findByPayway(Object payway
	) {
		return findByProperty(PAYWAY, payway
		);
	}
	

	public List findAll() {
		log.debug("finding all Payment instances");
		try {
			String queryString = "from Payment";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Payment merge(Payment detachedInstance) {
        log.debug("merging Payment instance");
        try {
            Payment result = (Payment) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Payment instance) {
        log.debug("attaching dirty Payment instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Payment instance) {
        log.debug("attaching clean Payment instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}