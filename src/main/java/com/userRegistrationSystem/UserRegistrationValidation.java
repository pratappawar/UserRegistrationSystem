package com.userRegistrationSystem;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationValidation {

    static Scanner scan = new Scanner(System.in);

    public static void validateFirstName() {
        System.out.println("Enter First name ");
        String first_name = scan.nextLine();
        String firstNamePattern = "^[A-Z]{1}[a-z,A-Z]{2,}";
        Pattern pattern = Pattern.compile(firstNamePattern);

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
        Pattern pattern = Pattern.compile(lastNamePattern);
        if (last_name.matches(lastNamePattern)) {
            System.out.println("'" + last_name + "'" + " validation success !");
        } else {
            System.out.println("'" + last_name + "'" + " validation unsuccessful ! ");
        }
    }

    public static void validateEmail() {
        System.out.println("Enter email ");
        String email = scan.nextLine();         //Accept Email id
        String emailPattern = "^[a-zA-Z0-9]+[.(a-zA-Z0-9)]*[@]{1}[a-z]+[.]{1}[a-z]{2,4}[.]*[a-z]*{2}$";  //set pattern for email id
        Pattern pattern = Pattern.compile(emailPattern);
        if (email.matches(emailPattern)) {                                                               //check Input and Pattern
            System.out.println("'" + email + "'" + " validation success !");
        } else {
            System.out.println("'" + email + "'" + " validation unsuccessful !");
        }
    }

    public static void validatePhoneNumber() {
        System.out.println("Enter Enter mobile number: ");
        String phoneNumber = scan.nextLine();                 //Accept Number
        String phoneNumberPattern = "^[0-9]{2}[ ]+[0-9]{10}";    //set pattern
        Pattern pattern = Pattern.compile(phoneNumberPattern);
        if (phoneNumber.matches(phoneNumberPattern)) {                //Check input and Pattern
            System.out.println("'" + phoneNumber + "'" + " validation success !");
        } else {
            System.out.println("'" + phoneNumber + "'" + " validation unsuccessful !");
        }
    }

    public static void validatePassword() {
        System.out.println("Enter password: ");
        String password = scan.nextLine();              //Accept input
        String passwordPattern = "^(?=.*[0-9])(?=.*[@#$%^&!])(?=.*[A-Z])(?=.*[a-z]).{8,}$"; //set Pattern
        Pattern pattern = Pattern.compile(passwordPattern);
        if (password.matches(passwordPattern)) {       //Check Input And Pattern
            System.out.println("'" + password + "'" + " validation success !");
        } else {
            System.out.println("'" + password + "'" + " validation unsuccessful !");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Project ");
        validateFirstName();
        validateLastName();
        validateEmail();
        validatePhoneNumber();
        validatePassword();
    }
}
