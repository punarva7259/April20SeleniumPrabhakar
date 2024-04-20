package HandelAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandelStaticAlerts {

	public static void main(String[] args) {
		ChromeDriver ch=null;
		try {
			  //Open the Browser and navigate the url of sample Application
			ch=new ChromeDriver();
			ch.manage().window().maximize();
			ch.navigate().to("file:///C:/Selenium%20Notes/SG_16th-FEB-2024_Handle%20Alerts%20and%20Child%20windows/Alerts%20Page/SampleAlertsDemo.html");
			Thread.sleep(2000);
			
			//Click on the "alertbtn" Button
			ch.findElement(By.id("btn_id1")).click();
			Thread.sleep(2000);
			
			//read the text from the alert and & click on ok button
			Alert oAlert=ch.switchTo().alert();
			
			String sText=oAlert.getText();
		    System.out.println(sText);
		    
		    oAlert.accept();
		    Thread.sleep(2000); 
		    
		    //Close the browser
		    ch.close();
		    
			
			
			
		    } catch(Exception e) {
			e.printStackTrace();
		}
		finally 
		{
			ch=null;
		}

	}

}
