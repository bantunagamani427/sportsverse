package com.SportsVerse.TCs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {

	@Test
	public void aboutTest() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();

		driver.get("https://www.sportsverse.trade/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions act=new Actions(driver);
		WebElement company=driver.findElement(By.xpath("//button[normalize-space()='Company']"));
		act.moveToElement(company).click().perform();
		
		Actions act2=new Actions(driver);
		WebElement aboutDD = driver.findElement(By.xpath("//a[text()='About us ']"));
		act2.moveToElement(aboutDD).click().perform();
		

		
	}}