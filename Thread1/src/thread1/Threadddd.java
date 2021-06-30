package thread1;

public class Threadddd extends Thread {
	public int f = 0;

	@Override
	public void run() {
		while (true) {

			try {
				Thread.currentThread().sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(f);
		}

	}
}
