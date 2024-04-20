package HandelAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandelStaticPromtAlert {

	public static void main(String[] args) {
		ChromeDriver ch=null;
		Alert oAlert=null;
		String sText=null;
		String userName=null;
		
		try {
			//Open the ChromeBrowser and navigate the url of sample Application
			ch=new ChromeDriver();
			ch.manage().window().maximize();
			ch.navigate().to("file:///C:/Selenium%20Notes/SG_16th-FEB-2024_Handle%20Alerts%20and%20Child%20windows/Alerts%20Page/SampleAlertsDemo.html");
			Thread.sleep(2000);
			
			//click on the "PromtBtn" Button
			ch.findElement(By.id("btn_id3")).click();
			Thread.sleep(2000);
			
			//Read the Text From the Alert
			oAlert=ch.switchTo().alert();
			sText=oAlert.getText();
			System.out.println(sText);
			
			//Enter the Value in Promt Alert and click on OK button
			userName="SG Testing Institute";
			oAlert.sendKeys(userName);
			oAlert.accept();
			Thread.sleep(2000);
			
			//Verify the Message
			sText=ch.findElement(By.xpath("/html/body")).getText();
			if(sText.equalsIgnoreCase("User Name is: "+userName))
				System.out.println("Entered User name is'"+userName+"'was Displayed Successfully");
			else System.out.println("Failed to Display the'"+userName+"'");
			
			//Refresh the page to get Back the sample web page
			ch.navigate().refresh();
			Thread.sleep(2000);
			
			//Click on the "promtbtn" Button and Dont enter any userName and click on ok Button
			ch.findElement(By.id("btn_id3")).click();
			Thread.sleep(2000);
			ch.switchTo().alert().accept();
			Thread.sleep(2000);
			
			//Verify the message
			sText=ch.findElement(By.xpath("/html/body")).getText();
			if(sText.equalsIgnoreCase("User didn't enter any value for userName"))
				System.out.println("The appropriate message 'User didn't enter any value for userName' was Displayed Sucessfull");
			else System.out.println("The expected message 'User didn't enter any value for userName' was not displyed");
			
			//Close The Browser
			ch.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			ch=null;
		}

	}

}
