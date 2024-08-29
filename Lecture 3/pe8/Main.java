import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		LandTractClass();
	}

	public static void LandTractClass() {
		double lenght1, width1;
		double lenght2, width2;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the dimensions of the first land tract :");
		System.out.print("Lenght : ");
		lenght1 = s.nextDouble();
		System.out.print("Width : ");
		width1 = s.nextDouble();
		
		System.out.println("Enter the dimensions of the second land tract :");
		System.out.print("Lenght : ");
		lenght2 = s.nextDouble();
		System.out.print("Width : ");
		width2 = s.nextDouble();
		
		LandTract l1 = new LandTract(lenght1, width1);
		LandTract l2 = new LandTract(lenght2, width2);

		System.out.println("Land tract 1 :");
		System.out.println(l1);
		System.out.println("Land tract 2 :");
		System.out.println(l2);

		if (l1.equals(l2)) {
			System.out.println("The land tract are the same size.");
		} else {
			System.out.println("The land tract are not the same size.");
		}

		s.close();
	}
}
