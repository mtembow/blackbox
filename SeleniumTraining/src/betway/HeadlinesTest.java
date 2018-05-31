package betway;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeadlinesTest {
	WebDriver driver;
	
	@Test
	public void headlinesPresent() {
		List <WebElement> aElements = driver.findElements(By.tagName("a"));
		System.out.println("All the headlines displayed on the page.");
		
			for (WebElement aElement : aElements) {
				System.out.println(aElement.getText());
			}
	}
	
	@BeforeMethod
	public void setUp() {
		String webUrl = "http://news.google.com/";
		driver = utilities.DriverFactory.open("firefox");
		driver.manage().deleteAllCookies();
		driver.get(webUrl);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
