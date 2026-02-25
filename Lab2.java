// Author: Majeed Hashmi
// Filename: Lab2
// Specification: input two numbers and then concatenates them
// Time Spent: 20 mins

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        String FirstName = "";
        String LastName = "";
        String FullName = "";
        int nameLength = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first name: ");
        FirstName = scan.nextLine();

        System.out.println("Please enter your last name:");
        LastName = scan.nextLine();

        if (FirstName.isEmpty() || LastName.isEmpty()) {
            System.out.println("Error: First name or Last name cannot be empty.");
        } else {
            FullName = FirstName + " " + LastName;
            FullName = FullName.toUpperCase();
            nameLength = FullName.length();

            System.out.println("Full Name = " + FullName);
            System.out.println("Total Number of Characters = " + nameLength);
        }
    }
}