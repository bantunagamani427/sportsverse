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

public class TC_003_SportsVerse101Test {

	@Test(priority = 3)
	public void sportverse101test() throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();

		driver.get("https://www.sportsverse.trade/learnPage2");
		System.out.println("Learn page2 is opening");
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
		//Locating all The FAQ's Links
		List<WebElement> BasicLinks = BasicsFAQContainer.findElements(By.tagName("h2"));
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
		//		jse.executeAsyncScript("window.scrollBy(0,1900)");

		jse.executeScript("window.scrollBy(0,1000)");

		Dimension size=new Dimension(1536, 731);
		driver.manage().window().setSize(size);
		driver.manage().window().maximize();
		WebElement ItAllDependsOntext=driver.findElement(By.xpath("//h1[@class=\"all-depends-heading pt-5 pb-5\"]"));
		System.out.println(ItAllDependsOntext.getText());
		System.out.println("***************************************");

		WebElement allDependsContainer=driver.findElement(By.xpath("//div[@class=\"row m-auto\"]"));
		List<WebElement> AllDependsTexts = allDependsContainer.findElements(By.tagName("div"));
		for(WebElement AllDependsText:AllDependsTexts) {
			System.out.println(AllDependsText.getText());
		}
		System.out.println("*****************************");
		System.out.println("all depends on sub text is printed");

		jse.executeScript("window.scrollBy(0,900)");
		driver.manage().window().setSize(size);
		driver.manage().window().maximize();

		//		WebElement contactSupport=null;
		//		WebDriverWait wait=new WebDriverWait(driver1, 30);
		//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='c-btn']")));

		WebElement contactSupport=driver.findElement(By.xpath("//h2[@class='c-btn']"));
		act.moveToElement(contactSupport).click().perform();

		Thread.sleep(3000);
		System.out.println("contact support is clicked");
		driver.navigate().back();

		Thread.sleep(3000);

		WebElement downloadappLink = driver.findElement(By.xpath("//h2[@class='btn-h']"));
		downloadappLink.click();

		String parent3=driver.getWindowHandle();
		Set<String> childs = driver.getWindowHandles();
		for(String child:childs) {
			if(!child.equals(parent3)) {
				driver.switchTo().window(child);
				Thread.sleep(3000);
			}
		}
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(parent3);

		Thread.sleep(2000);

		jse.executeScript("window.scrollBy(0,900)");
		driver.manage().window().setSize(size);
		driver.manage().window().maximize();

		/*
		WebElement faqContainer=driver1.findElement(By.xpath("//div[@class=\"accordion accordion-flush\"]"));
		List<WebElement> FaqLinks = faqContainer.findElements(By.tagName("div"));

		for(WebElement FaqLink:FaqLinks) {
			jse1.executeScript("arguments[0].scrollIntoView();",FaqLink );
			driver1.manage().window().setSize(size1);
			driver1.manage().window().maximize();
			act1.moveToElement(FaqLink).doubleClick().perform();
			Thread.sleep(2000);
			System.out.println(FaqLink.getText());
			Thread.sleep(1000);
		}
		 */	

		WebElement firstFaq=driver.findElement(By.xpath("//button[normalize-space()='What are Fan tokens?']"));
		firstFaq.click();
		Thread.sleep(2000);
		firstFaq.click();

		WebElement secondFaq=driver.findElement(By.xpath("//button[contains(text(),'What is a Digital Wallet? Are they necessary to bu')]"));
		secondFaq.click();
		Thread.sleep(2000);
		secondFaq.click();

		WebElement thirdFaq=driver.findElement(By.xpath("//button[contains(text(),'Which Cryptocurrencies can be used for Trading on ')]"));
		thirdFaq.click();
		Thread.sleep(2000);
		thirdFaq.click();

		WebElement fourthFaq=driver.findElement(By.xpath("//button[contains(text(),'Are my transactions secured on the Sportsverse Pla')]"));
		act.moveToElement(fourthFaq).doubleClick().perform();
		Thread.sleep(2000);

		WebElement fifth=driver.findElement(By.xpath("//button[normalize-space()='When will the NFT marketplace open on Sportsverse?']"));
		fifth.click();
		Thread.sleep(2000);
		fifth.click();

		WebElement sixth=driver.findElement(By.xpath("//button[contains(text(),'Can the Fan Tokens of Sportsverse be considered NF')]"));
		sixth.click();
		Thread.sleep(2000);
		sixth.click();

		WebElement seventh=driver.findElement(By.xpath("//button[contains(text(),'How to convert my profits on Sportsverse to FIAT c')]"));
		seventh.click();
		Thread.sleep(2000);
		seventh.click();

		WebElement eighth=driver.findElement(By.xpath("//button[normalize-space()='What are the advantages of Staking?']"));
		eighth.click();
		Thread.sleep(2000);
		eighth.click();

		System.out.println("each FAQ link is clciked");
		Thread.sleep(2000);

		jse.executeScript("window.scrollBy(0,1000)");
		driver.manage().window().setSize(size);
		driver.manage().window().maximize();

		WebElement socialMediaIconsContainer1 = driver.findElement(By.xpath("//div[@class=\"footer-meta-social \"]"));
		List<WebElement> socialMediaIcons1 = socialMediaIconsContainer1.findElements(By.tagName("a"));

		//move to each icon for that we create the actions class

		for(WebElement socialMediaIcon1:socialMediaIcons1) {
			act.moveToElement(socialMediaIcon1).click().perform();
			Thread.sleep(3000);

			String Parent3=driver.getWindowHandle();
			Set<String> childs1 = driver.getWindowHandles();
			for(String child1:childs1) {
				if(!child1.equals(Parent3)) {
					driver.switchTo().window(child1);
					Thread.sleep(3000);
				}
			}
			driver.close();
			Thread.sleep(3000);
			driver.switchTo().window(Parent3);
		}
		System.out.println("All icons are clicked ");
		//clicking on footer links

		WebElement homelink=driver.findElement(By.xpath("//li[normalize-space()='Home']"));
		homelink.click();
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("home is clicked");

		jse.executeScript("window.scrollBy(0,16000)");


		driver.manage().window().setSize(size);

		driver.manage().window().maximize();

		WebElement learn1Link=driver.findElement(By.xpath("//li[normalize-space()='Learn']"));
		act.moveToElement(learn1Link).click().perform();
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("Learn1 is clicked");

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
		String parent4=driver.getWindowHandle();
		Set<String> childs3 = driver.getWindowHandles();
		for(String child3:childs3) {
			if(!child3.equals(parent4)) {
				driver.switchTo().window(child3);
			}
		}
		driver.close();
		driver.switchTo().window(parent4);
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

		System.out.println("SportsVerse101 page is executed successfully");
		driver.close();
	}
}
