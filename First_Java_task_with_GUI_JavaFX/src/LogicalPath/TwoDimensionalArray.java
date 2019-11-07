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

    public static void mainDiagonal(int[][] arr) {
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
        System.out.println("Main Diagonal: ");
        System.out.println("Sum: " + sum + "\n" + "Multi: " + mult);
        System.out.println();
    }

    public static void secondaryDiagonal(int[][] arr) {
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
        System.out.println("Secondary Diagonal: ");
        System.out.println("Sum: " + sum + "\n" + "Multi: " + mult);
        System.out.println();
    }

    public static void maxElement(int[][] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.print("\n" + "Max value: " + max + "\n" + "Index of max value: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == max) {
                    System.out.print(" [" + i + "]" + "[" + j + "]");
                }
            }
        }
        System.out.println();
    }

    public static void rowWithMaxMulti(int[][] arr) {
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
        System.out.println();
        System.out.println("Max multi is: " + temp);
        System.out.print("Row with max multi: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                rowMulti *= arr[i][j];
            }
            rowMulti = Math.abs(rowMulti);
            if (rowMulti == temp) {
                System.out.print(" " + i + " ");
            }
            rowMulti = 1;
        }
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
