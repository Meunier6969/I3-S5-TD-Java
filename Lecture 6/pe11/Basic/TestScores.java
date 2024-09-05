public class TestScores {
	public double[] testScores;

	public TestScores(double[] ts) throws IllegalArgumentException {
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
