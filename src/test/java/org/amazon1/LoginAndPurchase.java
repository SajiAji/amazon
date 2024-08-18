package org.amazon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginAndPurchase {
	
	@Test
	private void login() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email_login']")).sendKeys("9597906017");
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SajiAji@123");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	}

}
