package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownDemo {

	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//selectdropdonw();
		//bootsrap();
		dynamicdown();
	}
	
	static void selectdropdonw() {
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement select = driver.findElement(By.xpath("//select[@id='select-demo']"));
		Select sel = new Select(select);
		sel.selectByIndex(3);
		sel.selectByValue("Wednesday");
		sel.selectByVisibleText("Saturday");
	}
	
	static void bootsrap() {
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		List<WebElement> crs = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li//a"));
		System.out.println(crs.size());
		
		for(int i=0;i<crs.size()-1;i++) {
			String name = crs.get(i).getText();
			if(name.equals("JavaScript")) {
				crs.get(i).click();
				break;
			}
		}	
	}
	
	static void dynamicdown() {
		driver.get("https://www.redbus.com/");
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("che");

		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@class='autoFill']")));
		
		List<WebElement> crs = driver.findElements(By.xpath("//ul[@class='autoFill']//li"));
		System.out.println(crs.size());
		
		for(int i=0;i<crs.size()-1;i++) {
			String name = crs.get(i).getText();
			if(name.contains("Egmore")) {
				crs.get(i).click();
				break;
			}
		}	
	}
	

}
