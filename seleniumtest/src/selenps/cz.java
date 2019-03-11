package selenps;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cz {
@Test
public void open() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","./tors/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="file:///D:/qq%E4%B8%8B%E8%BD%BD%E7%9A%84%E8%B5%84%E6%96%99/index.html";
	driver.get(url);
	
	WebElement input=driver.findElement(By.id("user"));
	input.sendKeys("��Ƥ��");
	
	WebElement s=driver.findElement(By.id("moreSelect"));
	
	Select s1=new Select(s);
	//����������ѡ��ʽ
	//��һ�ַ�ʽ����������ѡ,��һ��ѡ������ݴ�0��ʼ
	//s1.selectByIndex(3);
	//�ڶ��ַ�ʽ,by value
	//s1.selectByValue("xiaomi");
	//�����ַ�ʽ��VisibleText
	s1.selectByVisibleText("huawei");
	//��ѡ��
	WebElement r1=driver.findElement(By.className("Opel"));
	
	System.out.println(r1.isSelected());
	
	r1.click();

	System.out.println(r1.isSelected());
	//��ѡ��
	WebElement c1=driver.findElement(By.name("checkbox1"));
	if(!c1.isSelected())
	{
	c1.click();
	}
	WebElement c2=driver.findElement(By.name("checkbox2"));
	c2.click();
	
	WebElement b1=driver.findElement(By.name("buttonhtml"));
	//�ж��Ƿ����
	System.out.println(b1.isEnabled());
	
	//assert("false",b1.isEnabled());
	//���alter��ť
	WebElement a1=driver.findElement(By.className("alert"));
	a1.click();
	//���������ת������������ȥ
	Alert alert=driver.switchTo().alert();
	alert.accept();
	
	WebElement co1=driver.findElement(By.className("confirm"));
	co1.click();
	
	Alert cl1=driver.switchTo().alert();
	cl1.accept();//ȷ��
	Thread.sleep(1000);
    cl1.accept();//ȷ��
    //cl1.dismiss();//ȡ��
    
    WebElement p1=driver.findElement(By.className("prompt"));
	p1.click();
	
	Alert pp1=driver.switchTo().alert();
	pp1.sendKeys("hello,world");
	String aa=pp1.getText();
	System.out.println(aa);
	Thread.sleep(1000);
	pp1.accept();//ȷ��
	Thread.sleep(1000);
	pp1.accept();
	
	String lu="D:\\test2.class";
	WebElement up=driver.findElement(By.id("load"));
	Thread.sleep(1000);
	up.sendKeys(lu);
}
}
