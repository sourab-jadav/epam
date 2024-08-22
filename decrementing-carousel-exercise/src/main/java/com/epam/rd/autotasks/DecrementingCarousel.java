package com.epam.rd.autotasks;

import java.util.ArrayList;


public class DecrementingCarousel {
    private final int[] elements;
    private boolean isRunning;
    private int count;
    public DecrementingCarousel(int capacity) {
        this.elements= new int[capacity];
        this.count=0;
        this.isRunning=false;
    }
    public boolean addElement(int element){
        // when the element is <=0 
        // or number of elements exceed the count 
        // or if it is not running
        if (element<=0 || count>=elements.length || this.isRunning) {
                return false;
        }
        elements[count++]=element;
        return true;
    }
    public CarouselRun run(){
        if (isRunning){
            return null;
        }
        this.isRunning=true;
        return new CarouselRun(this.elements,count);
       
    }


}

