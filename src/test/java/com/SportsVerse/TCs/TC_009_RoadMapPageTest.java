package com.SportsVerse.TCs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_009_RoadMapPageTest {

	@Test
	public void roadMapTest() throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();

		driver.get("https://www.sportsverse.trade/roadmapPage");
		System.out.println("Road map page is opening");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;

		//clciking on withDraw money

		WebElement withdrawMoney=driver.findElement(By.xpath("//button[@class=' header-download']"));
		withdrawMoney.click();
		Thread.sleep(2000);	
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("with Draw money is clicked");

		//clicking on signUp

		WebElement signUp=driver.findElement(By.xpath("//button[@class='header-login responsive-header-navlinks2']"));
		signUp.click();
		Thread.sleep(2000);
		System.out.println("sign Up is clicked ");
		Actions act=new Actions(driver);

		//sign up is closed

		WebElement signUpClose=driver.findElement(By.xpath("//img[@alt='close']"));
		executor1.executeScript("arguments[0].click();",signUpClose );
		act.moveToElement(signUpClose).click().perform();	
		System.out.println("sign up is closed");
		/*
		System.out.println("**********************************");
		String roadmapInformation=driver.findElement(By.xpath("//div[@class=\"row roadmap\"]")).getText();
		System.out.println("RoadMap Information :"+roadmapInformation);

		System.out.println("****************************");
		String phase1=driver.findElement(By.xpath("//div[@class=\"col-lg-11 trading-padding  trading\"]")).getText();
		System.out.println("Phase1 Information :"+phase1);

		System.out.println("*************************");
		executor1.executeScript("window.scrollBy(0,900)");
		String phase2 = driver.findElement(By.xpath("//div[@class=\"col-lg-11 marketplace  trading\"]")).getText();
		System.out.println("phase2 information: "+phase2);

		System.out.println("*************************");
		String phase3 = driver.findElement(By.xpath("//div[@class=\"col-lg-6 m-auto\"]")).getText();
		System.out.println("phase3 information: "+phase3);

	/*

		for(WebElement BasicLink:BasicLinks) {

System.out.println();
Thread.sleep(2000);
			jse.executeScript("arguments[0].scrollIntoView();", BasicLink );

			Thread.sleep(2000);
		 */
		WebElement roadmapsection = driver.findElement(By.xpath("//section[@class='road-map-line-section']"));
		List<WebElement> phases = roadmapsection.findElements(By.tagName("div"));
		Set<String> uniquePhases = new HashSet<>();

		for (WebElement phase : phases) {
			String eachPhase = phase.getText();
			if (!uniquePhases.contains(eachPhase)) {
				uniquePhases.add(eachPhase);
				System.out.println("each phase information: " + eachPhase);
			}
		}

		//clicking on download the white paper  //section[@class='road-map-line-section']
		
		WebElement downloadTheWhitePaper=driver.findElement(By.xpath("//button[normalize-space()='download The White Paper']"));
		act.moveToElement(downloadTheWhitePaper).click().perform();
		String parent=driver.getWindowHandle();
		Set<String> childs = driver.getWindowHandles();
		for(String child:childs) {
			if(!child.equals(parent)) {
				driver.switchTo().window(child);
				Thread.sleep(2000);
			}
		}
		driver.close();
		Thread.sleep(2000);
		System.out.println("download the white paper is clicked :");
		
		
		

	}
}
