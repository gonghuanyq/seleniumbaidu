package xsgl1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import xsgl.xsgll;

public class xsgll1 extends xsgll{
	public void dl() {
	driver.findElement(By.name("username")).sendKeys("hujianming");
	}
	
//����	
	public void setuserpass() {
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");
	}
	
//ѡ��������	
	public void setselect() {
		WebElement a=driver.findElement(By.name("usertype"));
		Select s=new Select(a);
		s.selectByIndex(2);
	}
	
//�����¼	
	public void setlogin() {
		driver.findElement(By.className("tm_btn")).click();
	}
	
}
