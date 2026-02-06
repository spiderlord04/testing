package com.example.selenium_demo;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HobbyTest {

    @Test
    public void hobbyTest() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:8080/selenium-demo/hobby.html");

        // select all hobby checkboxes
        List<WebElement> hobbies = driver.findElements(By.name("hobby"));

        for (WebElement hobby : hobbies) {
            if (!hobby.isSelected()) {
                hobby.click();
            }
        }

        // click submit
        driver.findElement(By.id("submit")).click();

        // verify result
        Assertions.assertTrue(driver.getPageSource().contains("cricket"));

        driver.quit();
    }
}
