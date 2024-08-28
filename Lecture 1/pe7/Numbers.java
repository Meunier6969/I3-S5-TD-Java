package pe7;

import java.io.File;
import java.util.Scanner;

public class Numbers {
	private double[] numbers;

	Numbers(String filename) {
		try {
			File f = new File(filename);
			Scanner s = new Scanner(f);

			int size = 0;
			while (s.hasNextDouble()) {
				size++;
				s.nextDouble();
			}

			numbers = new double[size];
			s.close();

			s = new Scanner(f);
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = s.nextDouble();
			}

			s.close();
		} catch (Exception e) {
			System.err.println("File not found: " + filename);
			System.exit(1);
		}
	}

	void displayData() {
		double lowest = numbers[0];
		double highest = numbers[0];
		int total = 0;

		for (double number : numbers) {
			if (number < lowest) {
				lowest = number;
			}
			if (number > highest) {
				highest = number;
			}
			total += number;
		}

		double average = (double) total / numbers.length;

		System.out.println("Lowest number: " + lowest);
		System.out.println("Highest number: " + highest);
		System.out.println("Total: " + total);
		System.out.println("Average: " + average);

	}
}
