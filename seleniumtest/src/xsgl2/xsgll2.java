package xsgl2;

import org.openqa.selenium.By;

import xsgl.xsgll;

public class xsgll2 extends xsgll {
	
	//��ת����߿��
		public void tzzb() {
			driver.switchTo().frame("menu");
		}
		//���ѧ������
		public void xsgl() {
			driver.findElement(By.xpath("/html/body/div[2]/h2/a")).click();
		}
		//����༶����
		public void bjgl() {
			driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]/a")).click();
		}
//��ת���ұ߿��
		public void ybkj() {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("main");
		}
		//������Ӱ༶
}
