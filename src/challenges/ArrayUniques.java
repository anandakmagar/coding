package challenges;

public class ArrayUniques {
	public static void uniques(int[] array) {
		for(int i = 0; i < array.length; i++) {
			boolean isUnique = true;
			for(int j = 0; j < array.length; j++) {
				if(i != j && array[i] == array[j]) {
					isUnique = false;
				}
			}
			
			if(isUnique) {
				System.out.print(array[i] + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1, 3, 2, 1, 4, 3, 8, 5};
		uniques(array);
	}
}
