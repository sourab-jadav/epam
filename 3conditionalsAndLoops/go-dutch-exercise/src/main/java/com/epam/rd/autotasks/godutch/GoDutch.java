package com.epam.rd.autotasks.godutch;
import java.util.*;

import java.util.Scanner;

public class GoDutch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read bill total amount
        int billTotal = scanner.nextInt();
        if (billTotal < 0) {
            System.out.println("Bill total amount cannot be negative");
            return;
        }

        // Read number of friends
        int numberOfFriends = scanner.nextInt();
        if (numberOfFriends <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
            return;
        }

        // Calculate the total amount with tips
        int totalWithTip = billTotal + (billTotal / 10);

        // Calculate the part each friend has to pay
        int partToPay = totalWithTip / numberOfFriends;

        // Print the result
        System.out.println(partToPay);
    }
}

// public class GoDutch {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int totalAmount =sc.nextInt();
//         int friendsNumber=sc.nextInt();
//         if (totalAmount<0) {
//             System.out.println("Bill total amount cannot be negative");
//         }
//         if (friendsNumber<=0) {
//             System.out.println("Number of friends cannot be negative or zero");
//         }
//         int amountToBePaid=totalAmount/friendsNumber;
//         double tip=0.1*totalAmount;
//         double final_tip=tip/5;
//         int final_amount=amountToBePaid+(int)final_tip;
//         System.out.println(final_amount);
//         sc.close();
//     }
// } // galeez code
