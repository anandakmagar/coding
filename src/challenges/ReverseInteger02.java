package challenges;

public class ReverseInteger02 {
	public static int reverseInteger(int num) {
		String numString = Integer.toString(num);
		
		String reversedNumString = "";
		for(int i = numString.length() - 1; i >= 0; i--) {
			reversedNumString = reversedNumString + numString.charAt(i);
		}
		
		return Integer.parseInt(reversedNumString);
	}
	
	public static void main(String[] args) {
		System.out.println(reverseInteger(1234));
	}
}
