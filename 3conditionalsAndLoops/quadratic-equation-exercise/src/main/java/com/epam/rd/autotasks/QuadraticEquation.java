package com.epam.rd.autotasks;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double r1,r2;

        double des= (b*b-4*a*c);

        if (des==0) {
            r1=r2=(-b/2*a);
            if (Math.floor(r1)==r1) {
                System.out.print((int)r1);
            }else{
                System.out.println(r1);
            }
        }
        else if(des>0){
            r1=(-b+sqrt(des))/(2*a);
            r2=(-b-sqrt(des))/(2*a);
            if (Math.floor(r1)==r1) {
                System.out.print((int)r1);
            }else{
                System.out.print(r1);
            }
            System.out.print(" ");
            if (Math.floor(r2)==r2) {
                System.out.print((int)r2);
            }else{
                System.out.print(r2);
            }
        }else{
            System.out.println("no roots");
        }
    }

}
