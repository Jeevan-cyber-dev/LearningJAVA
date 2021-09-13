//Two number are entered through keyboard.Write a program to find the value
//value of one number raised to the power of another(without using builtin function)
package LOOP;

import java.util.Scanner;

public class SquareOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=1;
		for(int i=0;i<b;i++) {
			 c= c*a;
			
		}
		System.out.println(c);
	}

}
