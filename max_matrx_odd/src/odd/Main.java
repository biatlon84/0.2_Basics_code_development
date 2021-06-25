package odd;

//Replace all odd elements with the largest of the matrix
public class Main {
	public static void main(String args[]) {
		int[][] ar;
		ar = cr_arr.cr(8, 8);
		pri.p(ar);
		Changer.replase(ar, MaxF.lookFor(ar));
		pri.p(ar);
		/// System.out.print();
	}
}
