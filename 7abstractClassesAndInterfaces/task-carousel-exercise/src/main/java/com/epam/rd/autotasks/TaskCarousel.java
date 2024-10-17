package com.epam.rd.autotasks;

public class TaskCarousel {
    private int capacity=0;
    private int taskcount=0;
    private Task[] arr;

    public TaskCarousel(int capacity) {
        if (capacity>0) {
            this.capacity=capacity;
            arr=new Task[capacity];
        }
    }

    public boolean addTask(Task task) {
        if (taskcount<capacity) {
            arr[taskcount]=task;
            taskcount++;
            return true;
        }else{
            return false;
        }

    }

    public boolean execute() {
        throw new UnsupportedOperationException();
    }

    public boolean isFull() {
        return taskcount==capacity;
    }

    public boolean isEmpty() { // returns true if there is no task in the carousel else false
        return arr.length==0;
    }

}
