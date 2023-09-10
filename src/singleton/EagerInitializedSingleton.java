package singleton;

public class EagerInitializedSingleton {
	// Instance of the singleton class during loading
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
	// Private constructor to protect the initialization from other classes
	private EagerInitializedSingleton() {	
	}
	
	// Public method to get the instance of the singleton class
	public static EagerInitializedSingleton getInstance() {
		return instance;
	}
	
	// Additional methods 
	public void doSomething() {
		System.out.println("Doing something");
	}
	
	public static void main(String[] args) {
		EagerInitializedSingleton singleton = EagerInitializedSingleton.getInstance();
		singleton.doSomething();
	}
}
