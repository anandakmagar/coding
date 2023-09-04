package challenges;

public class IntegerReverse01 {
	public static int reverseInteger(int num) {
		int reversedInteger = 0;
		
		while(num > 0) {
			reversedInteger = reversedInteger*10 + num%10;
			num = num/10;
		}
		
		return reversedInteger;
	}
	public static void main(String[] args) {
		System.out.println(reverseInteger(1234));
	}
}
