package cr_ma;

public class testar {
	public static int[] af(int[][] array) {
		int bu = 0;
		int[] r = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			bu = 0;
			for (int ii = 0; ii < array[0].length; ii++) {

				bu += 5 == array[i][ii] ? 1 : 0;

			}
			r[i] = bu;
		}
		return r;
	}

}
