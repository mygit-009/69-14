import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TimeLock implements Runnable {
	public ReentrantLock reentrantLock = new ReentrantLock();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			if(reentrantLock.tryLock(6, TimeUnit.SECONDS)) {
				System.out.println(Thread.currentThread().getName()+"get lock");
				Thread.currentThread().sleep(5000);
			}else {
				System.out.println(Thread.currentThread().getName()+"not lock");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(reentrantLock.isHeldByCurrentThread()) {
				reentrantLock.unlock();
			}
		}
	}

}
