package z;

import java.util.Scanner;

public class z3 {

	//public static void qw() {
		// TODO Auto-generated method stub

		public static int ytc(int n) 
		{
			int j=1;
		for(int a=1;a<=n;a++) 
		{
			
			j*=a;
	
		}
		return j;
		} 
		public static void sos() {
			
			int a;
			System.out.print("������a:");
			Scanner n=new Scanner(System.in);
			a=n.nextInt();
			int b;
			System.out.print("������b:");
			Scanner k=new Scanner(System.in);
			b=k.nextInt();
			System.out.println("�ӷ���"+(a+b));
			System.out.println("������"+(a-b));
			System.out.println("�˷���"+(a*b));
			if(b!=0) {
			System.out.println("������"+(a/b));
			}
			else {
				System.out.println("��������");
				sos();
			}
		}
	
		public static void main(String[] args) {
		
		{
		
		System.out.println("a�Ľ׳�  "+ ytc(5));
		
		//System.out.println();
		sos();
		}
	}

}
