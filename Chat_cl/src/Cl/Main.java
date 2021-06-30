package Cl;

public class Main {

	public static void main(String args[]) {
		String ss;
		boolean w = true;
		int a = 1;
		Soc sck = new Soc();// create socket
		store.soccc = sck;// copy object "socket" to store
		IniThr th = new IniThr();
		// th.fa = true;
		th.start(); // start anther thread for initialization
		// client socket and checking for coming messages
		while (w) {
			scann sc = new scann();
			System.out.println("Do you want to try again? Type 1-Yes 2-exit");
			a = sc.s(3);

			if (a == 2) {// set flag to the false in the end
				// th.stop(); //deprecated expression
				th.fa = false;
				store.soccc.down();
			}

			if (a == 1) {
				store.soccc.Check();
				if (!sck.flagErr) { // Checking flag in object
					System.out.println("Type your messege");
					ss = sc.str(40);
					sck.sendT(ss);// typing message and send it if flag false
					// System.out.println(ss);
					// sck.sendTime();
				} else {
					System.out.println("error connection");
				}
			} else {
				break;
			}
		}
		// sc.connectSocketServer(7728);
		// sc.sendFile("2.jpg");
		// sc.sendT("hello worold");
	}
}
