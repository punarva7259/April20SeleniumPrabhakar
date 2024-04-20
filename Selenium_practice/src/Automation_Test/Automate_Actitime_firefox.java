package Automation_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automate_Actitime_firefox {

	public static void main(String[] args) {
		
		FirefoxDriver ff=null;
		try {
			//Open the Firefox Driver
			ff=new FirefoxDriver();
			ff.manage().window().maximize();
			
			//Navigate the actiTime url
			ff.navigate().to("http://localhost/login.do");
			Thread.sleep(2000);
			
			//Enter Valid username
			ff.findElement(By.name("username")).sendKeys("admin");
			
			//Enter valid password
			ff.findElement(By.name("pwd")).sendKeys("manager");
			
			//Click on Login button 
			ff.findElement(By.xpath("//a[@id='loginButton']")).click();
			Thread.sleep(2000);
			
			//Verify login actiTime suceessfull
			if(ff.findElement(By.xpath("//td[text()='Enter Time-Track']")).isDisplayed())
			{
				System.out.println("login actiTime is successfull");
			}else {
				System.out.println("Failed to login to actiTime");
			}
			
			//logout the actiTime Application by clicking logout Button
			ff.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
			
			//Verify Logout actiTime was successfull
			if(ff.findElement(By.xpath("//img[contains(@src,'/img/default/login/logo.png?')]") ).isDisplayed())
			{
				System.out.println("Logout actitime Sucessfull");
			}else {
				System.out.println("Failed to logout actitime");
			}
			
			//close the Firefox
			ff.close(); 
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			ff=null;
		}

	}

}
