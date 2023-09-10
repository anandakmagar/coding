package singleton;

public class EagerInitializedSingleton02 {
	private static final EagerInitializedSingleton02 instance = new EagerInitializedSingleton02();
	
	private EagerInitializedSingleton02() {
		
	}
	
	public static EagerInitializedSingleton02 getInstance() {
		return instance;
	}
	
	public void doSomething() {
		System.out.println("Doing something");
	}
	
	public static void main(String[] args) {
		EagerInitializedSingleton02 singleton = new EagerInitializedSingleton02();
		singleton.doSomething();
		
	}
}
