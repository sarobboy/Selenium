package org.sel;

//import java.awt.AWTException;
//import java.awt.List;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mobile {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\\\sarath\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver mobile = new ChromeDriver();
		String url = "https://www.flipkart.com/";
		mobile.navigate().to(url);
		mobile.manage().window().maximize();
		
		mobile.findElement(By.xpath("//button [@class = '_2KpZ6l _2doB4z']")).click();
		System.out.println("Browser is launched");
		
	    WebElement search = mobile.findElement(By.xpath("//input [@class = '_3704LK']"));
	    search.sendKeys("Mobile");
	    mobile.findElement(By.className("L0Z3Pu")).click();
	    System.out.println("Mobile search loaded");
	    System.out.println(" ");
	    
	   Thread.sleep(3000); 
	   
      WebElement name = mobile.findElement(By.xpath("//div [text() = 'POCO C31 (Royal Blue, 64 GB)']"));
	  String n1 = name.getText();
	  System.out.println(n1);
	  
	  WebElement name1 = mobile.findElement(By.xpath("//div [text() = 'realme C20 (Cool Blue, 32 GB)']"));
	  String n2 = name1.getText();
	  System.out.println(n2);
	  
	  WebElement name2 = mobile.findElement(By.xpath("//div [text() = 'realme C20 (Cool Grey, 32 GB)']"));
	  String n3 = name2.getText();
	  System.out.println(n3);
	  
	  WebElement name3 = mobile.findElement(By.xpath("//div [text() = 'POCO C31 (Shadow Gray, 64 GB)']"));
	  String n4 = name3.getText();
	  System.out.println(n4);
	  
	  WebElement name4 = mobile.findElement(By.xpath("//div [text() = 'SAMSUNG Galaxy F22 (Denim Blue, 64 GB)']"));
	  String n5 = name4.getText();
	  System.out.println(n5);
	  
	  
	   
	   
	   //or
	    
	    //Robot r = new Robot();
		   //r.keyPress(KeyEvent.VK_DOWN);
		   //r.keyRelease(KeyEvent.VK_DOWN);
		   
		   //r.keyPress(KeyEvent.VK_ENTER);
		   //r.keyRelease(KeyEvent.VK_ENTER);
	   
	   
	   
	 //  mobile.findElement(By.xpath("(//div [@class = 'gUuXy-' ])[1]")).click();
	  //String phone = one.getText();
	  //System.out.println(phone);
	   
	   
	   
		
	}

}
