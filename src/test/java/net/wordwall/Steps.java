package net.wordwall;

import org.junit.Assert;
import org.junit.Test;

import static net.wordwall.WebDriverSettings.ChromeDriver;

public class Steps {

    @Test // аннотация тест от junit
    public void test() {
        ChromeDriver.get("https://wordwall.net/"); // открытие страницы

        String title = ChromeDriver.getTitle(); // Переменная title, которую потом сравним с заголовком с сайта
        Assert.assertTrue(title.equals("Wordwall | Create better lessons quicker")); // проверка заголовкав
    }
}



