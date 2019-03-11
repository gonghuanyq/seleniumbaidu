package selenps;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lianxi {

	@Test
	public void open() throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver","./tors/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://localhost:8080/Exam_ssh/";
		driver.get(url);
		driver.findElement(By.linkText("进入后台管理")).click();
		driver.findElement(By.id("name")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.name("B1")).click();
		
		driver.findElement(By.linkText("添加考试类型")).click();
		
		driver.findElement(By.id("testName")).sendKeys("卷一");
		
		driver.findElement(By.id("testTime")).sendKeys("150分钟");
		
		driver.findElement(By.className("Sborder")).click();
		
		driver.findElement(By.linkText("添加试题")).click();
		
		driver.findElement(By.id("title")).sendKeys("买了佛冷");
		
		WebElement s=driver.findElement(By.id("examType"));
		Select ss=new Select(s);
		
		/*WebElement aa=driver.findElement(By.name("userNO"));
		aa.sendKeys("1545632855437");
		
		WebElement bb=driver.findElement(By.name("password"));
		bb.sendKeys("123456789");
		
		driver.findElement(By.id("loginValidate_0")).click();
		@Test (dependsOnMethods = {"verifyLogin"})
		driver.switchTo().frame("leftFrame");
		
		driver.findElement(By.xpath("/html/body/p[2]/a/img")).click();
		
		driver.switchTo().parentFrame();

		driver.switchTo().frame("mainFrame");

		WebElement cc=driver.findElement(By.name("money"));
		cc.sendKeys("10000");
		
		driver.findElement(By.id("smoneyValidate_0")).click();
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("leftFrame");
		
		driver.findElement(By.xpath("/html/body/p[4]/a/img")).click();
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("mainFrame");
		
		String s=driver.findElement(By.xpath("/html/body/center/table")).getText();
		
		System.out.println(s);*/

		
		
}
}
