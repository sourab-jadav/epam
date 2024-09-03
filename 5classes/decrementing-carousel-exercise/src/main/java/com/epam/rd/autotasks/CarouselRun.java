package com.epam.rd.autotasks;

import java.util.ArrayList;

public class CarouselRun {
    private final int[] elements;
    private int current_index;
    private int activeElements;
    CarouselRun(int []elements,int count){
        this.elements=new int[count];
        System.arraycopy(elements, 0, this.elements, 0, count);
        this.current_index=0;
        this.activeElements=count;
    }
    public int next() {
        if (isFinished()) {
            return -1;
        }
        while (elements[current_index]==0) {
            current_index=(current_index+1)%elements.length;
        }
        int value=elements[current_index];
        elements[current_index]--;
        if(elements[current_index]==0){
            activeElements--;
        }
        current_index=(current_index+1)%elements.length;
        return value;
    }
    public boolean isFinished() {
       return activeElements==0;
    }

}
