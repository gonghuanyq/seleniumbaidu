package selenps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jpbcxz {

	@Test
	public void open() throws InterruptedException, IOException, AWTException{
		System.setProperty("webdriver.chrome.driver","./tors/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///C:/Users/嗯嗯/AppData/Local/Temp/HZ$D.722.4330/HZ$D.722.4331/autotest.html";
		driver.get(url);
		
		WebElement a=driver.findElement(By.id("user"));
		
		//点击Ctrl
		Robot aa=new Robot();
		
		aa.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		//点击S
		aa.keyPress(KeyEvent.VK_S);
		Thread.sleep(1000);
		//放开S
		aa.keyRelease(KeyEvent.VK_S);
		Thread.sleep(1000);
		//放开Ctrl
		aa.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		//aa.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
}
	}
