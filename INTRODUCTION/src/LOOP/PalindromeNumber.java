package LOOP;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int reverseNumber=0;
        while(temp>0) {
        	int lastDigit=temp%10;
        	//System.out.println(lastDigit);
        	reverseNumber = reverseNumber * 10 + lastDigit;
        	temp=temp/10;
        	
        }
       
        System.out.println("Reverse of the number is" +n +" "+ reverseNumber);
        if(reverseNumber == n )  
        	System.out.println("It is palindrome number");
		else 
    		System.out.println("It is not a palindrome number.");
    
	}

}
