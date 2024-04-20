package HandelAlerts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleChildWindows {

	public static void main(String[] args) {
	ChromeDriver ch=null;
	try {
		//open the Browser and navigate the url of sample web page
		ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.navigate().to("C:\\Selenium Notes\\SG_10th-FEB-2024_html pages\\HTML\\WebPage\\SampleWebPage.html");
		Thread.sleep(2000);
		
		//Read the parent window id by clicking the "SG Testing" link
		String sParent=ch.getWindowHandle();
		System.out.println(sParent);
		
		ch.findElement(By.xpath("//a[@id='link2']")).click();
		Thread.sleep(2000);
		
		//It opens the new window,so read the child window id
		//using child window id swicth to child browser and read the url and title
		//close the child browser
		
		Set<String> childs=ch.getWindowHandles();
		
		for(String child:childs) {
			if(!child.equals(sParent));
			ch.switchTo().window(child);
			System.out.println("URL :"+ch.getCurrentUrl());
			System.out.println("Title :"+ch.getTitle());
			ch.close();
			Thread.sleep(2000);
			
		}
	
	
	
	
		//switch back to parent window
	ch.switchTo().window(sParent);
	System.out.println("URL :"+ch.getCurrentUrl());
	System.out.println("Titles :"+ch.getTitle());
	ch.close();
		
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		ch=null;
	}

  }

}
