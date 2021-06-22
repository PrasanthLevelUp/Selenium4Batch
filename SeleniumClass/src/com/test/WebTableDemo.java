package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		
		List<WebElement> trows = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tbody//tr"));
		System.out.println(trows.size());
		
		for(int i=0;i<trows.size();i++) {
			String colhead = trows.get(i).findElement(By.tagName("th")).getText();
			if(colhead.equalsIgnoreCase("Financial Center")) {	
				List<WebElement> tcolums = trows.get(i).findElements(By.tagName("td"));
				System.out.println(tcolums.size());
				for(int j=0;j<tcolums.size();j++) {
					System.out.println(tcolums.get(j).getText());
				}
				
				//System.out.println(tcolums.get(0).getText());
				break;
			}
		}
		
		driver.close();
	}

}
