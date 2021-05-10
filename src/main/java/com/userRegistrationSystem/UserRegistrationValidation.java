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
    public static void validateLastName() {
        System.out.println("Enter last name ");
        String last_name = scan.nextLine();
        String lastNamePattern = "^[A-Z]{1}[a-z,A-Z]{2,}";
        Pattern pattern= Pattern.compile(lastNamePattern);
        if (last_name .matches(lastNamePattern)) {
            System.out.println("'" + last_name  + "'" + " validation success !");
        } else {
            System.out.println("'" + last_name  + "'" + " validation unsuccessful ! ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Project ");
        validateFirstName();
        validateLastName();

    }
}
