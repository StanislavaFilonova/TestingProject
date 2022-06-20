package net.wordwall;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static net.wordwall.WebDriverSettings.ChromeDriver;

public class MainPage {
    static WebElement aboutButton =
            ChromeDriver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[1]/div[2]/ul/li[1]/p"));
    static WebElement servicesButton =
            ChromeDriver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[1]/div[2]/ul/li[2]/p"));
    static WebElement expertiseButton =
            ChromeDriver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[1]/div[2]/ul/li[3]/p"));
}
