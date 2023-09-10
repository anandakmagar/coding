package challenges;

/*
 * Prime Number: a positive integer greater than 1 that cannot be divided by the numbers other than itself
 */
public class IsPrime {
	public static boolean isPrime(int num) {
		if(num < 2) {
			return false;
		}
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isPrime(1));
		System.out.println(isPrime(2));
		System.out.println(isPrime(7));
		System.out.println(isPrime(13));
		System.out.println(isPrime(20));
	}
}
