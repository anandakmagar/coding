package challenges;

import java.util.Arrays;

public class ArrayIntegerSort {
	public static int[] sort(int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		int[] array = {3, 2, 1, 9, 7, 8, 5};
		System.out.println(Arrays.toString(sort(array)));
	}
}
