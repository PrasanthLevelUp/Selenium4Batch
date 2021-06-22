package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavasscriptExecutorDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//js.executeScript("alert('Test Succefull');");
		String jsurl = js.executeScript("return document.URL;").toString();
		System.out.println(jsurl);
		
		//js.executeScript("window.location='https://www.redbus.com/'");
		
		js.executeScript("document.getElementById('firstName').value='Victor';");
		
		//scroll - pixel x, y ---|||||
		js.executeScript("window.scrollBy(0,400)");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);

		String hbooies = "Sports";
		String[] hob = hbooies.split(",");
		System.out.println(hob[0]);
		
		

		// div[@id='hobbiesWrapper']//child::div[2]//child::div
		// div[@class='custom-control custom-checkbox custom-control-inline']

		List<WebElement> checkbox = driver
				.findElements(By.xpath("//div[@id='hobbiesWrapper']//div[2]//div"));
		System.out.println(checkbox.size());

		
		//driver.findElement(By.xpath("//div[@id='hobbiesWrapper']//div[2]//div[1]//label")).click();
		
		for (int i = 0; i < checkbox.size() - 1; i++) {
			WebElement name = checkbox.get(i).findElement(By.tagName("label"));
			WebElement icon = checkbox.get(i).findElement(By.tagName("input"));
			String names= name.getText();
			
			for(int j=0;j<hob.length;j++){
			if (names.equals(hob[j])) {
				//icon.click();
				name.click();
		
				//name.click();
				if(icon.isSelected()) {
					System.out.println("Is selected");
				}else {
					System.out.println("Not Selected");
				}
			}
			}
	}

		WebElement smt = driver.findElement(By.xpath("//button[@id='submit']"));
		//js.executeScript("arguments[0].click();", smt);
		js.executeScript("document.getElementById('submit').click();");

	}

}
