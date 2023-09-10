package challenges;

import java.util.Arrays;

public class ArrayStringSort {
	public static String[] sort(String[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i].compareTo(array[j]) > 0) {
					String temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		String[] array = {"Spring", "Winter", "Fall", "Summer"};
		System.out.println(Arrays.toString(sort(array)));
	}
}
