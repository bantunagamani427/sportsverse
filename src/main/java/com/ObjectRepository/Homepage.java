package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//h3[text()='download app']")
	private WebElement downloadapplink;
	public WebElement getdownloadapplink() {
		return downloadapplink;
	}

	@FindBy(xpath="//button[@class='button2']")
	private WebElement Tradenowbtn;
	public WebElement getTradenowbtn() {
		return Tradenowbtn;
	}

	@FindBy(xpath="")
	private WebElement withdrawlink;
	public WebElement getwithdrawlink() {
		return withdrawlink;
	}

	

}