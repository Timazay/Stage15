package by.itstep.stage15.levelA.controller;

import by.itstep.stage15.levelA.converter.Converter;
import by.itstep.stage15.levelA.model.MatrixLogic;
import by.itstep.stage15.levelA.util.MatrixInitial;
import by.itstep.stage15.levelA.view.Printer;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        MatrixInitial.initMatrix(matrix);

        Printer.print(Converter.convert(matrix));
        Printer.print("Max value above main diagonal: " + MatrixLogic.findMaxAboveDiagonal(matrix));
        Printer.print("\nMin value below main diagonal: " + MatrixLogic.findMinBelowDiagonal(matrix));
    }
}
