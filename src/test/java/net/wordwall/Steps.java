package net.wordwall;

import org.junit.Assert;
import org.junit.Test;

import static net.wordwall.WebDriverSettings.driver;

public class Steps {

    @Test // аннотация тест от junit
    public void test() {
        driver.get("https://wordwall.net/"); // открытие страницы

        String title = driver.getTitle(); // Переменная title, которую потом сравним с заголовком с сайта
        Assert.assertTrue(title.equals("Wordwall | Create better lessons quicker")); // проверка заголовкав
    }
}



