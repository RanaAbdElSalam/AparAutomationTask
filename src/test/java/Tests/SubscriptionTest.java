package Tests;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Pages.SubscriptionPage;

public class SubscriptionTest {


	SubscriptionPage SubscriptionObject;
	
@Test
	public void validateSubscriptionData() throws InterruptedException, IOException {
			
			
	SubscriptionObject = new SubscriptionPage();
		
	String[] valuesList = SubscriptionObject.getSubscriptionData();
	
	String firstPackageType = valuesList[0];
	String firstPackageprice = valuesList[1];
	String secondPackageType = valuesList[2];
	String secondPackageprice = valuesList[3];
	String thirdPackageType = valuesList[4];
	String thirdPackageprice = valuesList[5];
	String currency = valuesList[6];

		//String title = registrationObject.createAccountMethod();
		
    assertEquals(firstPackageType, "LITE");
    assertEquals(firstPackageprice, "5.4");
    
    assertEquals(secondPackageType, "CLASSIC");
    assertEquals(secondPackageprice, "10.9");
    
    assertEquals(thirdPackageType, "PREMIUM");
    assertEquals(thirdPackageprice, "16.3");
    
    assertEquals(currency, "USD/month");
		
	}


	
}
