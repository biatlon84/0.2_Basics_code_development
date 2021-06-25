package sort;

//Sort all rows or columns forward or backward
public class start {

	public static void main(String args[]) {
		int xx = 1;
		Sorting srg = Sorting.INCREASING;
		Typ ty;
		int[][] arrray = cr_arr.cr(5, 10);
		pri.p(arrray);
		System.out.println("enter 1 for quick, 2 for bubble");
		ty = userInput.intInp(2) == 1 ? Typ.QUICK : Typ.BUB;

		System.out.println("enter 1 for waning, 2 for increasing");
		srg = userInput.intInp(2) == 1 ? Sorting.WANING : Sorting.INCREASING;

		System.out.println("enter 1 for row, 2 for column");
		xx = userInput.intInp(2);
		if (xx == 1) {
			sortLogic.row(arrray, srg, ty);
		} else {
			sortLogic.column(arrray, srg, ty);
		}
		pri.p(arrray);
	}

}
