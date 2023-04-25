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

public class TC_007_SupportPageTest {
	@Test
	public void supportTest() throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();

		driver.get("https://www.sportsverse.trade/supportPage");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act=new Actions(driver);

		//Clicking on withdraw Money

		WebElement withDrawMoney=driver.findElement(By.xpath("//button[contains(@class,'header-download')]"));
		withDrawMoney.click();
		Thread.sleep(3000);

		System.out.println("withDraw money is clicked");
		driver.navigate().back();

		// clicking on sign up

		WebElement signUp=driver.findElement(By.xpath("//button[@class='header-login responsive-header-navlinks2']"));
		signUp.click();
		Thread.sleep(3000);

		WebElement signUpClose = driver.findElement(By.xpath("//img[@src='data:image/svg+xml,%3Csvg%20width%3D%2224%22%20height%3D%2224%22%20viewBox%3D%220%200%2024%2024%22%20fill%3D%22none%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%3E%3Cpath%20fill-rule%3D%22evenodd%22%20clip-rule%3D%22evenodd%22%20d%3D%22M13.4142%2012L19.7782%2018.364L18.364%2019.7782L12%2013.4143L5.63604%2019.7782L4.22183%2018.364L10.5858%2012L4.22183%205.63608L5.63604%204.22187L12%2010.5858L18.364%204.22187L19.7782%205.63608L13.4142%2012Z%22%20fill%3D%22%23DFDFDF%22%2F%3E%3C%2Fsvg%3E']"));
		act.moveToElement(signUpClose).click().perform();
		//WebElement signUpClose = driver.findElement(By.xpath("//img[@alt='close']"));
		//signUpClose.click();
		System.out.println("sign up is clicked");

		System.out.println("*******************************");

		WebElement askUsQuestion=driver.findElement(By.xpath("//div[@class=\"text-center ask-us-parent\"]"));
		System.out.println(" ask us question text:- "+askUsQuestion.getText());

		System.out.println("*************************************");

		WebElement allSocialText=driver.findElement(By.xpath("//div[@class=\"container request-call-back-section\"]"));
		System.out.println("social media text:--"+allSocialText.getText());

		WebElement socialmediatextContainer=driver.findElement(By.xpath("//div[@class=\"container request-call-back-section\"]"));
		List<WebElement> socialLinks = socialmediatextContainer.findElements(By.tagName("img"));
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;

		for(WebElement socialLink:socialLinks) {
			executor1.executeScript("arguments[0].click();", socialLink);

			Thread.sleep(3000);
			String parent=driver.getWindowHandle();
			Set<String> childs = driver.getWindowHandles();
			for(String child:childs) {
				if(!child.equals(parent)) {
					driver.switchTo().window(child);
					Thread.sleep(3000);
				}
			}
			driver.close();
			driver.switchTo().window(parent);
			Thread.sleep(2000);
		}
		System.out.println("all socialtext links are clicked one by one");

		executor1.executeScript("window.scrollBy(0,900)");
		Dimension size=new Dimension(1536, 736);
		driver.manage().window().setSize(size);

		driver.manage().window().maximize();


		WebElement followUsText=driver.findElement(By.xpath("//div[@class=\"follow-us-heading\"]"));
		System.out.println(followUsText.getText());

		WebElement followUsLinksContainer=driver.findElement(By.xpath("//div[@class=\"follow-us-links \"]"));
		List<WebElement> followUsLinks = followUsLinksContainer.findElements(By.tagName("li"));
		for(WebElement followUsLink:followUsLinks) {
			act.moveToElement(followUsLink).click().perform();
			Thread.sleep(2000);
			String parent=driver.getWindowHandle();
			Set<String> childs = driver.getWindowHandles();
			for( String child:childs) {
				if(!child.equals(parent)) {
					driver.switchTo().window(child);
					Thread.sleep(2000);
				}
			}
			driver.close();
			driver.switchTo().window(parent);
			Thread.sleep(2000);
		}
		System.out.println("follow us links are clicked one by one");

		driver.findElement(By.id("name")).sendKeys("sdsjdhj");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("subject")).sendKeys("jhcdhbchjsj");
		WebElement radiobtn=driver.findElement(By.xpath("//input[@type=\"radio\"]"));
		System.out.println("radio button displayed:  "+radiobtn.isDisplayed());


		driver.findElement(By.id("message")).sendKeys("khdsjbchddj");
		executor1.executeScript("window.scrollBy(0,150)");
		driver.manage().window().setSize(size);

		driver.manage().window().maximize();


		WebElement submitbtn=driver.findElement(By.xpath("//button[@class=\"submit-btn\"]"));
		act.moveToElement(submitbtn).click().perform();
		Thread.sleep(2000);

		String actual=driver.findElement(By.xpath("//div[@class='submited-btn']")).getText();

		if(actual.equals("Submited")) {
			System.out.println("contact us information submited successfully");
		}

		else {
			System.out.println("Contact us information is not submitted");
		}

		String address=driver.findElement(By.xpath("//div[@class=\"address\"]")).getText();
		System.out.println("address:-- "+address);
		String wantToWorkwithUs=driver.findElement(By.xpath("//div[@class=\"want-to\"]")).getText();
		System.out.println(wantToWorkwithUs);

		executor1.executeScript("window.scrollBy(0,2100)");
		Dimension size1=new Dimension(1536, 736);

		driver.manage().window().setSize(size1);

		driver.manage().window().maximize();


		WebElement careerLink=driver.findElement(By.xpath("//h2[@class='c-btn']//a[normalize-space()='Career']"));
		act.moveToElement(careerLink).click().perform();
		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("Career link has been clicked");

	//	driver.close();
		
		//again reintialize the driver
		
//		WebDriverManager.firefoxdriver().setup();
//
//		WebDriver driver1=new FirefoxDriver();
//
//		driver1.get("https://www.sportsverse.trade/supportPage");
//		driver1.manage().window().maximize();
//		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Actions act1=new Actions(driver1);
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("window.scrollBy(0,5000)");
		Dimension size11=new Dimension(1536, 736);

		driver.manage().window().setSize(size11);

		driver.manage().window().maximize();
		
		/*
		WebElement downloadApp1 = driver1.findElement(By.xpath("//h2[text()='Download App']"));
		act1.moveToElement(downloadApp1);
		executor2.executeScript("arguments[0].click();",downloadApp1 );

		String parent=driver1.getWindowHandle();
		Set<String> childs = driver1.getWindowHandles();
		for( String child:childs) {
			if(!child.equals(parent)) {
				driver1.switchTo().window(child);
				Thread.sleep(2000);
			}
		}
		driver1.close();
		driver1.switchTo().window(parent);
		Thread.sleep(2000);

		*/
		
		//clicking on social media footer links
		
		WebElement homelink=	driver.findElement(By.xpath("//li[normalize-space()='Home']"));
		homelink.click();
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("home is clicked");

		WebElement learn1Link	=driver.findElement(By.xpath("//li[normalize-space()='Learn']"));
		learn1Link.click();
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("home is Learn is clicked");


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
		Set<String> childs1 = driver.getWindowHandles();
		for(String child1:childs1) {
			if(!child1.equals(parent3)) {
				driver.switchTo().window(child1);
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
		System.out.println("Support page is executed successfully ");
		driver.close();
	}
}
