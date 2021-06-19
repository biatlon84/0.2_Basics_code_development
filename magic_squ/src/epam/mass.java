package epam;

public class mass {
	public static int marr[][] = { { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } };

	public static int[][] cr(int n, long indx) {

		int k = 0;
		int bu = 0;
		int r = 0;
		int[][] ar = new int[n][n];
		int[] ar1 = new int[n * n];
		int[] ar2 = new int[n * n];
		for (int i = 0; i < n * n; i++) {
			ar1[i] = i + 1;
		}
		r = 0;
		while (indx > 0) {
			r = 1;
			ar2[r]++;
			while (ar2[r] > r) {
				ar2[r] = 0;
				r++;
				ar2[r]++;
			}
			indx--;
		}
		/*
		 * for (int m = 0; m < n * n; m++) { System.out.print(ar2[m] + " "); }
		 * System.out.print("\n");
		 */
		for (int m = n * n - 1; m >= 0; m--) {
			bu = ar1[ar2[m]];
			ar1[ar2[m]] = ar1[m];
			ar1[m] = bu;
		}

		for (int f = 0; f < 1; f++) {
			int i = 0;
			while (i < n) {
				for (int ii = 0; ii < n; ii++) {
					k = (ii + (i * n));
					k = (k + f) % (n * n);
					ar[i][ii] = ar1[k];
				}
				i++;
			}
		}
		return ar;
	}
}
