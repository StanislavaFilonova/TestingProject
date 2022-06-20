package net.wordwall;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    public static ChromeDriver ChromeDriver; // видимость переменной всему методу

    // Аннотация Before
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/Stasya/Downloads/chromedriver"); // чтобы тест увидел chromedriver
        ChromeDriver = new ChromeDriver();
    }

    @After
    public void close() {
        ChromeDriver.quit(); // закрытие страницы
    }
}