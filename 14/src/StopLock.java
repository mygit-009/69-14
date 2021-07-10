import java.util.concurrent.locks.ReentrantLock;

public class StopLock implements Runnable{
	
	private ReentrantLock reentrantLock = new ReentrantLock();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			reentrantLock.lockInterruptibly();
			System.out.println(Thread.currentThread().getName()+"get lock");
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			reentrantLock.unlock();
		}
	}

}
