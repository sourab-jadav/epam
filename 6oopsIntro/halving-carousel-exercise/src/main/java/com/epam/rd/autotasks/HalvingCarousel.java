package com.epam.rd.autotasks;

public class HalvingCarousel extends DecrementingCarousel {

    public HalvingCarousel(final int capacity) {
        super(capacity);
    }

    @Override
    public CarouselRun run() {
        if (super.run() != null) {
            return new HalvingCarouselRun(arr, index);
        }
        return null;
    }
}

/**
 * HalvingCarouselRun
 */
class HalvingCarouselRun extends CarouselRun {

    public HalvingCarouselRun(int[] elements, int count) {
        super(elements, count);

    }

    @Override
    public int next() {
        if (isFinished()) {
            return -1;
        }
        while (arr[index] == 0) {
            index = (index + 1) % arr.length;
        }

        int value = arr[index];
        arr[index] /= 2; // Halve the current element
        if (arr[index] == 0) {
            count--;
        }

        index = (index + 1) % arr.length;
        return value;
    }

}
