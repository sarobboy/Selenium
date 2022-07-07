package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\sarath\\\\Selenium\\\\Driver\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://chercher.tech/practice/frames-example-selenium-webdriver";
        driver.navigate().to(url);
       // driver.manage().window().maximize();
        
        driver.switchTo().frame("frame1"); //method
       
        //========
        //Frame is the real time eg. of polymorphism, we can pass index/string/webelement
        // 1 method but can pass three different parameters so its a best eg . method overloading
        //=========
      
        WebElement title =driver.findElement(By.xpath("//b [@id ='topic']"));
        
        
        driver.switchTo().frame("frame3");
        driver.findElement(By.xpath("//input [@id ='a']")).click();
        driver.switchTo().parentFrame();
        String text = title.getText();
        System.out.println(text);
        
        driver.switchTo().defaultContent();
        WebElement main = driver.findElement(By.xpath("//h1 [text() = 'Frames Examples in Selenium Webdriver'] "));
        String mtxt = main.getText();
        System.out.println(mtxt);
        
        
        
        Thread.sleep(2000);
        
        String url1 = "https://demoqa.com/alerts";
        driver.navigate().to(url1);
        
        

	}

}
