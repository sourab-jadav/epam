package com.epam.rd.autotasks;

public class DecrementingCarousel {
    public int[] arr;
    public int index;
    private boolean isrunning;

    public DecrementingCarousel(int capacity) {
        this.arr = new int[capacity];
        this.index = 0;
        this.isrunning = false;
    }

    public boolean addElement(int element) {
        // adding the element into carousel
        // things to keep in mind
        // count< capacity
        // !isrunning
        if (element <= 0 || index >= this.arr.length || isrunning) {
            return false;
        } else {
            arr[index] = element;
            index++;
            return true;
        }
    }

    public CarouselRun run() {
        if (isrunning) {
            return null;
        }
        this.isrunning = true;
        return new CarouselRun(arr, index);
    }
}
