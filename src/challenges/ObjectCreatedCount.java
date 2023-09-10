package challenges;

public class ObjectCreatedCount {
	static int counter = 0;
	
	public ObjectCreatedCount() {
		counter++;
	}
	
	public static int count() {
		return counter;
	}
	
	public static void main(String[] args) {
		ObjectCreatedCount c1 = new ObjectCreatedCount();
		ObjectCreatedCount c2 = new ObjectCreatedCount();
		ObjectCreatedCount c3 = new ObjectCreatedCount();
		
		System.out.println(count());
	}
}
