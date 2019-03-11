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
	input.sendKeys("蛇皮怪");
	
	WebElement s=driver.findElement(By.id("moreSelect"));
	
	Select s1=new Select(s);
	//下拉框三种选择方式
	//第一种方式，按索引来选,第一个选择的内容从0开始
	//s1.selectByIndex(3);
	//第二种方式,by value
	//s1.selectByValue("xiaomi");
	//第三种方式，VisibleText
	s1.selectByVisibleText("huawei");
	//单选框
	WebElement r1=driver.findElement(By.className("Opel"));
	
	System.out.println(r1.isSelected());
	
	r1.click();

	System.out.println(r1.isSelected());
	//复选框
	WebElement c1=driver.findElement(By.name("checkbox1"));
	if(!c1.isSelected())
	{
	c1.click();
	}
	WebElement c2=driver.findElement(By.name("checkbox2"));
	c2.click();
	
	WebElement b1=driver.findElement(By.name("buttonhtml"));
	//判断是否可用
	System.out.println(b1.isEnabled());
	
	//assert("false",b1.isEnabled());
	//点击alter按钮
	WebElement a1=driver.findElement(By.className("alert"));
	a1.click();
	//从浏览器跳转到弹出框上面去
	Alert alert=driver.switchTo().alert();
	alert.accept();
	
	WebElement co1=driver.findElement(By.className("confirm"));
	co1.click();
	
	Alert cl1=driver.switchTo().alert();
	cl1.accept();//确定
	Thread.sleep(1000);
    cl1.accept();//确定
    //cl1.dismiss();//取消
    
    WebElement p1=driver.findElement(By.className("prompt"));
	p1.click();
	
	Alert pp1=driver.switchTo().alert();
	pp1.sendKeys("hello,world");
	String aa=pp1.getText();
	System.out.println(aa);
	Thread.sleep(1000);
	pp1.accept();//确定
	Thread.sleep(1000);
	pp1.accept();
	
	String lu="D:\\test2.class";
	WebElement up=driver.findElement(By.id("load"));
	Thread.sleep(1000);
	up.sendKeys(lu);
}
}
