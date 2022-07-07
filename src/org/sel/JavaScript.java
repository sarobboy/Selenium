package org.sel;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\sarath\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://accounts.snapchat.com/accounts/login?client_id=geo";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.xpath("//input [@id = 'username']"));
		WebElement pass = driver.findElement(By.xpath("//input [@id = 'password']"));
		//WebElement checkbox = driver.findElement(By.xpath("//div [@class = 'recaptcha-checkbox-border']"));
		//WebElement login = driver.findElement(By.xpath("//button[@id = 'loginTrigger']"));
		
		//send keys
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute ('value','Selenium')", user);
		js.executeScript("arguments[1].setAttribute ('value','123546')", user, pass );
		
		//get attribute
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", user);
		System.out.println(executeScript);
		Object executeScript1 = js.executeScript("return arguments[1].getAttribute('value')", user, pass);
		System.out.println(executeScript1);
		
		//click
	//	js.executeScript("arguments[0].click()", checkbox);
		//js.executeScript("arguments[0].click()", login);
		
		//scroll up and down
		WebElement promotions = driver.findElement(By.xpath("//a [text() ='Promotions Rules']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true)", promotions);
		
		//screenshot
		TakesScreenshot sc = (TakesScreenshot)driver;
		File fileType = sc.getScreenshotAs(OutputType.FILE);
		File location = new File("E:\\sarath\\Selenium\\Library\\promotion");
		FileUtils.copyFile(fileType,location);
		
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false)", user);
		System.out.println("Success");
		
		
		
		

	}

}
