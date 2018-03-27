package core;


import org.openqa.selenium.chrome.ChromeOptions;

public abstract class Options {

    public ChromeOptions chromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--disable-infobars");
        return options;
    }
}
