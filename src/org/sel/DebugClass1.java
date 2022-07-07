package org.sel;

import org.openqa.selenium.By;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class DebugClass1 extends DebugClass2{

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
	
		launch("https://www.facebook.com/");
        maximize();
		WebElement user = driver.findElement(By.xpath("//input [@class = 'inputtext _55r1 _6luy']"));
		WebElement pass = driver.findElement(By.xpath("//input [@class = 'inputtext _55r1 _6luy _9npi']"));
		WebElement login = driver.findElement(By.xpath("//button [@class = '_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
	    fill(user,"selenium");
	    takescreenShot("Username");
	    fill(pass,"122344");
	    takescreenShot("Password");
	    click(login);
	    takescreenShot("Login Page");
	    System.out.println("End");
	    takescreenShot("Username");
	}
//private static void takeScreenshot(String string) {
		// TODO Auto-generated method s
	}


