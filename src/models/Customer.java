package models;

public class Customer {
	public Customer() {
		super();
	}

	public int idCustomer;
	public String name;
	
	/**
	 * 
	 * @param idCustomer
	 * @param name
	 */
	public Customer(int idCustomer, String name) {
		super();
		this.idCustomer = idCustomer;
		this.name = name;
	}
	/**
	 * 
	 * @param name
	 */

	public Customer(String name) {
		super();
		this.name = name;
	}
	

	@Override
	public String toString(){
		return ("Customer has id: " + idCustomer + " and name: " + name);
	}
}
