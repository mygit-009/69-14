
public class Test2 {
	public static void main(String[] args) {
		Account account = new Account();
		Thread thread1 = new Thread(account,"用户A");
		Thread thread2 = new Thread(account,"用户B");
		thread1.start();
		thread2.start();
	}
}
