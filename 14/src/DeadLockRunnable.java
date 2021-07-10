
public class DeadLockRunnable implements Runnable {
	
	public int num;
	private static Chopsticks chopsticks1 = new Chopsticks();
	private static Chopsticks chopsticks2 = new Chopsticks();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(num == 1) {
			System.out.println(Thread.currentThread().getName()+"获取到chopsticks1,等待获取chopsticks2");
			synchronized (chopsticks1) {
				try {
					Thread.currentThread().sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (chopsticks2) {
					System.out.println(Thread.currentThread().getName()+"用餐完毕");
				}
			}
		}
		
		if(num == 2) {
			System.out.println(Thread.currentThread().getName()+"获取到chopsticks2,等待获取chopsticks1");
			synchronized (chopsticks2) {
				try {
					Thread.currentThread().sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (chopsticks1) {
					System.out.println(Thread.currentThread().getName()+"用餐完毕");
				}
			}
		}
		
	}

}
