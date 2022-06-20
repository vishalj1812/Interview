package interview_programs;

import java.util.Scanner;

public class I_Duplicate_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String::");
		String w = sc.nextLine();
		 
		String nw = " ";
		
		System.out.println("Original String: "+w);
		
		for(int i=0;i<w.length();i++) {//abcc
			
			char ch = w.charAt(i);//b
			
			if(ch!=' ') {//a
			nw = nw + ch;//ab
		    w = w.replace(ch, ' ');//abcc
		    
			
			}
		}
		System.out.println("New word = "+nw); 

	}

}