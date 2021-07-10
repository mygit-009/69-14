
public class Producer implements Runnable {
	private Container container = null;
	public Producer(Container container) {
		this.container = container;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 30; i++) {
			Hamburger hamburger = new Hamburger(i);
			this.container.push(hamburger);
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
