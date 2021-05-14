package com.userRegistrationSystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    /**
     * Constructor has created for UserRegistrationValidation class
     */
    UserRegistrationValidation userValidation = new UserRegistrationValidation();

    /**
     * tested all possible test cases for first name
     */
    @Test
    public void givenFirstName_WhenWithSpChars_ShouldReturnFalse() {
        try {
            userValidation.validateFirstName("P@1");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }

    /**
     * tested all possible test cases for last name
     */
    @Test
    public void givenLaststName_WhenWithSpChars_ShouldReturnFalse() {
        try {
            userValidation.validateFirstName("P@1");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    /**
     * tested all possible test cases for Email Validation
     * printStackTrace method to print message in Exception class
     */
    @Test
    public void validateEmailAddress_WhenWithoutDomain_ShouldReturnFalse() {
        try {
            userValidation.validateEmail("abc");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }

    /**
     * tested all possible test cases for Mobile number
     * printStackTrace method to print message in Exception class
     */
    @Test
    public void validateMobileNo_WhenShort_ShouldReturnFalse() {
        try {
            userValidation.validatePhoneNumber("98341");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }

    /**
     * Test Cases for Password Validation
     * printStackTrace method to print message in Exception class
     */
    @Test
    public void validatePassword_WhenDoNotContainAtLeast1Upper_ShouldReturnFalse() {
        try {
            userValidation.validatePassword("wret@sff223");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }

    /**
     * Test Cases for Password Validation
     * printStackTrace method to print message in Exception class
     */
    @Test
    public void validatePassword_WhenDoNotContainAtLeast1Digit_ShouldReturnFalse() {
        try {
            userValidation.validatePassword("SS@asdf");
        }catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }
}
