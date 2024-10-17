package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSeconds = scanner.nextInt();
        scanner.close();

        // Calculate hours, minutes, and seconds
        int hours = totalSeconds / 3600;
        int finalHours=hours==24?0:hours;
        int remainingMinutes = totalSeconds % 3600;
        int minutes = remainingMinutes / 60;
        int seconds = remainingMinutes % 60;

        // Format the output
        String formattedHours = String.format("%01d", finalHours);
        String formattedMinutes = String.format("%02d", minutes);
        String formattedSeconds = String.format("%02d", seconds);

        // Print the result
        System.out.printf("%s:%s:%s\n", formattedHours, formattedMinutes, formattedSeconds);
        // some other methods to remember 
        // converting a number to String
        //  int number;
        //  String numStr=String.valueOf(number);
        //  converting a character to number;
        //  for(int i=0;i<numStr.length();i++){
        //  int digit=numStr.charAt(i)-'0';
        //  }
        //
        //  adding a padding to a number;
        //  %.2f this is the value
        //
        //  converting a stringbuilder type to string type
        //  stringbuilder res=new stringbuilder();
        //  String str=res.toString();
    }
}

