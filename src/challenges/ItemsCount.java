package challenges;

public class ItemsCount {
	public static int count(int[] array) {
		
		int counter = 0;
		
		for(int i = 0; i < array.length; i++) {
			counter++;
		}
		
		return counter;
	}
	
	public static void main(String[] args) {
		
		int[] array = {1, 3, 2, 8, 7, 9, 10};
		
		System.out.println(count(array));
	}
}
