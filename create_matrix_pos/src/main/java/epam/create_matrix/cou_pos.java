package epam.create_matrix;

public class cou_pos {

    public static long whole;

    public static long pos(double[][] array) {
        long r = 0;
        for (int i = 0; i < array.length; i++) {
            for (int ii = 0; ii < array[i].length; ii++) {
                whole++;
                r = 0 < array[i][ii] ? r + 1 : r;
            }
        }
        return r;
    }

}
