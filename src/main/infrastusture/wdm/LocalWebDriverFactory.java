package main.infrastusture.wdm;

import main.infrastusture.config.ConfigurationManager;

public class LocalWebDriverFactory implements WebDriverFactory {
    public String create() {
        String testBrowser = ConfigurationManager.getInstance().getTestBrowser();
        switch (testBrowser) {
            case "chrome":
                return "local new Google Chrome driver";
            case "firefox":
                return "local new Mozilla Firefox driver";
            default:
                return "";
        }
    }
}
