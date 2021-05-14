package com.userRegistrationSystem;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * added an annotation @Runwith which takes class as an argument.
 */
@RunWith(Parameterized.class)
public class UserRegistrationParameterizedTest {
    public String testEmail;
    public boolean expectedResult;
    public UserRegistrationValidation userRegistration;

    //--------------------------Test Cases for email with Parameterized constructor--------------------------//
    public UserRegistrationParameterizedTest(String testEmail, boolean expectedResult) {
        super();
        this.testEmail = testEmail;
        this.expectedResult = expectedResult;
    }

    /**
     * @before annotation runs before with each test run
     */
    @Before
    public void initialize() {
        userRegistration = new UserRegistrationValidation();
    }

    /**
     * this is a collection to run will multiple email.
     *
     * @return
     */
    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true}, {"abc-100@yahoo.com", true}, {"abc.100@yahoo.com", true}, {"abc111@abc.com", true}
                , {"abc-100@abc.net", true}, {"abc.100@abc.com.au", true}, {"abc@1.com", true}, {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true}, {"abc", false}, {"abc@.com.my", false}, {"abc123@gmail.a", false}, {"abc123@.com", false}, {"abc123@.com.com", false},
                {".abc@abc.com", false}, {"abc()*@gmail.com", false}, {"abc@%*.com", false}, {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false}, {"abc@abc@gmail.com", false}
        });
    }
    /**
     * Test case actually runs from here
     */
    @Test
    public void testUserRegistrationTest() {
        System.out.println("This is Expected Result " + this.expectedResult);
        Assertions.assertEquals(expectedResult, userRegistration.validateEmail(testEmail));
    }
}