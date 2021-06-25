package sort;

// Sort all rows or columns forward or backward 
public class sortLogic {
	public static void column(int ar[][], Sorting srg, Typ ty) {
		int[] x = new int[ar.length];
		int summ = 0;
		long time = System.nanoTime();
		for (int ii = 0; ii < ar[0].length; ii++) {
			for (int i = 0; i < ar.length; i++) {
				x[i] = ar[i][ii];
			}
			if (ty == Typ.QUICK) {
				if (srg == Sorting.INCREASING) {
					QuickSort.quickSort(x, 0, x.length - 1);
				} else {
					QuickSort.quickSortB(x, 0, x.length - 1);
				}

			} else {
				if (srg == Sorting.INCREASING) {
					bubble.sort(x, 0, x.length - 1);
				} else {
					bubble.sortB(x, 0, x.length - 1);
				}
			}
			for (int i = 0; i < ar.length; i++) {
				ar[i][ii] = x[i];
			}
			summ += QuickSort.coun;
			QuickSort.coun = 0;

		}
		System.out.print((System.nanoTime() - time) / 1000);
		System.out.println("μsec");
		System.out.println("\n" + (float) summ / (float) ar.length + " iterations in one column");
	}

	public static void row(int ar[][], Sorting srg, Typ ty) {
		int summ = 0;
		long time = System.nanoTime();
		for (int ii = 0; ii < ar.length; ii++) {
			if (ty == Typ.QUICK) {
				if (srg == Sorting.INCREASING) {
					QuickSort.quickSort(ar[ii], 0, ar[ii].length - 1);
				} else {
					QuickSort.quickSortB(ar[ii], 0, ar[ii].length - 1);
				}
			} else {
				if (srg == Sorting.INCREASING) {
					bubble.sort(ar[ii], 0, ar[ii].length - 1);
				} else {
					bubble.sortB(ar[ii], 0, ar[ii].length - 1);
				}
			}
			summ += QuickSort.coun;
			QuickSort.coun = 0;
		}
		System.out.print((System.nanoTime() - time) / 1000);
		System.out.println("μsec");
		System.out.println("\n" + (float) summ / (float) ar.length + "iterations in one row");
	}

}
