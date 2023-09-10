package challenges;

public class LongestPrefix {
	public static String longestPrefix(String[] array) {
		String longestPrefix = "";
		String shortestString = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(array[i].length() < shortestString.length()) {
				shortestString = array[i];
			}
		}
		
		int counter = 0;
		for(int j = 0; j < shortestString.length(); j++) {
			for(int k = 0; k < array.length; k++) {
				if(shortestString.charAt(j) == array[k].charAt(j)) {
					counter++;
				}
			}
			if(counter == array.length) {
				longestPrefix = longestPrefix + shortestString.charAt(j);
				counter = 0;
			}
		}
		
		if(longestPrefix.length() == 0) {
			return "No common prefix found";
		}
		else {
			return longestPrefix;
		}
	}
	
	public static void main(String[] args) {
		String[] array = {"Flow", "Fly", "Flower", "Flood"};
		System.out.println(longestPrefix(array));
	}
}
