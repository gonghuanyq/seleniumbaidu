package xsgl2;

import org.openqa.selenium.By;

import xsgl.xsgll;

public class xsgll2 extends xsgll {
	
	//跳转到左边框架
		public void tzzb() {
			driver.switchTo().frame("menu");
		}
		//点击学生管理
		public void xsgl() {
			driver.findElement(By.xpath("/html/body/div[2]/h2/a")).click();
		}
		//点击班级管理
		public void bjgl() {
			driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]/a")).click();
		}
//跳转到右边框架
		public void ybkj() {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("main");
		}
		//点击增加班级
}
