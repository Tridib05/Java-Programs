package StringPatterns;

public class AlphabetPattern {
	public static void main(String abc[]) {
		for (int i = 1; i < 10; i++) 
		{
			String strChars = "";
			int alphabet = 97; 
			for (int j = 1; j <= i; j++) {
				strChars = strChars + (char) alphabet + " + ";
				alphabet++;
			}
			System.out.println("(" + strChars.substring(0, strChars.length() - 3) + ")");
		}
	}
}

