package net.wordwall;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends WebDriverSettings {

    @Test // аннотация тест от junit
    public void firstTest() {
        driver.get("https://wordwall.net/"); // открытие страницы

        String title = driver.getTitle(); // Переменная title, которую потом сравним с заголовком с сайта
        Assert.assertTrue(title.equals("Wordwall | Create better lessons quicker")); // проверка заголовкав
    }

    @Test // аннотация тест от junit
    public void firstTest2() {
        driver.get("https://wordwall.net/"); // открытие страницы

        String title = driver.getTitle(); // Переменная title, которую потом сравним с заголовком с сайта
        Assert.assertTrue(title.equals("Wordwall | Create better lessons quicker")); // проверка заголовкав
    }
}

