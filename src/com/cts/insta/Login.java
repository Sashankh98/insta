package com.cts.insta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

	@Test
	public void LoginInsta()
	{
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("8179351517");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("krishna1998llr");
		driver.close();
		
	}
	
}```````````````
