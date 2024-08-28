import java.util.Scanner;

public class pe5 {
	public static void main(String[] args) {
		// RectangleArea();
		IsPrimeMethod();
	}

	public static void RectangleArea() {
		double length; // The rectangle's length
		double width; // The rectangle's width
		double area; // The rectangle's area

		Scanner s = new Scanner(System.in);

		// Get the rectangle's length from the user.
		length = getLength(s);
		// Get the rectangle's width from the user.
		width = getWidth(s);
		// Get the rectangle's area.
		area = getArea(length, width);
		// Display the rectangle data.
		displayData(length, width, area);

		s.close();
		System.exit(0);
	}

	public static double getLength(Scanner s) {
		System.out.println("Enter the lenght :");
		double length = s.nextDouble();
		
		return length;
	}

	public static double getWidth(Scanner s) {
		System.out.println("Enter the width :");
		double width = s.nextDouble();

		return width;
	}

	public static double getArea(double length, double width) {
		return length * width;
	}

	public static void displayData(double length, double width, double area) {
		System.out.println("Lenght : " + length);
		System.out.println("Width  : " + width);
		System.out.println("Area   : " + area);
	}

	public static void IsPrimeMethod() {
		for (int i = 1; i <= 25; i++) {
			if (isPrime(i)) {
				System.out.println(i + " is prime.");
			} else {
				System.out.println(i + " is not prime.");
			}
		}
	}

	public static boolean isPrime(int n) {
		if (n <= 3) 
			return n > 1;

		if (n % 2 == 0)
			return false;

		for (int i = 3; i < n/2+1; i+=2) {
			if (n % i == 0)
				return false;
		}

		return true;
	}
}
