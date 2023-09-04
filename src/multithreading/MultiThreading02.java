package multithreading;

class ThreadClass02 implements Runnable {
	public void run() {
		for(int i = 0; i <= 10; i++) {
			System.out.println(i + " Hello!!");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class MultiThreading02 {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new ThreadClass02());
		Thread thread2 = new Thread(new ThreadClass02());
		
		thread1.start();
		thread2.start();
	}
}
