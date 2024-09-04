import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String name;
		String address;
		String phoneNumber;
		
		do {
			System.out.println("Enter a name : ");
			name = s.nextLine();
			System.out.println("Enter an address : ");
			address = s.nextLine();
			System.out.println("Enter a phone number : ");
			phoneNumber = s.nextLine();
	
			Customer customer = new Customer(name, address, phoneNumber);
	
			System.out.println("Do you want to be on the mailing list ? (y/N)");
			if (Character.toLowerCase(s.nextLine().charAt(0)) == 'y') { // hehe
				customer.toggleMailingList();
			}
	
			System.out.printf("Name : %s\n", customer.getName());
			System.out.printf("Address : %s\n", customer.getAddress());
			System.out.printf("Phone Number : %s\n", customer.getPhoneNumber());
			System.out.printf("Customer ID : %s\n", customer.getCustomerNumber());
			System.out.printf("On mailing list : %s\n", customer.isOnMailingList());

			System.out.println("Do you wish to create a new customer ? (y/N)");
		} while (Character.toLowerCase(s.nextLine().charAt(0)) == 'y');


		s.close();
	}
}