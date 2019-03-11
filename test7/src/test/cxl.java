package test;


	
	abstract class cnt{
		abstract public void chi();
			
		
	}
	 class bug extends cnt{
		public void chi() {
			 System.out.println("√®≥‘”„");
		 }
		
	}
	 class sct extends cnt{
		public void chi() {
			System.out.println("π∑ø–π«Õ∑");
		}
	}
public class cxl {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bug p=new bug();
		sct s=new sct();
		  p.chi();
		  s.chi();
		  
}

}
