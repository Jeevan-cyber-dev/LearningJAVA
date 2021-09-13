package ConditionalStatement;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter first Number...");
      float a=sc.nextFloat();
      System.out.println("Enter secand Number...");
      float b=sc.nextFloat();
      System.out.println("Enter the Operation...");
      
      //To avoid space value.To take Char value
      sc.nextLine();
      char operation = sc.nextLine().charAt(0);
      int result =0;
      switch(operation) {
    	  case '+':
    		  System.out.println(a+b);
    		  break;
    	  case '-':
    		  System.out.println(a-b);
    		  break;
    	  case '*':
    		  System.out.println(a*b);
    		  break;
    	  case '/':
    		  System.out.println(a/b);
    		  break;
		  default:
			  System.out.println("Choose operation");
	}
	}
}
