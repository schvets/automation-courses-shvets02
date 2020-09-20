package main.lessons.lesson10.website;

import main.infrastusture.TestBase;

public class LoginTests extends AuthFlowBaseTest {

    @Override
    public void beforeTest(){
        beforeAuth();
        logger.log("fill login");
    }

//    public void beforeTest(){
//        beforeAuth();
//        logger.log("switch to registration page");
//        logger.log("fill login");
//        logger.log("fill password");
//    }

    public void loginTest(){
        logger.log("fill password");
        logger.log("submit login form");
        logger.log("check is logged in");
    }

    public void loginTestNegative(){
        logger.log("submit login form");
        logger.log("check error");
    }
}
