package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandling {

	
	final int a =10;
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();

		//
		
		
		//try -catch
		//block action
		try {
			driver.findElement(By.xpath("//input[contains(@placeholder,'First Name')]")).sendKeys("Test");
			System.out.println("Pass");
			
		}catch(NoSuchElementException e) {
			//e.printStackTrace();
			System.out.println("Fail");
		}catch(ElementNotInteractableException e) {
			//e.printStackTrace();
			System.out.println("Fail");
		}finally {
			System.out.println("Manaoty");
			
		}
		driver.close();
		//throws
		test();
		
		//throw
		//throw new Exception("This is sleeep");
	}
	
	
	public static void test() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
