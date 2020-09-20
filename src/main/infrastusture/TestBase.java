package main.infrastusture;

import main.infrastusture.logging.AbstractLogger;
import main.infrastusture.logging.FileTestLogger;
import main.infrastusture.logging.StdTestLogger;

public class TestBase {
    private WebDriverManager wdm;
    protected TestServer server;
    protected AbstractLogger logger;

    private String browser;

    public void setup(){
        wdm = new WebDriverManager();
        logger = getLogger();
        browser = wdm.createBrowser();
        server = new TestServer();
        String url = server.getUrl();
        logger.log(url);
        logger.log(browser);
        beforeTest();
    }

    public void tearDown(){
        wdm.destroyBrowser(browser);
    }

    public void beforeTest(){

    }

    public void afterTest(){

    }

    public AbstractLogger getLogger(){
        return ConfigurationManager.getInstance().getCurrentEnvironment().equals("local")
                ? new StdTestLogger() : new FileTestLogger();
    }
}
