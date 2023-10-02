package thread;

public class ThreadDemo {

	public static void main(String[] args) {

		MyThread thread = new MyThread();

		thread.start();

	}

}

class MyThread extends Thread {

	public void run() {
		for (int th = 0; th < 5; th++) {
			System.out.println("Thread " + th);
		}
	}
}
