package test;

interface jk{
	String sa="��";
	 void cater();
	 void ing();
	
}
 class cf implements jk{
    public void cater(){
	
	System.out.println(sa +"����");
}
    public void ing() {
    	System.out.println(sa +"������");
    }
}
public class cxl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 cf p=new cf();
 p.cater();
 p.ing();
  
	}
}
