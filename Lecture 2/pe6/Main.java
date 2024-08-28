import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// CircleClass();
		TestScoresClass();
	}	

	public static void CircleClass() {
		double radius;
		Circle c = new Circle();
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a radius : ");
		radius = s.nextDouble();

		c.setRadius(radius);

		System.out.println("Radius : " + c.getRadius());
		System.out.println("Area : " + c.getArea());
		System.out.println("Diameter : " + c.getDiameter());
		System.out.println("Circumference : " + c.getCircumference());

		s.close();
	}

	public static void TestScoresClass() {
		Scanner s = new Scanner(System.in);

		double s1, s2, s3;

		System.out.println("Enter the first test score : ");
		s1 = s.nextDouble();
		System.out.println("Enter the second test score : ");
		s2 = s.nextDouble();
		System.out.println("Enter the third test score : ");
		s3 = s.nextDouble();
		
		TestScore ts = new TestScore(s1, s2, s3);

		System.out.println("The average is : " + ts.getAverage());
	}
}
