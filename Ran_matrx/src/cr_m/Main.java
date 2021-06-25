package cr_m;

public class Main {
	public static void main(String args[]) {
		int[][] ar;
		int y = (int) ((Math.random() * 40) + 1);
		int x = (int) ((Math.random() * y) + 1);
		ar = Creator.mx(y, x);
		pri.p(ar);
		pri.xy(y, x);
	}

}
