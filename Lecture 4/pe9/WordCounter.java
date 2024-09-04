public class WordCounter {
	static int countWord(String s) {
		String[] tokenizedString = s.split(" ");
		return tokenizedString.length;
	}
}
