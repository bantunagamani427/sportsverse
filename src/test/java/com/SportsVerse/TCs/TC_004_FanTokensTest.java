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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_004_FanTokensTest {
	@Test
	public void fantokenstest() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();


		driver.get("https://www.sportsverse.trade/FantokensPage");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Clicking on withdraw Money
		WebElement withDrawMoney=driver.findElement(By.xpath("//button[contains(@class,'header-download')]"));
		withDrawMoney.click();
		
		Thread.sleep(3000);
		System.out.println("with Draw money is clicked");
		driver.navigate().back();
		Thread.sleep(3000);

		// clicking on sign up

		WebElement signUp=driver.findElement(By.xpath("//button[@class='header-login responsive-header-navlinks2']"));
		signUp.click();
		Thread.sleep(3000);



		//WebElement signUpClose = driver.findElement(By.xpath("//img[@alt='close']"));


		WebElement signUpClose = driver.findElement(By.xpath("//img[@src='data:image/svg+xml,%3Csvg%20width%3D%2224%22%20height%3D%2224%22%20viewBox%3D%220%200%2024%2024%22%20fill%3D%22none%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%3E%3Cpath%20fill-rule%3D%22evenodd%22%20clip-rule%3D%22evenodd%22%20d%3D%22M13.4142%2012L19.7782%2018.364L18.364%2019.7782L12%2013.4143L5.63604%2019.7782L4.22183%2018.364L10.5858%2012L4.22183%205.63608L5.63604%204.22187L12%2010.5858L18.364%204.22187L19.7782%205.63608L13.4142%2012Z%22%20fill%3D%22%23DFDFDF%22%2F%3E%3C%2Fsvg%3E']"));


		WebDriverWait wait=new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".w3ajs-modal-loader.w3a-modal__loader")));
		//WebElement signUpClose=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='close']")));

		signUpClose.click();
		System.out.println("sign up is clicked");

		Thread.sleep(3000);

		//clicking on download App

		Actions act=new Actions(driver);

		WebElement downloadApp=driver.findElement(By.xpath("//h3[normalize-space()='download app']"));
		act.moveToElement(downloadApp).click().perform();
		Thread.sleep(3000);


		String parent=driver.getWindowHandle();
		Set<String> childs = driver.getWindowHandles();
		for(String child:childs) {
			if(!child.equals(parent)) {
				driver.switchTo().window(child);
			}
		}
		driver.close();
		Thread.sleep(1000);

		driver.switchTo().window(parent);
		System.out.println("download app is clicked");


		//clicking on contents

		WebElement liveTokensLink=driver.findElement(By.xpath("//li[normalize-space()='Live Tokens']"));
		act.moveToElement(liveTokensLink).click().perform();
		Thread.sleep(3000);
		System.out.println("Live tokens is clicked");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2000)");

		//for edge 10000 and dimensions 1920,1080 for firefox 0,2000 & 1536,731

		Dimension size=new Dimension(1536, 731);
		driver.manage().window().setSize(size);

		//clicking on contact support link
		Thread.sleep(3000);

		WebElement contactSupportLink=driver.findElement(By.xpath("//a[normalize-space()='Contact Support']"));
		driver.manage().window().maximize();



		//JavascriptExecutor jse6=(JavascriptExecutor)driver;
		//jse6.executeScript("arguments[0].scrollIntoView();", contactSupportLink);
		act.moveToElement(contactSupportLink).click().perform();
		Thread.sleep(3000);

		System.out.println("contact support is clicked");
		driver.navigate().back();



		Thread.sleep(2000);


		WebElement downloadApp1 = driver.findElement(By.xpath("//button[@class='start-engine-btn']"));
		act.moveToElement(downloadApp1).click().perform();
		String Parent2=driver.getWindowHandle();
		Set<String> childs2 = driver.getWindowHandles();
		for(String child2:childs2) {
			if(!child2.equals(Parent2)) {
				driver.switchTo().window(child2);
				Thread.sleep(3000);
			}
		}
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(Parent2);

		Thread.sleep(2000);
		//Locating all The FAQ's Links

		JavascriptExecutor jse4=(JavascriptExecutor)driver;
		jse4.executeScript("window.scrollBy(0,620)");

		//driver.manage().window().setSize(size);

		//driver.manage().window().maximize();


		WebElement faqContainer=driver.findElement(By.xpath("//div[@class=\"accordion accordion-flush\"]"));
		List<WebElement> FaqLinks = faqContainer.findElements(By.tagName("h2"));

		//move to each FAQ and clicking
		for( WebElement FaqLink:FaqLinks) {
			act.moveToElement(FaqLink).click().perform();
			Thread.sleep(1000);
			FaqLink.click();
		}
		System.out.println("each Faq link is clicked");

		Thread.sleep(2000);

		JavascriptExecutor jse5=(JavascriptExecutor)driver;
		jse5.executeScript("window.scrollBy(0,3000)");

		Dimension size1=new Dimension(1536, 731);
		driver.manage().window().setSize(size1);

		driver.manage().window().maximize();

		WebElement socialMediaIconsContainer1 = driver.findElement(By.xpath("//div[@class=\"footer-meta-social \"]"));
		List<WebElement> socialMediaIcons1 = socialMediaIconsContainer1.findElements(By.tagName("a"));

		//move to each icon for that we create the actions class

		//clicking social media icons one by one

		for(WebElement socialMediaIcon1:socialMediaIcons1) {
			act.moveToElement(socialMediaIcon1).click().perform();
			Thread.sleep(3000);

			String Parent3=driver.getWindowHandle();
			Set<String> Childs= driver.getWindowHandles();
			for(String Child:Childs) {
				if(!Child.equals(Parent3)) {
					driver.switchTo().window(Child);
				}
			}
			driver.close();
			Thread.sleep(3000);
			driver.switchTo().window(Parent3);
		}
		System.out.println("All icons are clicked");

		//Footer 1st section link
		/*
		WebElement FirstLinkContainer=driver.findElement(By.xpath("//div[@class=\"col-lg-2 col-4 mt-4 mt-lg-0 pl-3\"]"));
		List<WebElement> firstLinks = FirstLinkContainer.findElements(By.tagName("a"));


		for(WebElement firstLink:firstLinks) {
			act.moveToElement(firstLink).click().perform();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);

			FirstLinkContainer	=driver.findElement(By.xpath("//div[@class=\"col-lg-2 col-4 mt-4 mt-lg-0 pl-3\"]"));
			firstLinks=FirstLinkContainer.findElements(By.tagName("a"));

		}


		//clicking on 2nd section links

		WebElement secondLinkContaoiner=driver.findElement(By.xpath("//div[@class=\"col-lg-3 pl-lg-5 pl-2 col-4 mt-4 mt-lg-0 \"]"));

		List<WebElement> SecondLinks = secondLinkContaoiner.findElements(By.tagName("a"));


		for(WebElement SecondLink:SecondLinks) {
			act.moveToElement(SecondLink).click().perform();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);

			secondLinkContaoiner=driver.findElement(By.xpath("//div[@class=\"col-lg-3 pl-lg-5 pl-2 col-4 mt-4 mt-lg-0 \"]"));
			SecondLinks=secondLinkContaoiner.findElements(By.tagName("a"));
		}
		 */

		WebElement homelink=driver.findElement(By.xpath("//li[normalize-space()='Home']"));
		homelink.click();
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("home is clicked");

		JavascriptExecutor jse7=(JavascriptExecutor)driver;
		jse7.executeScript("window.scrollBy(0,16000)");


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
		Set<String> childs3 = driver.getWindowHandles();
		for(String child:childs3) {
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
		System.out.println("fan tokens page executed sucessfully");
		driver.close();
	}
}