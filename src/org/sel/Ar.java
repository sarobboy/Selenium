package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\sarath\\Selenium\\Driver\\chromedriver.exe");
		WebDriver r = new ChromeDriver();
		String url = "https://www.flipkart.com/";
		r.get(url);
		r.manage().window().maximize();
		
		// to close the login pop-up
		WebElement close = r.findElement(By.xpath("//button[@class = '_2KpZ6l _2doB4z']"));
		close.click();
		
		//
		//WebElement login = r.findElement(By.xpath("(//a)[3]"));
		
		WebElement more  = r.findElement(By.xpath("//div [@class = 'exehdJ']"));
		
		//Class
		Actions a = new Actions(r);
		a.moveToElement(more).perform();
		
		WebElement MS = r.findElement(By.xpath("//div [text( ) = 'Notification Preferences']"));
		MS.click();
		
		WebElement login = r.findElement(By.xpath("(//a)[3]"));
		Actions b = new Actions(r);
		b.moveToElement(login).perform();
		
		System.out.println("Success");

		
	}

}
