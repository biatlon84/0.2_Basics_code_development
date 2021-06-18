package epam;

public class printA {
	public static void ar(int array[][]) {

		for (int i = 0; i < array.length; i++) {
			System.out.print("\n");
			for (int ii = 0; ii < array[0].length; ii++) {
				System.out.print(" " + array[i][ii]);
			}

		}
		System.out.print("\n");

	}

}
