package main.infrastusture.wdm;

public interface WebDriverManager {
    String getBrowser();
    void destroyBrowser(String browser);
}
