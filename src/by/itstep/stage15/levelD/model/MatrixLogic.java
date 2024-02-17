package by.itstep.stage15.levelD.model;

public class MatrixLogic {
    public static boolean isZeroValueBelowDiagonal(int[][] matrix){
       boolean check = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - i; j < matrix.length; j++) {
                if (matrix[i][j] == 0) {
                    check = true;
                }
            }
        }
        return check;
    }
}
