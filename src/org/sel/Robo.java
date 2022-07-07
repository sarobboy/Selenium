package org.sel;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robo {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\sarath\\Selenium\\Driver\\chromedriver.exe");
		WebDriver q = new ChromeDriver();
		String link = "https://www.facebook.com/";
		q.get(link);
		q.manage().window().maximize();
		
		WebElement un = q.findElement(By.xpath("//input [@class = 'inputtext _55r1 _6luy']"));
		un.sendKeys("selenium1234");
		
		Actions b = new Actions(q);
		b.doubleClick(un).perform();
		b.contextClick(un).perform();
		
		Robot r = new Robot();
		for(int i=0; i<3; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(keycode);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		

	}

}
