package challenges;

public class StringReverse {
	public static String reverseString(String s) {
		String reversedString = "";
		
		for(int i = s.length() - 1; i >= 0; i--) {
			reversedString = reversedString + s.charAt(i);
		}
		
		return reversedString;
	}
	public static void main(String[] args) {
		System.out.println(reverseString("America"));
	}
}
