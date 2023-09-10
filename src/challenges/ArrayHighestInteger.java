package challenges;

public class ArrayHighestInteger {
	public static int findHighest(int[] array) {
		int highest = array[0];
		
		for(int i = 1; i < array.length; i++) {
			if(highest < array[i]) {
				highest = array[i];
			}
		}
		return highest;
	}
	
	public static void main(String[] args) {
		int[] array = {1, 3, 5, 2, 5, 39, 44, 23, 40};
		System.out.println("The highest integer in the given array is " + findHighest(array));
	}
}
