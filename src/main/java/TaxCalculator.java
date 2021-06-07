/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Seney
 */

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the order amount?");
        double orderAmount = scanner.nextDouble();

        System.out.println("What is the state?");
        String state = scanner.next();

        final double taxRate = 0.055;

        double total = orderAmount;
        double addedTax = 0;

        if (state.equals("WI")) {


            addedTax = (orderAmount * taxRate);

            total = total + addedTax;

        }

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println((state.equals("WI")) ? "The subtotal is $" + df.format(orderAmount) +".\nThe tax is $" + df.format(addedTax) + ".\nThe total is $"
                + df.format(total) + "." : "The total is $" + df.format(total));
    }
}
