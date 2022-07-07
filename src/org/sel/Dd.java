package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\sarath\\Selenium\\Driver\\chromedriver.exe");
		WebDriver r = new ChromeDriver();
		String url = "https://demo.guru99.com/test/drag_drop.html";
		r.get(url);
		r.manage().window().maximize();
		
		WebElement drag = r.findElement(By.xpath("//a[contains(text(), 'BANK')]"));
		WebElement drop = r.findElement(By.xpath("(//li [@class ='placeholder'])[1]"));
		
		Actions a = new Actions(r);
		a.dragAndDrop(drag, drop).perform();
		
		WebElement drag1 = r.findElement(By.xpath("(//a [contains (text(), '5000')])[2]"));
		WebElement drop1 = r.findElement(By.xpath("(//li [@class ='placeholder'])[3]"));
		
		Actions b = new Actions(r);
		b.dragAndDrop(drag1, drop1).perform();
		
		WebElement drag2 = r.findElement(By.xpath("(//a [contains (text(), '5000')])[4]"));
		WebElement drop2 = r.findElement(By.xpath("(//li [@class = 'placeholder'])[1]"));
		
		Actions c = new Actions(r);
		c.dragAndDrop(drag2, drop2).perform();
		
		WebElement drag3 = r.findElement(By.xpath("//a [contains (text(),' SALES ')]"));
		WebElement drop3 = r.findElement(By.xpath("(//li [@class = 'placeholder'])"));
		
		Actions d = new Actions(r);
		d.dragAndDrop(drag3, drop3).perform();
		
		System.out.println("Success");
		
		

	}

}
