package com.userRegistrationSystem;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationValidation {

    static Scanner scan = new Scanner(System.in);

    public static void validateFirstName() {
        System.out.println("Enter First name ");
        String first_name = scan.nextLine();
        String firstNamePattern = "^[A-Z]{1}[a-z,A-Z]{2,}";
        Pattern pattern= Pattern.compile(firstNamePattern);
        if ((first_name.matches(firstNamePattern))) {
            System.out.println("'" + first_name + "'" + " validation success !");
        } else {
            System.out.println("'" + first_name + "'" + " validation unsuccessful ! ");
        }
    }

    public static boolean validateLastName(String name) {
        String expression = "^[A-Z]{1}[a-z,A-Z]{2,}";
        if (name.matches(expression)) {
            System.out.println("'" + name + "'" + " validation success !");
            return true;
        } else {
            System.out.println("'" + name + "'" + " validation unsuccessful ! ");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Project ");
<<<<<<< HEAD
        System.out.println("Enter First name ");
        String first_name = scan.nextLine();
        System.out.println(validateFirstName(first_name));
        System.out.println("Enter Last name ");
        String last_name=scan.nextLine();
        System.out.println(validateLastName(last_name));
=======
        validateFirstName();

>>>>>>> UC1_Enter_valid_first_name
    }
}
