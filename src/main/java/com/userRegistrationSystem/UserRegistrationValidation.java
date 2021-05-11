package com.userRegistrationSystem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationValidation {

    static Scanner scan = new Scanner(System.in);

    public static boolean validateFirstName(String first_name) {
        String firstNamePattern = "^([A-Z]{1})+[a-zA-Z]{2,}$"; //set Pattern
        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(first_name);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validateLastName(String last_name) {
        String firstNamePattern = "^([A-Z]{1})+[a-zA-Z]{2,}$"; //set Pattern
        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(last_name);
        if (matcher.matches()) {
            System.out.println("'" + last_name + "'" + " validation successful ! ");
            return true;
        } else {
            System.out.println("'" + last_name + "'" + " validation unsuccessful ! ");
            return false;
        }
    }

    public static boolean validateEmail(String email) {
        String emailPattern = "^[a-zA-Z0-9]+[.(a-zA-Z0-9)]*[@]{1}[a-z]+[.]{1}[a-z]{2,4}[.]*[a-z]*{2}$";  //set pattern for email id
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validatePhoneNumber(String phone_number) {
        String phoneNumberPattern = "^[0-9]{2}[ ]+[0-9]{10}";    //set pattern
        Pattern pattern = Pattern.compile(phoneNumberPattern);
        Matcher matcher = pattern.matcher(phone_number);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validatePassword(String password) {
        String passwordPattern = "^(?=.*[0-9])(?=.*[@#$%^&!])(?=.*[A-Z])(?=.*[a-z]).{8,}$"; //set Pattern
        Pattern pattern = Pattern.compile(passwordPattern);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Project ");
        System.out.println("Enter First name ");
        validateFirstName(scan.nextLine());
        System.out.println("Enter last name ");
        validateLastName(scan.nextLine());
        System.out.println("Enter email name ");
        validateEmail(scan.nextLine());
        System.out.println(" Enter mobile number: ");
        validatePhoneNumber(scan.nextLine());
        System.out.println("Enter password: ");
        validatePassword(scan.nextLine());
    }
}
