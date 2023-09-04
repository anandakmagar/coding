package challenges;

public class ArrayDistincts {
	public static void distincts(int[] array) {
		for(int i = 0; i < array.length; i++) {
			boolean isDistinct = true;
			for(int j = i+1; j < array.length; j++) {
				if(array[i] == array[j]) {
					isDistinct = false;
				}
			}
			
			if(isDistinct) {
				System.out.print(array[i] + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1, 3, 2, 1, 4, 5, 3, 4, 5, 9};
		distincts(array);
	}
}
