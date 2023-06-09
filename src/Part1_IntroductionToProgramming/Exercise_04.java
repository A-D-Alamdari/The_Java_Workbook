package Part1_IntroductionToProgramming;

import java.util.Scanner;

/*
    Exercise 4:Area of a Field

    Create a program that reads the length and width of a farmer’s field from the user in
    feet. Display the area of the field in acres.

    Hint: There are 43,560 square feet in an acre.
 */
public class Exercise_04 {
    public static void main(String[] args) {
        // Since there are 43560 square feet in an acre, and it is constant number
        // We can define a variable for this, which its name should be in uppercase.
        int SQFT_PER_ACRE = 43560;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width of the field in feet: ");
        float width = scanner.nextFloat();

        System.out.print("Enter the length of the field in feet: ");
        float length = scanner.nextFloat();

        // Compute the area of the field in square feet
        float areaInSqFt = length * width;

        // Convert the area in square feet to acre
        float areaInArce = areaInSqFt / SQFT_PER_ACRE;

        System.out.println("The area of the field is " + areaInSqFt + " square feet or " +
                String.format("%.3f", areaInArce) + " acres.");
    }
}
