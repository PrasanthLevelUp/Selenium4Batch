package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		/*//xpath - dynamic locator and travers
		//1.absoulte 2.relativ
		//absoulte -  direct way 
		'/' - /html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/div/button
		
		relative- middle location 
		'//' - //*[@id="menu1"]
*/	
		/*Basic xpath
		//tagname[@attri='arrtival']  - //button[@type='button']
		
		Contains
		//p[contains(text(),'The .dropdown class is used to')]
		//div[contains(@class,'container')]
	
		logical  - OR and AND
		//ul[@class='dropdown-menu' and @role='menu1']
		//ul[@class='dropdown-menu' or @role='menu1']
		*/
		
		
		//starts-with - //label[starts-with(@id,'victor')]
		//texted method -  //label[text()='abcd']
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'First Name')]")).sendKeys("Test");
		//*[@id="firstName"]
		driver.findElement(By.xpath("//input[@type='text' and @id='lastName']")).sendKeys("last test");
	/*	driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		
		String gender = driver.findElement(By.xpath("//label[contains(text(),'Male')]")).getText();
		
		
		System.out.println(gender);*/
		
		
		List<WebElement> genders = driver.findElements(By.xpath("//div[@id='genterWrapper']//div[@class='col-md-9 col-sm-12']//div//label"));
		
		for(int i=0;i<genders.size()-1;i++)
		{
			if(genders.get(i).getText().equals("Female")) {
				genders.get(i).click();
				break;
			}
		
		}
		}
	
	

}
