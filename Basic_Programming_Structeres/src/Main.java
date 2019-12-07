import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int scan = 0;
        String scan2;
        while (scan != 6) {
            System.out.println("Choose the task: " + "\n" + "1) Sorting arrays using the bubble method, selecting and using the Arrays.sort method (....)." + "\n" +
                    "2) Calculation of n! factorial." + "\n" +
                    "3) Drawing shapes using nested loops." + "\n" +
                    "4) Tasks on one-dimensional arrays." + "\n" +
                    "5) Task on two-dimensional arrays." + "\n" +
                    "6) Exit");
            scan = in.nextInt();
            switch (scan) {
                case 1:
                    System.out.println("Input a number (n): ");
                    int n = in.nextInt();
                    int[] arr1 = new int[n];
                    int[] arr2 = new int[n];
                    int[] arr3 = new int[n];
                    MyArrays.randomIntValues(arr1, 0, 100);
                    arr2 = Arrays.copyOf(arr1, arr2.length);
                    arr3 = Arrays.copyOf(arr1, arr3.length);

                    System.out.println("Initial array: ");
                    MyArrays.arrayOutput(arr1);
                    long startTime1 = System.nanoTime();
                    MyArrays.selectionSort(arr1);
                    double estimatedTime1 = (System.nanoTime() - startTime1) / 1000000.0;
                    System.out.println("Result of Selection sort: ");
                    MyArrays.arrayOutput(arr1);

                    long startTime2 = System.nanoTime();
                    MyArrays.intBubbleSort(arr2);
                    double estimatedTime2 = (System.nanoTime() - startTime2) / 1000000.0;
                    System.out.println("Result of Bubble sort: ");
                    MyArrays.arrayOutput(arr2);

                    long startTime3 = System.nanoTime();
                    Arrays.sort(arr3);
                    double estimatedTime3 = (System.nanoTime() - startTime3) / 1000000.0;
                    System.out.println("Result of Array.sort: ");
                    MyArrays.arrayOutput(arr3);

                    System.out.println("\n" + "Selection sort time: " + estimatedTime1 + " millisec" + "\n"
                            + "Bubble sort time: " + estimatedTime2 + " millisec" + "\n"
                            + "Arrays.sort time: " + estimatedTime3 + " millisec" + "\n");

                    double result = Math.min(estimatedTime1, estimatedTime2);
                    result = Math.min(result, estimatedTime3);
                    System.out.println("Better time: " + result + " millisec");
                    break;

                case 2:
                    System.out.println("Enter factorial parameter");
                    int m = in.nextInt();
                    long facResult = 0;
                    long startTime4 = System.nanoTime();
                    facResult = MyFactorial.loopFactorial(m);
                    long estimatedTime4 = System.nanoTime() - startTime4;
                    System.out.println("Result of loopFactorial method: " + facResult);

                    long startTime5 = System.nanoTime();
                    facResult = MyFactorial.recursionFactorial(m);
                    long estimatedTime5 = System.nanoTime() - startTime5;
                    System.out.println("Result of recursionFactorial method: " + facResult);

                    System.out.println("\n" + "loopFactorial method time: " + estimatedTime4 +
                            "\n" + "recursionFactorial method time: " + estimatedTime5 +
                            "\n" + "better time: " + Math.min(estimatedTime4, estimatedTime5));
                    break;

                case 3:
                    System.out.println("Enter a size: ");
                    int size = in.nextInt();
                    FigurePainter.simpleFigurePainter(size);
                    FigurePainter.aFigurePainter();
                    FigurePainter.bFigurePainter();
                    FigurePainter.dFigurePainter();
                    FigurePainter.eFigurePainter();
                    FigurePainter.fFigurePainter();
                    break;

                case 4:
                    System.out.println("Choose the subtask: " + "\n" +
                            "a) An array of odd numbers from 1 to 99. Output them in ascending and descending order. " + "\n" +
                            "b) An array in the range of [0:10]. Output the number of even and odd elements. " + "\n" +
                            "c) An array in range of [1:100]. Replace each element with odd index by 0." + "\n" +
                            "d) An array in range of [-50:50]. Search for max and min of an element and index of the last occurrence." + "\n" +
                            "e) Two arrays in range of [0:10]. Search for avg of elements of each array. Comparison of Results." + "\n" +
                            "f) An array in range [-1:1]. Determine which element in the array is found most often.");
                    scan2 = in.next();
                    switch (scan2) {
                        case "a":
                            int[] oddArr = new int[50];
                            OneDimensionalArray.getOddValue(oddArr);
                            System.out.println("Ascending odd array: ");
                            MyArrays.arrayOutput(oddArr);
                            System.out.println("Descending odd arrays: ");
                            OneDimensionalArray.reverseValue(oddArr);
                            MyArrays.arrayOutput(oddArr);
                            break;

                        case "b":
                            int[] testArr = new int[20];
                            MyArrays.randomIntValues(testArr, 0, 10);
                            System.out.println("Starting Array: ");
                            MyArrays.arrayOutput(testArr);
                            OneDimensionalArray.oddAndEvenElementsOnArray(testArr);
                            break;

                        case "c":
                            int[] anotherTestArr = new int[10];
                            MyArrays.randomIntValues(anotherTestArr, 0, 100);
                            System.out.println("Starting Array: ");
                            MyArrays.arrayOutput(anotherTestArr);
                            anotherTestArr = OneDimensionalArray.replaseOddValues(anotherTestArr);
                            System.out.println("Result of replace");
                            MyArrays.arrayOutput(anotherTestArr);
                            break;

                        case "d":
                            int[] arr5 = new int[15];
                            MyArrays.randomIntValues(arr5, -50, 50);
                            System.out.println("Starting Array: ");
                            MyArrays.arrayOutput(arr5);
                            OneDimensionalArray.minMaxAndEntryOfelements(arr5);
                            break;

                        case "e":
                            int[] arr6 = new int[10];
                            int[] arr7 = new int[10];
                            MyArrays.randomIntValues(arr6, 0, 10);
                            MyArrays.randomIntValues(arr7, 0, 10);
                            System.out.println("First array: ");
                            MyArrays.arrayOutput(arr6);
                            System.out.println("Second array: ");
                            MyArrays.arrayOutput(arr7);
                            float avg1 = MyArrays.arrayAvg(arr6);
                            float avg2 = MyArrays.arrayAvg(arr7);
                            System.out.println("Avg1: " + avg1);
                            System.out.println("Avg2: " + avg2);
                            if (avg1 == avg2) {
                                System.out.println("Avg1 = Avg2");
                            } else {
                                if (avg1 > avg2) {
                                    System.out.println("The biggest avg is avg1 " + avg1);
                                } else {
                                    System.out.println("The biggest avg is avg2 " + avg2);
                                }
                            }
                            break;

                        case "f":
                            int[] arr8 = new int[20];
                            MyArrays.randomIntValues(arr8, -1, 1);
                            System.out.println("Starting array: ");
                            MyArrays.arrayOutput(arr8);
                            OneDimensionalArray.whichElement(arr8);
                            break;

                        default:
                            System.out.println("Wrong symbol");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Choose the subtask: " + "\n" +
                            "a) A two-dimensional array of random elements in a range [1:99]. Find the sum and multi of diagonal elements " + "\n" +
                            "b) A two-dimensional array (8x5) in the range of [-99:99]. Find max element id" + "\n" +
                            "c) A two-dimensional array (8x5) in the range of [-10:10]. Find the index of the row with the largest product of elements " + "\n" +
                            "d) A two-dimensional array (10x7) in the range of [0:100]. Sort each row descending");

                    scan2 = in.next();
                    switch (scan2) {
                        case "a":
                            int[][] ar = new int[8][8];
                            TwoDimensionalArray.getRandomIntValue(ar, 1, 99);
                            TwoDimensionalArray.arrayOutput(ar);
                            TwoDimensionalArray.mainDiagonal(ar);
                            TwoDimensionalArray.secondaryDiagonal(ar);
                            break;
                        case "b":
                            int[][] ar2 = new int[8][5];
                            TwoDimensionalArray.getRandomIntValue(ar2, -99, 99);
                            TwoDimensionalArray.arrayOutput(ar2);
                            TwoDimensionalArray.maxElement(ar2);
                            break;
                        case "c":
                            int[][] ar3 = new int[8][5];
                            TwoDimensionalArray.getRandomIntValue(ar3, -10, 10);
                            TwoDimensionalArray.arrayOutput(ar3);
                            TwoDimensionalArray.rowWithMaxMulti(ar3);
                            break;
                        case "d":
                            int[][] arr4 = new int[10][7];
                            TwoDimensionalArray.getRandomIntValue(arr4, 0, 100);
                            System.out.println("Starting array: ");
                            TwoDimensionalArray.arrayOutput(arr4);
                            System.out.println("\n" + "Result of RowSort: ");
                            TwoDimensionalArray.rowArraySOrt(arr4);
                            TwoDimensionalArray.arrayOutput(arr4);
                            break;
                        default:
                            System.out.println("Wrong symbol");
                            break;
                    }
                    break;
                case 6:
                    scan = 6;
                    break;
                default:
                    System.out.println("Wrong number! Try again: ");
                    break;

            }
            if (scan != 6) {
                System.out.println("\n" + "Anything else ? (y/n)");
                scan2 = in.next();
                if (scan2.equals("n")) {
                    scan = 6;
                }
            }
        }
    }
}
