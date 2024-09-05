import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) {
		try {
			TestScoresModificationforSerialization();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void TestScoresModificationforSerialization() throws IOException {
		
		double[] scores = {50, 75, 82, 93, 95, 98, 100};
		TestScoresforSerialization testScores = new TestScoresforSerialization(scores);

		FileOutputStream fos = new FileOutputStream("../scores.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(testScores);
		System.out.println("Test Scores has been serialized.");

		oos.close();
		fos.close();
	}
}
