package com.SportsVerse.TCs;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_005_AboutUsTest {

	@Test
	public void aboutUsTest() throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();

		//driver.get("https://www.sportsverse.trade/");
		driver.get("https://www.sportsverse.trade/companyPage");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Actions act=new Actions(driver);
		//		WebElement company=driver.findElement(By.xpath("//button[normalize-space()='Company']"));
		//		act.moveToElement(company).click().perform();
		//		
		//		//clicking on about dropdown
		//		WebElement aboutDD = driver.findElement(By.xpath("//a[text()='About us ']"));
		//		act.moveToElement(aboutDD).click().perform();
		//			
		System.out.println("URL is opening");


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

		driver.close();

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1=new FirefoxDriver();

		driver1.get("https://www.sportsverse.trade/companyPage");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//clicking on download app
		Actions act1=new Actions(driver1);
		WebElement downloadAppLink=driver1.findElement(By.xpath("//h3[normalize-space()='download app']"));
		act1.moveToElement(downloadAppLink).click().perform();

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

		System.out.println("download app is clicked");
		Thread.sleep(2000);

		JavascriptExecutor jse=(JavascriptExecutor)driver1;
		jse.executeScript("window.scrollBy(0,1000)");

		System.out.println("scrolling happen upto our team");

		WebElement ourTeamContainer = driver1.findElement(By.xpath("//div[@class=\"slick-track\"]"));

		List<WebElement> teamMembers = ourTeamContainer.findElements(By.tagName("div"));

		for(WebElement teamMember:teamMembers) {
			System.out.println(teamMember.getText());
		}

		System.out.println("all team memebers are printed");

		JavascriptExecutor jse1=(JavascriptExecutor)driver1;
		jse1.executeScript("window.scrollBy(0,1400)");

		Dimension size=new Dimension(1536, 731);
		driver1.manage().window().setSize(size);



		driver1.manage().window().maximize();

		// fill the details in Contact Us a message

		driver1.findElement(By.id("name")).sendKeys("bannu");			
		driver1.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver1.findElement(By.name("subject")).sendKeys("dsnmbcel");

		WebElement radioButton=driver1.findElement(By.xpath("//input[@type=\"radio\"]"));
		radioButton.click();
		System.out.println("radio button displayed:  "+ radioButton.isDisplayed());

		driver1.findElement(By.id("message")).sendKeys("hjdgjd");

		Thread.sleep(2000);
		JavascriptExecutor jse2=(JavascriptExecutor)driver1;
		jse2.executeScript("window.scrollBy(0,250)");

		Dimension size1=new Dimension(1536, 731);
		driver1.manage().window().setSize(size1);



		driver1.manage().window().maximize();



		WebElement submitbtn=driver1.findElement(By.xpath("//button[@class='submit-btn']"));
		act1.moveToElement(submitbtn).click().perform();

		String actual=driver1.findElement(By.xpath("//div[@class='submited-btn']")).getText();

		if(actual.equals("Submited")) {
			System.out.println("contact information submitted successfully");
		}
		else {
			System.out.println("contact information is not submitted");
		}

		Thread.sleep(2000);

		JavascriptExecutor jse3=(JavascriptExecutor)driver1;
		jse3.executeScript("window.scrollBy(0,2000)");



		Dimension size2=new Dimension(1536, 731);
		driver1.manage().window().setSize(size2);

		driver1.manage().window().maximize();


		driver1.manage().window().maximize();

		WebElement CareerLink = driver1.findElement(By.xpath("//h2[@class='c-btn']"));
		act1.moveToElement(CareerLink).click().perform();
		Thread.sleep(2000);
		driver1.navigate().refresh();
		driver1.navigate().back();

		System.out.println("Career link is clicked");

		JavascriptExecutor jse4=(JavascriptExecutor)driver1;
		jse4.executeScript("window.scrollBy(0,7000)");

		Dimension size3=new Dimension(1536, 731);
		driver1.manage().window().setSize(size3);

		driver1.manage().window().maximize();
		WebElement downloadappLink=driver1.findElement(By.xpath("//button[@class='start-engine-btn']"));
		act1.moveToElement(downloadappLink).click().perform();
		
				String parent2=driver1.getWindowHandle();
				Set<String> childs1 = driver1.getWindowHandles();
				for(String child1:childs1) {
					if(!child1.equals(childs1)) {
						driver1.switchTo().window(child1);
						Thread.sleep(3000);
					}
				}
				driver1.close();
		
				driver1.switchTo().window(parent2);
		
				WebElement socialMediaContainer = driver1.findElement(By.xpath("//div[@class=\"footer-meta-social \"]"));
				List<WebElement> socialMediaIcons = socialMediaContainer.findElements(By.tagName("a"));
		
				for(WebElement socialMediaIcon:socialMediaIcons) {
					act1.moveToElement(socialMediaIcon).click().perform();
					Thread.sleep(4000);
		
					String parent3=driver1.getWindowHandle();
					Set<String> childs2 = driver1.getWindowHandles();
		
					for( String child2:childs2) {
						if(!child2.equals(parent3)) {
							driver1.switchTo().window(child2);
						}
					}
					driver1.close();
					Thread.sleep(3000);
		
					driver1.switchTo().window(parent3);
				}
					System.out.println("all social media icons are clicked");
		
					WebElement homelink=driver1.findElement(By.xpath("//li[normalize-space()='Home']"));
					homelink.click();
					Thread.sleep(3000);
					driver1.navigate().back();
					System.out.println("home is clicked");
		
					WebElement learn1Link=driver1.findElement(By.xpath("//li[normalize-space()='Learn']"));
					learn1Link.click();
					Thread.sleep(3000);
					driver1.navigate().back();
					System.out.println("home is Learn is clicked");
		
		
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
		
		
					WebElement  CareerLink1=driver1.findElement(By.xpath("//li[normalize-space()='Career']"));
					CareerLink1.click();
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
					Set<String> childs4 = driver1.getWindowHandles();
					for(String child4:childs4) {
						if(!child4.equals(parent4)) {
							driver1.switchTo().window(child4);
						}
					}
					driver1.close();
					driver1.switchTo().window(parent4);
		
					System.out.println("Privacy policy is clicked");
		
					WebElement contactUsLink=driver1.findElement(By.xpath("//a[normalize-space()='Contact us']"));
					contactUsLink.click();
					Thread.sleep(3000);
					driver1.navigate().back();
					System.out.println("Contact Us is clicked");
		
					System.out.println("all footer links are clicked");
					driver1.navigate().refresh();
		
		//				WebElement legalDesclaimerLink=driver.findElement(By.xpath("//li[normalize-space()='Legal Disclaimer']"));
		//				legalDesclaimerLink.click();
		//				Thread.sleep(3000);
		//				driver.navigate().back();
		//			
		System.out.println("About us page is executed successfully");
					driver1.close();
	}
}




