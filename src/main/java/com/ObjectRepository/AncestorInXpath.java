package com.ObjectRepository;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AncestorInXpath{

	@Test

	public void testAncestorInXpath() throws InterruptedException{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();             
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/guru99home/");
		Thread.sleep(2000);

		//Search All elements in 'Popular course' section 
		//with the help of ancestor of the anchor whose text is 'SELENIUM'

		List <WebElement> dateBox = driver.findElements(By.xpath("//div[.//a[text()='SELENIUM']]/ancestor::div[@class='rt-grid-2 rt-omega']/following-sibling::div"));
		//1st take div tag bcos all elements under Popular course and take text element of selenium(like for others) and take common parent
		//then take all following siblings



		Thread.sleep(3000);
		//Print all the which are sibling of the element named as 'SELENIUM' in 'Popular course'

		for (WebElement webElement : dateBox) {
			System.out.println(webElement.getText());
		}	
	}
}








