package by.itstep.stage15.levelC.model;

public class MatrixLogic {
    public static int findPositiveValues(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - i - 1; j++) {
                if (matrix[i][j] > 0) {
                    sum++;
                }
            }
        }
        return sum;
    }
}
