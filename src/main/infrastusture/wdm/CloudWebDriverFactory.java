package main.infrastusture.wdm;

import main.infrastusture.BrowserType;
import main.infrastusture.config.ConfigurationManager;

public class CloudWebDriverFactory implements WebDriverFactory {
    public String create() {
        BrowserType testBrowser = ConfigurationManager.getInstance().getTestBrowser();
        switch (testBrowser) {
            case CHROME:
                return "cloud new Google Chrome driver";
            case FIREFOX:
                return "cloud new Mozilla Firefox driver";
            default:
                return "";
        }
    }
}
