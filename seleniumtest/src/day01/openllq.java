package day01;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openllq {
	@Test
	public void open1() {
		System.setProperty("webdriver.chrome.driver","./tors/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//打开一个浏览器页面
		String url="https://www.baidu.com";
		String url2="http://www.v2er.com";
		driver.get(url);
		driver.navigate().to(url2);
		//driver.get(url2);
		//最大化页面
		driver.manage().window().maximize();
		//浏览器后退
		driver.navigate().back();
		//打印标题
		String title1=driver.getTitle();
		System.out.println(title1);
		//打印网址
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		
		//浏览器前进
		driver.navigate().forward();
		//打印标题
		String title11=driver.getTitle();
		System.out.println(title11);
		//打印网址
		//跳转页面 driver.switchTo().window(句柄);
		
		String url22=driver.getCurrentUrl();
		System.out.println(url22);
		
	}
	

}
/*八种定位方式
 1 ID
 2 name












*/
