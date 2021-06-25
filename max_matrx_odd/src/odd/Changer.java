package odd;

public class Changer {

	public static void replase(int[][] ar, int max) {
		for (int i = 0; i < ar.length; i++) {
			for (int ii = 0; ii < ar[0].length; ii++) {
				if ((ar[i][ii] % 2) != 0) {
					ar[i][ii] = max;
				}
			}
		}
	}

}
