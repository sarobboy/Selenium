package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown { // 21.6.22 
	//SELECT IN DOM STRUCTURE = DROP/DOWN

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\\\sarath\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		WebElement single = driver.findElement(By.xpath("(//select) [1]"));
		WebElement multiple = driver.findElement(By.xpath("(//select)[3]"));
		
		Select s = new Select(single);
		
		s.selectByValue("Google");
		
		s.selectByVisibleText("Bing");
		
		s.selectByIndex(2);
		
		List <WebElement> a1 = s.getAllSelectedOptions();
	
	  for(int i = 0; i<a1.size(); i++) {
		  WebElement b = a1.get(i);
		  String text = b.getText();
		  System.out.println("##### : "+text);
		  
	  }
		
		
		
		
		
		//String option = single.getText();
		//System.out.println(option);
		
		System.out.println(" ");
		
		Boolean M = s.isMultiple();
		System.out.println(M);
		
		List<WebElement> all = s.getOptions();
		for (int i = 0; i< all.size(); i++) {
			WebElement a = all.get(i);
			String element = a.getText();
			System.out.println(element);
		}
		System.out.println(" ");
		
		Select s1 = new Select(multiple);
		
		s1.selectByIndex(0);
		//s1.selectByIndex(1);
		s1.selectByValue("bonda");
		//s1.selectByVisibleText("Burger");
		
		//String om = multiple.getText();
		//System.out.println(om);
		
		System.out.println(" ");
		
		List<WebElement> all1= s1.getOptions();
		for (int i =0; i< all1.size(); i++) {
			WebElement element1 = all1.get(i);
			String txt = element1.getText();
			System.out.println(txt);
		}
		
		//Thread.sleep(2000);
		//s1.deselectByIndex(0);
		//s1.deselectAll();
		
		System.out.println(" ");
		WebElement one = s1.getFirstSelectedOption();
		String txt = one.getText();
		System.out.println("First Selected option is : "+txt);
		
		System.out.println(" ");
		
		List <WebElement> print = s1.getAllSelectedOptions();
		for(int i =0 ; i< print.size() ; i++) {
			WebElement all2 = print.get(i);
			String store = all2.getText();
			System.out.println("Total items selected : "+store);
		
			
		}
		
		
		
	}

}
