package sort;

import java.util.Scanner;

public class userInput {
	public static int intInp(int u) {

		int input = 0;
		Scanner sc = new Scanner(System.in);
		while ((input > u) || (input <= 0)) {
			while (!sc.hasNextInt()) {
				System.out.print(sc.next());
			}
			input = sc.nextInt();
		}
		return input;
	}

}
