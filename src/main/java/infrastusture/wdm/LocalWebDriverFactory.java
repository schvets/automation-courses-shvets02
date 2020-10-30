package infrastusture.wdm;


import infrastusture.BrowserType;
import infrastusture.config.ConfigurationManager;

public class LocalWebDriverFactory implements WebDriverFactory {
    public String create() {
        BrowserType testBrowser = ConfigurationManager.getInstance().getTestBrowser();
        switch (testBrowser) {
            case CHROME:
                return "local new Google Chrome driver";
            case FIREFOX:
                return "local new Mozilla Firefox driver";
            default:
                return "";
        }
    }
}
