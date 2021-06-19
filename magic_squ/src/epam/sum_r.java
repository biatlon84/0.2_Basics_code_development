package epam;

public class sum_r {
	public sum_r() {

	}

	public boolean s(int array[][], int l) {
		boolean w = true;
		int max = 0;
		int bu = 0;
		for (int i = 0; i < l; i++) {
			bu = 0;
			for (int v = 0; v < l; v++) {
				bu += array[i][v];
			}
			if ((max != bu) && (i != 0)) {
				w = false;
			}
			max = bu;
		}
		for (int v = 0; v < l; v++) {
			bu = 0;
			for (int i = 0; i < l; i++) {
				bu += array[i][v];
			}

			if (max != bu) {
				w = false;
			}
		}
		// ---------
		bu = 0;
		for (int i = 0; i < l; i++) {

			bu += array[i][i];

		}
		if (max != bu) {
			w = false;
		}
		// ---------
		bu = 0;
		for (int i = 0; i < l; i++) {

			bu += array[i][l - i - 1];

		}
		if (max != bu) {
			w = false;
		}
		return w;
	}

}
