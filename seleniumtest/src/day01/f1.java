package day01;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.io.FileHandler;

public class f1 {

	@Test
	public void open() throws IOException{
		
//FileHandler.createDir(new File("D:\\data"));
	
	//FileHandler.copy(new File("D:\\data"), new File("D:\\date"));
		//FileHandler.delete(new File("D:\\data"));
		 FileHandler.readAsString(new File("D\\data"));
		
}
}