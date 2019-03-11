package day01;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class day3 {

	public void open() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./tors/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://localhost:8080/examsys/login.thtml";
		driver.get(url);
	@Beforeclass{
		
	}
}
}	