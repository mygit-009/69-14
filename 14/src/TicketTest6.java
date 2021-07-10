
public class TicketTest6 {
	public static void main(String[] args) {
		TicketRunnable ticketRunnable = new TicketRunnable();
		new Thread(ticketRunnable,"窗口1").start();
		new Thread(ticketRunnable,"窗口2").start();
		new Thread(ticketRunnable,"窗口3").start();
	}
}
