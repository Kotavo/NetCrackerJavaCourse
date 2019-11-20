package LogicalPath;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class TwoDimensionalArray {

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static int[][] getRandomIntValue(int[][] arr, int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = rnd(min, max);
            }
        }
        return Arrays.copyOf(arr, arr.length);
    }

    public static void arrayOutput(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("  " + "[" + i + "]" + "[" + j + "]" + " = " + arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static String mainDiagonal(int[][] arr) {
        StringBuffer result = new StringBuffer("");
        int sum = 0;
        long mult = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                    mult *= arr[i][j];
                }
            }
        }
        result.append("Main Diagonal: " + "\n");
        result.append("Sum: ").append(sum).append("\n").append("Multi: ").append(mult).append("\n");
        return result.toString();
    }

    public static String secondaryDiagonal(int[][] arr) {
        StringBuffer result = new StringBuffer("");
        int sum = 0;
        long mult = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == (arr.length - i - 1)) {
                    sum += arr[i][j];
                    mult *= arr[i][j];
                }
            }
        }
        result.append("Secondary Diagonal: " + "\n");
        result.append("Sum: ").append(sum).append("\n").append("Multi: ").append(mult).append("\n");
        return result.toString();

    }

    public static String maxElement(int[][] arr) {
        StringBuffer result = new StringBuffer("");
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        result.append("\n" + "Max value: ").append(max).append("\n").append("Index of max value: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == max) {
                    result.append(" [").append(i).append("]").append("[").append(j).append("]");
                }
            }
        }
        result.append("\n");
        return result.toString();
    }

    public static String rowWithMaxMulti(int[][] arr) {
        StringBuffer result = new StringBuffer("");
        long rowMulti = 1;
        long temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                rowMulti *= arr[i][j];
            }
            rowMulti = Math.abs(rowMulti);
            if (rowMulti > temp) {
                temp = rowMulti;
            }
            rowMulti = 1;
        }
        result.append("\n");
        result.append("Max multi is: ").append(temp).append("\n");
        result.append("Row with max multi: " + "\n");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                rowMulti *= arr[i][j];
            }
            rowMulti = Math.abs(rowMulti);
            if (rowMulti == temp) {
                result.append(" ").append(i).append(" ");
            }
            rowMulti = 1;
        }
        return result.toString();
    }

    public static int[][] rowArraySOrt(int[][] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[0].length; j++) {
                for (int k = 0; k < arr[0].length - 1; k++) {
                    if (arr[j][k] > arr[j][k + 1]) {
                        temp = arr[j][k + 1];
                        arr[j][k + 1] = arr[j][k];
                        arr[j][k] = temp;

                    }
                }
            }
        return Arrays.copyOf(arr, arr.length);
    }

}
