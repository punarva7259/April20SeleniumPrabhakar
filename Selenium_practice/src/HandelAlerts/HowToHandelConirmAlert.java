package HandelAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandelConirmAlert {

	public static void main(String[] args) {
		ChromeDriver ch=null;
		Alert oAlert=null;
		String sText=null;
		try {
			//Open the chromeBrowser and navigate the URL of Sample application
			ch=new ChromeDriver();
			ch.manage().window().maximize();
			ch.navigate().to("file:///C:/Selenium%20Notes/SG_16th-FEB-2024_Handle%20Alerts%20and%20Child%20windows/Alerts%20Page/SampleAlertsDemo.html");
			Thread.sleep(2000);
			
			//Click on the "confirmBtn" Button
			ch.findElement(By.id("btn_id2")).click();
			Thread.sleep(2000);
			
			//Read the Text from Alert and Click on Ok Button
			oAlert=ch.switchTo().alert();
			sText=oAlert.getText();
			System.out.println(sText);
			oAlert.accept();
			Thread.sleep(2000);
			
			//Verify the Message
		     sText=ch.findElement(By.xpath("/html/body")).getText();
			if(sText.equalsIgnoreCase("User clicked OK button"))
				System.out.println("User Clicked On 'OK' Butoon");
			else System.out.println("Failed click on 'OK' Button");
				
			//Refresh the page to get Back to the sample page
			ch.navigate().refresh();
			Thread.sleep(2000);
			
			//Click on the "confirmBtn" Button
			ch.findElement(By.id("btn_id2")).click();
			Thread.sleep(2000);
			
		   //Read the text from the Alert message and click on cancel Button
			oAlert=ch.switchTo().alert();
			sText=oAlert.getText();
			System.out.println(sText);
			oAlert.dismiss();
			Thread.sleep(2000);
			
			//Verify the Message
			sText=ch.findElement(By.xpath("/html/body")).getText();
			if(sText.equalsIgnoreCase("User clicked cancel Button"))
				System.out.println("User clicked on 'cancel' Button");
			else System.out.println("Failed Clicked on 'Cancel' Button");
			
			//close the Browser
			ch.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally
		{
			ch=null;
			
		}

	}

}
