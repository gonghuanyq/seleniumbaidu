package xsgl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class xsgll {
	public static String url;
	public static WebDriver driver;    //static 静态 public动态（全局、公有的）
//相当于预置条件
	@BeforeClass
	public void afterClass1() {
		System.setProperty("webdriver.chrome.driver", "./tors/chromedriver.exe");
		driver=new ChromeDriver();
		url="http://localhost:8080/examsys/login.thtml";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	
	@AfterClass
	public void thr() {
		//driver.close();
	
}
}
