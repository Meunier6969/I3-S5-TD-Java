import java.util.Scanner;

public class pe3 {
	public static void main(String[] args) {
		// SortedNames();
		BankCharges();
	}	

	public static void SortedNames() {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the first name :");
		String name1 = s.nextLine();
		System.out.println("Enter the second name :");
		String name2 = s.nextLine();
		System.out.println("Enter the third name :");
		String name3 = s.nextLine();

		// oh god why.
		if (name1.compareToIgnoreCase(name2) <= 0 && name1.compareToIgnoreCase(name3) <= 0) {
			System.out.println(name1);
			if (name2.compareToIgnoreCase(name3) <= 0) {
				System.out.println(name2);
				System.out.println(name3);
			} else {
				System.out.println(name3);
				System.out.println(name2);
			}
		} else if (name1.compareToIgnoreCase(name2) <= 0 && name1.compareToIgnoreCase(name3) >= 0) {
			System.out.println(name3);
			System.out.println(name1);
			System.out.println(name2);
		} else if (name1.compareToIgnoreCase(name2) >= 0 && name1.compareToIgnoreCase(name3) <= 0) {
			System.out.println(name2);
			System.out.println(name1);
			System.out.println(name3);
		} else {
			if (name2.compareToIgnoreCase(name3) <= 0) {
				System.out.println(name2);
				System.out.println(name3);
			} else {
				System.out.println(name3);
				System.out.println(name2);
			}
			System.out.println(name1);
		}
	
	s.close();
	}

	public static void BankCharges() {
		int numOfChecks; 
		int bankFee = 10;

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of checks :");
		numOfChecks = s.nextInt();

		if (numOfChecks < 20) {
			bankFee += 0.1 * numOfChecks;
		} else if (numOfChecks < 40) {
			bankFee += 0.08 * numOfChecks;
		} else if (numOfChecks < 60) {
			bankFee += 0.06 * numOfChecks;
		} else {
			bankFee += 0.04 * numOfChecks;
		}

		System.out.println("The bank fee for the month is " + bankFee);

		s.close();
	}
}
