package odd;

public class cr_arr {
	public static int[][] cr(int y, int x) {
		int[][] array = new int[y][x];
		int w = 0;
		for (int ii = 0; ii < y; ii++) {
			for (int i = 0; i < x; i++) {
				w = (int) (Math.floor((Math.random() * 100)));
				array[ii][i] = w;
			}
		}
		return array;
	}

}
