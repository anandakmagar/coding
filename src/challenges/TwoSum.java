package challenges;

import java.util.Arrays;

/* 
 * Given an array of integers nums and an integer target, 
 * return the indices of the two numbers such that they add up to the target.

   You may assume that each input would have exactly one solution, 
   and you may not use the same element twice.
 */
public class TwoSum {
	public static int[] twoSum(int[] array, int target) {
		for(int i = 0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i] + array[j] == target) {
					return new int[] {i, j};
				}
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		int[] array = {1, 3, 2, 4, 7};
		
		System.out.println(Arrays.toString(twoSum(array, 7)));
	}
}
