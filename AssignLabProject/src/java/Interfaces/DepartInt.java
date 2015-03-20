package Interfaces;


import Pojo.*;
import java.util.List;



/**
 * @author JETS_ITI
 * @version 1.0
 * @created 19-Mar-2015 10:55:46 AM
 */
public interface DepartInt {

	

	/**
	 * 
	 * @param Obj
	 */
	public abstract int create(Department  Obj);

	/**
	 * 
	 * @param Obj
	 */
	public abstract int deactivate(Department  Obj);

	/**
	 * 
	 * @param Obj
     * @return 
	 */
	public int delete(Department Obj);
	

	public List GetAllDepartActive();
	

	public List GetAllDepartDeactive();
	

	public List GetOneDepartActive();
	
	/**
	 * 
	 * @param Obj
	 */
	public List GetOneDepartDeactive(Department  Obj);
	

	/**
	 * 
	 * @param Obj
	 */
	public abstract int update(Department  Obj);

}