package com.SportsVerse.TCs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class A{
	@Test
	public void learn2Test() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.sportsverse.trade/learnPage2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,6500)");
		
		WebElement FirstFaq=driver.findElement(By.xpath("//button[normalize-space()='What are Fan tokens?']"));
		FirstFaq.click();
		Thread.sleep(2000);
		FirstFaq.click();
		
		WebElement secondFaq=driver.findElement(By.xpath("//button[contains(text(),'What is a Digital Wallet? Are they necessary to bu')]"));
		secondFaq.click();
		Thread.sleep(2000);
		secondFaq.click();
		
		WebElement thirdFaq=driver.findElement(By.xpath("//button[contains(text(),'Which Cryptocurrencies can be used for Trading on ')]"));
		thirdFaq.click();
		Thread.sleep(2000);
		thirdFaq.click();

	}
}
