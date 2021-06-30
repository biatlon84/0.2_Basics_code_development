package Serv;

public class Main {
	public static void main(String args[]) {
		Socc sk = new Socc();
		scann sc = new scann();
		stor.soccc = sk;
		String SS;
		IniT innn = new IniT();
		IniThr th = new IniThr();
		boolean w = true;
		int a = 1;
		th.start();
		innn.start();
		while (w) {

			System.out.print(">>type for 2-exit 1-type mes<<");
			a = sc.s(3);

			if (a == 2) {

				// th.stop();
				th.fa = false;
				innn.fa = false;
				break;
			}
			System.out.print("type\n>>");
			if (!stor.soccc.flagErr) {
				SS = sc.str(40);
				sk.sendT(SS);
			} else {
				System.out.print("non con you need to  ");
			}
		}

	}
}