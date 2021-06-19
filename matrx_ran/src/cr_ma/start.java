package cr_ma;

public class start {
	public static void main(String args[]) {
		int x, y;
		x = 20;
		y = 10;
		int[][] ar = new int[y][x];
		int[] max = new int[x];

		ar = cr_arr.cr(y, x);
		pri.p(ar);
		max = testar.af(ar);
		pri.pw(max);

	}

}
