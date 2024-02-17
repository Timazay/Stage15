package by.itstep.stage15.levelB.controller;

import by.itstep.stage15.levelA.converter.Converter;
import by.itstep.stage15.levelA.util.MatrixInitial;
import by.itstep.stage15.levelA.view.Printer;
import by.itstep.stage15.levelB.model.MatrixLogic;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        MatrixInitial.initMatrix(matrix);

        Printer.print(Converter.convert(matrix));
        Printer.print("Number of even results below the main diagonal: "
                + MatrixLogic.findEvenNumBelowDiagonal(matrix));
    }
}
