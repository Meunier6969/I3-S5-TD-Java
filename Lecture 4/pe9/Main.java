import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// BackwardStringClass();
		WordCounterClass();
	}

	public static void BackwardStringClass() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string:");
		String s = scanner.nextLine();

		BackwardString.displayBackward(s);

		scanner.close();
	}

	public static void WordCounterClass() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string:");
		String s = scanner.nextLine();

		System.out.printf("There are %d word(s).\n", WordCounter.countWord(s));

		scanner.close();

	}
}
