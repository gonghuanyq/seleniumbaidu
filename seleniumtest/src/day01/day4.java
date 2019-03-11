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
		String url="file:///D:/QQ下载的资料/dragAndDrops.html";
		driver.get(url);
		//拖动红色的方块到第一行的字上
		WebElement f=driver.findElement(By.id("drag"));
		
		//WebElement s=driver.findElement(By.linkText("text"));
		
		Actions aa=new Actions(driver);
		
		//aa.clickAndHold(f).moveToElement(s).release(f).perform();
		
		//拖到指定位置上
		aa.dragAndDropBy(f, -199, -130).perform();
		
	//aa.doubleClick(f).perform();
	
}
}	 





/*	//截图功能
		File jt=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(jt, new File("D:\\test.jpg"));
		
		driver.switchTo().frame("frame");
		
		driver.findElement(By.id("input1")).sendKeys("嘤嘤怪");
		driver.switchTo().defaultContent();
		
		String wen=driver.findElement(By.id("id1")).getText();
		System.out.println(wen);
		
		//第一种，括号中直接写上frame的标签ID或name
		//第二种，通过索引
		
    	driver.switchTo().frame(0);
		driver.findElement(By.id("user")).sendKeys("test");
		Thread.sleep(1000);
		//跳回到主页面，也有两种方式
		//第一种是跳回到父类页面
		//主页面--iframe--iframe
		//driver.switchTo().parentFrame();
		
		//直接跳到最外层
		driver.switchTo().defaultContent();
		driver.findElement(By.id("user")).sendKeys("test");*/