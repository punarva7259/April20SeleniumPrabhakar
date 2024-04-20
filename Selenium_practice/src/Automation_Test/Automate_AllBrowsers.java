package Automation_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automate_AllBrowsers {

	public static void main(String[] args) {
	
      WebDriver oBrowser=null;
      String browserName=null;
      
      try {
    	    browserName="Chrome";
    	    if(browserName.equalsIgnoreCase("Chrome"))
    	    //open the chrome Driver
    	    oBrowser=new ChromeDriver();
    	    else if(browserName.equalsIgnoreCase("Firefox"))
    	    	//open firefox Driver
    	    oBrowser=new FirefoxDriver();
    	    else if(browserName.equalsIgnoreCase("Edge"))
    	    	//open Edge driver
    	    oBrowser=new EdgeDriver();
    	    else
    	    	System.out.println("Invalid Driver");
    	    oBrowser.manage().window().maximize();
    	    
    	    //Navigate the URL
    	    oBrowser.navigate().to("http://localhost/login.do");
    	    Thread.sleep(2000);
    	    
    	    //Enter valid Username
    	    oBrowser.findElement(By.name("username")).sendKeys("admin");
    	    
    	    //Enter valid Password
    	    oBrowser.findElement(By.name("pwd")).sendKeys("manager");
    	    
    	    //click on login button 
    	    oBrowser.findElement(By.id("loginButton")).click();
    	    Thread.sleep(2000);
    	    
    	    //click on logout button
    	    oBrowser.findElement(By.id("logoutLink")).click();
    	    Thread.sleep(2000);
    	    
    	    //close the Browser
    	    oBrowser.close();
    	    
    	    
    	  
      }catch(Exception e) {
    	  e.printStackTrace();
      }
      finally
      {
    	  oBrowser=null;
    	  
      }

	}

}
