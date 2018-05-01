package com.ibm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestJava {

	@Test
	public void test() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manohar\\RekhaWorkspace\\SeleniumTest\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Assert.assertEquals("Gooe", driver.getTitle());
	

	}

}
