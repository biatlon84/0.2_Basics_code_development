package cr_m;

public class Creator {
	public static int[][] mx(int y, int x) {
		int[][] ar = new int[y][x];
		for (int i = 0; i < ar[0].length; i++) {
			int u = 0;
			int plase;
			while (u <= i) {
				plase = (int) (Math.random() * y);

				if (ar[plase][i] != 1) {
					ar[plase][i] = 1;
					u++;
				}

			}

		}
		return ar;
	}

}
