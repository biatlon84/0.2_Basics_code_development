package epam.create_matrix;
//I am creating a matrix by pattern. 

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        boolean ag = true;

        while (ag) {
            System.out.println("agen");
            while (!sc.hasNextInt()) {
                System.out.println(sc.next() + " is not INT");
            }
            n = sc.nextInt();
            if (n >= 0) {
                ag = false;
            }
        }

        int[][] ar = new int[n][n];
        for (int i = 0; i < n; i++) {
            int[] buf = new int[n];
            if (i % 2 == 0) {
                for (int ii = 0; ii < n; ii++) {
                    buf[ii] = ii + 1;
                }
            } else {

                for (int ii = 0; ii < n; ii++) {

                    buf[ii] = n - ii;
                }
            }
            ar[i] = buf.clone();

        }
        print.out(ar);
        System.out.println("ok");
    }

}
