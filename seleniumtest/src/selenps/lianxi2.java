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
		//�����ʼ���߿���
		driver.findElement(By.linkText("��ʼ���߿���")).click();
		//����ѧ��
		driver.findElement(By.name("stuNumber")).sendKeys("1234567");
        //��������
		driver.findElement(By.name("stuName")).sendKeys("��ľ��");
		//�ύ
		driver.findElement(By.name("B1")).click();
		//ѡ���Ծ�
		
		WebElement x=driver.findElement(By.name("examType"));
		Select s=new Select(x);
		s.selectByValue("1");
		//��ʼ
		driver.findElement(By.name("start_b")).click();
		//ѡ���
		driver.findElement(By.name("questionOption")).click();
}
	}
