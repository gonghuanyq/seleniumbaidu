package day01;

import java.awt.Dimension;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openliu {
@Test
public void open() 
throws InterruptedException

{
	System.setProperty("webdriver.chrome.driver","./tors/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//打开一个网站
	String url1="https://www.baidu.com";
	String url2="http://www.v2ex.com/member/olivia";
	driver.get(url1);
	//最大化页面
	driver.manage().window().maximize();
	//设置页面大小
	
	//刷新页面
	driver.navigate().refresh();
	
	driver.navigate().to(url2);
	//后退一个页面
	driver.navigate().back();
	//执行完成后，退回百度页面
	//打印标题
	String title1=driver.getTitle();
	System.out.println(title1);
	//打印当前的网址
	String url11=driver.getCurrentUrl();
	System.out.println(url11);
	
	Thread.sleep(1000);
	//前进一个页面
	driver.navigate().forward();
	//打印标题
	String title2=driver.getTitle();
	System.out.println(title2);
	//打印当前的网址
	String url22=driver.getCurrentUrl();
	System.out.println(url22);
}
	
}
