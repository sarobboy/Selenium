package org.sel;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\sarath\\Selenium\\Driver\\chromedriver.exe");
		WebDriver l = new ChromeDriver(); // Interface
		String url = "https://www.facebook.com/";
		l.get(url);
		//l.manage().window().maximize();
		String password = "A1234";
		
		//--------------------------------------
		
		//using xpath
		//WebElement user = l.findElement(By.xpath("(//index)[3]"));
		
		WebElement user = l.findElement(By.id("email"));
		user.sendKeys("Saravanan");
		
		//----------------------------------------
		WebElement pass = l.findElement(By.name("pass"));
         pass.sendKeys(password);
         
         String val = pass.getAttribute("value");
         System.out.println(val);
         
         if(password.equals(val)) {
        	 System.out.println("Alphanumeric is supported");
         }
   
       //Thread.sleep(4000);
        
         WebElement txt = l.findElement(By.xpath("//h2 [contains(text(),'Facebook helps you connect and share with the people in your life.')]"));
    	 String text = txt.getText();
    	 System.out.println(text);
    	 
    	 l.findElement(By.xpath("//button [@name = 'login']")).click();
    	 l.findElement(By.l);
        	  
        	 //Xpath >> //tagname [@attribute name ='attributevalue']
         	//1. 	 l.findElement(By.xpath("//button [@name = 'login']")).click();
          
          // Xpath using Text >> //tagname[text()= 'text value'];
          //2. l.findElement(By.xpath("//button[text() = 'Log In']")).click();
          
        	 //Xpath using only the tagname
       //3.   l.findElement(By.xpath("//button")).click();
        	 
        	 //Xpath using tagname  and index value 
        	 //4. l.findElement(By.xpath("(//a)[5]"));
        	 
         	 
         
         
        	
        	 
         }
         
	}  
		
	


