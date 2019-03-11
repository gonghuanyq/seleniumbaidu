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
	//打开一个网站
	String url1="http://localhost:8080/shop1/index.jsp";
	driver.get(url1);
      //选择类型
	WebElement x=driver.findElement(By.name("select_type"));
	Select s=new Select(x);
	s.selectByIndex(1);	
	//点击搜索
	driver.findElement(By.name("Submit")).click();
	
	//点击主页
	driver.findElement(By.className("mainA")).click();
	
	 //选择类型
		WebElement x1=driver.findElement(By.name("select_type"));
		Select s1=new Select(x1);
		s1.selectByIndex(1);
	   //商品
		driver.findElement(By.name("select_p_name")).sendKeys("联想");
		//点击搜索
		driver.findElement(By.name("Submit")).click();
		//返回
		driver.findElement(By.className("STYLE1")).click();
		//输入商品“联想”
	
		//商品
		driver.findElement(By.name("select_p_name")).sendKeys("联想");
		//点击搜索
		driver.findElement(By.name("Submit")).click();
}
}
