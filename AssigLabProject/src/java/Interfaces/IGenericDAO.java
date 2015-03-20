package Interfaces;



import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author rania
 * 
 */
public interface IGenericDAO extends Serializable {

	public Session getSession();

	public void beginTransaction();

	public void commit();

	public void evict(Object e);

	public void rollBack();

	public Transaction getTransaction();

	public Serializable save(Object obj);

	public void update(Object obj);

	public void close();

	public void saveOrUpdate(Object obj);

	public void delete(Object obj);

}
