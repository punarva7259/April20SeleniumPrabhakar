package Automation_Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_Actitime_chrome {
	public static void main(String[] args) {
		ChromeDriver ch=null;
		Alert oAlert=null;
		try
		{
		 // 1.Open and maximize the chrome browser	
		  ch=new ChromeDriver();
		  ch.manage().window().maximize();
		  
		  // 2.navigate the URL (Actitime:http://localhost/login.do)
		  ch.navigate().to("http://localhost/login.do");
		  Thread.sleep(2000);
		  
		  // 3.Enter valid user name
		 ch.findElement(By.name("username")).sendKeys("admin");
		 
		 // 4.Enter valid password 
		  ch.findElement(By.name("pwd")).sendKeys("manager");
		  
		  // 5.Click on "Login" Button
			/*
			 * ch.findElement(By.id("loginButton")).click(); 
			 * Thread.sleep(2000);
			 */
		  //by using Linked text
		  ch.findElement(By.linkText("View License")).click();
		  
		  
		  // 6. Verify login actiTime was Sucessfull
		  // String str=ch.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
		  //if(str.equalsIgnoreCase("Enter Time-Track")) {
		  if (ch.findElement(By.xpath("//td[text()='Enter Time-Track']")).isDisplayed()) {
		      System.out.println("login actiTime login was sucessfull");
		  }else {
			  System.out.println("failed to login to actiTime");
		  }
		  
		  //go to users menu
		  ch.findElement(By.xpath("//div[text()='USERS']")).click();
		  
		  //handle shortcuts(alerts)
		  ch.findElement(By.xpath("//div[@id='gettingStartedShortcutsMenuCloseId']")).click();
		  
		  //click on Add new Users
		  ch.findElement(By.xpath("//div[@class='buttonText']")).click();
		  Thread.sleep(2000);
		  
		  //Add constraints
		      ch.findElement(By.name("firstName")).sendKeys("MS");
		      ch.findElement(By.name("lastName")).sendKeys("Dhoni");
		      ch.findElement(By.name("email")).sendKeys("msdhoni@gmail.com");
			  ch.findElement(By.name("username")).sendKeys("CSK");
			  ch.findElement(By.name("password")).sendKeys("Msdians");
			  ch.findElement(By.name("passwordCopy")).sendKeys("Msdians");
			  ch.findElement(By.xpath("//span[text()='Create User']")).click();
			  Thread.sleep(2000);
			  
			  //verify add users was successfull
			  if(ch.findElement(By.xpath("//span[text()='Dhoni, MS'][@class='userNameSpan']")).isDisplayed()) {
				  System.out.println("Add User was successfull");
				}else {
					System.out.println("failed to creat new user");
				}
			  
			  //Edit Existing User
			  ch.findElement(By.xpath("//td[@class='userNameCell first']")).click();
			  Thread.sleep(2000);
			  
    
              //Edit the exixting user Ms Dhoni
			  ch.findElement(By.name("firstName")).sendKeys("glenn");
		      ch.findElement(By.name("lastName")).sendKeys("Maxwell");
		      ch.findElement(By.name("email")).clear();
		      ch.findElement(By.name("email")).sendKeys("Maxwell@gmail.com");
			  ch.findElement(By.name("username")).sendKeys("RCB");
			  ch.findElement(By.name("password")).sendKeys("PlayBold");
			  ch.findElement(By.name("passwordCopy")).sendKeys("PlayBold");
			  
			  //Click on Save Changes Button to save the edited User
			  ch.findElement(By.id("userDataLightBox_commitBtn")).click();
			  Thread.sleep(2000);
			  
				/*OR
				 * ch.findElement(By.xpath("//span[text()='Save Changes']")).click();
				 * Thread.sleep(2000);
				 */
				 
				  
			 
			  
			//Delete the Edited users 
			  ch.findElement(By.xpath("//td[@class='userNameCell first']")).click();
			  Thread.sleep(2000);
			  ch.findElement(By.id("userDataLightBox_deleteBtn")).click();
			  Thread.sleep(2000);
			 
			  
			  //Handle the alert
               ch.switchTo().alert().accept();
			  
			 
		  
		  // 7.Logout from the actiTime By clicking logout link(button)
		  ch.findElement(By.id("logoutLink")).click();
		  Thread.sleep(2000);
		  
		  // 8.verify logout actiTime was successful
		  if(ch.findElement(By.xpath("//img[contains(@src ,'/img/default/login/timer.')]")).isDisplayed())
		  {
			  System.out.println("logout actiTime is successFul");
		  }else {
		  System.out.println("Failed to logout actiTime");
		  }
		  
		  
		  //Close the browser
		    ch.close();
		  
		  
		  
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		    finally 
		{
			ch=null;
			oAlert=null;
			
			

		}
		
	}
}
