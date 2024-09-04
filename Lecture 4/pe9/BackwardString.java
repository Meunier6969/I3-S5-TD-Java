public class BackwardString {
	public static void displayBackward(String s) {
		StringBuilder backString = new StringBuilder(s.length());
		
		for (int i = s.length() - 1; i >= 0; i--) {
			backString.append(s.charAt(i));
		}

		System.out.println(backString);
	} 	
}
