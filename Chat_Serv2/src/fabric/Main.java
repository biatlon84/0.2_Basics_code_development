package fabric;

public class Main {
	public static void main(String args[]) {
		Server_Thread.cr();
		int p = 0;
		String ss = "test for";

		System.out.print("while");

		while (true) {

			Pull.pull1[p].sendT(ss);
			if (p > 7) {
				p = 0;
			}
		}
	}

}
