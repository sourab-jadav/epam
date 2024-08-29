package com.epam.rd.autotasks;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel{
    private final int actionLimit;
    public DecrementingCarouselWithLimitedRun(final int capacity, final int actionLimit) {
        super(capacity);
        this.actionLimit=actionLimit;
    }
    @Override 
    public CarouselRunWithLimit run(){
        if (super.run()!=null) {
            return new CarouselRunWithLimit(arr,index,actionLimit);
            
        }
        return null;
    }
    public static void main(String[] args) {

        DecrementingCarousel carousel = new DecrementingCarouselWithLimitedRun(7, 10);

        carousel.addElement(20);
        carousel.addElement(30);
        carousel.addElement(10);

        CarouselRun run = carousel.run();

        System.out.println(run.isFinished()); //false

        System.out.println(run.next()); //20
        System.out.println(run.next()); //30
        System.out.println(run.next()); //10

        System.out.println(run.next()); //19
        System.out.println(run.next()); //29
        System.out.println(run.next()); //9

        System.out.println(run.next()); //18
        System.out.println(run.next()); //28
        System.out.println(run.next()); //8

        System.out.println(run.next()); //17

        System.out.println(run.isFinished()); //true
        System.out.println(run.next()); //-1
    }
}
/**
 * CarouselRunWithLimit
 */
class CarouselRunWithLimit extends CarouselRun {
    private final int limit;
    private int current;
    private boolean isfinished;
    public CarouselRunWithLimit(int arr[],int count,final int limit){
        super(arr, count);
        this.limit=limit;
        this.current=1;
        this.isfinished=false;
    }
    @Override
    public int next(){
        int value=-1;
        if (current<=limit) {
            value=super.next();
            if (current==limit) {
                isfinished=true;
            }
            current++;
        }else{
            isfinished=true;
        }
        return value;
    }
    @Override
    public boolean isFinished(){
        if (isfinished ) {
            return true;
        }else{
            return super.isFinished();
        }
    }

}

