package JavaPATTERN;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;i++) {
				
				System.out.print("* ");
				
			}
//			for(int j=n;j<=1;j--) {
//				System.out.println("* ");
//			}
			
			System.out.println();
		}
	}

}
