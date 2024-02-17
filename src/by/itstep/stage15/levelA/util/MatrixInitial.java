package by.itstep.stage15.levelA.util;

import java.util.Random;

public class MatrixInitial {
    public static final Random RND = new Random();

    public static void initMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = RND.nextInt(10);
            }
        }
    }


}
