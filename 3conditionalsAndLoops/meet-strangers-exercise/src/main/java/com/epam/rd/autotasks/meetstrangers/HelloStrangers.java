package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.*;
public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        Scanner sc= new Scanner(System.in);
        ArrayList<String> ar= new ArrayList<>();
        int number= sc.nextInt();

        if (number==0) {
                System.out.println("Oh, it looks like there is no one here");
        }else if (number<0) {
                System.out.println("Seriously? Why so negative?");
        }else {
            for (int i = 0; i < number; i++) {
                String temp=sc.nextLine();
                if (!(temp.isEmpty())) {
                    ar.add(temp);
                }else{
                    number++;
                }
            }
        }
        for(int i=0;i<ar.size();i++){
            System.out.println("Hello, "+ar.get(i));
        }
        sc.close();
        //Then reads stranger names line by line and prints line by line "Hello, ...".
    }
}
