package Serv;

public class IniT extends Thread {
	public boolean fa = true;

	@Override
	public void run() {
		// int iii = 0;
		stor.soccc.Sockini();
		while (fa) {
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			stor.soccc.ClCon();
		}
		System.out.print("!!!");

	}

}
