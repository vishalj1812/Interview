package interview_programs.copy;

import java.util.*;

public class C_Fibonnaci_Series {
	
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Number");
		
		int n =s.nextInt();
		int a = 0, b=1, i, c;
		
		for(i=0; i<=n; i++) {
			c=a+b;
			System.out.print(" "+c);
			
			a=b;
			b=c;
		}
		
	}

}
