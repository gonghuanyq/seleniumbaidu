package z;

import java.util.Scanner;

public class z2 {

	public static void printRect() {
		// TODO Auto-generated method stub

		System.out.println("*");
	}
	public static void printRest(int width,int height) {
		for (int i=0;i<height;i++) {
		 for (int j=0;j<width;j++) {
			 System.out.print("*");
			 }
		 System.out.println();
		} 
		System.out.println();
	}
	public static int add(int a,int b) {
		
		int sum;
		sum=a*b;
		return sum;
	}
	public static int ck(int c,int d ) {
		
		int lig;
		lig=c*d;
		return lig;
	}
	public static int s(int e,int g) {
	int t;
	System.out.print("³¤£º");
	Scanner f=new Scanner(System.in);
	e=f.nextInt();
	System.out.print("¿í£º");
	Scanner h=new Scanner(System.in);
	g=h.nextInt();
	t=e*g;
	return t;
	}
	public static void main(String[] args) {
		{
		printRect();
		printRest(10,2);
		printRest(12,3);
			System.out.println(add(3,5));
			//System.out.println(ck(20,10));
			//System.out.println(s(e*g));
		}
		
		
	}

}
