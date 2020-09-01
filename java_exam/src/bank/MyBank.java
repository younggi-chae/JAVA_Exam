package bank;

public class MyBank {
	
	private Customer[] customer;
	private int customersNum;
	
	public MyBank() {
		customer = new Customer[10];
	}

	public void addCustomer(String id, String name, long balance) {
		customer[customersNum++] = new Customer(id, name, balance);		
	}

	public Customer getCustomer(String id) {
		Customer cust = null;
		for(int i = 0; i< customersNum; i++) {
			if(customer[i].getId().equals(id)) {
				cust = customer[i];
			}
		}
		return cust;
	}

	public Customer[] getAllCustomers() {
		Customer[] newCust = new Customer[customersNum];
		System.arraycopy(customer, 0, newCust, 0, customersNum);
		return newCust;
	}
	
	
	
	
	
	
}
