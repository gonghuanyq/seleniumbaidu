package DZSC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ksxt {

	public void open() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./tors/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://localhost:8080/examsys/login.thtml";
		driver.get(url);
		
}
	}
