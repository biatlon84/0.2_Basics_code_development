package thread1;

public class Main {
	public static void main(String[] args) {
		int qw = 0;
		Threadddd thread = new Threadddd();
		scann r = new scann();
		thread.start();
		while (true) {
			qw = r.s(3);

			thread.f = qw;
		}
	}

}
