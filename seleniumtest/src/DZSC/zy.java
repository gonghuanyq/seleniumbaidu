package DZSC;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class zy {
	static WebDriver driver;
	static String url;
	@BeforeClass
	public void setup1() {
		System.setProperty("webdriver.chrome.driver","./tors/chromedriver.exe");
		driver=new ChromeDriver();
		url="http://localhost:8080/shop1";
	}
	//��¼
  @Test
  public void aa() {
	  driver.get(url);
	  //�����û���
	  driver.findElement(By.name("c_name")).sendKeys("aaaaaa");
	  //��������
	  driver.findElement(By.name("c_pass")).sendKeys("aaa");
	  //���ȷ��
	  driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/form/table/tbody/tr[5]/td/input[1]")).click();
  }
  //�����Բ���
  @Test(dependsOnMethods="aa")
	public void bb() throws InterruptedException {
	  //��ȡ��ǰ���
		String a=driver.getWindowHandle();
		//���������ַ
		String a1="http://localhost:8080/shop1/message.jsp";
		//����������
		driver.findElement(By.linkText("�������")).click();
		Set<String>s=driver.getWindowHandles();
		for(String handle:s) {
			driver.switchTo().window(handle);
			String a2=driver.getCurrentUrl();
			if(a1.equals(a2)) {
				
				//��λ
				driver.findElement(By.xpath("/html/body/center[4]/form/table/tbody/tr[7]/td/input[2]")).click();
			
			}
		}
		driver.switchTo().window(a);
	}
	@Test(dependsOnMethods="bb")
	public void cc() throws InterruptedException {
		//��ȡ��ǰ���
		String e=driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[2]/table[2]/tbody/tr[1]/td[4]/p[3]/input")).click();
		String a="http://localhost:8080/shop1/my_cart.jsp";
		Set<String>x=driver.getWindowHandles();
		for(String handle:x) {
			driver.switchTo().window(handle);
			String a1=driver.getCurrentUrl();
			if(a.equals(a1)) {
				
				driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr[2]/td[2]/table/tbody/tr[4]/td/form/table[2]/tbody/tr[1]/td/font/input[1]")).click();
				WebElement s=driver.findElement(By.name("pay_fangshi"));
				Select s1=new Select(s);
				s1.selectByIndex(2);
				//�����ַ
				driver.findElement(By.name("pay_address")).sendKeys("�Ϻ�");
				//��������
				driver.findElement(By.name("pay_email")).sendKeys("1234567@123.com");
				//����ύ
				driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr/td[2]/table/tbody/tr[6]/td/form/table/tbody/tr[7]/td/input[1]")).click();
				String x1="http://localhost:8080/shop1/payment.jsp";
				Set<String>g=driver.getWindowHandles();
				for(String hand:g) {
					driver.switchTo().window(hand);
					String g1=driver.getCurrentUrl();
					if(g1.equals(x1)) {
						driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr/td[2]/table/tbody/tr[11]/td/table/tbody/tr[4]/td/input[1]")).click();
						
						String g2="http://localhost:8080/shop1/message.jsp";
						Set<String>p=driver.getWindowHandles();
						for(String h:p) {
							driver.switchTo().window(h);
							String g3=driver.getCurrentUrl();
							if(g2.equals(g3)) {
								
								driver.findElement(By.xpath("/html/body/center[4]/form/table/tbody/tr[7]/td/input[2]")).click();
							}
						}
					}
				}
			}
		}	
	}

  @AfterClass
 public void setup4() {
  }

}
