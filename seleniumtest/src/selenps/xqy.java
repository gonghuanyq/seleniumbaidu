package selenps;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xqy {
@Test
public void open(){
	System.setProperty("webdriver.chrome.driver","./tors/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url1="http://www.126.com";
	driver.get(url1);
	
	WebElement a=driver.findElement(By.id("idInput"));
	a.sendKeys("15286708315");
	WebElement a1=driver.findElement(By.id("pwdInput"));
	a1.sendKeys("zxc123");
	
	driver.findElement(By.id("loginBtn")).click();
}

}
