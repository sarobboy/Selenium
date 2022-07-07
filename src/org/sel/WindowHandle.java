package org.sel;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\sarath\\Selenium\\Driver\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		String url = "https://www.flipkart.com/";
		chrome.navigate().to(url);
		//chrome.manage().window().maximize();
		
		chrome.findElement(By.xpath("//button[text() = '✕']")).click();
		 chrome.findElement(By.name("q")).sendKeys("Iphone",Keys.ENTER);
		 Thread.sleep(2000);
		 
		 String parent = chrome.getWindowHandle();
		 
		 chrome.findElement(By.xpath("(//div [@class = '_4rR01T'])[1]")).click();
		// chrome.switchTo().window(parent);
		 
		 chrome.findElement(By.xpath("(//div [@class = '_4rR01T'])[2]")).click();
		// chrome.switchTo().window(parent);
		 
		 chrome.findElement(By.xpath("(//div [@class = '_4rR01T'])[3]")).click();
		// chrome.switchTo().window(parent);
	
		 //System.out.println(parent);
		 
		 Set<String> child = chrome.getWindowHandles();
		 
		     
		 List<String > one = new ArrayList<> (child);
		 
		 chrome.switchTo().window(one.get(1));
		 
		 // for(String x : child) {
			 //System.out.println(x);
			// if(!parent.equals(x)) {
			 //chrome.switchTo().window(x);
			 
			 WebElement model = chrome.findElement(By.xpath("//span [@class = 'B_NuCI']"));
			 String title = model.getText();
			 System.out.println(title);
			 //}
			 
		 //}
		 
		
		
		
		
	}

}
