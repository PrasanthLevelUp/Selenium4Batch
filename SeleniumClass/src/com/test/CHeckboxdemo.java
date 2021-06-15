package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CHeckboxdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		String hbooies = "Sports,Reading";
		String[] hob = hbooies.split(",");
		System.out.println(hob[0]);
		System.out.println(hob[1]);
		

		// div[@id='hobbiesWrapper']//child::div[2]//child::div
		// div[@class='custom-control custom-checkbox custom-control-inline']

		List<WebElement> checkbox = driver
				.findElements(By.xpath("//div[@class='custom-control custom-checkbox custom-control-inline']"));
		System.out.println(checkbox.size());

		for (int i = 0; i < checkbox.size() - 1; i++) {
			WebElement name = checkbox.get(i).findElement(By.tagName("label"));
			WebElement icon = checkbox.get(i).findElement(By.tagName("input"));
			String names= name.getText();
			
			for(int j=0;j<hob.length-1;j++){
			if (names.equals(hob[j])) {
				icon.click();
				//name.click();
				if(icon.isSelected()) {
					System.out.println("Is selected");
				}else {
					System.out.println("Not Selected");
				}
			}
			}
	}

	}

}
