package day01;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class day4 {

	@Test
	public void open() throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver","./tors/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///D:/QQ���ص�����/dragAndDrops.html";
		driver.get(url);
		//�϶���ɫ�ķ��鵽��һ�е�����
		WebElement f=driver.findElement(By.id("drag"));
		
		//WebElement s=driver.findElement(By.linkText("text"));
		
		Actions aa=new Actions(driver);
		
		//aa.clickAndHold(f).moveToElement(s).release(f).perform();
		
		//�ϵ�ָ��λ����
		aa.dragAndDropBy(f, -199, -130).perform();
		
	//aa.doubleClick(f).perform();
	
}
}	 





/*	//��ͼ����
		File jt=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(jt, new File("D:\\test.jpg"));
		
		driver.switchTo().frame("frame");
		
		driver.findElement(By.id("input1")).sendKeys("���ӹ�");
		driver.switchTo().defaultContent();
		
		String wen=driver.findElement(By.id("id1")).getText();
		System.out.println(wen);
		
		//��һ�֣�������ֱ��д��frame�ı�ǩID��name
		//�ڶ��֣�ͨ������
		
    	driver.switchTo().frame(0);
		driver.findElement(By.id("user")).sendKeys("test");
		Thread.sleep(1000);
		//���ص���ҳ�棬Ҳ�����ַ�ʽ
		//��һ�������ص�����ҳ��
		//��ҳ��--iframe--iframe
		//driver.switchTo().parentFrame();
		
		//ֱ�����������
		driver.switchTo().defaultContent();
		driver.findElement(By.id("user")).sendKeys("test");*/