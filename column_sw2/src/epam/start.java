package epam;

//I am replacing values of couple columns. 
public class start {
	public static void main(String args[]) {

		int[][] ar = mass.marr;
		int x = 0;
		int y = 0;
		int bu = 0;

		int l = ar[0].length;

		printA.ar(ar);

		scann dy = new scann();

		System.out.print("first column\n>>");
		x = dy.s(l);

		System.out.print("second column\n>>");
		y = dy.s(l, x);

		for (int i = 0; i < ar.length; i++) {
			bu = ar[i][y];
			ar[i][y] = ar[i][x];
			ar[i][x] = bu;

		}

		printA.ar(mass.marr);

	}

}
