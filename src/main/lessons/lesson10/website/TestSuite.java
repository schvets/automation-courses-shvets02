package main.lessons.lesson10.website;

import main.infrastusture.logging.AbstractLogger;

public class TestSuite {
    public static void main(String[] args) {

        LoginTests test1 = new LoginTests();
        test1.setup();
        test1.loginTest();
        test1.tearDown();

        test1.setup();
        test1.loginTestNegative();
        test1.tearDown();

        RegistrationTests test2 = new RegistrationTests();
        test2.setup();
        test2.registrationTestNegative();
        test2.tearDown();

        test2.setup();
        test2.registrationTestPositive();
        test2.tearDown();

    }
}
