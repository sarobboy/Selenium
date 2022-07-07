package org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroLaunch {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "E:\\sarath\\Selenium\\Driver\\chromedriver.exe");
		String url = ("https://www.facebook.com/");
		WebDriver c = new ChromeDriver();
		c.get(url);
		c.manage().window().maximize();
		Thread.sleep(4000);
		c.navigate().back();
		Thread.sleep(4000);
		c.navigate().forward();
		Thread.sleep(4000);
		c.navigate().refresh();
		
		String a = c.getCurrentUrl();
		System.out.println(a);
		
		if(url.equals(a)) {
			System.out.println("True");
		}
		
		String t = c.getTitle();
		System.out.println(t);
		
		if(t.contains("facebook")) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		Thread.sleep(4000);
		
		c.close();
		
	}

}
