
public class Test {
	public static void main(String[] args) {
		DeadLockRunnable deadLockRunnable1 = new DeadLockRunnable();
		deadLockRunnable1.num=1;
		DeadLockRunnable deadLockRunnable2 = new DeadLockRunnable();
		deadLockRunnable2.num=2;
		Thread thread = new Thread(deadLockRunnable1,"张三");
		Thread thread2 = new Thread(deadLockRunnable2,"李四");
		thread.start();
//		try {
//			Thread.currentThread().sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		thread2.start();
	}
}
