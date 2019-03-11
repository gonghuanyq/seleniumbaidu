package selenps;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lianxi2 {

	@Test
	public void open() throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver","./tors/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://localhost:8080/Exam_ssh/";
		driver.get(url);
		//点击开始在线考试
		driver.findElement(By.linkText("开始在线考试")).click();
		//输入学号
		driver.findElement(By.name("stuNumber")).sendKeys("1234567");
        //输入名字
		driver.findElement(By.name("stuName")).sendKeys("花木兰");
		//提交
		driver.findElement(By.name("B1")).click();
		//选择试卷
		
		WebElement x=driver.findElement(By.name("examType"));
		Select s=new Select(x);
		s.selectByValue("1");
		//开始
		driver.findElement(By.name("start_b")).click();
		//选择答案
		driver.findElement(By.name("questionOption")).click();
}
	}
