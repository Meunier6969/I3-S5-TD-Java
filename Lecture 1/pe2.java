import java.util.Scanner;

public class pe2 {
	public static void main(String[] args) {
		// TestAverage();
		RestaurantBill();
	}

	public static double TestAverage() {
		double test1, test2, test3;
		double average;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter score 1 :");
		test1 = s.nextDouble();
		System.out.println("Enter score 2 :");
		test2 = s.nextDouble();
		System.out.println("Enter score 3 :");
		test3 = s.nextDouble();
		
		average = (test1 + test2 + test3) / 3;

		System.out.println("The average is " + average);
		
		s.close();
		return average;
	}

	public static double RestaurantBill() {
		final double TAXAMOUNT = 0.0675;
		final double TIPAMOUNT = 0.2;
		double mealPrice; 
		double finalMealPrice; 
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the price of the meal :");
		mealPrice = s.nextDouble();

		System.out.println("Meal price : " + mealPrice);
		System.out.println("Tax : " + 100*TAXAMOUNT + "%");
		System.out.println("Tip : " + 100*TIPAMOUNT + "%");
		
		finalMealPrice = mealPrice * (1+TAXAMOUNT) * (1+TIPAMOUNT);
		
		System.out.println("----------");
		System.out.println("Final price : " + finalMealPrice);

		s.close();

		return finalMealPrice;
	}
}