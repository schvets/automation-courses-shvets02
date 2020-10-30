package infrastusture.wdm;

import infrastusture.BrowserType;
import infrastusture.config.ConfigurationManager;

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
