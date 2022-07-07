package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flight {

	public static void main(String[] args) throws AWTException, Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\\\sarath\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver plane = new ChromeDriver();
		String url = "https://www.flipkart.com/";
	    plane.navigate().to(url);
		plane.manage().window().maximize();
		
		plane.findElement(By.xpath("//button [@class = '_2KpZ6l _2doB4z']")).click();
		System.out.println("Browser is launched");
		
		//TO
		plane.findElement(By.xpath("//div [text()= 'Travel']")).click();
		Thread.sleep(2000);
		Robot r = new Robot(); 
		   r.keyPress(KeyEvent.VK_DOWN);
		   r.keyRelease(KeyEvent.VK_DOWN);
		   r.keyPress(KeyEvent.VK_ENTER);
		   r.keyRelease(KeyEvent.VK_ENTER);

		   Thread.sleep(2000);
		   //Depart date
		   plane.findElement(By.xpath("(//button [text() = '21'])[1]")).click();
		   
		Thread.sleep(2000);
		 //Passengers
		 plane.findElement(By.xpath("(//button [@class = '_2KpZ6l _34K0qG _37Ieie'])[1]")).click();
		 Thread.sleep(2000);
		 plane.findElement(By.xpath("(//button [@class = '_2KpZ6l _34K0qG _37Ieie'])[2]")).click();
		 Thread.sleep(2000);
		 plane.findElement(By.xpath("(//button [@class = '_2KpZ6l _34K0qG _37Ieie'])[3]")).click();
		 
		 

		 Thread.sleep(2000);
		 //Class
		 plane.findElement(By.xpath("(//div [@class ='_1XFPmK'])[4]")).click();
		 
		 Thread.sleep(1000);
		 //DONE
		 plane.findElement(By.xpath("//button [text() = 'Done']")).click();
		 System.out.println("Half Success");
		 
		 Thread.sleep(2000);
		 //FROM
		 plane.findElement(By.xpath("//input [@name = '0-departcity']")).click();
		 for(int i =0; i<2; i++) {
		 r.keyPress(KeyEvent.VK_DOWN);
		   r.keyRelease(KeyEvent.VK_DOWN);
		 }  
		   r.keyPress(KeyEvent.VK_ENTER);
		   r.keyRelease(KeyEvent.VK_ENTER);
		
		 
		 Thread.sleep(2000);
		 //search flights
		 plane.findElement(By.xpath("//button [@class = '_2KpZ6l _1QYQF8 _3dESVI']")).click();
		 System.out.println("Full Input is valid");
		
		 Thread.sleep(5000);
		 //Ticket Book
		 plane.findElement(By.xpath("(//div [@class = '_-5f1wK'])[2]")).click();
		 System.out.println("Successfully booked");
		 

		 
		 
		
		   
		   	   
		
		   
		
	}

}
