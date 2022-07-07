package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable { //21.6.22 Dynamic WebTable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\sarath\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.techlistic.com/p/demo-selenium-practice.html";
		driver.navigate().to(url);
		//driver.manage().window().maximize();
		
		List<WebElement> Mtable = driver.findElements(By.tagName("table"));
		       for(int i =0; i< Mtable.size(); i++) {
		    //for(int i = Mtable.size() -1; i< Mtable.size(); i++) { (prints the last row in a table)
		    // (10 tables) >>for (int i = Mtable.size() /2....{ (prints the middle table)
		   //break >> can be added in the end of loop
			   WebElement one = Mtable.get(i);
			//========== getting table body
			   WebElement  tbody = one.findElement(By.tagName("tbody"));
			//========== getting table row
	    List <WebElement> row = tbody.findElements(By.tagName("tr")); //By.xpath("(//tr)[1]") - print only 1st table
			    for (int j =0; j< row.size(); j++) {
				WebElement irow = row.get(j);
		   //========= getting table data
				List<WebElement> data = irow.findElements(By.tagName("td"));
				for(int k =0; k<data.size(); k++) {
					WebElement text =data.get(k);
					String result = text.getText();
					System.out.println(result);
//					if( result.equals("Austria")) {
//						System.out.println("The Given country is present in the table");
//						System.out.println("In the row :"+j);
//						System.out.println("In the coloumn :" +k);
//					}
//					//System.out.println(result);
		}
				
			}

		}
		

	}

}
