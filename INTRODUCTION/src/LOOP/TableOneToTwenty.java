package LOOP;

public class TableOneToTwenty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=0;
        for(int i=1;i<=20;i++) {
        	for(int j=1;j<=10;j++) {
        		result=i*j;
        		System.out.print("\t" +result);
        	}
        	System.out.println();
        }
	}

}
