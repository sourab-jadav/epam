package com.epam.rd.autotasks;

public class CarouselRun {
    public int arr[];
    public int count;
    public int index;

    CarouselRun(int arr[], int count) {
        // ohh forgot to create an array
        this.arr = new int[count];
        System.arraycopy(arr, 0, this.arr, 0, count);
        this.count = count;
        this.index = 0;
    }

    public int next() {
        if (isFinished()) {
            return -1;
        } else {
            while (arr[index] == 0) {
                index = (index + 1) % arr.length;
            }
            int temp = arr[index];
            arr[index]--;
            if (arr[index] == 0) {
                count--;
            }
            index = (index + 1) % arr.length;
            return temp;
        }

    }

    public boolean isFinished() {
        for (int x : arr) {
            if (x > 0) {
                return false;
            }
        }
        return true;
    }

}
