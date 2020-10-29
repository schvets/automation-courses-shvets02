package main.infrastusture.wdm;

import main.infrastusture.BrowserType;
import main.infrastusture.config.ConfigurationManager;

public class RemoteWebDriverFactory implements WebDriverFactory {
    public String create() {
        BrowserType testBrowser = ConfigurationManager.getInstance().getTestBrowser();
        switch (testBrowser) {
            case CHROME:
                return "remote new Google Chrome driver";
            case FIREFOX:
                return "remote new Mozilla Firefox driver";
            default:
                return "";
        }
    }
}
