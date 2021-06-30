package Serv;

public class IniThr extends Thread {
	public boolean fa = true;

	@Override
	public void run() {
		while (fa) {

			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if ((!stor.soccc.flagErrSS) && (!stor.soccc.flagErr)) {
				System.out.println(stor.soccc.getT(0));
			} else {
				// System.out.print("Bay")
				System.out.print(stor.soccc.flagErr);
			}
		}
		System.out.print("Bay");

	}

}
