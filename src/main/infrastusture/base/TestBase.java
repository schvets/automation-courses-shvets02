package main.infrastusture.base;

import main.infrastusture.config.ConfigurationManager;
import main.infrastusture.TestServer;
import main.infrastusture.logging.AbstractLogger;
import main.infrastusture.logging.FileTestLogger;
import main.infrastusture.logging.StdTestLogger;
import main.infrastusture.wdm.DefaultWebDriverManager;
import main.infrastusture.wdm.WebDriverManager;

public class TestBase {
    private WebDriverManager wdm;
    protected TestServer server;
    protected AbstractLogger logger;

    private String browser;

    public void setup(){
        wdm = new DefaultWebDriverManager();
        logger = getLogger();
        browser = wdm.getBrowser();
        server = new TestServer();
        String url = server.getUrl();
        logger.log(url);
        logger.log(browser);
        beforeTest();
    }

    public void tearDown(){
        wdm.destroyBrowser(browser);
        afterTest();
    }

    public void beforeTest(){

    }

    public void afterTest(){
       logger.atFinish();

    }

    public AbstractLogger getLogger(){
        return ConfigurationManager.getInstance().getCurrentEnvironment().equals("local")
                ? new StdTestLogger() : new FileTestLogger();
    }
}
