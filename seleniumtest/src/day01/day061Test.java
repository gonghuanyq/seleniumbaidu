package day01;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day061Test {
	 day061 y=new  day061();
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("beforeclass");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("afterclass");
	  }
	/* @DataProvider(name="jia") 

	public Object[][] data(){
		return new Object[][] {{"20","40"},{"50","20"}};
	}*/
	


	  @Test//(dataProvider="jia")
	  @Parameters({"test1","test2"})
	  public void Aadd(String test1,String test2) {
	    /*int result=y.add(3,2);
	    Assert.assertEquals(result,5);  //实际结果在前，预期结果在后*/
	    System.out.println(test1);
	    System.out.println(test2);
	  }
  @Test
  public void cf() {
	  int result=y.cf(3,2);
	  Assert.assertEquals(result,6);
  }

  @Test
  public void cu() {
	  int result=y.cu(4,2);
	  Assert.assertEquals(result,2);
  }

  @Test
  public void jia() {
	  int result=y.jia(3,0);
	  Assert.assertEquals(result,3);
  }

  @Test
  public void sub() {
	  int result=y.sub(3,0);
	  Assert.assertEquals(result,3);
  }
}
