package com.epam.rd.autotasks;


// we need dec to increase after every cycle
public class GraduallyDecreasingCarousel extends DecrementingCarousel{
    public GraduallyDecreasingCarousel(final int capacity) {
        super(capacity);
        // now  we have the carousel ready now we need to manupulate it 
        // in a way so that dec get increased after every cycle
    }
        @Override
        public CarouselRun run(){
            if (super.run()!=null) {
                return new GraduallyDecreasingRun(arr,index);
            }
            return null;
        }
}
/**
 * GraduallyDecreasingRun
 */
class GraduallyDecreasingRun extends CarouselRun{
    private int [] decrement;
    public GraduallyDecreasingRun(int [] elements,int count){
        super(elements, count);
        decrement=new int[count];
        for(int i=0;i<decrement.length;i++){
            decrement[i]=1;
        }
    }
    // what we have ?
    // we have the number of elements that are greater than 0

    @Override
    public int next(){
        if (isFinished()) {
            return -1;
        } else {
            while (arr[index] <= 0 ) {
                index = (index + 1) % arr.length;
            }
            int value=arr[index];
            arr[index]-=decrement[index];
            decrement[index]++;
            index=(index+1)%arr.length;
            printDecrement();
            return value;
        }
    }

    public void printDecrement(){
        for(int i=0;i<decrement.length;i++){
            System.out.print(decrement[i]+" ");
        }
        System.out.println();

    }
    
}

