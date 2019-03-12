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
			System.out.print("请输入a:");
			Scanner n=new Scanner(System.in);
			a=n.nextInt();
			int b;
			System.out.print("请输入b:");
			Scanner k=new Scanner(System.in);
			b=k.nextInt();
			System.out.println("加法："+(a+b));
			System.out.println("减法："+(a-b));
			System.out.println("乘法："+(a*b));
			if(b!=0) {
			System.out.println("除法："+(a/b));
			}
			else {
				System.out.println("重新输入");
				sos();
			}
		}
	
		public static void main(String[] args) {
		
		{
		
		System.out.println("a的阶乘  "+ ytc(5));
		
		//System.out.println();
		sos();
		}
	}

}
