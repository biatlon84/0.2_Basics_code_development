package epam.create_matrix;

public class print {

    public static void out(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int ii = 0; ii < array[i].length; ii++) {
                System.out.print(array[i][ii]+" ");
            }
            System.out.print("\n");
        }
    }

}
