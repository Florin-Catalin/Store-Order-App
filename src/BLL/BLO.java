package BLL;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;

import dal.DAO;
import presentation.Action;
/**
 * 
 * @author Florin
 * Business layer 
 * @param <T>
 */
public abstract class BLO<T> {
	
	public boolean applyAction(Action action, T t){
		switch (action){
		case INSERT : insert (t); return true;
		case UPDATE : update (t); return true;
		case DELETE : delete (t); return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param t
	 * @return
	 */
	public int insert(T t){
		if (t == null) return (-1);
		return (DAO.instance().insert(t));
	}
	/**
	 * 
	 * @param t
	 * @return
	 */
	
	public boolean delete(T t){
		if (t == null) return (false);
		return (DAO.instance().delete(t));
	}
	/**
	 * 
	 * @return
	 */
	
	@SuppressWarnings("unchecked")
	public ArrayList<T> selectAll(){
		return (ArrayList<T>) (DAO.instance().selectAll(((Class<?>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0])));
	}
	/**
	 * 
	 * @param t
	 * @return
	 */
	public boolean update(T t){
		if (t == null) return (false);
		return (DAO.instance().update(t));
	}
	/**
	 * 
	 * @param t
	 * @return
	 */
	
	@SuppressWarnings("unchecked")
	public T findById(T t){
		if (t == null) return (null);
		return ((T)DAO.instance().findById(t));
	}
	/**
	 * 
	 * @param t
	 * @return
	 */
	
	public boolean exists(T t){
		return (findById(t) != null);
	}
	
}
