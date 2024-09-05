import java.io.Serializable;

public class TestScoresforSerialization implements Serializable {
	public double[] testScores;

	public TestScoresforSerialization(double[] ts) throws IllegalArgumentException {
		testScores = ts;

		for (double d : testScores) {
			if (d < 0 || d > 100)
				throw new IllegalArgumentException();
		}
	}

	public double averageScores() {
		double total = 0;
	
		for (double d : testScores) {
			total += d;
		}
		
		return total/testScores.length;
	}

	

}
