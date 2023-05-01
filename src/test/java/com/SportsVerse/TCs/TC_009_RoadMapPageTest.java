package com.SportsVerse.TCs;

import java.util.HashSet;
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
		System.out.println("******************************");

		//clicking on signUp

		WebElement signUp=driver.findElement(By.xpath("//button[@class='header-login responsive-header-navlinks2']"));
		signUp.click();
		Thread.sleep(2000);
		System.out.println("sign Up is clicked ");
		System.out.println("*************************************");

		Actions act=new Actions(driver);

		//sign up is closed

		WebElement signUpClose=driver.findElement(By.xpath("//img[@alt='close']"));
		executor1.executeScript("arguments[0].click();",signUpClose );
		act.moveToElement(signUpClose).click().perform();	
		System.out.println("sign up is closed");
		System.out.println("****************************************");

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

		for(WebElement BasicLink:BasicLinks) {
          System.out.println();
           Thread.sleep(2000);
			jse.executeScript("arguments[0].scrollIntoView();", BasicLink );
       }
			Thread.sleep(2000);
		 */
		WebElement roadmapsection = driver.findElement(By.xpath("//section[@class='road-map-line-section']"));
		List<WebElement> phases = roadmapsection.findElements(By.tagName("div"));
		Set<String> uniquePhases = new HashSet<>();

		// here there are number of div tags contains the repeated information to avoid this we use Hashset

		for (WebElement phase : phases) {
			String eachPhase = phase.getText();
			if (!uniquePhases.contains(eachPhase)) {
				uniquePhases.add(eachPhase);
				System.out.println("each phase information: " + eachPhase);
				System.out.println("******************************************");
			}
		}

		//clicking on download the white paper  //section[@class='road-map-line-section']

		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,3000)");

		Dimension size=new Dimension(1536, 731);
		driver.manage().window().setSize(size);

		driver.manage().window().maximize();

		WebElement downloadTheWhitePaper=driver.findElement(By.xpath("//button[normalize-space()='download The White Paper']"));
		act.moveToElement(downloadTheWhitePaper).click().perform();
		String parent=driver.getWindowHandle();
		Set<String> childs = driver.getWindowHandles();
		for(String child:childs) {
			if(!child.equals(parent)) {
				driver.switchTo().window(child);
				Thread.sleep(5000);
			}
		}
		driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(2000);

		System.out.println("**********************************");
		System.out.println("download the white paper is clicked :");



		//driver is closed and again reintialized



		WebElement footerContainer=driver.findElement(By.xpath("//div[@class=\"footer-meta-social \"]"));
		List<WebElement> footerLinks = footerContainer.findElements(By.tagName("a"));



		for(WebElement footerLink:footerLinks){
			act.moveToElement(footerLink).click().perform();
			Thread.sleep(2000);
			String Parent =driver.getWindowHandle();
			Set<String> childs1 = driver.getWindowHandles();
			for(String child1:childs1) {
				if(!child1.equals(Parent)) {
					driver.switchTo().window(child1);
					Thread.sleep(2000);
				}
			}

			driver.close();
			Thread.sleep(1000);
			driver.switchTo().window(Parent);
		}
		System.out.println("**************************");
		System.out.println("all social media links are clicked one by one");		

		WebElement homeLink=driver.findElement(By.xpath("//li[normalize-space()='Home']"));
		act.moveToElement(homeLink).click().perform();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("home link is clicked ");

		WebElement learn1Link=driver.findElement(By.xpath("//li[normalize-space()='Learn']"));
		act.moveToElement(learn1Link).click().perform();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("Learn1 link is clicked");

		WebElement SportsVerse101=driver.findElement(By.xpath("//li[normalize-space()='Sportsverse 101']"));
		act.moveToElement(SportsVerse101).click().perform();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("Sportsverse101 link is clicked");

		WebElement RoadMapLink=driver.findElement(By.xpath("//li[normalize-space()='Roadmap']"));
		act.moveToElement(RoadMapLink).click().perform();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("RoadMap link is clicked ");

		WebElement FanTokensLink=driver.findElement(By.xpath("//li[normalize-space()='Fan Tokens']"));
		act.moveToElement(FanTokensLink).click().perform();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("Fan Tokens link is clicked");


		WebElement aboutUsLink=driver.findElement(By.xpath("//li[normalize-space()='About us']"));
		act.moveToElement(aboutUsLink).click().perform();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("About us link is clicked");

		WebElement careerLink=driver.findElement(By.xpath("//li[normalize-space()='Career']"));
		act.moveToElement(careerLink).click().perform();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("Career link is clicked ");

		WebElement supportLink =driver.findElement(By.xpath("//li[normalize-space()='Support']"));
		act.moveToElement(supportLink).click().perform();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("Support link is clicked");

		WebElement PrivacyPolicyLink = driver.findElement(By.xpath("//li[normalize-space()='Privacy Policy']"));
		act.moveToElement(PrivacyPolicyLink).click().perform();
		Thread.sleep(2000);
		String Parent2=driver.getWindowHandle();
		Set<String> childs2 = driver.getWindowHandles();
		for(String child2:childs2) {
			if(!child2.equals(Parent2)) {
				driver.switchTo().window(child2);
			}
		}
		driver.close();
		driver.switchTo().window(Parent2);

		WebElement contactUsLink=driver.findElement(By.xpath("//li[normalize-space()='Contact us']"));
		act.moveToElement(contactUsLink).click().perform();
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("Contact us link is clicked");
		driver.close();
	}
}
