package lessons.lesson10.website;


import infrastusture.base.TestBase;

public class AuthFlowBaseTest extends TestBase {

    public void beforeTest(){
        logger.atStart();
        logger.log("open home page");
        logger.log("open login page");
    }
}
