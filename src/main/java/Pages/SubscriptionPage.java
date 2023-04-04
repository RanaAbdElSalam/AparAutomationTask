package Pages;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import javax.xml.xpath.XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SubscriptionPage extends Page_Base {


	
	public String[] getSubscriptionData() throws InterruptedException, IOException {
		

		WebDriver driver = webDriver();
		
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);		
		driver.get("https://subscribe.stctv.com/");
	
		WebElement countrySection = driver.findElement(By.id("country-btn"));
		clickButton(countrySection);
		
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);		
		WebElement countryField = driver.findElement(By.id("ae"));
		clickButton(countryField);
		
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);		
		WebElement languageButton = driver.findElement(By.id("translation-btn"));
		clickButton(languageButton);
		
		String firstPackageType = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div[1]/strong")).getText();
		
		String firstPackagePrice = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div[2]/div[3]/div[2]/div[1]/div/b")).getText();
		
		String secondPackageType = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div[2]/strong")).getText();

		String secondPackagePrice = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div[2]/div[3]/div[2]/div[2]/div/b")).getText();

		String thirdPackageType = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div[3]/strong")).getText();
		
		String thirdPackagePrice = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div[2]/div[3]/div[2]/div[3]/div/b")).getText();
		
		String currency = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div[2]/div[3]/div[2]/div[1]/div/i")).getText();
		System.out.println(currency);
		
		String[] values = new String[7]; 		
		values[0] = firstPackageType;
	    values[1] = firstPackagePrice;
	    values[2] = secondPackageType;
	    values[3] = secondPackagePrice;
	    values[4] = thirdPackageType;
	    values[5] = thirdPackagePrice;
	    values[6] = currency;
		
		return values;

	}
	
}

