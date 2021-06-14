package com.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Thread - java
		Thread.sleep(5000);
		
		WebElement gender1 = driver.findElement(By.cssSelector("label.custom-control-label[for='gender-radio-1']"));
		WebElement genicon = driver.findElement(By.cssSelector("input#gender-radio-1"));
		//Explicit wait
		
		//webdriverwait 
		
		WebDriverWait wait= new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.elementToBeClickable(gender1)).click();
		wait.until(ExpectedConditions.alertIsPresent());
		
		//fluent wait
		
		Wait wait1 = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(Exception.class);
		wait1.until(ExpectedConditions.elementToBeClickable(gender1));
		
		
		

	}

}
