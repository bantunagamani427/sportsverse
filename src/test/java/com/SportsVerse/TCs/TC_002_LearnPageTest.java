package com.SportsVerse.TCs;

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

public class TC_002_LearnPageTest {
	
	@Test(priority = 2) 
	public void learntest() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();

		//Open SportsVerse
		System.out.println("Learn page1 is opening");
		driver.get("https://www.sportsverse.trade/learnPage1");
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


		//Click on downloadApp
		System.out.println("Clicking on download app");
		Actions act=new Actions(driver);
		WebElement downloadApp = driver.findElement(By.xpath("//h3[normalize-space()='download app']"));
		act.moveToElement(downloadApp).click().perform();
		Thread.sleep(3000);

		String parentwindow=driver.getWindowHandle();

		Set<String> childwindow = driver.getWindowHandles();
		for(String each:childwindow) {
			if(!each.equals(parentwindow)) {
				driver.switchTo().window(each);
			}
		}
		Thread.sleep(3000);
		System.out.println("closing the download app");
		driver.close();

		driver.switchTo().window(parentwindow);



		System.out.println("scrolling happening");


		//click on sportsverse101
		System.out.println("clicking on sportsverse 101");
		WebElement sportsverse101 = driver.findElement(By.xpath("//button[@class='sportsverse-101']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3100)");
		//js.executeScript("arguments[0].scrollIntoView();",sportsverse101 );
		Thread.sleep(3000);

		Dimension size = new Dimension(1600, 900);
		driver.manage().window().setSize(size);

		act.moveToElement(sportsverse101, 0, 100).build().perform();
		Thread.sleep(3000);

		sportsverse101.click();
		Thread.sleep(3000);

		/*
		 * WebElement element = driver.findElement(By.xpath("//div[@class='some-class']"));
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();", element);

Actions actions = new Actions(driver);
actions.moveToElement(element).build().perform();

Dimension size = new Dimension(1600, 900);
driver.manage().window().setSize(size);

WebElement element = driver.findElement(By.xpath("//div[@class='some-class']"));
Actions actions = new Actions(driver);
actions.moveToElement(element, 0, 100).build().perform();
 */

		//again coome back to learn page1
		driver.navigate().back();

		System.out.println("coiming back to learn page1");

		WebElement downloadApp1 = driver.findElement(By.xpath("//h2[text()='Download App']"));
		act.moveToElement(downloadApp1).build().perform();

		downloadApp1.click();
		Thread.sleep(3000);

		System.out.println("clicking on download app");
		String parent1=driver.getWindowHandle();
		Set<String> allChild1 = driver.getWindowHandles();
		for(String each:allChild1) {
			if(!each.equals(parent1)){
				driver.switchTo().window(each);

			}
		}
		Thread.sleep(3000);
		System.out.println("closing the download app");
		driver.close();
		driver.switchTo().window(parent1);

		//FAQ's

		System.out.println("clicking on 1st FAQ");

		WebElement firstdrop = driver.findElement(By.xpath("//button[normalize-space()='What are Fan tokens?']"));
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,1000)");
		//jse1.executeScript("arguments[0].scrollIntoView();",firstdrop );
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
		driver.manage().window().maximize();

		//Footer links
		JavascriptExecutor jse2=(JavascriptExecutor)driver;
		jse2.executeScript("window.scrollBy(0,6000)");

		Thread.sleep(3000);

		WebElement socialMediaIconsContainer = driver.findElement(By.xpath("//div[@class=\"footer-meta-social \"]"));

		//Locating all the social media icons

		List<WebElement> socialMediaIcons = socialMediaIconsContainer.findElements(By.tagName("a"));

		//Clicking social media icons one by one
		for(WebElement socialMediaIcon:socialMediaIcons) {
			act.moveToElement(socialMediaIcon).click().perform();
			Thread.sleep(4000);

			String Parent2=driver.getWindowHandle();
			Set<String> Childs = driver.getWindowHandles();
			for(String Child:Childs) {
				if(!childwindow.equals(Parent2)) {
					driver.switchTo().window(Child);

				}
			}
			driver.close();
			Thread.sleep(4000);
			driver.switchTo().window(Parent2);
		}

		System.out.println("All Icons are clicked");

		//Locating 1st column Links
		/*
		WebElement FirstSectionHeader=driver.findElement(By.xpath("//div[@class=\"col-lg-3 pl-lg-5 pl-2 col-4 mt-4 mt-lg-0 \"]"));
		FirstSectionHeader.click();

		//Locating all the 1st column Links
		List<WebElement> FirstLinks = FirstSectionHeader.findElements(By.xpath("//div[@class='col-lg-3 pl-lg-5 pl-2 col-4 mt-4 mt-lg-0 ']//ul//a"));

		//Move to each Icons
		Actions actions1=new Actions(driver);

		for(WebElement FirsLink:FirstLinks) {
			actions1.moveToElement(FirsLink).click().perform();
			Thread.sleep(3000);
			driver.navigate().back();

			Thread.sleep(3000);
			FirstSectionHeader = driver.findElement(By.xpath("//div[@class=\"col-lg-3 pl-lg-5 pl-2 col-4 mt-4 mt-lg-0 \"]"));
			FirstLinks = FirstSectionHeader.findElements(By.xpath("//div[@class='col-lg-3 pl-lg-5 pl-2 col-4 mt-4 mt-lg-0 ']//ul//a"));	
		}
		System.out.println("Section wise URL's clicked");
		driver.close();
		 */

		WebElement homelink=	driver.findElement(By.xpath("//li[normalize-space()='Home']"));
		homelink.click();
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("home is clicked");

		WebElement learn1Link	=driver.findElement(By.xpath("//li[normalize-space()='Learn']"));
		learn1Link.click();
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("Learn is clicked");

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
		
		System.out.println("learn1 page is executed successfully ");
		driver.close();
		
	}
}
