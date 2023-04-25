package com.ObjectRepository;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author :nagamani
 * @ description: this class is going to create all the classes to reduce the code
 */
public class WebDriverUtil {
	WebDriver driver ;

	public WebDriverUtil(WebDriver driver)
	{
		this.driver=driver;
}

	public void maximiseWindow() {
		driver.manage().window().maximize();
	}

	public void pageLoadTimeout() 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void waitanClick(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,10); 
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	

	public void selectDD(String visibletext,WebElement element) 
	{
		Select select = new Select(element);
		select.selectByVisibleText(visibletext);
	}

	public void selectDD(WebElement element,String value) 
	{
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void selectDD(WebElement element,int index) 
	{
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void moveToelement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void dragAndDrop(WebElement source,WebElement target) {
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
	}

	public void refreshPage() {
		driver.navigate().refresh();
	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();

	}

	public void TakeScreenshot() throws IOException {
		TakesScreenshot sh=(TakesScreenshot)driver;
		File src=sh.getScreenshotAs(OutputType.FILE);
		
		String filePath="copy path";
		
		File dest=new File(filePath);
		FileUtils.copyFile(src, dest);
	}

	public WebDriver switchWindow(String Wh) 
	{
		driver.switchTo().window(Wh);
		return driver.switchTo().window(Wh);

	}
}
