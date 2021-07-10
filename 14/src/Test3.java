
public class Test3 {
	public static void main(String[] args) {
		StopLock stopLock = new StopLock();
		Thread thread1 = new Thread(stopLock,"线程1");
		Thread thread2 = new Thread(stopLock,"线程2");
		thread1.start();
		thread2.start();
		try {
			Thread.currentThread().sleep(1000);
			thread2.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
