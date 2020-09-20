package main.infrastusture;

public class WebDriverManager {

    public String createBrowser() {
        String testBrowser = ConfigurationManager.getInstance().getTestBrowser();
        switch (testBrowser) {
            case "chrome":
                return "new Google Chrome driver";
            case "firefox":
                return "new Mozilla Firefox driver";
            default:
                return "";
        }
    }

    public void destroyBrowser(String browser){
        if(browser != null){
            System.out.println("Browser closed");
        }
    }


}