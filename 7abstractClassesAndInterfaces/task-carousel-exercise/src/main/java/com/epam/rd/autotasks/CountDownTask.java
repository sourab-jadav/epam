package com.epam.rd.autotasks;

public class CountDownTask implements Task{
    private int countDown=0;
    private boolean isFinished=false;
    public CountDownTask(int value) { // the value can also be negative you have to handle that case as well
        if (value>=0) {
            this.countDown=value;
            if (value==0) {
                this.isFinished=true;
            }
        }
    }
    public int getValue() {
        return this.countDown;
    }
    @Override
    public void execute() {
        if (!isFinished()) {
            if (this.countDown>0) {
                this.countDown--;
            }else{
                this.isFinished=true;
            }
        }
    }
    @Override
    public boolean isFinished() {
        return this.isFinished==true;
    }
}
