package BLL;

import models.OrderfHasProduct;
/**
 * 
 * @author Florin
 *
 */
public class OrderfHasProductBLO extends BLO<OrderfHasProduct>{
	
	private static OrderfHasProductBLO instance;
	/**
	 * 
	 * @return the instance of OrderfHasProductBlo
	 */
	public static OrderfHasProductBLO instance(){
		if (instance == null){
			instance = new OrderfHasProductBLO();
		}
		return (instance);
	}
}
