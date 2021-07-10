
public class Test4 {
	public static void main(String[] args) {
		TimeLock timeLock = new TimeLock();
		new Thread(timeLock,"线程1").start();
		new Thread(timeLock,"线程2").start();
	}
}
