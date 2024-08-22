package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input
        int count =0;
        int total=0;
        while (true) {
            int temp=scanner.nextInt();
            if (temp==0) {
                break;
            }
            total+=temp;
            count++;
        }
        System.out.println(total/count);

    }

}
