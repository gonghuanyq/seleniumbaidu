package DZSC;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dzsc {
	@Test
	public void dsc(){
	System.setProperty("webdriver.chrome.driver","./tors/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//��һ����վ
	String url1="http://localhost:8080/shop1/index.jsp";
	driver.get(url1);
      //ѡ������
	WebElement x=driver.findElement(By.name("select_type"));
	Select s=new Select(x);
	s.selectByIndex(1);	
	//�������
	driver.findElement(By.name("Submit")).click();
	
	//�����ҳ
	driver.findElement(By.className("mainA")).click();
	
	 //ѡ������
		WebElement x1=driver.findElement(By.name("select_type"));
		Select s1=new Select(x1);
		s1.selectByIndex(1);
	   //��Ʒ
		driver.findElement(By.name("select_p_name")).sendKeys("����");
		//�������
		driver.findElement(By.name("Submit")).click();
		//����
		driver.findElement(By.className("STYLE1")).click();
		//������Ʒ�����롱
	
		//��Ʒ
		driver.findElement(By.name("select_p_name")).sendKeys("����");
		//�������
		driver.findElement(By.name("Submit")).click();
}
}
