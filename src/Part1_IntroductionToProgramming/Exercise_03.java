package Part1_IntroductionToProgramming;

import java.util.Scanner;

/*
    Exercise 3:Area of a Room

    Write a program that asks the user to enter the width and length of a room. Once
    the values have been read, your program should compute and display the area of the
    room. The length and the width will be entered as floating point numbers. Include
    units in your prompt and output message; either feet or meters, depending on which
    unit you are more comfortable working with.
 */
public class Exercise_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the room: ");
        float width = scanner.nextFloat();

        System.out.print("Enter the length of the room: ");
        float length = scanner.nextFloat();

        // Calculate the area
        float area = width * length;

        System.out.println("The area of the room is: " + area + " [mˆ2].");
    }
}
