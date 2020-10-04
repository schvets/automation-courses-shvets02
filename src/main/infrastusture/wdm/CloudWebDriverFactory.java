package main.infrastusture.wdm;

import main.infrastusture.config.ConfigurationManager;

public class CloudWebDriverFactory implements WebDriverFactory {
    public String create() {
        String testBrowser = ConfigurationManager.getInstance().getTestBrowser();
        switch (testBrowser) {
            case "chrome":
                return "cloud new Google Chrome driver";
            case "firefox":
                return "cloud new Mozilla Firefox driver";
            default:
                return "";
        }
    }
}
