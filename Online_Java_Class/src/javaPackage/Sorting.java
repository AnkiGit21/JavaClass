package javaPackage;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] array1 = {8, 6, 3, 0, 1, 7, 5, 1, 5};

        // Sort in ascending order using Bubble Sort
        bubbleSortAscending(array1);
        System.out.println("Array in Ascending Order: " + Arrays.toString(array1));

        // Sort in descending order using Bubble Sort
        bubbleSortDescending(array1);
        System.out.println("Array in Descending Order: " + Arrays.toString(array1));
    }

    public static void bubbleSortAscending(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortDescending(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

