package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/mdhaque/Desktop/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");

	}

}
