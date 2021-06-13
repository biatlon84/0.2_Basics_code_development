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

        double[][] ar = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int ii = 0; ii < n; ii++) {
                ar[i][ii] = Math.sin(((double)i * i - (double)ii * ii) / (double)n);
            }
        }

        print.out(ar);
        System.out.println(cou_pos.pos(ar));
        System.out.println(cou_pos.whole);
    }

}
