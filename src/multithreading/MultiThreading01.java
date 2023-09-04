package multithreading;

class ThreadClass01 extends Thread {
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
public class MultiThreading01 {
	public static void main(String[] args) {
		ThreadClass01 thread1 = new ThreadClass01();
		ThreadClass01 thread2 = new ThreadClass01();
		
		thread1.start();
		thread2.start();
	}
}

