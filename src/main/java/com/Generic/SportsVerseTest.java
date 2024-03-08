package com.Generic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SportsVerseTest {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();

		driver.get("https://www.sportsverse.trade/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// 1)Verify that page title is correct

		String expectedTitle="Sportsverse";

		String actualTitle=driver.getTitle();

		System.out.println("expected Title: "+expectedTitle);
		System.out.println("Actual Title: "+actualTitle);

		if(actualTitle.equals(expectedTitle)) {

			System.out.println("Title is correct");
		}

		else {

			System.out.println("Title is inCorrect");
		}

		System.out.println("****************************");

		// 2)Verify that the page is secure and uses HTTPS encryption

		String currentURL=driver.getCurrentUrl();

		if(currentURL.startsWith("https://")) {
			System.out.println("page is secure");
		}

		else {
			System.out.println("page is not secure");
		}
		System.out.println("****************************");
		// 3)Verify that the page heading is correct

		WebElement headingElement = driver.findElement(By.xpath("//div[@class=\"header-container\"]"));
		System.out.println("actual Heading: "+headingElement.getText());
		String expectedHeading = "Home Learn Fan Tokens Company Roadmap Withdraw Money SIGN UP";
		System.out.println("expected Heading: "+expectedHeading);
		String actualHeading = headingElement.getText();

		if (actualHeading.equals(expectedHeading)) {
			System.out.println("Page heading is correct");
		} else {
			System.out.println("Page heading is incorrect");
		}
		System.out.println("****************************");

		//4) Verify that the page has a footer

		WebElement footer=driver.findElement(By.tagName("footer"));

		if(footer.isDisplayed()) {
			System.out.println("footer is displayed");
		}

		else {
			System.out.println("footer is not displayed");
		}

		System.out.println("******************************");

		//5)Verify that all links on the page are functional and lead to the correct pages

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for(WebElement link:links) {
			String href=link.getAttribute("href");
			if((href!=null)&&(!href.isEmpty())){
				System.out.println(href+" is valid Link");
			}
			else {
				System.out.println(href+" is not a Valid link");
			}
			
			driver.navigate().back();
		}
	
		
/*
 *Verify that the login and registration forms work correctly.how can we do it for following URL https://www.sportsverse.trade/
 *  // Find the register button and click it
        WebElement registerButton = driver.findElement(By.linkText("Register"));
        registerButton.click();

        // Find the form fields and enter valid information
        WebElement nameField = driver.findElement(By.name("name"));
        WebElement emailField = driver.findElement(By.name("email"));
        WebElement passwordField = driver.findElement(By.name("password"));
        nameField.sendKeys("John Smith");
        emailField.sendKeys("valid_email@example.com");
        passwordField.sendKeys("valid_password");

        // Find the submit button and click it
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();

        // Verify that the registration was successful by checking for the presence of the user's name on the page
        WebElement welcomeMessage = driver.findElement(By.xpath("//span[@class='navbar-text']"));
        if (welcomeMessage.getText().equals("Welcome, John Smith")) {
            System.out.println("Registration was successful");
        } else {
            System.out.println("Registration was not successful");
       }
      ---------------------------------------------------------- 
// Find the register button and click it
        WebElement registerButton = driver.findElement(By.linkText("Register"));
        registerButton.click();

        // Find the form fields and enter valid information
        WebElement nameField = driver.findElement(By.name("name"));
        WebElement emailField = driver.findElement(By.name("email"));
        WebElement passwordField = driver.findElement(By.name("password"));
        nameField.sendKeys("John Smith");
        emailField.sendKeys("valid_email@example.com");
        passwordField.sendKeys("valid_password");

        // Find the submit button and click it
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();

        // Verify that the registration was successful by checking for the presence of the user's name on the page
        WebElement welcomeMessage = driver.findElement(By.xpath("//span[@class='navbar-text']"));
        if (welcomeMessage.getText().equals("Welcome, John Smith")) {
            System.out.println("Registration was successful");
        }
         
        else {
            System.out.println("Registration was not successful");
       }
       -------------------------------------------------------------------------------
       Verify that the search functionality returns accurate results. how can we do it for following URL https://www.sportsverse.trade/
       
 //Find the search input field and enter a search query
        WebElement searchField = driver.findElement(By.name("search"));
        searchField.sendKeys("basketball");

        // Find the search button and click it
        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
        searchButton.click();

        // Verify that the search results page is displayed
        WebElement searchResultsTitle = driver.findElement(By.xpath("//h1[contains(text(), 'Search Results')]"));
        if (searchResultsTitle.isDisplayed()) {
            System.out.println("Search results page was displayed");
        } else {
            System.out.println("Search results page was not displayed");
        }

        // Verify that the search results contain the expected text
        WebElement searchResults = driver.findElement(By.xpath("//div[@class='card-body']"));
        if (searchResults.getText().contains("basketball")) {
            System.out.println("Search results are accurate");
        } else {
            System.out.println("Search results are not accurate");
        }
-------------------------------------------------------------------------------------------------------
Verify that the page is optimized for mobile devices and responsive to different screen sizes.how can we do it for this URL https://www.sportsverse.trade/

// Verify that the page layout is adapted for a mobile device
        boolean isMobileLayout = driver.findElement(By.xpath("//div[contains(@class, 'navbar-collapse')]")).isDisplayed();
        if (isMobileLayout) {
            System.out.println("Page layout is adapted for a mobile device");
        } else {
            System.out.println("Page layout is not adapted for a mobile device");
        }

        // Resize the window to a tablet screen size
        driver.manage().window().setSize(new Dimension(768, 1024)); // iPad screen size

        // Verify that the page layout is adapted for a tablet device
        boolean isTabletLayout = driver.findElement(By.xpath("//div[contains(@class, 'container-fluid')]")).isDisplayed();
        if (isTabletLayout) {
            System.out.println("Page layout is adapted for a tablet device");
        } else {
            System.out.println("Page layout is not adapted for a tablet device");
        }

        // Resize the window to a desktop screen size
        driver.manage().window().setSize(new Dimension(1280, 800)); // typical laptop screen size

        // Verify that the page layout is adapted for a desktop device
        boolean isDesktopLayout = driver.findElement(By.xpath("//a[contains(text(), 'About Us')]")).isDisplayed();
        if (isDesktopLayout) {
            System.out.println("Page layout is adapted for a desktop device");
        } else {
            System.out.println("Page layout is not adapted for a desktop device");
        }
-----------------------------------------------------------------------------------------------------
Verify that the page is optimized for mobile devices and responsive to different screen sizes.how can we do it for this URL https://www.sportsverse.trade/
ChatGPT
To verify that the page at https://www.sportsverse.trade/ is optimized for mobile devices and responsive to different screen sizes, you can use Selenium WebDriver to emulate different screen sizes and verify that the page layout adapts accordingly.

Here's an example of how you can test the page responsiveness:

java
Copy code
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SportsVerseTest {
    public static void main(String[] args) {
        // Set the path to the Chrome driver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

        // Set the Chrome options to emulate a mobile device
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=375,812"); // iPhone X screen size

        // Create a new instance of the Chrome driver with the specified options
        WebDriver driver = new ChromeDriver(options);

        // Navigate to the URL
        driver.get("https://www.sportsverse.trade/");

        // Verify that the page layout is adapted for a mobile device
        boolean isMobileLayout = driver.findElement(By.xpath("//div[contains(@class, 'navbar-collapse')]")).isDisplayed();
        if (isMobileLayout) {
            System.out.println("Page layout is adapted for a mobile device");
        } else {
            System.out.println("Page layout is not adapted for a mobile device");
        }

        // Resize the window to a tablet screen size
        driver.manage().window().setSize(new Dimension(768, 1024)); // iPad screen size

        // Verify that the page layout is adapted for a tablet device
        boolean isTabletLayout = driver.findElement(By.xpath("//div[contains(@class, 'container-fluid')]")).isDisplayed();
        if (isTabletLayout) {
            System.out.println("Page layout is adapted for a tablet device");
        } else {
            System.out.println("Page layout is not adapted for a tablet device");
        }

        // Resize the window to a desktop screen size
        driver.manage().window().setSize(new Dimension(1280, 800)); // typical laptop screen size

        // Verify that the page layout is adapted for a desktop device
        boolean isDesktopLayout = driver.findElement(By.xpath("//a[contains(text(), 'About Us')]")).isDisplayed();
        if (isDesktopLayout) {
            System.out.println("Page layout is adapted for a desktop device");
        } else {
            System.out.println("Page layout is not adapted for a desktop device");
        }

        // Close the browser
        driver.quit();
    }
}
This code creates a new instance of the Chrome driver with the Chrome options set to emulate an iPhone X screen size. It then navigates to the URL and verifies that the page layout is adapted for a mobile device. The code then resizes the window to emulate a tablet and a desktop screen size and verifies that the page layout is adapted accordingly.

Note that the screen sizes used in this example may need to be adjusted based on the actual screen sizes of the devices you want to test.
----------------------------------------------------------------------------------
Verify that the page loads quickly and without errors.how can we do it for following URL https://www.sportsverse.trade/

// Navigate to the URL
        driver.get("https://www.sportsverse.trade/");

        // Wait for the page to load
        long endTime = System.currentTimeMillis();
        long loadTime = endTime - startTime;
        System.out.println("Page loaded in " + loadTime + " milliseconds");

        // Check for any errors in the browser console
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Object errors = js.executeScript("return window.console.error");
        if (errors != null) {
            System.out.println("Errors found in the browser console:");
            System.out.println(errors.toString());
        } else {
            System.out.println("No errors found in the browser console");
        }
-----------------------------------------------------------------------------------------------------------------------------------





 */
		
		driver.close();
	}

}
