package com.SportsVerse.TCs;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001_HomepageTest {

	@Test(priority = 1)
	public void homepagetest() throws IOException, InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();

		driver.get("https://www.sportsverse.trade/");
		System.out.println("Home Page  is opening");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Clicking on withdraw Money

		WebElement withDrawMoney=driver.findElement(By.xpath("//button[contains(@class,'header-download')]"));
		withDrawMoney.click();
		Thread.sleep(3000);
		System.out.println("with Draw money is clicked");
		driver.navigate().back();
		
		// clicking on sign up
		
		WebElement signUp=driver.findElement(By.xpath("//button[@class='header-login responsive-header-navlinks2']"));
		signUp.click();
		Thread.sleep(3000);
		WebElement signUpClose = driver.findElement(By.xpath("//img[@alt='close']"));
		signUpClose.click();
		System.out.println("sign up is clicked");
		
		//clicking on download app

		Actions act=new Actions(driver);

		WebElement	downloadapp1=driver.findElement(By.xpath("//button[@class='best-btn']"));
		act.moveToElement(downloadapp1).click().perform();
		Thread.sleep(3000);
		System.out.println("download app 1 is clicked");
		String parent=driver.getWindowHandle();
		Set<String> childwindow = driver.getWindowHandles();


		for(String eachwindow:childwindow){

			if(!eachwindow.equals(parent)) {
				driver.switchTo().window(eachwindow);

			}
		}
		driver.close();
		System.out.println("download app is closed");
		//come back to parent window

		driver.switchTo().window(parent);

		//clicking on Trade now
		WebElement tradenow=driver.findElement(By.xpath("//h4[normalize-space()='Trade Now']"));
		tradenow.click();
		System.out.println("Trade Now is clicked");
		Thread.sleep(3000);


		WebElement tradeclose=driver.findElement(By.xpath("//div[@class='trade-close']"));
		tradeclose.click();
		System.out.println("Trade now is closed");

		//To scroll down the page
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,12000)");



		//again click on download app & Trade now
		Dimension size=new Dimension(1600,900);
		driver.manage().window().setSize(size);

		WebElement downloadapp2=driver.findElement(By.xpath("//button[@class='start-engine-btn']"));


		driver.manage().window().maximize();
		act.moveToElement(downloadapp2);

		act.click().perform();
		Thread.sleep(3000);
		System.out.println("2nd Download app is clicked");

		String parent1=driver.getWindowHandle();
		Set<String> Allchild1 = driver.getWindowHandles();
		for(String eachwindow1:Allchild1) {
			if(!eachwindow1.equals(parent1)) {
				driver.switchTo().window(eachwindow1);

			}
		}
		driver.close();

		//come back to parent
		driver.switchTo().window(parent1);

		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);

		System.out.println("scrolling to icons");



		WebElement socialMediaIconsContainer = driver.findElement(By.xpath("//div[@class=\"d-flex icons-section pt-4\"]"));

		// Locating all the social media icons
		List<WebElement> socialMediaIcons = socialMediaIconsContainer.findElements(By.tagName("a"));

		
		// Clicking on each social media icon one by one
		for (WebElement socialMediaIcon : socialMediaIcons) {
			act.moveToElement(socialMediaIcon).click().perform();
			Thread.sleep(3000);

			String parent2=driver.getWindowHandle();
			Set<String> childs = driver.getWindowHandles();
			for(String child:childs) {
				if(!child.equals(parent2)) {
					driver.switchTo().window(child);
				}
			}
			driver.close();
			Thread.sleep(3000);
			driver.switchTo().window(parent2);
		}
		
		System.out.println("all icons are clicked one by one");
		System.out.println("clicking on 1st FAQ");
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		
		jse1.executeScript("window.scrollBy(0,900)");
		WebElement firstdrop = driver.findElement(By.xpath("//button[normalize-space()='What are Fan tokens?']"));

		Thread.sleep(1000);
		firstdrop.click();

		Thread.sleep(3000);
		firstdrop.click();

		System.out.println("clicking on 2nd FAQ");
		WebElement secondDrop = driver.findElement(By.xpath("//button[contains(text(),'What is a Digital Wallet? Are they necessary to bu')]"));
		secondDrop.click();
		Thread.sleep(1000);
		secondDrop.click();

		System.out.println("clicking on 3rd FAQ");

		WebElement thirdDrop = driver.findElement(By.xpath("//button[contains(text(),'Which Cryptocurrencies can be used for Trading on ')]"));
		thirdDrop.click();
		Thread.sleep(1000);
		thirdDrop.click();

		System.out.println("clicking on 4th FAQ");

		WebElement FourthDrop = driver.findElement(By.xpath("//button[contains(text(),'Are my transactions secured on the Sportsverse Pla')]"));
		FourthDrop.click();
		Thread.sleep(1000);
		FourthDrop.click();

		System.out.println("clicking on 5th FAQ");

		WebElement FifthDrop = driver.findElement(By.xpath("//button[normalize-space()='When will the NFT marketplace open on Sportsverse?']"));
		FifthDrop.click();
		Thread.sleep(1000);
		FifthDrop.click();

		System.out.println("clicking on 6th FAQ");
		WebElement SixDrop = driver.findElement(By.xpath("//button[contains(text(),'Can the Fan Tokens of Sportsverse be considered NF')]"));
		SixDrop.click();
		Thread.sleep(1000);
		SixDrop.click();

		System.out.println("clicking on 7th FAQ");
		WebElement SeventhDrop = driver.findElement(By.xpath("//button[contains(text(),'How to convert my profits on Sportsverse to FIAT c')]"));
		SeventhDrop.click();
		Thread.sleep(1000);
		SeventhDrop.click();

		System.out.println("clicking on 8th FAQ");
		WebElement eighthDrop = driver.findElement(By.xpath("//button[normalize-space()='What are the advantages of Staking?']"));
		eighthDrop.click();
		Thread.sleep(1000);
		eighthDrop.click();

		JavascriptExecutor jse3=(JavascriptExecutor)driver;
		jse3.executeScript("window.scrollBy(0,1000)");

		Dimension size1=new Dimension(1536, 731);
		driver.manage().window().setSize(size1);

		driver.manage().window().maximize();
		WebElement socialMediaIconsContainer1 = driver.findElement(By.xpath("//div[@class=\"footer-meta-social \"]"));

		//Locating all the social media icons

		List<WebElement> socialMediaIcons1 = socialMediaIconsContainer1.findElements(By.tagName("a"));

		//Move to each Icon for that creating instance of Actions class


		//Clicking social media icons one by one
		for(WebElement socialMediaIcon1:socialMediaIcons1) {
			act.moveToElement(socialMediaIcon1).click().perform();
			Thread.sleep(4000);

			String Parent2=driver.getWindowHandle();
			Set<String> Childs = driver.getWindowHandles();
			for(String Child:Childs) {
				if(!childwindow.equals(Parent2)) {
					driver.switchTo().window(Child);
				}
			}
			driver.close();
			Thread.sleep(2000);
			driver.switchTo().window(Parent2);
		}
		
		System.out.println("All Icons are clicked");

		WebElement homelink=driver.findElement(By.xpath("//li[normalize-space()='Home']"));
		homelink.click();
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("home is clicked");

		JavascriptExecutor jse4=(JavascriptExecutor)driver;
		jse4.executeScript("window.scrollBy(0,16000)");
		

		Dimension size2=new Dimension(1536, 731);
		driver.manage().window().setSize(size2);

		driver.manage().window().maximize();

		
		WebElement learn1Link=driver.findElement(By.xpath("//li[normalize-space()='Learn']"));
		act.moveToElement(learn1Link).click().perform();
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println(" Learn is clicked");
		
		WebElement SportsVerse101Link=driver.findElement(By.xpath("//li[normalize-space()='Sportsverse 101']"));
		SportsVerse101Link.click();
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("Sportsverse101 is clicked");


		WebElement roadMapLink=driver.findElement(By.xpath("//li[normalize-space()='Roadmap']"));
		roadMapLink.click();
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("RoadMap is clicked");


		WebElement fantokensLink=driver.findElement(By.xpath("//li[normalize-space()='Fan Tokens']"));
		fantokensLink.click();
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("Fan Tokens is clicked");



		WebElement aboutUsLink=driver.findElement(By.xpath("//li[normalize-space()='About us']"));
		aboutUsLink.click();
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("About us  is clicked");


		WebElement  CareerLink=driver.findElement(By.xpath("//li[normalize-space()='Career']"));
		CareerLink.click();
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("Career is clicked");


		WebElement supportLink=driver.findElement(By.xpath("//li[normalize-space()='Support']"));
		supportLink.click();
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("Support  is clicked");

		//	WebElement termsOfUseLink=driver.findElement(By.xpath("//li[normalize-space()='Terms of use']"));
		//	termsOfUseLink.click();
		//	Thread.sleep(3000);
		//	driver.navigate().back();

		WebElement privacyPolicyLink=driver.findElement(By.xpath("//li[normalize-space()='Privacy Policy']"));
		privacyPolicyLink.click();
		Thread.sleep(3000);
		String parent3=driver.getWindowHandle();
		Set<String> childs = driver.getWindowHandles();
		for(String child:childs) {
			if(!child.equals(parent3)) {
				driver.switchTo().window(child);
			}
		}
		
		
		driver.close();
		driver.switchTo().window(parent3);

		System.out.println("Privacy policy is clicked");

		WebElement contactUsLink=driver.findElement(By.xpath("//a[normalize-space()='Contact us']"));
		contactUsLink.click();
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("Contact Us is clicked");

		System.out.println("all footer links are clicked");


		//	WebElement legalDesclaimerLink=driver.findElement(By.xpath("//li[normalize-space()='Legal Disclaimer']"));
		//	legalDesclaimerLink.click();
		//	Thread.sleep(3000);
		//	driver.navigate().back();
		//
		System.out.println("home page executed successfully");
		driver.close();
	}
}
