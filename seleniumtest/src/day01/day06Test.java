package day01;
import org.testng.annotations.Test;
	import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
public class day06Test {
	
		 day06 y=new  day06();
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
	  public void Ccf() {
		  int result=y.cf(3,2);
		  Assert.assertEquals(result,6);//实际结果在前，预期结果在后
	  }

	  @Test
	  public void Dcu() {
		  int result=y.cu(4,2);
		  Assert.assertEquals(result,2);
	  }

	  @Test
	  public void Bsub() {
		  int result=y.sub(3,0);
		  Assert.assertEquals(result,3);
	  }
	  
	  @Test
	  public void Ajia() {
		  int result=y.jia(3,0);
		  Assert.assertEquals(result,3);
	  }
	}

