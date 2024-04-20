package HandelAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandelDynamicAlert {
	
	static boolean isAlertPresent(WebDriver oBrowser) {
		try {
			oBrowser.switchTo().alert();
			return true;
		}catch(NoAlertPresentException e) {
			return false;
		}
	}

	public static void main(String[] args) {
		ChromeDriver ch=null;
		try {
			//open the ChromeBrowser Navigate the url of Sample Application
			ch=new ChromeDriver();
			ch.manage().window().maximize();
			ch.navigate().to("file:///C:/Selenium%20Notes/SG_16th-FEB-2024_Handle%20Alerts%20and%20Child%20windows/Alerts%20Page/SampleAlertsDemo.html");
			Thread.sleep(2000);
			
			//Click on the "alertbutton" Button
			ch.findElement(By.id("btn_id1")).click();
			Thread.sleep(2000);
			
			//Verify the Alerat is Present or not, if Present read the text from alert and click on ok Button,
			//otherwise Display "Alert is not Displayed"message
			
			if(isAlertPresent(ch)) {
				System.out.println("Alert is displayed");
				ch.switchTo().alert().accept();
			}else {
				System.out.println("Alert is NOT Displayed");
			}
				//close the Browser
				ch.close();
			
			
			
			}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			ch=null;
		}
		

	}

}
