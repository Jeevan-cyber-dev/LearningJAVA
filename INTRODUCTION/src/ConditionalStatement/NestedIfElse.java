package ConditionalStatement;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
a=100;
b=20;
c=50;
if(a>b) {
  if(a>c) {
	  System.out.println("a is largest.");
  }
  else {
	  System.out.println("c is largest");
  }
}else {
     if(b>c) {
	       System.out.println("b is largest");
              }
      else {
	System.out.println("c is largest");
     }
}
	}

}
