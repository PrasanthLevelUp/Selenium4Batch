package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
	/*
		id=priya123
		id=priya4655
		id=priya778*/
				
		
		//following -  //label[starts-with(@id,'victor')]//following::div
		//ancestor -  //label[starts-with(@id,'victor')]//ancestor::div
		//parent -  //label[starts-with(@id,'victor')]//parent::div
		//child -  //label[starts-with(@id,'victor')]//child::li
		//following-sibling-  //label[starts-with(@id,'victor')]//following-sibling::input
		//self -  //label[starts-with(@id,'victor')]//self::label
		//descendant -  //label[starts-with(@id,'victor')]//descendant::div
		//indexing
		
		

	}

}
