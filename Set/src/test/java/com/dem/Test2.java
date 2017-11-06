package com.dem;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Test2 extends Test1{
	@Test
	public void launch()  {
		//driver.get("https://www.google.co.in/");
		 /*driver.findElement(By.xpath("//input[@id='gs_htif0']")).sendKeys("Selenium");
		 driver.findElement(By.xpath("//input[@name='btnK']")).click();
		 Thread.sleep(3000);
		*/ //driver.findElement(arg0)
		 driver.findElement(By.name("q")).sendKeys("selenuim");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
	}

}
