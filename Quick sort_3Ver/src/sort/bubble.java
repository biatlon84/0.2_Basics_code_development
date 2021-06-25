package sort;

public class bubble {
	public static void sort(int[] array, int low, int high) {
		boolean w = true;
		int i = low + 1, bu;
		while (w) {
			QuickSort.coun++;
			w = false;
			i = low + 1;
			while (high >= i) {

				if (array[i - 1] > array[i]) {
					bu = array[i];
					array[i] = array[i - 1];
					array[i - 1] = bu;
					w = true;
				}
				i++;
			}

		}
		// System.out.print(QuickSort.coun);
	}

	public static void sortB(int[] array, int low, int high) {
		boolean w = true;
		int i = low + 1, bu;
		while (w) {
			QuickSort.coun++;
			w = false;
			i = low + 1;
			while (high >= i) {

				if (array[i - 1] < array[i]) {
					bu = array[i];
					array[i] = array[i - 1];
					array[i - 1] = bu;
					w = true;
				}
				i++;
			}

		}
		// System.out.print(QuickSort.coun);
	}
}
