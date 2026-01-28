package com.example.selenium_demo;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest {

    @Test
    void validLoginTest() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Change port if needed (8080 / 9090 etc.)
        driver.get("http://localhost:8080/BasicTesting/login.html");

        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("1234");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        // Validate success
        assertTrue(driver.getPageSource().contains("Login Successful"));

        driver.quit();
    }
}