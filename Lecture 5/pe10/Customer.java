public class Customer extends Person{
	private static int NUMOFCUSTOMERS;
	private int customerNumber;
	private boolean onMailingList;

	public Customer(String n, String a, String pn) {
		super(n, a, pn);

		customerNumber = NUMOFCUSTOMERS++;
		onMailingList = false;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	public boolean isOnMailingList() {
		return onMailingList;
	}

	public void toggleMailingList() {
		onMailingList ^= true;
	}
}
