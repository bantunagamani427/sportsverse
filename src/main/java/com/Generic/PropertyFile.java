package com.Generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyFile {
	
//	private static PropertyFile prop;
//	
//	public PropertyFile() {
//		
//	}
//	
//	public static PropertyFile getObjectPropfile() {
//		return prop=new PropertyFile();
//		
//	}
//	
//	public String readDatafromPropfile(String key) throws IOException {
//		FileInputStream fis=new FileInputStream("../SportsVerse/src/main/java/Browser.properties");
//		Properties prop=new Properties();
//		prop.load(fis);
//		return prop.getProperty(key);
//	}
//	
	public static void main(String[] args) throws IOException {

		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("../SportsVerse/src/main/java/Browser.properties");
		prop.load(fis);

		String workingDir=System.getProperty("user.dir");
		System.out.println("system working directory:"+workingDir);
		String URL=prop.getProperty("URL");
		String Username=prop.getProperty("username");
		String password=prop.getProperty("password");
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(URL);
		System.out.println(Username);
		System.out.println(password);
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get(URL);
		
//		WebDriverUtility util=new WebDriverUtility(driver);
//		util.maximiseWindow();
	}
	}

	


