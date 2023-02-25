package com.skocur.chromerunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * <h1>Website</h1>
 * This class is responsible for opening web browser with given URL.
 *
 * @author oleitao
 */
class Website implements Runnable {

    private String url;
    private WebDriver driver;

    public Website(String url) {
        this.url = url;
    }

    @Override
    public void run() {

    	driver = new FirefoxDriver();
        
        driver.get(url);
        
        LogWindow.addLog("Successfully opened: " + url);
    }
}
