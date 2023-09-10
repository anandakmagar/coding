package challenges;

import java.util.Arrays;

/*
 * Anagram: a word can be anagram of another word when the first contains 
 * all the letters of the second word without being repeated
 */
public class IsAnagram {
	public static boolean isAnagram(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		
		// Sorting the str1's characters in alphabetical order
		char[] characters1 = str1.toLowerCase().toCharArray();
		for(int i = 0; i < characters1.length; i++) {
			for(int j = i+1; j < characters1.length; j++) {
				if(characters1[i] > characters1[j]) {
					char temp = characters1[i];
					characters1[i] = characters1[j];
					characters1[j] = temp;
				}
			}
		}
		
		// Sorting the str2's characters in alphabetical order
		char[] characters2 = str2.toLowerCase().toCharArray();
		for(int i = 0; i < characters2.length; i++) {
			for(int j = i+1; j < characters2.length; j++) {
				if(characters2[i] > characters2[j]) {
					char temp = characters2[i];
					characters2[i] = characters2[j];
					characters2[j] = temp;
				}
			}
		}
		
		if(Arrays.equals(characters1, characters2)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(isAnagram("smile", "sm"));
		System.out.println(isAnagram("Listen", "Silent"));
	}
}
