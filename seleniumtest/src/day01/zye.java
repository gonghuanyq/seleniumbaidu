package day01;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class zye {
@Test
public void open() {
	
	System.setProperty("webdriver.chrome.driver","./tors/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url1="http://localhost:8080/mobile_mysql/index.jsp";
	driver.get(url1);
	
	
   
   
    WebElement input11=driver.findElement(By.name("name"));
    input11.sendKeys("qing");

    WebElement input2=driver.findElement(By.name("password"));
    input2.sendKeys("123");
    
    WebElement input3=driver.findElement(By.className("input1"));
    input3.click();
    /*
    WebElement input0=driver.findElement(By.linkText("�����ֻ�"));
    input0.click();*/
    driver.findElement(By.linkText("�鿴��ϸ����")).click();
    
    String phoneBefore = driver.getWindowHandle();
    
	for(String winHandle : driver.getWindowHandles()) {
	if (winHandle.equals(phoneBefore)) {
	continue;
	}
	driver.switchTo().window(winHandle);
	break; 
	}
	
	
	driver.findElement(By.name("Submit")).click();
	Alert alert=driver.switchTo().alert();
	alert.accept();
	
	driver.switchTo().window(phoneBefore);
	
	driver.findElement(By.linkText("���ﳵ")).click();
	
	driver.findElement(By.linkText("ȥ����̨����")).click();
	
	WebElement input4=driver.findElement(By.name("address"));
	input4.sendKeys("����");
	
	WebElement input5=driver.findElement(By.name("tel"));
	input5.sendKeys("1234567890");
	
    WebElement s=driver.findElement(By.name("setMoney"));
	
	Select s1=new Select(s);
	
	s1.selectByIndex(3);
	
WebElement ss=driver.findElement(By.name("post"));
	
	Select s2=new Select(ss);
	
	s2.selectByIndex(3);
	
	WebElement input6=driver.findElement(By.name("bz"));
	input6.sendKeys("����͵�");
	
	WebElement input7=driver.findElement(By.name("Submit2"));
	input7.click();
	
	Alert cl1=driver.switchTo().alert();
	cl1.accept();
}
}