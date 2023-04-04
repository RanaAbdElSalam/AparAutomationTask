package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Page_Base {
	
	
		public JavascriptExecutor jse = new JavascriptExecutor() {
		
		public Object executeScript(String arg0, Object... arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		public Object executeAsyncScript(String arg0, Object... arg1) {
			// TODO Auto-generated method stub
			return null;
		}
	}; 
	public Select select ; 
	public Actions action ; 


	
	public WebDriver webDriver() 
	{
		System.setProperty("webdriver.http.factory", "apache");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;		
	}
	
	
	public static void clickButton(WebElement button) 
	{
		button.click();
	}
	
	public static void setTextElementText(WebElement textElement , String value) 
	{
		textElement.sendKeys(value);
	}
	
	public void scrollToBottom() 
	
	{
		jse.executeScript("scrollBy(0,2500)"); 
	}
	
	public void clearText(WebElement element) 
	{
		element.clear();
	}
	
	public void selectlist(String value , WebElement webElement ) {
		Select select = new Select(webElement);
		select.selectByVisibleText(value);
	}
	

}
