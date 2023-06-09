package Part1_IntroductionToProgramming;

/*
    Exercise 1: Mailing Address

    Create a program that displays your name and complete mailing address formatted in
    the manner that you would usually see it on the outside of an envelope. Your program
    does not need to read any input from the user.
 */

public class Exercise_01 {
    public static void main(String[] args) {
        String myName = "John Wick";
        String myDepartment = "Department of Computer Science";
        String myUniversity = "Ozyegin University";
        String myAddressLine1 = "Nisantepe, Orman St., Ozyegin University, AB4 Building, B4 floor, Office No: B426";
        String myAddressLine2 = "Cekmekoy-Istanbul";

        System.out.println(myName);
        System.out.println(myDepartment);
        System.out.println(myUniversity);
        System.out.println(myAddressLine1);
        System.out.println(myAddressLine2);
    }
}
