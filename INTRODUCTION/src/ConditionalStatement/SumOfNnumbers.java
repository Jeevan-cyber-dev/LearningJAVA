package ConditionalStatement;

public class SumOfNnumbers {
	public static void main(String[] args) {
	int n=1234,temp,Sumt=0;
	while(n>0) {
		temp=n%10;
		Sumt= Sumt + temp;
		n=n/10;
		
	}
	System.out.println("Sum of the digits are\n" + Sumt);
	
	}
}
