package Part1_IntroductionToProgramming;

import java.util.Scanner;

/*
    Exercise 5: Bottle Deposits

    In many jurisdictions a small deposit is added to drink containers to encourage people
    to recycle them. In one particular jurisdiction, drink containers holding one liter or
    less have a $0.10 deposit, and drink containers holding more than one liter have a
    $0.25 deposit.

    Write a program that reads the number of containers of each size from the user.
    Your program should continue by computing and displaying the refund that will be
    received for returning those containers. Format the output so that it includes a dollar
    sign and always displays exactly two decimal places.
 */
public class Exercise_05 {
    public static void main(String[] args) {
        // In this exercise, we have two constants, one for containers equal or less than 1 liter
        // and the other for the containers holding more than one liter
        final double LESS_DEPOSIT = 0.10;
        final double MORE_DEPOSIT = 0.25;

        // Get the input from user
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many containers 1 liter or less do you have? ");
        double leesThanOne = scanner.nextDouble();

        System.out.print("How many containers more than 1 liter do you have? ");
        double moreThanOne = scanner.nextDouble();

        // Compute the refunds
        Double refundLess = leesThanOne * LESS_DEPOSIT;
        Double refundMore = moreThanOne * MORE_DEPOSIT;

        Double totalRefund = refundLess + refundMore;


        // You can compute these in one line, but in future you may need just one of them, and
        // computing separately is wise choice, and in this way it is simple to read.
        // refund = leesThanOne * LESS_DEPOSIT + moreThanOne * MORE_DEPOSIT

        // Display the result
        System.out.println("Your total refund will be $" + String.format("%.2f", totalRefund));
    }
}
