package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Browser {
  @Test
  public void f() {
	   WebDriver driver= new ChromeDriver();
		 driver.get("https://www.policybazaar.com/");
		 driver.manage().window().maximize(); 
		 Reporter.log("Lunching Browser Application",true);
  }
}
