package DZSC;






import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.jetty.html.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/*1�� ����Qunar��Ʊ��ҳhttp://flight.qunar.com��ѡ�񡰵��̡������������������У�ѡ��today+7�պ�����ڣ��㡰����������ת����Ʊ���������б�ҳ�� 
2�� ���б�ҳͣ��1���ӣ�����ҳ���ϳ��֡�������������
3�� ������ֺ����б����ڳ��֡�ÿ�κ���������˰�ѡ����������ѡ����Ʊ����ť����չ�����б��л���֡���һ�̡��� ���ڶ��̡�������û�г��֡�ÿ�κ���������˰�ѡ����������ѡ����Ʊ����ť����չ�����б�ײ��л���֡����۷�Χ�� 
4�� ��������ֺ����б���ҳ�����֡��ú��ߵ�ǰ�޿��ۺ��ࡱ
*/

public class zy3 {
	@Test
	  public void hb1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./tors/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//����Qunar��Ʊ��ҳhttp://flight.qunar.com
			String url="http://flight.qunar.com";
			driver.get(url);
	driver.findElement(By.name("searchType")).click();
		        WebElement from_date = driver
		                .findElement(By.xpath("//*[@id=\"fromDate\"]"));
		        WebElement sigleWayCheckBox = driver
		                .findElement(By.xpath("//div[@id='js_flighttype_tab_domestic']//input[@class='inp_chk js-searchtype-oneway']"));
		        if (!sigleWayCheckBox.isSelected()) {
		            sigleWayCheckBox.click();
		        }
		        
		        /*
		         * ѡ�񡰵��̡������������������У�
		         * ѡ��today+7�պ�����ڣ��㡰������
		         * ��ת����Ʊ���������б�ҳ�� 
		        */
	    	driver.findElement(By.name("fromCity")).click();
	    	driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[1]/div/div[2]/div/div[2]/div[2]/dl/dd/ul/li[2]/a")).click();
	    	driver.findElement(By.name("toCity")).sendKeys("����");
	    	
	    	 from_date.clear();
	         from_date.sendKeys(getDateAfterToday(7));
	         WebElement search = driver
	                 .findElement(By
	                         .xpath("//*[@id=\"dfsForm\"]/div[4]/button"));
	         search.submit();
	         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	         driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	         WebElement aa = driver.findElement(By
	                 .xpath("//*[@id=\"fromDate\"]"));
	         JavascriptExecutor jse = (JavascriptExecutor) driver;
	         jse.executeScript("arguments[0].scrollIntoView()", aa);
	         aa.click();
	         
               driver.findElement(By.className("btn_search")).click();
               driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
               
	         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	         driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
/*	         
	          ������ֺ����б����ڳ��֡�ÿ�κ���������˰�ѡ����������ѡ����Ʊ����ť��
	          ��չ�����б��л���֡���һ�̡��� ���ڶ��̡�������û�г��֡�ÿ�κ���������˰�ѡ����������ѡ����Ʊ����ť����չ�����б�ײ��л���֡����۷�Χ�� 
              ��������ֺ����б���ҳ�����֡��ú��ߵ�ǰ�޿��ۺ��ࡱ
	         */
	         driver.findElement(
	                 By.xpath("(//div[@class='avt_trans']//p[contains(text(),'ÿ�κ���������˰��')]/ancestor::div//div[@class='a_booking']/a)[3]")).click();
	         driver.findElement(
	                 By.xpath("//div[@id='flightbarXI883']//div[@class='t_bk']/a")).click();
	     }

	     public static String getDateAfterToday(int dateAfterToday) {
	         Calendar bb = Calendar.getInstance();
	         bb.add(Calendar.DATE, +dateAfterToday);
	         System.out.println(bb.getTime().toString());
	         Date date = bb.getTime();
	         SimpleDateFormat bb1 = new SimpleDateFormat("yyyy-MM-dd");
	         System.out.println(bb1.format(date));
	         return bb1.format(date);
	     }
		 public static boolean isElementPresent(WebDriver driver, final By by,
		            int timeOut) throws InterruptedException {
		        boolean isPresent = false;
		        Thread.sleep(timeOut * 1000);
		        List cc = (List) driver.findElements(by);
		        if (cc.size() != 0) {
		            isPresent = true;
		        }
		        return isPresent;
		
}
}



/*public class zy3 {
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
public void a() {
	  driver.get(url);
	  //�����û���
	  driver.findElement(By.name("c_name")).sendKeys("aaaaaa");
	  //��������
	  driver.findElement(By.name("c_pass")).sendKeys("aaa");
	  //���ȷ��
	  driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/form/table/tbody/tr[5]/td/input[1]")).click();

}
@Test
public void a1() {
	//��������̨����
	driver.findElement(By.linkText("��̨����")).click();
	//�����˺�
	driver.findElement(By.name("a_name")).sendKeys("admin");
	//��������
	driver.findElement(By.name("a_pass")).sendKeys("admin");
	//�����¼
	driver.findElement(By.name("submit2")).click();
}
@Test
public void a2() {
	String s="http://localhost:8080/shop1/admin/login2?op=login";
	Set<String>p=driver.getWindowHandles();
	for(String handle:p) {
		driver.switchTo().window(handle);
		String s1=driver.getCurrentUrl();
		if(s.equals(s1)) {
			*//**
			 * ���һ����Ʒ������
			 * ɾ��һ������
			 * ��������*//*
			driver.switchTo().frame(0);
			driver.switchTo().frame("Left");
			driver.findElement(By.xpath("/html/body/table/tbody/tr[13]/td/span/a")).click();
            driver.switchTo().parentFrame();
            driver.switchTo().frame("Rigth");
            //������Ʒ������
			driver.findElement(By.name("t_name")).sendKeys("�ֻ�");
			//������
			driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[2]/td[3]/input[1]")).click();
			driver.switchTo().parentFrame();
			driver.switchTo().frame("Left");
			driver.findElement(By.xpath("/html/body/table/tbody/tr[9]/td/span/a")).click();
			driver.switchTo().parentFrame();
			driver.switchTo().frame("Rigth");
			driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td[6]/span/a")).click();
			driver.switchTo().parentFrame();
			driver.switchTo().frame("Left");
			driver.findElement(By.xpath("/html/body/table/tbody/tr[16]/td/span/a")).click();
			driver.switchTo().parentFrame();
			driver.switchTo().frame("Rigth");
			driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[5]/td/input[1]")).click();

             }
	     }
     }
}
*/