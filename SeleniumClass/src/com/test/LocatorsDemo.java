package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	//Locators
	//We have 8 Locators
	
	//1.using id = id="src"
	//2.class class="db"
	//3.name - name = 
	//4.linkText
	//5.PartialLinkText
	//6.tagname - a	
	
	//7.xpath
	//8.cssselector

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
			
		WebElement from = driver.findElement(By.id("firstName"));
		from.sendKeys("Victor");
		WebElement last = driver.findElement(By.id("lastName"));
		last.sendKeys("Sam");
		
		List<WebElement> inputs = driver.findElements(By.tagName("a"));
		
		System.out.println(inputs.size());
			
		driver.get("https://www.google.com/");
		/*driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("btnK")).click();*/
		//driver.findElement(By.linkText("About")).click();
		driver.findElement(By.partialLinkText("Search works")).click();
		driver.close();

	}

}
