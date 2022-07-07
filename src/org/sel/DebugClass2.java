package org.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DebugClass2  {
	static WebDriver driver;
	
	public static void launch(String url) {
		System.setProperty("webdriver.chrome.driver", "E:\\sarath\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void fill(WebElement element , String value) {
		element.sendKeys(value);
	}
	
	public static void  click(WebElement element) {
		element.click();
	}
	
	public static void takescreenShot(String screenshotName) throws Throwable  {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File f = tk.getScreenshotAs(OutputType.FILE);
		//File location = new File ("E:\\sarath\\Selenium\\Library"screenshotName);
		File location = new File ("E:\\\\sarath\\\\Selenium\\\\Library"+screenshotName);
		FileUtils.copyFile(f, location);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
	}

}
