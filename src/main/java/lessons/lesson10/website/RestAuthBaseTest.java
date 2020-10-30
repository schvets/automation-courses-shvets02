package lessons.lesson10.website;


import infrastusture.base.TestBase;

public class RestAuthBaseTest extends TestBase {

    @Override
    public void beforeTest(){
        logger.atStart();
        logger.log("REST auth");
        logger.log("refresh page");
    }
}
