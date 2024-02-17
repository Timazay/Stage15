package by.itstep.stage15.levelB.model;

public class MatrixLogic {
    public static int findEvenNumBelowDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] % 2 == 0) {
                    sum++;
                }
            }
        }
        return sum;
    }
}
