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
	//��һ����վ
	String url1="https://www.baidu.com";
	String url2="http://www.v2ex.com/member/olivia";
	driver.get(url1);
	//���ҳ��
	driver.manage().window().maximize();
	//����ҳ���С
	
	//ˢ��ҳ��
	driver.navigate().refresh();
	
	driver.navigate().to(url2);
	//����һ��ҳ��
	driver.navigate().back();
	//ִ����ɺ��˻ذٶ�ҳ��
	//��ӡ����
	String title1=driver.getTitle();
	System.out.println(title1);
	//��ӡ��ǰ����ַ
	String url11=driver.getCurrentUrl();
	System.out.println(url11);
	
	Thread.sleep(1000);
	//ǰ��һ��ҳ��
	driver.navigate().forward();
	//��ӡ����
	String title2=driver.getTitle();
	System.out.println(title2);
	//��ӡ��ǰ����ַ
	String url22=driver.getCurrentUrl();
	System.out.println(url22);
}
	
}
