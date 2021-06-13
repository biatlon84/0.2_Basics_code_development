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
            if (n >= 0 && (n % 2 == 0)) {
                ag = false;
            } else {
                System.out.println(n + " is not even or positive");
            }
        }

        int[][] ar = new int[n][n];
        boolean k = true;
        // int[][] ar= int[][];
        //int h = n/2;
        for (int i = 0; i < n; i++) {
            for (int ii = 0; ii < n; ii++) {
                if (i < n / 2) {
                    ar[i][ii] = (i <= ii) && (i < (n - ii)) ? 1 : 0;
                } else {
                    ar[i][ii] = (i >= ii) && ((i + 2) > (n - ii)) ? 1 : 0;
                }
            }

        }
        print.out(ar);
        System.out.println("ok");
    }

}
