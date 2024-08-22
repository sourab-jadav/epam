package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner sc= new Scanner(System.in);
        int current_max=Integer.MIN_VALUE;
        while (true) {
            int temp=sc.nextInt();
            if (temp==0) {
                break;
            }
            current_max=current_max>temp?current_max:temp;
        }


        return current_max;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
