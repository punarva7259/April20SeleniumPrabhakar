package AutomationOfBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserDemo {
	private static WebDriver oBrowser=null;
	private static void main(String[] args) {
		LunchBrowser();
	}
	private static void LunchBrowser()
	{
		
		
		try {
			oBrowser=new FirefoxDriver();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}

	}
	
	private static void navigateURL()
	{
		
	}

}
