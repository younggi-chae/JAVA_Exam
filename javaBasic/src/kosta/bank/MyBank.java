package kosta.bank;

public class MyBank {

	private Customer[] customer;
	private int customersNum;

	MyBank() {
		customer = new Customer[10];
	}

	public void addCustomer(String id, String name, long balance) {
		// Customer 객체 생성 후 배열에 추가
		customer[customersNum++] = new Customer(id, name, balance);
	}

	public Customer getCustomer(String id) {
		// 아이디에 해당하는 Customer 객체 구하기
		Customer cust = null;

		for (int i = 0; i < customersNum; i++) {
			if (customer[i].getId().equals(id)) {
				cust = customer[i];
				break;
			}
		}
		return cust;

	}

	public Customer[] getAllCustomers() {
		Customer newCustomer[] = new Customer[customersNum];
		//배열의 복사
		System.arraycopy(customer, 0, newCustomer, 0, customersNum);
		return newCustomer;
		}

	public void setCustomer(Customer[] customer) {
		this.customer = customer;
	}

	public int getCustomersNum() {
		return customersNum;
	}

	public void setCustomersNum(int customersNum) {
		this.customersNum = customersNum;
	}

}
