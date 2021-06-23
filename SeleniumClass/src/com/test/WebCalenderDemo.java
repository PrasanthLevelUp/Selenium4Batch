package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCalenderDemo {

	public static void main(String[] args) throws InterruptedException {// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai, Tamil Nadu, India");
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Coimbatore, Tamil Nadu, India");
		
		driver.findElement(By.xpath("//label[contains(text(),'Onward Date')]")).click();
				
		List<WebElement> onwordscal = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//tbody//tr"));
		System.out.println(onwordscal.size());
		
		for(int i=2;i<onwordscal.size()-1;i++) {
			
			List<WebElement> onwordscol = onwordscal.get(i).findElements(By.tagName("td"));
			
			for(int j=0;j<onwordscol.size();j++) {
				if(onwordscol.get(j).getText().equals("23")) {
					onwordscol.get(j).click();	
					break;
				}
			}
		}
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement returndate = driver.findElement(By.xpath("//input[@id='return_cal']"));
		js.executeScript("arguments[0].removeAttribute('readonly')", returndate);
		js.executeScript("arguments[0].setAttribute('data-caleng','24-Jun-2021')", returndate);
		//23-Jun-2021
		//driver.close();
	}

}
