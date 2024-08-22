package com.epam.rd.autotasks;


class CycleSwap {
    static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void cycleSwap(int[] array) {
        int n=array.length;
        for(int i=0;i<n-1;i++){
            swap(array, i, n-1);
        }
    }

    static void cycleSwap(int[] array, int shift) {
        for(int i=0;i<shift;i++){
            cycleSwap(array);
        }

    }
}
