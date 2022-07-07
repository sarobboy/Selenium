package org.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alrt {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\sarath\\Selenium\\Driver\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		String url = "https://demoqa.com/alerts";
		a.navigate().to(url);
		a.manage().window().maximize();
		
		//simple alert
		a.findElement(By.xpath("//button [@id = 'alertButton']")).click();
		Alert al = a.switchTo().alert();
		Thread.sleep(1000);
		al.accept();
		
		//Confirm alert
		a.findElement(By.xpath("//button [@id = 'confirmButton']")).click();
		Thread.sleep(1000);
		al.dismiss(); 
		
		
	    a.findElement(By.xpath("//button [@id = 'promtButton']")).click();
		String t =al.getText();
		System.out.println(t);
		al.sendKeys("Selenium Automation");
		Thread.sleep(1000);
		al.accept();
		
		WebElement alert1 = a.findElement(By.xpath("//span [contains (text() , 'You selected')]"));
		String input = alert1.getText();
		System.out.println(input);  // 

		WebElement alert2 = a.findElement(By.xpath("//span [contains (text() , 'You entered')]"));
		String input1 = alert2.getText();
		System.out.println(input1);
	}

}
