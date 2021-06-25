package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchResults {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		List<WebElement> pages = driver.findElements(By.xpath("//ul[@class='a-pagination']//li"));
		System.out.println(pages.size());
		
		int pagecount = Integer.parseInt(pages.get(pages.size()-2).getText());
		System.out.println(pagecount);
		
		List<WebElement> results = driver.findElements(By.cssSelector("div.s-main-slot.s-result-list div.s-result-item span.a-text-normal"));
		System.out.println(results.size());
		
		for(int i =0;i<results.size();i++) {
			String name = results.get(i).getText();
			if(name.contains("Lenovo V15-ADA")) {
				results.get(i).click();
			}
			
		}
		
		driver.close();
	}

}
