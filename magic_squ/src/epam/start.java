package epam;

//Magic square 
public class start {
	public static void main(String args[]) {
		int n = 0;
		boolean b = true;
		sum_r sm = new sum_r();
		scann sc = new scann();
		System.out.println("enter 2 or 3 or 4\n>>");
		n = sc.s(5);

		int[][] ar = new int[n][n];
		long fact = 1;

		for (int i = 2; i <= n * n; i++) {
			fact = fact * i;
		}
		System.out.println("it will be antil " + fact + " matrxs");
		System.out.println("each namber means 10000 matrxs");
		long fk = 0;
		while (fk < fact) {
			b = false;
			do {
				ar = mass.cr(n, fk);
				b = sm.s(ar, n);
				fk++;
				if ((fk % 10000) == 0) {
					System.out.print((fk / 10000) + " ");
				}
			} while ((!b) && (fk < fact));
			System.out.print("\n" + fk + "'th matrx is ");
			System.out.print(b + " magic");
			printA.ar(ar);
			System.out.print("\n");
		}
		System.out.print("finish");
	}

	/// printA.ar(mass.marr);

}
