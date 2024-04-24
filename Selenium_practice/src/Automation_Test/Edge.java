package Automation_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
	public static WebDriver ebrowser=null;
	public static void main(String[] args) {
		launch();
		launch1();
		launch2();
	}
	private static void launch() 
	{
		try {
			ebrowser =new EdgeDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void launch1() 
	{
		try {
			ebrowser.get("https://www.selenium.dev/");
			Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void launch2() 
	{
		try {
			ebrowser.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
