package day01;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openllq {
	@Test
	public void open1() {
		System.setProperty("webdriver.chrome.driver","./tors/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//��һ�������ҳ��
		String url="https://www.baidu.com";
		String url2="http://www.v2er.com";
		driver.get(url);
		driver.navigate().to(url2);
		//driver.get(url2);
		//���ҳ��
		driver.manage().window().maximize();
		//���������
		driver.navigate().back();
		//��ӡ����
		String title1=driver.getTitle();
		System.out.println(title1);
		//��ӡ��ַ
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		
		//�����ǰ��
		driver.navigate().forward();
		//��ӡ����
		String title11=driver.getTitle();
		System.out.println(title11);
		//��ӡ��ַ
		//��תҳ�� driver.switchTo().window(���);
		
		String url22=driver.getCurrentUrl();
		System.out.println(url22);
		
	}
	

}
/*���ֶ�λ��ʽ
 1 ID
 2 name












*/
