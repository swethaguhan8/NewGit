package com.dem;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SetTest {
	
		public WebDriver driver;
		@Test
		public void testApp() {
			System.setProperty("webdriver.chrome.driver", "./drivr/chromedriver.exe");
			 driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.navigate().to("https://www.google.co.in/");
			driver.quit();
		}
	}


