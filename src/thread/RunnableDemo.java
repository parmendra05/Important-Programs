package thread;

public class RunnableDemo {

	public static void main(String[] args) {

		Thread th = new Thread(new MyRunnable());

		th.start(); // Recommended way to achieve multithreading

		th.run();
		/*
		 * calling run() directly, it simply executes the code within the run() method
		 * in the current thread, without starting a new thread. so it won't achieve
		 * multithreading.
		 * 
		 * When you invoke start() on a Thread object, it tells the Java Virtual Machine
		 * (JVM) to start a new thread of execution, and the run() method of that thread
		 * is called in a separate thread.
		 */

	}

}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int th = 0; th < 50; th++) {
			System.out.println("Thread " + th);
		}

	}
}
