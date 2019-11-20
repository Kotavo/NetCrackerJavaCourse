package LogicalPath;

import java.util.Arrays;

import sample.Controller;

public class MyArrays {
    public static void arrayOutput(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static int[] randomIntValues(int[] arr, int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = MyArrays.rnd(min, max);
        }
        return Arrays.copyOf(arr, arr.length);
    }

    public static int[] intBubbleSort(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    counter = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = counter;
                }
            }
        }
        return Arrays.copyOf(arr, arr.length);

    }

    public static int[] selectionSort(int[] arr) {
        int temp = 0;
        int min = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return Arrays.copyOf(arr, arr.length);
    }

    public static float arrayAvg(int[] arr) {
        float avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }
        return avg / arr.length;
    }
}
