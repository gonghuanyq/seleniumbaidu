package selenps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.testng.annotations.AfterClass;


import org.openqa.selenium.support.ui.Select;
public class zy2 {
  
  static WebDriver driver;
	static String url;
	@BeforeClass
	public void setup1() {
		System.setProperty("webdriver.chrome.driver","./tors/chromedriver.exe");
		driver=new ChromeDriver();
		url="http://localhost:8080/examsys";
	}
@Test
public void a() throws InterruptedException {
	  driver.get(url);
	  driver.findElement(By.name("username")).sendKeys("hujianming");
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");
		WebElement s=driver.findElement(By.name("usertype"));
		Select s1=new Select(s);
		s1.selectByVisibleText("����Ա");
		Thread.sleep(9000);
		driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[5]/td/div/button[1]")).click();
		driver.switchTo().frame("main");
		String wen=driver.findElement(By.xpath("/html/body/div/div[1]/ul/li")).getText();
		System.out.println(wen);
		if (wen.equals("��ҳ")) { 
			System.out.println("�ɹ������ϵͳ");
		}else {
			System.out.println("�����ϵͳʧ��");
		}
	} 
/*@AfterClass
public void stup2() {
	driver.quit();
}*/
}
