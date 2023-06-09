package Part1_IntroductionToProgramming;

/*
    Exercise 2: Hello

    Write a program that asks the user to enter his or her name. The program should
    respond with a message that says hello to the user, using his or her name.
 */

import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        // Get user input
        String userName = scanner.nextLine();

        System.out.println("Hello, " + userName);
    }
}
