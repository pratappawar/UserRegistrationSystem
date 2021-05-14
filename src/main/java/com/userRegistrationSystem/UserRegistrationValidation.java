package com.userRegistrationSystem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationValidation {
    /**
     * declare All pattern as a constant which does not chage in whole program
     */
    private static final String NAME_PATTERN = "^([A-Z]{1})+[a-zA-Z]{2,}$";
    private static final String EMAIL_PATTERN = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9]{2,6}$";
    private static final String PHONE_NO_PATTERN = "^[0-9]{2}[ ]+[0-9]{10}";
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[@#$%^&!])(?=.*[A-Z])(?=.*[a-z]).{8,}$";
    static Scanner scan = new Scanner(System.in);

    /**
     * Validate first name with pattern NAME_PATTERN
     * @param first_name
     * @return
     */
    public static boolean validateFirstName(String first_name) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(first_name);
        if (matcher.matches()) {
            return true;
        } else {
            throw new UserRegistrationException("Enter valid name");
        }

    }

    /**
     * Validate last name with pattern NAME_PATTERN
     * @param last_name
     * @return
     */
    public static boolean validateLastName(String last_name) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(last_name);
        if (matcher.matches()) {
            return true;
        } else {
            throw new UserRegistrationException("Enter valid name");
        }
    }

    /**
     * Validate Email with pattern Email pattern
     * @param testEmail
     * @return
     */
    public static boolean validateEmail(String testEmail) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(testEmail);
        if (matcher.matches()) {
            return true;
        } else {
            throw new UserRegistrationException("Enter valid name");
        }
    }

    /**
     * Validate Phone number with pattern PHONE_NO_PATTERN
     * @param phone_number
     * @return
     */
    public static boolean validatePhoneNumber(String phone_number) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(PHONE_NO_PATTERN);
        Matcher matcher = pattern.matcher(phone_number);
        if (matcher.matches()) {
            return true;
        } else {
            throw new UserRegistrationException("Enter valid name");
        }
    }

    /**
     * Validate Password with pattern Password pattern
     * @param password
     * @return
     */
    public static boolean validatePassword(String password) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            return true;
        } else {
            throw new UserRegistrationException("Enter valid name");
        }
    }

    /**
     * main method to call different method
     * @param args
     */
    public static void main(String[] args)throws UserRegistrationException {
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