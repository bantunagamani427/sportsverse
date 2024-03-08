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

public class Kyyte {
	@Test
	public void aboutTest() throws InterruptedException {
       WebDriverManager.firefoxdriver().setup();
       WebDriver driver=new FirefoxDriver();
       
       
       driver.get("https://kyyte.io/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
       JavascriptExecutor jse=(JavascriptExecutor)driver;
       jse.executeScript("window.scrollBy(0,1000)");
       
       WebElement imageContainer = driver.findElement(By.xpath("//div[@class=\"row spsm15 about-custom p-3\"]"));
       List<WebElement> images = imageContainer.findElements(By.tagName("div"));
      
       Actions act=new Actions(driver);
       for(WebElement image:images) {
    	   act.moveToElement(image).click();
    	   Thread.sleep(3000);
    	   
    	   Dimension size=new Dimension(1536, 731);
    	   driver.manage().window().setSize(size);
    	   driver.manage().window().maximize();
    	   
    	   WebElement linkedInSymbol=driver.findElement(By.xpath("//div[@class=\"about-popup-child\"]//img[@src=\"./images/banner/linkdein.png\"]"));
    	   act.moveToElement(linkedInSymbol).click().perform();
    	   Thread.sleep(3000);
    	   String parent=driver.getWindowHandle();
    	   Set<String> childs = driver.getWindowHandles();
    	   
    	   for(String child:childs) {
    		   if(!child.equals(parent)) {
    			   driver.switchTo().window(child);
    			   Thread.sleep(2000);
    		   }
    	   }
    	  driver.close();
    	  driver.switchTo().window(parent);
    	  WebElement closebtn= driver.findElement(By.id("pop-close"));
    	  closebtn.click();
    	   
       }
     driver.quit();
       
       
       
       /*
        * import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageClickAutomation {
   public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://kyyte.metalok.io/about.html");
       Thread.sleep(5000);
       WebElement[] imageContainers = driver.findElements(By.className("image-container")).toArray(new WebElement[0]);
       for (WebElement container : imageContainers) {
           container.click();
           Thread.sleep(3000);
           WebElement linkedinSymbol = driver.findElement(By.className("linkedin-symbol"));
           linkedinSymbol.click();
           Thread.sleep(5000);
           // Switch to the new window opened
           for (String winHandle : driver.getWindowHandles()) {
               driver.switchTo().window(winHandle);
           }
           // Perform actions on LinkedIn page
           // ...
           driver.close();
           // Switch back to the original window
           driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
           WebElement closeButton = driver.findElement(By.className("close-button"));
           closeButton.click();
       }
       driver.quit();
   }
}

        */
       
       
		
		
		
		
	}
}
