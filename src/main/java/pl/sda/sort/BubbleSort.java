package pl.sda.sort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {
        int[] randomArray = getRandomArray(100);
        System.out.println(Arrays.toString(randomArray));
        bubbleSort(randomArray);
        System.out.println(Arrays.toString(randomArray));
    }

    private static int[] getRandomArray(int size) {
        Random random = new Random();
        int[] result = new int[size];

        for (int i = 0; i < size; ++i) {
            result[i] = random.nextInt(501);
        }
        return result;
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j);
                }
            }
        }
    }

    private static void swap(int[] arr, int j) {
        int temp;
        temp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = temp;
    }

}
