package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		
		if(gender1.isEnabled()) {
			System.out.println("Unhidden");
		}else {
			System.out.println("Hide");
		}
		
		if(gender1.isDisplayed()) {
			System.out.println("visible");
			gender1.click();
			
			if(genicon.isSelected()) {
				System.out.println("Selected");
			}else {
				System.out.println("Not selected");
			}
		}else {
			System.out.println("No visible");
		}
	}

}
