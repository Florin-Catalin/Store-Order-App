package BLL;

import java.util.ArrayList;
/**
 
 */

import dal.DAO;
import models.Customer;
import models.OrderfHasProduct;
import models.Orderf;
import models.Product;
/**
 * 
 * @author Florin
 *
 */

public class BLOManager {
	public static BLOManager instance;
	
	public static BLOManager instance(){
		if (instance == null){
			instance = new BLOManager();
		}
		return (instance);
	}
	
	/**
	 * 
	 * @param type
	 * @return
	 */
	@SuppressWarnings("unused")
	public BLO getBLO(Class<?> type){
		if (type.toString().equals(Customer.class.toString())){
			 return (CustomerBLO.instance());
		}
		else if (type.toString().equals(Orderf.class.toString())){
			return (OrderfBLO.instance());
		}
		else if (type.toString().equals(OrderfHasProduct.class.toString())){
			return (OrderfHasProductBLO.instance());
		}
		else if (type.toString().equals(Product.class.toString())){
			return (ProductBLO.instance());
		}
		else {
			return (null);
		}
	}
	
}
