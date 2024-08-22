package com.epam.rd.autotasks.pizzasplit;

import java.util.*;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        Scanner sc= new Scanner(System.in);

        int numberOfPeople=sc.nextInt();
        int numberOfPizza=sc.nextInt();
        sc.close();
        int x=numberOfPeople;
        int y=numberOfPizza;

        while (x!=y) {
            if (x<y) {
                x+=numberOfPeople;
            }else{
                y+=numberOfPizza;
            }
        }
        System.out.println(x/numberOfPizza);

    }
}
