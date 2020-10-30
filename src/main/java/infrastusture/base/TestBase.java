package infrastusture.base;

import infrastusture.TestServer;
import infrastusture.config.ConfigurationManager;
import infrastusture.logging.AbstractLogger;
import infrastusture.logging.FileTestLogger;
import infrastusture.logging.StdTestLogger;
import infrastusture.wdm.DefaultWebDriverManager;
import infrastusture.wdm.WebDriverManager;


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
