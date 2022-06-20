package interview_programs.copy;

import java.util.Scanner;

public class I_Duplicate_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String::");
		String w = sc.nextLine();
		 
		String nw = " ";
		
		System.out.println("Original String: "+w);
		
		for(int i=0; i<=w.length()-1; i++) {
			
			char ch = w.charAt(i);
			
			if(ch!=' ') {
				nw=nw+ch;
				w=w.replace(ch, ' ');
				
			}
			
		}
		System.out.println("New word = "+nw); 

	}

}