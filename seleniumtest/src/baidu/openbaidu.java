package baidu;

import org.testng.annotations.Test;

import openbaidu.ChromeDriver;
import openbaidu.WebDriver;

public class openbaidu {
  @Test
  public void open() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./tors/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.baidu.com";
		driver.get(url);
}
}
