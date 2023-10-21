package com.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BasePage {
    public static WebDriver driver;

    public static void initialize(String browser) {

        if (browser.equalsIgnoreCase("chrome") == true) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox") == true) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("safari") == true) {
            WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();
        } else {
            System.out.println("No driver found");
        }
    }
}
