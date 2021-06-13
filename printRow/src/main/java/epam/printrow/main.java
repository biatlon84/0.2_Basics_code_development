package epam.printrow;
//Task: print row or column into system out. 
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        long[][] ar = new long[][]{{7, 56}, {8, 23}};
        int n = 0, t = 0;
        boolean err = true;
        System.out.println("column=1 line=2\n>>");
        Scanner sc = new Scanner(System.in);
        while (err) {
            while (!sc.hasNextInt()) {
                System.out.println(sc.next() + " is not namber integer");
                System.out.print(">>");
            }
            t = sc.nextInt();
            if (!(t == 1 || t == 2)) {
                System.out.println("wrong type");
                err = true;

            } else {
                err = false;
            }
        }

        System.out.println("witch item?");

        System.out.print(">>");
        err = true;
        while (err) {
            while (!sc.hasNextInt()) {
                System.out.println(sc.next() + " is not namber integer");
                System.out.print(">>");
            }
            err = false;
            n = sc.nextInt();
            if (n >= ar[0].length && t == 1) {
                n = 0;
                err = true;
                System.out.println("only fewer columns exist");
            }
            if (n >= ar.length && t == 2) {
                n = 0;
                err = true;
                System.out.println("only fewer lines exist");
            }

        }
        switch (t) {
            case 1:
                System.out.println("column " + n);
                for (int i = 0; i < ar[0].length; i++) {
                    System.out.println(ar[i][n]);
                }
                break;
            case 2:
                System.out.println("line " + n);
                for (int i = 0; i < ar.length; i++) {
                    System.out.print(ar[n][i] + " ");
                }
                break;
            default:
                System.out.println("row=1 column=2\n>>");

        }

        //System.out.println("P");
    }

}
