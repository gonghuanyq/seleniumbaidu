package selenps;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day6 {

	@Test
	public void open() throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver","./tors/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///D:/QQ下载的资料/dragAndDrops.html";
		driver.get(url);

}
}