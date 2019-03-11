package selenps;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lx {
@Test
public void open() {
	System.setProperty("webdriver.chrome.driver","./tors/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="file:///D:/QQ%E4%B8%8B%E8%BD%BD%E7%9A%84%E8%B5%84%E6%96%99/%E9%A1%B5%E9%9D%A2/autotest.html";
	driver.get(url);
	
	WebElement a=driver.findElement(By.id("accountID"));
	a.sendKeys("12345");
	
	WebElement a1=driver.findElement(By.id("passwordID"));
	a1.sendKeys("12345");
	
	WebElement s=driver.findElement(By.id("areaID"));
	Select x=new Select(s);
	x.selectByIndex(1);

	WebElement q=driver.findElement(By.id("sexID1"));
     System.out.println(q.isSelected());
	  q.click();
	  //¸´Ñ¡¿ò
	  WebElement p=driver.findElement(By.id("u2"));
	  p.click();
	  
	  WebElement p1=driver.findElement(By.id("u3"));
	  p1.click();
	  
	  WebElement p2=driver.findElement(By.id("u4"));
	  p2.click();
	  
	  String wj="D:\\\\test2.class";
	  WebElement g=driver.findElement(By.name("file"));
	  g.sendKeys(wj);
	  
	  WebElement f=driver.findElement(By.id("buttonID"));
	  f.click();
	  
	  Alert pp1=driver.switchTo().alert();
	  pp1.accept();
}

}
