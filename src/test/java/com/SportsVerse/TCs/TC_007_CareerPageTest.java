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
public class TC_007_CareerPageTest {
	
	@Test(priority = 7)
	public void careertest() throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();

		driver.get("https://www.sportsverse.trade/careerPage");
		System.out.println("Career page is opening");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Career page is opened");

		Actions act=new Actions(driver);

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
		act.moveToElement(signUpClose).click().perform();
		System.out.println("sign up is closed");
		System.out.println("***********************************");
		String joinTheTeamText=driver.findElement(By.xpath("//div[@class=\"col-md-12 m-auto career1-parent\"]")).getText();
		System.out.println(joinTheTeamText);
		driver.close();


		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1=new FirefoxDriver();

		driver1.get("https://www.sportsverse.trade/careerPage");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Actions act1=new Actions(driver1);

		WebElement joinTheTeam=driver1.findElement(By.xpath("//button[@class=\"join-the-team\"]"));
		act1.moveToElement(joinTheTeam).click().perform();		
		Thread.sleep(3000);
		String parent=driver1.getWindowHandle();
		Set<String> childs = driver1.getWindowHandles();
		for(String child:childs) {
			if(!child.equals(parent)) {
				driver1.switchTo().window(child);
				Thread.sleep(2000);
			}
		}
		driver1.close();
		driver1.switchTo().window(parent);

		System.out.println("*****************************");
		String YouJoinOurText=driver1.findElement(By.xpath("//div[@class=\" row m-auto\"]")).getText();
		System.out.println(YouJoinOurText);

		System.out.println("***************************");
		String exlorejobsHeading=driver1.findElement(By.xpath("//div[@class=\"explore-jobs-head\"]")).getText();
		System.out.println(exlorejobsHeading);

		System.out.println("**************************");
		String explorejobscontainertext=driver1.findElement(By.xpath("//div[@class=\"row my-2\"]")).getText();
		System.out.println(explorejobscontainertext);

		System.out.println("*****************************");
		JavascriptExecutor jse=(JavascriptExecutor)driver1;
		jse.executeScript("window.scrollBy(0,1700)");
		Thread.sleep(2000);
		Dimension size=new Dimension(1536, 731);
		driver1.manage().window().setSize(size);

		driver1.manage().window().maximize();
		//clicking on applylinks

		WebElement exploreJobsContainer=driver1.findElement(By.xpath("//div[@class=\"row my-2\"]"));
		List<WebElement> applyNowLinks = exploreJobsContainer.findElements(By.tagName("button"));
		for(WebElement applyNowLink:applyNowLinks) {
			act1.moveToElement(applyNowLink).click().perform();
			Thread.sleep(2000);
			jse.executeScript("arguments[0].scrollIntoView();", applyNowLink );	

			String parent1=driver1.getWindowHandle();
			Set<String> childs1 = driver1.getWindowHandles();
			for(String child1:childs1) {
				if(!child1.equals(parent1)) {
					driver1.switchTo().window(child1);
					Thread.sleep(2000);
				}
			}
			driver1.close();
			Thread.sleep(2000);
			driver1.switchTo().window(parent1);
		}
		System.out.println("all apply links are clicked one by one");
		jse.executeScript("window.scrollBy(0,800)");

		String whatareThey=driver1.findElement(By.xpath("//div[@class=\"col-md-6 what-are-they-left-section\"]")).getText();
		System.out.println(whatareThey);

		driver1.manage().window().setSize(size);
		driver1.manage().window().maximize();

		WebElement innovativeContainer=driver1.findElement(By.xpath("//div[@class=\"slide-panel\"]"));
		List<WebElement> images = innovativeContainer.findElements(By.tagName("img"));
		for(WebElement image:images) {
			act1.moveToElement(innovativeContainer).build().perform();
			System.out.println("images are showing:-"+image.isDisplayed());
		}

		System.out.println("all images are displayed true");

		System.out.println("********************************");
		Thread.sleep(2000);

		WebElement preArrow=driver1.findElement(By.xpath("//div[@class=\"prev\"]"));
		act1.moveToElement(preArrow).doubleClick().perform();
		act1.moveToElement(preArrow).doubleClick().perform();
		System.out.println("arrow is clicking 4 times");

		System.out.println("**********************************");

		String fastSimpleText=driver1.findElement(By.xpath("//div[@class=\"section my-5\"]")).getText();
		System.out.println(fastSimpleText);
		Thread.sleep(2000);

		System.out.println("***************************");

		jse.executeScript("window.scrollBy(0,600)");
		driver1.manage().window().setSize(size);
		driver1.manage().window().maximize();

		WebElement fastsimpleImagesContainer = driver1.findElement(By.xpath("//div[@class=\"row text-center\"]"));
		List<WebElement> fastsimpleImages = fastsimpleImagesContainer.findElements(By.tagName("img"));
		for(WebElement fastsimpleImage:fastsimpleImages) {
			act1.moveToElement(fastsimpleImage).build().perform();
			System.out.println("every fast & simple image displayed :--"+fastsimpleImage.isDisplayed());
		}

		System.out.println("**********************");
		String lifeSportVerseSection=driver1.findElement(By.xpath("//div[@class=\"life-sportsverse-section\"]")).getText();
		System.out.println(lifeSportVerseSection);
		Thread.sleep(2000);

		System.out.println("**********************");
		jse.executeScript("window.scrollBy(0,850)");

		String ComeJoinUsText=driver1.findElement(By.xpath("//div[@class=\"container come-join-section text-center\"]")).getText();
		System.out.println(ComeJoinUsText);
		Thread.sleep(2000);
		System.out.println("*************************");
		String footer=driver1.findElement(By.xpath("//div[@class=\"row footer-r\"]")).getText();
		System.out.println("footer:--"+footer);


		/*
		 * 
		WebElement firstLinksContainer = driver.findElement(By.xpath("//div[@class=\"col-lg-2 col-4 mt-4 mt-lg-0 pl-3\"]"));
		List<WebElement> firstLinks = firstLinksContainer.findElements(By.tagName("ul"));
		WebDriverWait wait=new WebDriverWait(driver, 10);
		for(WebElement firstLink:firstLinks) {
			wait.until(ExpectedConditions.elementToBeClickable(firstLink));
			act.moveToElement(firstLink).click().perform();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);

		}

		List<WebElement> footerLinks = firstLinksContainer.findElements(By.cssSelector("footer li"));
		WebDriverWait wait = new WebDriverWait(driver, 10);

		for (WebElement link : footerLinks) {
		    wait.until(ExpectedConditions.elementToBeClickable(link));
		    String linkText = link.getText();
		    WebElement specificLink = driver.findElement(By.xpath("//footer//a[contains(text(), '" + linkText + "')]"));
		    act.moveToElement(specificLink).click().perform();
		    Thread.sleep(2000);
		    driver.navigate().back();
		    Thread.sleep(2000);
		}
		 */

		WebElement footerContainer=driver1.findElement(By.xpath("//div[@class=\"footer-meta-social \"]"));
		List<WebElement> footerLinks = footerContainer.findElements(By.tagName("a"));

		for(WebElement footerLink:footerLinks){
			act1.moveToElement(footerLink).click().perform();
			Thread.sleep(2000);
			String Parent =driver1.getWindowHandle();
			Set<String> childs1 = driver1.getWindowHandles();
			for(String child1:childs1) {
				if(!child1.equals(Parent)) {
					driver1.switchTo().window(child1);
					Thread.sleep(2000);
				}
			}
			
			driver1.close();
			Thread.sleep(1000);
			driver1.switchTo().window(Parent);
		}
		
		System.out.println("all social media Icons are clicked one by one ");

		WebElement homeLink=driver1.findElement(By.xpath("//li[normalize-space()='Home']"));
		homeLink.click();
		Thread.sleep(2000);
		System.out.println("home is clicked");
		driver1.navigate().back();
		Thread.sleep(2000);

		WebElement learnLink=driver1.findElement(By.xpath("//li[normalize-space()='Learn']"));
		learnLink.click();
		Thread.sleep(2000);
		System.out.println("Learn1 is clicked ");
		driver1.navigate().back();
		Thread.sleep(2000);

		WebElement  sportsVerse101=driver1.findElement(By.xpath("//li[normalize-space()='Sportsverse 101']"));
		sportsVerse101.click();
		Thread.sleep(2000);
		System.out.println("learn2 is clicked ");
		driver1.navigate().back();
		Thread.sleep(2000);

		WebElement roadMap=driver1.findElement(By.xpath("//li[normalize-space()='Roadmap']"));
		roadMap.click();
		Thread.sleep(2000);
		System.out.println("roadMap is clicked ");
		driver1.navigate().back();
		Thread.sleep(2000);

		WebElement fanTokensLink=driver1.findElement(By.xpath("//li[normalize-space()='Fan Tokens']"));
		fanTokensLink.click();
		Thread.sleep(2000);
		System.out.println("fanTokens is clicked ");
		driver1.navigate().back();
		Thread.sleep(2000);

		WebElement AboutUs=driver1.findElement(By.xpath("//li[normalize-space()='About us']"));
		AboutUs.click();
		Thread.sleep(2000);
		System.out.println("About Us is clicked ");
		driver1.navigate().back();
		Thread.sleep(2000);

		WebElement careerLink=driver1.findElement(By.xpath("//li[normalize-space()='Career']"));
		act1.moveToElement(careerLink).click();
		Thread.sleep(2000);
		System.out.println("Career link is clicked");
		driver1.navigate().back();
		Thread.sleep(2000);

		WebElement supportLink=driver1.findElement(By.xpath("//li[normalize-space()='Support']"));
		act1.moveToElement(supportLink).click().perform();
		Thread.sleep(2000);
		System.out.println("Spport link is clicked");
		driver1.navigate().back();
		Thread.sleep(2000);
		
		WebElement privacyPolicyLink=driver1.findElement(By.xpath("//li[normalize-space()='Privacy Policy']"));
		act1.moveToElement(privacyPolicyLink).click().perform();
		String parent1=driver1.getWindowHandle();
		Set<String> childs2 = driver1.getWindowHandles();
		for(String child1:childs2) {
			if(!child1.equals(parent1)) {
				driver1.switchTo().window(child1);
				Thread.sleep(2000);
			}
			}
		driver1.close();
		driver1.switchTo().window(parent1);
		Thread.sleep(2000);

		WebElement contactUs=driver1.findElement(By.xpath("//a[normalize-space()='Contact us']"));
		act1.moveToElement(contactUs).click().perform();
		Thread.sleep(2000);
		System.out.println("Contact us link is clicked ");
		driver1.navigate().back();

		System.out.println("all footer links are clicked one by one ");
		System.out.println("Career page is executed successfully");
		driver1.close();
		
		
	}
}


