package com.epam.rd.autotasks.snail;
import java.util.*;

public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree

        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();

        int days=1;
        if (a-b<=0 && a<h) {
                System.out.println("Impossible");
        }else{
            int result=0;
            while (result+a<h) {
                result+=(a-b);
                days++;
            }
            System.out.println(days);
        }
    }
}
