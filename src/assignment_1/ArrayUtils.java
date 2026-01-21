package assignment_1;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtils {

    // Q1: Clone an array
    public static int[] cloneArray(int[] arr) {
        return arr.clone();
    }

    // Q2: Remove random element
    public static int[] removeRandom(int[] arr) {
        Random r = new Random();
        int index = r.nextInt(arr.length);
        return removeAt(arr, index);
    }

    // Q3: Remove specific element
    public static int[] removeElement(int[] arr, int value) {
        int index = -1;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == value) {
                index = i;
                break;
            }
        if (index == -1) return arr;
        return removeAt(arr, index);
    }

    // Q4: Reverse array
    public static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++; j--;
        }
    }

    private static int[] removeAt(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index)
                newArr[j++] = arr[i];
        }
        return newArr;
    }
}
