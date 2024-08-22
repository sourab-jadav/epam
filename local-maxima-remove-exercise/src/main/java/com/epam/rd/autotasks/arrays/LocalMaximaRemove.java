package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[] { 18, 1, 3, 6, 7, -5 };

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static boolean checkLocalMaxmima(int[] arr, int i) {
        if (i == 0) {
            return arr[i] > arr[i + 1];
        } else if (i == arr.length - 1) {
            return arr[i] > arr[i - 1];
        } else {
            return arr[i] > arr[i + 1] && arr[i] > arr[i - 1];
        }
    }

    public static int[] removeLocalMaxima(int[] array) {

        // counting the number of localmaxima's
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (checkLocalMaxmima(array, i)) {
                continue;
            }
            count++;
        }
        int[] result = new int[count];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (!(checkLocalMaxmima(array, i))) {
                result[j] = array[i];
                j++;
            }
        }
        return result;

    }
}
