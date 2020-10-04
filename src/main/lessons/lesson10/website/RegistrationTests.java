package main.lessons.lesson10.website;

public class RegistrationTests extends AuthFlowBaseTest {

    @Override
    public void beforeTest(){
        super.beforeTest();
        logger.log("switch to registration page");
        logger.log("fill login");
        logger.log("fill password");
    }

    public void registrationTestPositive(){
        logger.log("fill password");
        logger.log("submit registration form");
        logger.log("check is registred in");
    }

    public void registrationTestNegative(){
        logger.log("submit registration form");
        logger.log("check is error visible");
    }
}
