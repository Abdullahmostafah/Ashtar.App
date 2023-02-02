package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Initialize driver
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        // Open Website
        driver.navigate().to("https://www.demoblaze.com/");

        // Prepare date to use
        String username = new String();
        username ="ahmedx12211"; //Changable
        String password = new String(); //Changable
        password ="ahmedx11221";

        // Signup Feature
        driver.findElement(By.id("signin2")).click();
        driver.findElement(By.id("sign-username")).sendKeys(username);
        driver.findElement(By.id("sign-password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@onclick='register()']")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();

        // login Feature
        driver.findElement(By.id("login2")).click();
        driver.findElement(By.id("loginusername")).sendKeys(username);
        driver.findElement(By.id("loginpassword")).sendKeys(password);
        driver.findElement(By.xpath("//button[@onclick='logIn()']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"logout2\"]")).click();


        // add items to cart
        driver.findElement(By.linkText("Laptops")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("next2")).click();
        driver.findElement(By.linkText("ASUS Full HD")).click();
        driver.findElement(By.linkText("Add to cart")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        driver.findElement(By.id("nava")).click();
        driver.findElement(By.linkText("Samsung galaxy s6")).click();
        driver.findElement(By.linkText("Add to cart")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();

        // Purchase
        driver.findElement(By.id("cartur")).click();
        driver.findElement(By.xpath("//button[@data-toggle='modal']")).click();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("ahmed");
        driver.findElement(By.xpath("//input[@id='card']")).sendKeys("4738");
        driver.findElement(By.xpath("//button[@onclick='purchaseOrder()']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@tabindex='1']")).click();



        // Contact Support
        driver.findElement(By.linkText("Contact")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@onclick='send()']")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();

        // Quit driver
        driver.quit();
    }
}