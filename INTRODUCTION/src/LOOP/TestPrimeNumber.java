package LOOP;
import java.util.Scanner;
public class TestPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<n;i++) {
			if(n%i==0) { System.out.println("it is not a prime number./n");
			}
			else {
		 System.out.println(i);} 
			}
	}
}


