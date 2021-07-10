import java.util.concurrent.locks.ReentrantLock;

public class Account implements Runnable {
	private static int num;
	private ReentrantLock reentrantLock = new ReentrantLock();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		reentrantLock.lock();
		reentrantLock.lock();
		num++;
		System.out.println(Thread.currentThread().getName()+"是当前的第"+num+"位访问");
		reentrantLock.unlock();
		reentrantLock.unlock();
	}

}
