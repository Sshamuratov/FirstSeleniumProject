package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bzikb\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.etsy.com/search?q=wooden%20spoon");
		
		//made some changes
<<<<<<< HEAD
		
		
		
		//how about some more
=======
		//another change on the site
>>>>>>> 5eb353b0ede35a0382bd29d7919203149b5cd7d6
	}

}
