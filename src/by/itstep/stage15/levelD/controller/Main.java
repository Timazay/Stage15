package by.itstep.stage15.levelD.controller;

import by.itstep.stage15.levelA.converter.Converter;
import by.itstep.stage15.levelA.util.MatrixInitial;
import by.itstep.stage15.levelA.view.Printer;
import by.itstep.stage15.levelD.model.MatrixLogic;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        MatrixInitial.initMatrix(matrix);

        Printer.print(Converter.convert(matrix));
        String msg = "There is no zero value below the side diagonal";

        if (MatrixLogic.isZeroValueBelowDiagonal(matrix)) {
            msg = "There is zero value below the side diagonal";
        }

        Printer.print(msg);
    }
}
