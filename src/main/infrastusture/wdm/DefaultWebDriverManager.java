package main.infrastusture.wdm;

import main.infrastusture.config.ConfigurationManager;

public class DefaultWebDriverManager implements WebDriverManager{
    @Override
    public String getBrowser() {
        String runOn = ConfigurationManager.getInstance().getRunOn();
//        local, remote, cloud
        WebDriverFactory factory;
        switch (runOn){
            case "local" :
                factory = new LocalWebDriverFactory();
                break;
            case "remote":
                factory = new RemoteWebDriverFactory();
                break;
            case "cloud":
                factory = new CloudWebDriverFactory();
                break;
            default:
                factory = new LocalWebDriverFactory();
        }
        return factory.create();
    }

    @Override
    public void destroyBrowser(String browser) {

    }
}
