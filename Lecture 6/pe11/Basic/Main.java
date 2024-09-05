import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		TestScoresClass();
	}

	public static void TestScoresClass() {
		Scanner s = new Scanner(System.in);

		int numOfScores;
		double[] scores;

		System.out.println("How many scores to add ?");
		numOfScores = s.nextInt();

		scores = new double[numOfScores];

		for (int i = 0; i < numOfScores; i++) {
			System.out.printf("Enter the score %d : ", i);
			scores[i] = s.nextDouble();
		}

		TestScores testScores = new TestScores(scores);

		System.out.printf("The average of the scores is %f.\n", testScores.averageScores());

		s.close();
	}
}
