package main.lessons.lesson10.website;

import main.infrastusture.TestBase;

public class AuthFlowBaseTest extends TestBase {

    public void beforeAuth(){
        logger.log("open home page");
        logger.log("open login page");
    }
}
