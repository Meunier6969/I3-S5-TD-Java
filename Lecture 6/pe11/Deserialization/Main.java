import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main {
	public static void main(String[] args) {
		try {
			TestScoresDeserialization();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void TestScoresDeserialization() throws IOException, ClassNotFoundException {
		TestScoresforSerialization testScores = null;

		FileInputStream fis = new FileInputStream("../scores.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		testScores = (TestScoresforSerialization) ois.readObject();
		System.out.println("Test Scores have been deserialized.");

		System.out.println("The scores are :");
		for (double d : testScores.testScores) {
			System.out.println(d);
		}
		System.out.printf("The average is : %f.\n", testScores.averageScores());

		ois.close();
		fis.close();
	}
}
