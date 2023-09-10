package challenges;

import java.util.Arrays;

public class BinarySearch {
	public static int binarySearch(int[] array, int target) {
		int lowIndex = 0;
		int highIndex = array.length - 1;
		
		while(lowIndex <= highIndex) {
			int midIndex = (lowIndex + highIndex)/2;
			
			if(target == array[midIndex]) {
				return midIndex;
			}
			
			if(target < array[midIndex]) {
				highIndex = midIndex - 1;
			}
			
			if(target > array[midIndex]) {
				lowIndex = midIndex + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] array1 = {1, 4, 8, 9};
		System.out.println(Arrays.toString(array1));
		System.out.println("Item: 1  Expected: 0  Output: " + binarySearch(array1, 1));
		System.out.println("Item: 4  Expected: 1  Output: " + binarySearch(array1, 4));
		System.out.println("Item: 8  Expected: 2  Output: " + binarySearch(array1, 8));
		System.out.println("Item: 9  Expected: 3  Output: " + binarySearch(array1, 9));
		
		System.out.println();
		
		int[] array2 = {0, 2, 4, 5, 9};
		System.out.println(Arrays.toString(array2));
		System.out.println("Item: 0  Expected: 0  Output: " + binarySearch(array2, 0));
		System.out.println("Item: 2  Expected: 1  Output: " + binarySearch(array2, 2));
		System.out.println("Item: 4  Expected: 2  Output: " + binarySearch(array2, 4));
		System.out.println("Item: 5  Expected: 3  Output: " + binarySearch(array2, 5));
		System.out.println("Item: 9  Expected: 4  Output: " + binarySearch(array2, 9));
	}
}
