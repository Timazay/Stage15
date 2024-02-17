package by.itstep.stage15.levelA.converter;

public class Converter {
    public static String convert(int[][] matrix){
        StringBuilder builder = new StringBuilder();

        for (int[] array : matrix) {
            for (int elements : array) {
                builder.append(elements).append(" ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
