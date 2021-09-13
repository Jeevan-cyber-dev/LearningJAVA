//write a  program to print Fibbonacci series of n terms where n is input by user
//0 1 1 2 3 5 8 12 24 ....



package LOOP;

import java.util.Scanner;

public class FibbonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=0;i<n-2;i++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
