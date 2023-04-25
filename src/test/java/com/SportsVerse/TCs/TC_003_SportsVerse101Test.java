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

public class TC_003_SportsVerse101Test {
	@Test
	public void sportverse101test() throws InterruptedException {
/*
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();

		driver.get("https://www.sportsverse.trade/learnPage2");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		//Clicking on withdraw Money
		Thread.sleep(3000);
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

		WebElement signUpClose = driver.findElement(By.xpath("//img[@alt='close']"));
		signUpClose.click();

		System.out.println("sign up is clicked");
		Thread.sleep(3000);

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
		Thread.sleep(3000);
		driver.switchTo().window(parentwindow);

		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		Thread.sleep(3000);

		//clicking on The Basics Link

		WebElement basicsLink = driver.findElement(By.xpath("//body//div[@id='root']//a[@href='#basic']//li[1]"));
		act.moveToElement(basicsLink).click().perform();

		Thread.sleep(2000);


		WebElement BasicsFAQContainer=driver.findElement(By.xpath("//div[@class=\"accordion accordion-flush\"]"));
		jse.executeScript("arguments[0].scrollIntoView();", BasicsFAQContainer );


		//Locating all The FAQ's Links

		List<WebElement> BasicLinks = BasicsFAQContainer.findElements(By.tagName("h2"));


		//	Dimension size=new Dimension(1536, 731);
		//driver.manage().window().setSize(size);



		for(WebElement BasicLink:BasicLinks) {
			act.doubleClick(BasicLink).click().perform();
			Thread.sleep(2000);
			jse.executeScript("arguments[0].scrollIntoView();", BasicLink );

			Thread.sleep(2000);
		}


		System.out.println("basics links are clicked one by one");
		//driver.manage().window().maximize();

		WebElement videos=driver.findElement(By.xpath("//body//div[@id='root']//a[@href='#videos']//li[1]"));
		act.moveToElement(videos).click().perform();

		Thread.sleep(3000);
		//
		//		WebElement videosContainer=driver.findElement(By.xpath("//div[@class=\"col-md-8 \"]"));
		//		List<WebElement> videosLinks = videosContainer.findElements(By.tagName("h2"));

		//Actions act4=new Actions(driver);

		//		//Move to each Video and clicking
		//		for(WebElement videosLink:videosLinks) {
		//			videosLink.
		//		}
		//		
//		JavascriptExecutor jse1=(JavascriptExecutor)driver;
//		jse1.executeAsyncScript("window.scrollBy(0,1900)");


		driver.close();
		*/

		//driver is closed and reintialised

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1=new FirefoxDriver();

		driver1.get("https://www.sportsverse.trade/learnPage2");

		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		System.out.println("driver is closed and again intialised");

		JavascriptExecutor jse7=(JavascriptExecutor)driver1;
		jse7.executeScript("window.scrollBy(0,3500)");
		
		Dimension size4=new Dimension(1536, 731);
		driver1.manage().window().setSize(size4);
		driver1.manage().window().maximize();
		
		
//		WebElement contactSupport=null;
//		WebDriverWait wait=new WebDriverWait(driver1, 30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='c-btn']")));

			WebElement contactSupport=driver1.findElement(By.xpath("//h2[@class='c-btn']"));
		driver1.manage().window().maximize();

		Actions act1=new Actions(driver1);
		act1.moveToElement(contactSupport).click().perform();

		Thread.sleep(3000);
		System.out.println("contact support is clicked");
		driver1.navigate().back();


		Thread.sleep(3000);


		WebElement downloadappLink = driver1.findElement(By.xpath("//h2[@class='btn-h']"));
		downloadappLink.click();

		String parent3=driver1.getWindowHandle();
		Set<String> childs = driver1.getWindowHandles();
		for(String child:childs) {
			if(!child.equals(parent3)) {
				driver1.switchTo().window(child);
				Thread.sleep(3000);
			}
		}
			driver1.close();
			Thread.sleep(3000);
			driver1.switchTo().window(parent3);

			Thread.sleep(2000);

			JavascriptExecutor jse4=(JavascriptExecutor)driver1;
			jse4.executeScript("window.scrollBy(0,450)");

			WebElement faqContainer=driver1.findElement(By.xpath("//div[@class=\"accordion accordion-flush\"]"));
			List<WebElement> FaqLinks = faqContainer.findElements(By.tagName("h2"));

			for(WebElement FaqLink:FaqLinks) {
				act1.moveToElement(FaqLink).click().perform();
				Thread.sleep(1000);
				FaqLink.click();	

			}

			System.out.println("each FAQ link is clciked");
			Thread.sleep(2000);

			JavascriptExecutor jse5=(JavascriptExecutor)driver1;
			jse5.executeScript("window.scrollBy(0,1000)");

			Dimension size2=new Dimension(1536, 731);
			driver1.manage().window().setSize(size2);

			driver1.manage().window().maximize();

			WebElement socialMediaIconsContainer1 = driver1.findElement(By.xpath("//div[@class=\"footer-meta-social \"]"));
			List<WebElement> socialMediaIcons1 = socialMediaIconsContainer1.findElements(By.tagName("a"));

			//move to each icon for that we create the actions class


			for(WebElement socialMediaIcon1:socialMediaIcons1) {
				act1.moveToElement(socialMediaIcon1).click().perform();
				Thread.sleep(3000);

				String Parent3=driver1.getWindowHandle();
				Set<String> childs1 = driver1.getWindowHandles();
				for(String child1:childs1) {
					if(!child1.equals(parent3)) {
						driver1.switchTo().window(child1);
						Thread.sleep(3000);
					}
				}

				driver1.close();
				Thread.sleep(3000);
				driver1.switchTo().window(parent3);
			}

			System.out.println("All icons are clicked ");

			//clicking on footer links

			WebElement homelink=driver1.findElement(By.xpath("//li[normalize-space()='Home']"));
			homelink.click();
			Thread.sleep(3000);
			driver1.navigate().back();
			System.out.println("home is clicked");

			//JavascriptExecutor jse8=(JavascriptExecutor)driver1;
			jse7.executeScript("window.scrollBy(0,16000)");


			Dimension size3=new Dimension(1536, 731);
			driver1.manage().window().setSize(size3);

			driver1.manage().window().maximize();



			WebElement learn1Link=driver1.findElement(By.xpath("//li[normalize-space()='Learn']"));
			act1.moveToElement(learn1Link).click().perform();
			Thread.sleep(3000);
			driver1.navigate().back();
			System.out.println(" Learn is clicked");




			WebElement SportsVerse101Link=driver1.findElement(By.xpath("//li[normalize-space()='Sportsverse 101']"));
			SportsVerse101Link.click();
			Thread.sleep(3000);
			driver1.navigate().back();
			System.out.println("Sportsverse101 is clicked");


			WebElement roadMapLink=driver1.findElement(By.xpath("//li[normalize-space()='Roadmap']"));
			roadMapLink.click();
			Thread.sleep(3000);
			driver1.navigate().back();
			System.out.println("RoadMap is clicked");


			WebElement fantokensLink=driver1.findElement(By.xpath("//li[normalize-space()='Fan Tokens']"));
			fantokensLink.click();
			Thread.sleep(3000);
			driver1.navigate().back();
			System.out.println("Fan Tokens is clicked");



			WebElement aboutUsLink=driver1.findElement(By.xpath("//li[normalize-space()='About us']"));
			aboutUsLink.click();
			Thread.sleep(3000);
			driver1.navigate().back();
			System.out.println("About us  is clicked");


			WebElement  CareerLink=driver1.findElement(By.xpath("//li[normalize-space()='Career']"));
			CareerLink.click();
			Thread.sleep(3000);
			driver1.navigate().back();
			System.out.println("Career is clicked");


			WebElement supportLink=driver1.findElement(By.xpath("//li[normalize-space()='Support']"));
			supportLink.click();
			Thread.sleep(3000);
			driver1.navigate().back();
			System.out.println("Support  is clicked");


			//	WebElement termsOfUseLink=driver.findElement(By.xpath("//li[normalize-space()='Terms of use']"));
			//	termsOfUseLink.click();
			//	Thread.sleep(3000);
			//	driver.navigate().back();


			WebElement privacyPolicyLink=driver1.findElement(By.xpath("//li[normalize-space()='Privacy Policy']"));
			privacyPolicyLink.click();
			Thread.sleep(3000);
			String parent4=driver1.getWindowHandle();
			Set<String> childs3 = driver1.getWindowHandles();
			for(String child3:childs3) {
				if(!child3.equals(parent4)) {
					driver1.switchTo().window(child3);
				}
			}
			driver1.close();
			driver1.switchTo().window(parent3);

			System.out.println("Privacy policy is clicked");

			WebElement contactUsLink=driver1.findElement(By.xpath("//a[normalize-space()='Contact us']"));
			contactUsLink.click();
			Thread.sleep(3000);
			driver1.navigate().back();
			System.out.println("Contact Us is clicked");

			System.out.println("all footer links are clicked");


			//	WebElement legalDesclaimerLink=driver.findElement(By.xpath("//li[normalize-space()='Legal Disclaimer']"));
			//	legalDesclaimerLink.click();
			//	Thread.sleep(3000);
			//	driver.navigate().back();
			//
			System.out.println("SportsVerse101 page is executed successfully");
			driver1.close();


		}
	}
