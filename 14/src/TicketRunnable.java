
public class TicketRunnable implements Runnable {
	//剩余的火车票
	public int scount = 15;
	//已售出的火车票
	public int ocount = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(scount>0) {
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(scount == 0) {
				return;
			}
			synchronized (TicketRunnable.class) {
				scount--;
				ocount++;
				if(scount == 0) {
					System.out.println(Thread.currentThread().getName()+"售出了第"+ocount+"张火车票，火车票已售完");
				}else {
					System.out.println(Thread.currentThread().getName()+"售出了第"+ocount+"张火车票，剩余"+scount+"张火车票");
				}
			}
		}
	}
	
}
