package challenges;

public class ArrayDuplicates {
	public static void duplicates(int[] array) {
		for(int i = 0; i < array.length; i++) {
			boolean isDuplicate = false;
			for(int j = i+1; j < array.length; j++) {
				if(array[i] == array[j]) {
					isDuplicate = true;
				}
			}
			
			if(isDuplicate) {
				boolean isAlreadyExisted = false;
				for(int k = 0; k < i; k++) {
					if(array[i] == array[k]) {
						isAlreadyExisted = true;
					}
				}
				if(!isAlreadyExisted) {
					System.out.print(array[i] + " ");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1, 3, 2, 1, 7, 6, 4, 5, 3, 2, 1, 4, 3, 2, 1};
		duplicates(array);
	}
}
