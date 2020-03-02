package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testscript02 {
	
@Test
public void testtwo()
{
//WebDriverManager.chromedriver()	.setup();
System.setProperty("webdriver"
		+ ".gecko.driver", "./drivers/geckodriver.exe");
WebDriver driver=new FirefoxDriver();

driver.get("https://www.selenium.dev/");
driver.getTitle();
driver.close();

	
	
	
	
}
	
	
	
	

}
