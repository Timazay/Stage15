package by.itstep.stage15.levelC.controller;

import by.itstep.stage15.levelA.converter.Converter;
import by.itstep.stage15.levelA.util.MatrixInitial;
import by.itstep.stage15.levelA.view.Printer;
import by.itstep.stage15.levelC.model.MatrixLogic;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        MatrixInitial.initMatrix(matrix);

        Printer.print(Converter.convert(matrix));
        Printer.print("Quantity of Positive numbers: " + MatrixLogic.findPositiveValues(matrix));
    }
}
