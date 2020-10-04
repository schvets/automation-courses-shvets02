package main.infrastusture.wdm;

import main.infrastusture.config.ConfigurationManager;

public class RemoteWebDriverFactory implements WebDriverFactory {
    public String create() {
        String testBrowser = ConfigurationManager.getInstance().getTestBrowser();
        switch (testBrowser) {
            case "chrome":
                return "remote new Google Chrome driver";
            case "firefox":
                return "remote new Mozilla Firefox driver";
            default:
                return "";
        }
    }
}
