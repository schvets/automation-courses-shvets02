package main.lessons.lesson10.website;

public class LoginTests extends AuthFlowBaseTest {

    @Override
    public void beforeTest(){
        super.beforeTest();
        logger.log("fill login");
    }

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
