package com.ObjectRepository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {
	
public 	Properties prop;
public  WebDriver driver;

@Test		
public void intializer() throws IOException {
		

			//load the propertyfile
		
		FileInputStream fis=new FileInputStream("../SportsVerse/src/main/resources/Sportsverse.properties");
		prop=new Properties();
			prop.load(fis);

			//get the browser property value from the propertyfile
			String browserName=prop.getProperty("browser");

			//initialize the browser driver based on property value
			if(browserName.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
			}
			else if(browserName.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				WebDriver drvier=new FirefoxDriver();
			}

			else if(browserName.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				WebDriver driver=new EdgeDriver();
			}
			else {
				System.out.println("Invalid browsername");
				System.exit(0);
			}
	
			driver.get(prop.getProperty("url"));
	}}


