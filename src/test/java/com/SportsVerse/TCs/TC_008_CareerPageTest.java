package com.SportsVerse.TCs;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_008_CareerPageTest {
	@Test
	public void careertest() throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();

		driver.get("https://www.sportsverse.trade/careerPage");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Career page is opened");


		WebElement withDrawMoney=driver.findElement(By.xpath("//button[@class=\" header-download\"]"));
		withDrawMoney.click();
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("withDraw money is clicked");

		WebElement signUp=driver.findElement(By.xpath("//button[@class=\"header-login responsive-header-navlinks2\"]"));
		signUp.click();
		Thread.sleep(2000);

		WebElement signUpClose=driver.findElement(By.xpath("//img[@alt=\"close\"]"));
		signUpClose.click();
		System.out.println("sign up is closed");

		Actions act=new Actions(driver);
		WebElement joinTheTeam=driver.findElement(By.xpath("//button[@class=\"join-the-team\"]"));
		act.moveToElement(joinTheTeam).click().perform();		
		Thread.sleep(3000);
		String parent=driver.getWindowHandle();
		Set<String> childs = driver.getWindowHandles();
		for(String child:childs) {
			if(!child.equals(parent)) {
				driver.switchTo().window(child);
				Thread.sleep(2000);
			}
		}
		driver.close();
		driver.switchTo().window(parent);
		
		
		
		
		
		
		
		
		
		




	}
}
