public class Person {
	private String name;
	private String address;
	private String phoneNumber;

	public Person(String n, String a, String pn) {
		this.name = n;
		this.address = a;
		this.phoneNumber = pn;
	}

	public String getAddress() {
		return address;
	}
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
