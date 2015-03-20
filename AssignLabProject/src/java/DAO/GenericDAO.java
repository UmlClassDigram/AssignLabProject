package DAO;

/**
 * 
 */


import DAO.HibernateUtil;
import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 * @author rania
 *
 */
public class GenericDAO{
	
	private Session session;
	
	@SuppressWarnings("unchecked")
        public void setSession(Session s) {
            session=HibernateUtil.getSessionFactory().openSession();
        }

	/* (non-Javadoc)
	 * @see com.ibm.event.daos.interfaces.IGenericDAO#beginTransaction()
	 */
	
	public void beginTransaction() {
		getSession().beginTransaction();
	}

	/* (non-Javadoc)
	 * @see com.ibm.event.daos.interfaces.IGenericDAO#close()
	 */
	
	public void close() {
		getSession().close();
	}

	/* (non-Javadoc)
	 * @see com.ibm.event.daos.interfaces.IGenericDAO#commit()
	 */
	
	public void commit() {
		getSession().getTransaction().commit();
	}

	/* (non-Javadoc)
	 * @see com.ibm.event.daos.interfaces.IGenericDAO#evict(java.lang.Object)
	 */
	
	public void evict(Object e) {
		getSession().evict(e);
	}

	/* (non-Javadoc)
	 * @see com.ibm.event.daos.interfaces.IGenericDAO#getSession()
	 */
	
	public Session getSession() {
	           session = HibernateUtil.getSessionFactory().getCurrentSession();
	       return session;
	}

	/* (non-Javadoc)
	 * @see com.ibm.event.daos.interfaces.IGenericDAO#getTransaction()
	 */
	
	public Transaction getTransaction() {
		return getSession().getTransaction();
	}

	/* (non-Javadoc)
	 * @see com.ibm.event.daos.interfaces.IGenericDAO#rollBack()
	 */
	
	public void rollBack() {
		getSession().getTransaction().rollback();
	}

	/* (non-Javadoc)
	 * @see com.ibm.event.daos.interfaces.IGenericDAO#save(java.lang.Object)
	 */
	
	public Serializable save(Object obj) {
		return getSession().save(obj);
	}

	/* (non-Javadoc)
	 * @see com.ibm.event.daos.interfaces.IGenericDAO#saveOrUpdate(java.lang.Object)
	 */
	
	public void saveOrUpdate(Object obj) {
		getSession().saveOrUpdate(obj);
	}

	/* (non-Javadoc)
	 * @see com.ibm.event.daos.interfaces.IGenericDAO#update(java.lang.Object)
	 */
	
	public void update(Object obj) {
		getSession().update(obj);
	}

	/* (non-Javadoc)
	 * @see com.ibm.event.daos.interfaces.IGenericDAO#delete(java.lang.Object)
	 */
	
	public void delete(Object obj) {
		getSession().delete(obj);
		
	}
        
	public void persist(Object obj) {
		getSession().persist(obj);
		
	}
	

}
