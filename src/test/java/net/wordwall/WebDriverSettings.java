package net.wordwall;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    public ChromeDriver driver; // видимость переменной всему методу

    // Аннотация Before
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/Stasya/Downloads/chromedriver"); // чтобы тест увидел chromedriver
        driver = new ChromeDriver();
    }

    @After
    public void close() {
        driver.quit(); // закрытие страницы
    }
}