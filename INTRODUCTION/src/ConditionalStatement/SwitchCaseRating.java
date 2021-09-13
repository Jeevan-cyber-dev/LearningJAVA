package ConditionalStatement;
import java.util.Scanner;
public class SwitchCaseRating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rating");
		int rating=sc.nextInt();
		switch(rating) {
		case 1:
		case 2:
			System.out.println("BAD RATING");
			break;
			
		case 3:
			System.out.println("AVERAGE");
			break;
			
		case 4:
		case 5:
			System.out.println("GOOD");
			break;
			
			
		default:
				System.out.println("pick out of 5 rating");
		

	}
	}
}
	

