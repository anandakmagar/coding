package challenges;

public class ArrayLowestInteger {
	public static int findLowest(int[] array) {
		int lowest = array[0];
		
		for(int i = 1; i < array.length; i++) {
			if(lowest > array[i]) {
				lowest = array[i];
			}
		}
		return lowest;
	}
	
	public static void main(String[] args) {
		int[] array = {3, 1, 4, 5, 5, 9};
		System.out.println("The lowest integer in the given array is " + findLowest(array));
	}
}
