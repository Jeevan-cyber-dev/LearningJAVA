package Introduction;
import java.util.Scanner;

public class TakingUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
double princple=sc.nextDouble();
float rate=12.5f;
int time=sc.nextInt();
double SimpleIntrest=(princple*rate*time)/100;
System.out.println(SimpleIntrest);
	}
}
