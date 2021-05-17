package com.userRegistrationSystem;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Declared Interface
 */
@FunctionalInterface
interface IValidate_UserDetail{
    boolean userValidation(String userDetails,String pattern);
}

public class UserRegistrationValidation {
    /**
     * declare All pattern as a constant which does not change in whole program
     */
    private static final String NAME_PATTERN = "^([A-Z]{1})+[a-zA-Z]{2,}$";
    private static final String EMAIL_PATTERN = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9]{2,6}$";
    private static final String PHONE_NO_PATTERN = "^[0-9]{2}[ ]+[0-9]{10}";
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[@#$%^&!])(?=.*[A-Z])(?=.*[a-z]).{8,}$";
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)throws UserRegistrationException {
        IValidate_UserDetail validateUser=(userDetails,pattern)->Pattern.matches(userDetails,pattern);
        try {
            System.out.println("Welcome to User Registration Project ");
            System.out.println("Enter First name ");
            System.out.println("Valid first name:"+validateUser.userValidation(scan.nextLine(),NAME_PATTERN ));
            System.out.println("Enter last name ");
            System.out.println("Validate last Name: "+validateUser.userValidation(scan.nextLine(),NAME_PATTERN ));
            System.out.println("Enter email name ");
            System.out.println("validate Email: "+validateUser.userValidation(scan.nextLine(),EMAIL_PATTERN));
            System.out.println(" Enter mobile number: ");
            System.out.println("Validate phone Number: "+validateUser.userValidation(scan.nextLine(),PHONE_NO_PATTERN));
            System.out.println("Enter password: ");
            System.out.println("Validate Password: "+validateUser.userValidation(scan.nextLine(),PASSWORD_PATTERN));
        } catch (Exception e) {
            throw new UserRegistrationException("Please Enter Valid Detail");
        }
    }
}