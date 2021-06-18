package epam;

//Searching for the column with biggest sum
public class start {
	public static void main(String args[]) {

		int[][] ar = mass.marr;
		int adr = 0;
		int max = 0;
		int bu = 0;

		// int l = ar[0].length;

		printA.ar(ar);

		// scann dy = new scann();

		// System.out.print("first column\n>>");
		// x = dy.s(l);

		// System.out.print("second column\n>>");
		// y = dy.s(l, x);
		for (int v = 0; v < ar[0].length; v++) {
			bu = 0;
			for (int i = 0; i < ar.length; i++) {
				bu += ar[i][v];

			}
			if (max < bu) {
				max = bu;
				adr = v;
			}
		}
		System.out.print(adr);
		/// printA.ar(mass.marr);

	}

}
