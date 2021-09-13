//Write a program to calculate the sum of following series where n is input
//1 - 1/2 + 1/3 - 1/4 + ..... 1/n 
package LOOP;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		double result=0;
		for(int i=1;i<=n;i++) {
			 {
				result+= 1/i;
			}
		
		}
		System.out.println(result);
	}

}
