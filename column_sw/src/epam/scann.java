package epam;

import java.util.Scanner;

public class scann {
	public int s(int e) {

		int a = 0;
		boolean w = true;
		Scanner sc = new Scanner(System.in);
		while (w) {
			w = false;
			while (!sc.hasNextInt()) {

				System.out.print(sc.next() + "is't int\n");
			}
			a = sc.nextInt();
			if ((a >= e || a < 0)) {
				System.out.print("wrong volue\n");
				w = true;
			}

		}
		return a;
	}
}