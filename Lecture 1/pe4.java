import java.util.Random;
import java.util.Scanner;

public class pe4 {
	public static void main(String[] args) {
		// DistanceTraveled();
		// CelsiustoFahrenheitTable();
		DiceGame();
	}	

	public static void DistanceTraveled() {
		Scanner s = new Scanner(System.in);
		int speed;
		int time;

		// speed > 0
		do {
			System.out.println("Enter the speed :");
			speed = s.nextInt();
		} while (speed <= 0);
		
		// time > 1
		do {
			System.out.println("Enter the time :");
			time = s.nextInt();
		} while (time < 1);

		System.out.println("Hour\tDistance");
		System.out.println("----------------");
		for (int i = 1; i <= time; i++) {
			System.out.printf("%d\t%8d\n", i, i*speed);
		}

		s.close();
	}
	
	public static void CelsiustoFahrenheitTable() {
		System.out.println("Celcius\tFahrenheit");
		System.out.println("----------------------");
		for (double i = 0.0; i <= 20; i++) {

			System.out.printf("%.0f\t%.1f\n", i, 1.8*i+32);
		
		}
	}

	public static void DiceGame() {
		Random r = new Random();
		int computerDiceValue;
		int userDiceValue;

		int computerWinCount = 0;
		int userWinCount = 0;
		
		for (int i = 0; i < 20; i++) {
			computerDiceValue = r.nextInt(6) + 1;
			userDiceValue = r.nextInt(6) + 1;

			System.out.printf("Computer : %d, User : %d\t", computerDiceValue, userDiceValue);
			if (computerDiceValue > userDiceValue) {
				System.out.println("The computer won !");
				computerWinCount++;
			} else if (computerDiceValue < userDiceValue) {
				System.out.println("The user won !");
				userWinCount++;
			} else {
				System.out.println("It's a tie !");
			}
		}

		System.out.printf("Computer has %d points, user has %d.\n", computerWinCount, userWinCount);
		if (computerWinCount > userWinCount) {
			System.out.println("The grand winner is the computer !");
		} else if (computerWinCount < userWinCount) {
			System.out.println("The grand winner is the user !");
		} else {
			System.out.println("It's a tie...");
		}
	}
}
